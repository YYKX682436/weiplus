package kp3;

/* loaded from: classes14.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f311005d;

    public k0(kp3.p0 p0Var) {
        this.f311005d = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        kp3.p0 p0Var = this.f311005d;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) p0Var.f311021d).getValue();
        if (relativeLayout != null && (animate = relativeLayout.animate()) != null) {
            animate.alpha(1.0f);
            animate.setDuration(300L);
            animate.start();
        }
        android.view.ViewPropertyAnimator animate2 = p0Var.R6().animate();
        if (animate2 != null) {
            animate2.alpha(1.0f);
            animate2.setDuration(150L);
            animate2.setStartDelay(250L);
            animate2.start();
        }
    }
}
