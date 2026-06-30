package gg1;

/* loaded from: classes7.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(gg1.c1 c1Var, int i17) {
        super(0);
        this.f271585d = c1Var;
        this.f271586e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String a17 = fg1.u.f261893l.a(this.f271586e);
        gg1.c1 c1Var = this.f271585d;
        c1Var.getClass();
        x91.h b17 = c1Var.f271539e.b();
        gg1.w0 w0Var = new gg1.w0(c1Var, a17);
        x91.l lVar = b17.f452649c;
        if (lVar != null) {
            b17.f452648b.g(new w91.j(b17.a(lVar), b17.f452649c.f452664a, a17), w0Var);
        }
        return jz5.f0.f302826a;
    }
}
