package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class nb extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f169987a;

    public nb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f169987a = snsAdNativeLandingPagesUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "show", 0);
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f169987a;
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.T6(snsAdNativeLandingPagesUI) == null || !(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.T6(snsAdNativeLandingPagesUI).getAdapter() instanceof androidx.fragment.app.y1)) {
            com.tencent.mars.xlog.Log.w(snsAdNativeLandingPagesUI.f166700d, "videoProgressbarStatusChangeReceiver called ,but the viewpager or adapter is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
            return;
        }
        androidx.fragment.app.y1 y1Var = (androidx.fragment.app.y1) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.T6(snsAdNativeLandingPagesUI).getAdapter();
        int currentItem = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.T6(snsAdNativeLandingPagesUI).getCurrentItem();
        if (currentItem >= y1Var.getCount()) {
            com.tencent.mars.xlog.Log.w(snsAdNativeLandingPagesUI.f166700d, "videoProgressbarStatusChangeReceiver called ,current index is larger than item count!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
            return;
        }
        java.lang.String str = snsAdNativeLandingPagesUI.f166700d;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) y1Var.getItem(currentItem);
        boolean z17 = g17 == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.f166698c2 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.u8(500L);
        contentFragment.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("videoCompProgressBarStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        contentFragment.f165750t = z17;
        if (!contentFragment.o0() || z17) {
            contentFragment.A0();
        } else {
            contentFragment.z0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("videoCompProgressBarStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
    }
}
