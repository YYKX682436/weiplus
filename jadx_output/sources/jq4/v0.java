package jq4;

/* loaded from: classes3.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301208e;

    public v0(jq4.z0 z0Var, android.view.View view) {
        this.f301207d = z0Var;
        this.f301208e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f301208e;
        int measuredHeight = view.getMeasuredHeight();
        jq4.z0 z0Var = this.f301207d;
        z0Var.f301244m = measuredHeight;
        android.animation.Animator animator = z0Var.f301241j;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-z0Var.f301244m, 0);
        android.view.View view2 = z0Var.f301236e;
        if (view2 != null) {
            ofInt.addUpdateListener(new jq4.t0(view2, z0Var));
        }
        ofInt.addListener(new jq4.u0(view, z0Var));
        ofInt.setDuration(200L);
        ofInt.start();
        z0Var.f301241j = ofInt;
    }
}
