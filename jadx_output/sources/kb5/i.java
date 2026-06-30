package kb5;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, kb5.k kVar) {
        super(1);
        this.f306253d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        jz5.f0 f0Var;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (dVar != null && (dVar instanceof wi5.f0)) {
            wi5.f0 f0Var3 = (wi5.f0) dVar;
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f306253d);
            r45.ha5 ha5Var = new r45.ha5();
            java.util.Iterator it = ((java.util.ArrayList) g95.e.f269801a.f(f0Var3.f446288b)).iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it.next();
                java.util.LinkedList linkedList = ha5Var.f375981d;
                r45.ga5 ga5Var = new r45.ga5();
                ga5Var.f375041d = z3Var.d1();
                ga5Var.f375043f = ui5.b.f428141g.c(z3Var, z07);
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(z3Var.d1());
                if (n07 == null || (str = n07.d()) == null) {
                    str = "";
                }
                ga5Var.f375042e = str;
                java.util.HashMap hashMap = state.f446330z;
                java.lang.Long l17 = (java.lang.Long) hashMap.get(z3Var.d1());
                jz5.f0 f0Var4 = null;
                if (l17 != null) {
                    ga5Var.f375044g = l17.longValue();
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    java.lang.Long l18 = (java.lang.Long) hashMap.get(ga5Var.f375041d);
                    if (l18 != null) {
                        ga5Var.f375044g = l18.longValue();
                        f0Var4 = f0Var2;
                    }
                    if (f0Var4 == null) {
                        ga5Var.f375044g = c01.id.c();
                    }
                }
                linkedList.add(ga5Var);
                if (linkedList.size() > 1) {
                    kz5.g0.t(linkedList, new kb5.h());
                }
            }
            f0Var3.f298067a = new wi5.g0(ha5Var);
        }
        return f0Var2;
    }
}
