package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f168233d;

    public ec(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f168233d = snsAdNativeLandingPagesUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 e0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$31");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f168233d;
        if (snsAdNativeLandingPagesUI.keyboardState() != 1) {
            snsAdNativeLandingPagesUI.m8();
        }
        java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = snsAdNativeLandingPagesUI.X1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!z17) {
            new java.util.ArrayList();
            gb4.r rVar = (gb4.r) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.T6(snsAdNativeLandingPagesUI).getAdapter();
            rVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            java.util.Iterator it = rVar.f270079i.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) ((androidx.fragment.app.Fragment) it.next());
                snsAdNativeLandingPagesUI.keyboardState();
                contentFragment.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyboardStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (contentFragment.f165741h && (e0Var = contentFragment.f165739f) != null) {
                    e0Var.e();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyboardStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$31");
    }
}
