package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab4.u f165791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f165792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y f165793f;

    public x(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar, ab4.u uVar, android.widget.Button button) {
        this.f165793f = yVar;
        this.f165791d = uVar;
        this.f165792e = button;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$9");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f165791d.Z) && (drawable = this.f165792e.getCompoundDrawables()[0]) != null) {
            drawable.setColorFilter(i65.a.d(this.f165793f.f165049d, com.tencent.mm.R.color.aaw), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$9");
    }
}
