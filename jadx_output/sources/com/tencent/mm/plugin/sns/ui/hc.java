package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hc implements com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f168495b;

    public hc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, android.view.View view) {
        this.f168495b = snsAdNativeLandingPagesUI;
        this.f168494a = view;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRemove", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$34");
        android.view.View view = this.f168494a;
        if (view != null && view.getParent() != null) {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
        }
        java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.f168495b.f166724l3 = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRemove", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$34");
    }
}
