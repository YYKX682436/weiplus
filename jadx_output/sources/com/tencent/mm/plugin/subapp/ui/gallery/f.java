package com.tencent.mm.plugin.subapp.ui.gallery;

/* loaded from: classes3.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.gallery.j f172381e;

    public f(com.tencent.mm.plugin.subapp.ui.gallery.j jVar, int i17) {
        this.f172381e = jVar;
        this.f172380d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.subapp.ui.gallery.j jVar = this.f172381e;
        if (floatValue <= 0.1f) {
            jVar.f172390h.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            jVar.f172390h.setAlpha((1.0f - floatValue) * 10.0f);
        }
        jVar.f172390h.setTranslationY(floatValue * (this.f172380d - r0.getHeight()));
    }
}
