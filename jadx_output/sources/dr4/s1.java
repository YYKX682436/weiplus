package dr4;

/* loaded from: classes14.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.x1 f242739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(dr4.x1 x1Var, yz5.l lVar) {
        super(1);
        this.f242739d = x1Var;
        this.f242740e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dr4.c0 it = (dr4.c0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        dr4.x1 x1Var = this.f242739d;
        dr4.d2 d2Var = x1Var.f242763c;
        if (d2Var != null) {
            dr4.o.c(d2Var, null, it, true, 1, null);
        }
        dr4.d2 d2Var2 = x1Var.f242763c;
        if (d2Var2 != null) {
            d2Var2.j();
        }
        dr4.n0 n0Var = x1Var.f242764d;
        if (n0Var != null) {
            n0Var.b(dr4.u1.f242749d, null, false);
        }
        dr4.n0 n0Var2 = x1Var.f242764d;
        if (n0Var2 != null) {
            n0Var2.j();
        }
        dr4.h hVar = x1Var.f242765e;
        if (hVar != null) {
            dr4.o.c(hVar, null, it, true, 1, null);
        }
        dr4.h hVar2 = x1Var.f242765e;
        if (hVar2 != null) {
            hVar2.j();
        }
        com.tencent.mm.plugin.voip.model.v2protocal.f176823j2 = new dr4.t1(x1Var);
        yz5.l lVar = this.f242740e;
        if (lVar != null) {
            lVar.invoke(it);
        }
        return jz5.f0.f302826a;
    }
}
