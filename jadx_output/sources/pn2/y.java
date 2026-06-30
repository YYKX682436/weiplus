package pn2;

/* loaded from: classes3.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f357034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f357035e;

    public y(android.graphics.Bitmap bitmap, pn2.c0 c0Var) {
        this.f357034d = bitmap;
        this.f357035e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pn2.c0 c0Var = this.f357035e;
        android.graphics.Bitmap bitmap = this.f357034d;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e(c0Var.f356977m, "load product img failed");
            android.widget.ImageView C = c0Var.C();
            if (C == null) {
                return;
            }
            C.setVisibility(8);
            return;
        }
        android.widget.ImageView C2 = c0Var.C();
        if (C2 != null) {
            C2.setVisibility(0);
        }
        android.widget.ImageView C3 = c0Var.C();
        if (C3 != null) {
            C3.setImageBitmap(bitmap);
        }
        android.animation.Animator animator = c0Var.f356982r;
        if (animator != null) {
            animator.cancel();
        }
        android.widget.TextView B = c0Var.B();
        if (B != null) {
            B.setVisibility(8);
        }
        android.view.View u17 = c0Var.u();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(u17, "scaleX", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(u17, "scaleY", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new pn2.x(c0Var));
        animatorSet.start();
        c0Var.f356982r = animatorSet;
    }
}
