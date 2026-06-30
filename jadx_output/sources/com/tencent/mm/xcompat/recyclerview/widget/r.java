package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.v f214622d;

    public r(com.tencent.mm.xcompat.recyclerview.widget.v vVar) {
        this.f214622d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.xcompat.recyclerview.widget.v vVar = this.f214622d;
        int i17 = vVar.A;
        android.animation.ValueAnimator valueAnimator = vVar.f214685z;
        if (i17 == 1) {
            valueAnimator.cancel();
        } else if (i17 != 2) {
            return;
        }
        vVar.A = 3;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}
