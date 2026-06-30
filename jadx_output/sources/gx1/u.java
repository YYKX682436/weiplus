package gx1;

/* loaded from: classes11.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.v f277327d;

    public u(gx1.v vVar) {
        this.f277327d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gx1.v vVar = this.f277327d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(vVar.f277329b);
        u1Var.g(vVar.f277329b.getString(com.tencent.mm.R.string.brf));
        u1Var.m(com.tencent.mm.R.string.f490507x1);
        u1Var.a(false);
        u1Var.q(false);
    }
}
