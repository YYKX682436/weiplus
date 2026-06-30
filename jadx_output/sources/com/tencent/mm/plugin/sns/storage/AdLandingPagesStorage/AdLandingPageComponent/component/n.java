package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f165358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab4.u f165359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f165360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y f165361g;

    public n(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar, android.view.View view, ab4.u uVar, android.widget.Button button) {
        this.f165361g = yVar;
        this.f165358d = view;
        this.f165359e = uVar;
        this.f165360f = button;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        ab4.u uVar = this.f165359e;
        android.view.View view = this.f165358d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$11");
        try {
            java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = num.intValue();
            view.setLayoutParams(layoutParams);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(uVar.Z)) {
                l44.f4.a(this.f165361g.f165049d, this.f165360f, num.intValue(), uVar);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$11");
    }
}
