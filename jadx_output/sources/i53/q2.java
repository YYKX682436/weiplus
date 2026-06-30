package i53;

/* loaded from: classes8.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.w2 f288696d;

    public q2(i53.w2 w2Var) {
        this.f288696d = w2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.d2 d2Var = this.f288696d.f288773h;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(d2Var.f182646g, "translationY", 0.0f, d2Var.getStayHeight());
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.start();
        ofFloat.addUpdateListener(new i53.b2(d2Var));
        d2Var.e();
    }
}
