package peixun.gitdroid.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.transition.CircularPropagation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.relex.circleindicator.CircleIndicator;
import peixun.gitdroid.R;

/**
 * Created by ~Wang~ on 2016/7/26.
 */
public class SplashPagerFragment extends Fragment {
    private ViewPager viewPager;
    private SplashPagerAdapter splashPagerAdapter;
    private CircleIndicator indicator;//指示器

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash_pager,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        indicator =(CircleIndicator) view.findViewById(R.id.indicator);
        splashPagerAdapter = new SplashPagerAdapter(getContext());
        viewPager.setAdapter(splashPagerAdapter);
        indicator.setViewPager(viewPager);
        //添加viewpager监听（为了动画）
        viewPager.addOnPageChangeListener(pageChangeListener);
        viewPager.addOnPageChangeListener(phonepageChangeListener);

    }
    //主要为了负责做背景颜色的渐变处理
    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            //int position, float positionOffset, int positionOffsetPixels.移动到哪里，移动是多少
        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    //主要为了做手机的动画处理效果（如平移、缩放、透明度的变化）
    private ViewPager.OnPageChangeListener phonepageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            //int position, float positionOffset, int positionOffsetPixels.移动到哪里，移动是多少
        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
