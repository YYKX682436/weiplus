package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab4.u f165341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f165342e;

    public m(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar, ab4.u uVar, android.widget.Button button) {
        this.f165341d = uVar;
        this.f165342e = button;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$10");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f165341d.Z)) {
            java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
            android.graphics.drawable.Drawable drawable = this.f165342e.getCompoundDrawables()[0];
            if (drawable != null) {
                drawable.setColorFilter(num.intValue(), android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$10");
    }
}
