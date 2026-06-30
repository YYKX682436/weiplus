package rp1;

/* loaded from: classes14.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.u1 f398526d;

    public t1(rp1.u1 u1Var) {
        this.f398526d = u1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rp1.u1 u1Var = this.f398526d;
        androidx.recyclerview.widget.k3 k3Var = u1Var.f398533e;
        if (!(k3Var instanceof dp1.k) || ((dp1.k) k3Var).f242136d == null) {
            return;
        }
        com.tencent.mm.plugin.ball.view.FloatMenuView.b(u1Var.f398534f.f398542a, ((dp1.k) k3Var).f242136d, ((dp1.k) k3Var).f242137e);
    }
}
