package km2;

/* loaded from: classes3.dex */
public abstract class i0 implements km2.k0 {
    @Override // km2.k0
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        lm2.s sVar = (lm2.s) this;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lxltest boxContext: ");
        com.tencent.mm.plugin.finder.assist.o0 o0Var = com.tencent.mm.plugin.finder.assist.o0.f102420a;
        r45.qn qnVar = sVar.f319446b;
        sb6.append(o0Var.b(qnVar));
        java.lang.String sb7 = sb6.toString();
        lm2.h0 h0Var = sVar.f319448d;
        h0Var.b(sb7);
        gk2.e eVar = h0Var.f319394a;
        db2.u0 u0Var = new db2.u0(((mm2.e1) eVar.a(mm2.e1.class)).f328985o, sVar.f319445a, qnVar.f384102e, ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.c1) eVar.a(mm2.c1.class)).f328852o, sVar.f319447c);
        u0Var.l().K(new km2.h0(this, u0Var, nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }
}
