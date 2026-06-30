package gn4;

/* loaded from: classes11.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.b1 f273588d;

    public a1(gn4.b1 b1Var) {
        this.f273588d = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(this.f273588d.f273592f.f264492g.B().getString(com.tencent.mm.R.string.k1f));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.l_e);
        u1Var.l(new gn4.z0(this));
        u1Var.e(new gn4.y0(this));
        u1Var.q(false);
    }
}
