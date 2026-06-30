package uf;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f426976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(uf.o0 o0Var, int i17) {
        super(0);
        this.f426976d = o0Var;
        this.f426977e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String a17 = uf.c.a(this.f426977e);
        uf.o0 o0Var = this.f426976d;
        o0Var.getClass();
        x91.h c17 = o0Var.f427062e.c();
        uf.j0 j0Var = new uf.j0(a17);
        x91.l lVar = c17.f452649c;
        if (lVar != null) {
            c17.f452648b.g(new w91.j(c17.a(lVar), c17.f452649c.f452664a, a17), j0Var);
        }
        return jz5.f0.f302826a;
    }
}
