package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class u implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.v f214643d;

    public u(com.tencent.mm.xcompat.recyclerview.widget.v vVar) {
        this.f214643d = vVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int floatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        com.tencent.mm.xcompat.recyclerview.widget.v vVar = this.f214643d;
        vVar.f214662c.setAlpha(floatValue);
        vVar.f214663d.setAlpha(floatValue);
        vVar.f214678s.invalidate();
    }
}
