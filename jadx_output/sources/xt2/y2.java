package xt2;

/* loaded from: classes3.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f457115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f457116f;

    public y2(xt2.e3 e3Var, float f17, long j17) {
        this.f457114d = e3Var;
        this.f457115e = f17;
        this.f457116f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator translationY;
        xt2.e3 e3Var = this.f457114d;
        e3Var.f456719w.setTranslationY(-this.f457115e);
        android.view.ViewPropertyAnimator animate = e3Var.f456719w.animate();
        if (animate == null || (alpha = animate.alpha(1.0f)) == null || (translationY = alpha.translationY(0.0f)) == null) {
            return;
        }
        translationY.setDuration(this.f457116f);
    }
}
