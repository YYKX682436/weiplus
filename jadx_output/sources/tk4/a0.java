package tk4;

/* loaded from: classes5.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f419958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419959e;

    public a0(tk4.c0 c0Var, android.view.View view) {
        this.f419958d = c0Var;
        this.f419959e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioPush.TipsManager", "show banner!!");
        android.view.View view = this.f419959e;
        int measuredHeight = view.getMeasuredHeight();
        tk4.c0 c0Var = this.f419958d;
        c0Var.f419968f = measuredHeight;
        android.animation.Animator animator = c0Var.f419965c;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-c0Var.f419968f, 0);
        android.view.View view2 = c0Var.f419964b;
        if (view2 != null) {
            ofInt.addUpdateListener(new tk4.y(view2, c0Var));
        }
        ofInt.addListener(new tk4.z(view, c0Var));
        ofInt.setDuration(200L);
        ofInt.start();
        c0Var.f419965c = ofInt;
    }
}
