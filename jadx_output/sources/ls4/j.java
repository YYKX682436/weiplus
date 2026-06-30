package ls4;

/* loaded from: classes8.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ls4.u uVar) {
        super(1);
        this.f321070d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ns4.c0 it = (ns4.c0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.f339464c.q();
        boolean b17 = it.b();
        ls4.u uVar = this.f321070d;
        if (b17) {
            ls4.u.b(uVar);
        } else {
            uVar.getClass();
            js4.n nVar = new js4.n();
            nVar.f301549g = js4.m.DIRECT_CHARGE;
            ns4.c0 c0Var = uVar.f321102c;
            if (c0Var == null) {
                kotlin.jvm.internal.o.o("consumePanel");
                throw null;
            }
            ns4.d0 d0Var = c0Var.f339463b;
            r45.js3 js3Var = d0Var.f339496c;
            nVar.f301548f = js3Var.f378089h.f375992e.f377679d;
            pr4.l lVar = uVar.f321100a;
            nVar.f301550h = lVar.f358029j - d0Var.f339495b;
            nVar.f301547e = js3Var.f378088g;
            nVar.f301544b = lVar.f358020a;
            nVar.f301552j = false;
            boolean b18 = it.b();
            ns4.d0 d0Var2 = it.f339463b;
            nVar.f301553k = b18 ? 0L : d0Var2.f339494a.f358029j - d0Var2.f339495b;
            nVar.f301554l = d0Var2.f339496c;
            nVar.f301546d = new ls4.f(uVar);
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(lVar.f358021b, nVar);
        }
        return jz5.f0.f302826a;
    }
}
