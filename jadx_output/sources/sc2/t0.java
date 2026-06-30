package sc2;

/* loaded from: classes2.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f406255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406256f;

    public t0(sc2.h1 h1Var, android.view.ViewGroup viewGroup, in5.s0 s0Var) {
        this.f406254d = h1Var;
        this.f406255e = viewGroup;
        this.f406256f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.h1 h1Var = this.f406254d;
        h1Var.K(this.f406255e, 0);
        com.tencent.mm.ui.xj xjVar = new com.tencent.mm.ui.xj(h1Var.T);
        android.view.View view = h1Var.T;
        if (view != null) {
            view.setTouchDelegate(xjVar);
        }
        android.widget.TextView textView = h1Var.K;
        in5.s0 s0Var = this.f406256f;
        if (textView != null) {
            textView.post(new sc2.r0(s0Var, textView, xjVar, h1Var));
        }
        android.view.View view2 = h1Var.R;
        if (view2 != null) {
            view2.post(new sc2.s0(s0Var, view2, xjVar, h1Var));
        }
    }
}
