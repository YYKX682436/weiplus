package ls1;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ls1.e0 e0Var) {
        super(1);
        this.f321005d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(value, "value");
        ls1.e0 e0Var = this.f321005d;
        com.tencent.mars.xlog.Log.i(e0Var.B1(), "load pageFrame : ".concat(value));
        e0Var.V.a("onTmplLoadEnd", java.lang.System.currentTimeMillis());
        boolean B = r26.n0.B(value, "ok", false);
        boolean z17 = e0Var.Z1;
        r45.wm6 wm6Var = e0Var.N1;
        if (!z17) {
            e0Var.Z1 = true;
            is1.l.f294423a.k(wm6Var, B);
        }
        if (B) {
            e0Var.I(-102);
            ax4.a.b(wm6Var.f389300o, 114, 1, true);
        } else {
            e0Var.I(-103);
            ax4.a.b(wm6Var.f389300o, 115, 1, true);
        }
        return jz5.f0.f302826a;
    }
}
