package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class mc extends androidx.viewpager.widget.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f169906d;

    public mc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f169906d = snsAdNativeLandingPagesUI;
    }

    @Override // androidx.viewpager.widget.p, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f169906d;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z76 = snsAdNativeLandingPagesUI.z7();
        z76.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewPagerScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        z76.f165753w = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewPagerScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        boolean z17 = false;
        java.util.Map map = snsAdNativeLandingPagesUI.f166711g3;
        if (i17 == 1) {
            for (int i18 = 0; i18 < snsAdNativeLandingPagesUI.f166709g.size(); i18++) {
                za4.g0 g0Var = (za4.g0) snsAdNativeLandingPagesUI.f166709g.get(i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(g0Var.f471086f));
                if (fragment != null) {
                    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) fragment).A0();
                }
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.e(snsAdNativeLandingPagesUI.getContext());
        } else if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(((za4.g0) snsAdNativeLandingPagesUI.f166709g.get(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.T6(snsAdNativeLandingPagesUI).getCurrentItem())).f471086f));
            if (fragment2 != null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) fragment2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = snsAdNativeLandingPagesUI.f166696b2;
                if (yVar != null) {
                    z17 = yVar.Z();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                }
                if (!z17) {
                    contentFragment.z0();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
    }

    @Override // androidx.viewpager.widget.p, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 e0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f169906d;
        if (snsAdNativeLandingPagesUI.z7() != null) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z76 = snsAdNativeLandingPagesUI.z7();
            z76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            if (z76.f165741h && (e0Var = z76.f165739f) != null) {
                e0Var.e();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        }
        if (snsAdNativeLandingPagesUI.keyboardState() == 1) {
            snsAdNativeLandingPagesUI.hideVKB();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
    }

    @Override // androidx.viewpager.widget.p, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f169906d;
        snsAdNativeLandingPagesUI.hideVKB();
        for (int i18 = 0; i18 < snsAdNativeLandingPagesUI.f166709g.size(); i18++) {
            za4.g0 g0Var = (za4.g0) snsAdNativeLandingPagesUI.f166709g.get(i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            java.util.Map map = snsAdNativeLandingPagesUI.f166711g3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(g0Var.f471086f));
            if (fragment != null) {
                if (i18 == i17) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) fragment;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = snsAdNativeLandingPagesUI.f166696b2;
                    if (yVar != null) {
                        z17 = yVar.Z();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        z17 = false;
                    }
                    if (!z17) {
                        contentFragment.z0();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                } else {
                    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) fragment).A0();
                }
            }
        }
        snsAdNativeLandingPagesUI.t8();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
    }
}
