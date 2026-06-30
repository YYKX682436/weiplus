package et1;

/* loaded from: classes8.dex */
public abstract class c implements vg3.t3 {
    @Override // vg3.t3
    public void C0(com.tencent.mm.storage.f9 f9Var, xg3.l0 notifyInfo, boolean[] isConsumed) {
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        kotlin.jvm.internal.o.g(isConsumed, "isConsumed");
        java.lang.String str = notifyInfo.f454410a;
        if (str == null || !m(str)) {
            return;
        }
        jz5.f0 f0Var = null;
        if (f9Var != null) {
            com.tencent.mm.storage.f9 f9Var2 = (f9Var.getMsgId() > 0L ? 1 : (f9Var.getMsgId() == 0L ? 0 : -1)) != 0 ? f9Var : null;
            if (f9Var2 != null) {
                et1.b h17 = h(f9Var2);
                int i17 = kotlin.jvm.internal.o.b(notifyInfo.f454411b, "insert") ? notifyInfo.f454413d : 0;
                java.lang.Object f17 = f(str);
                c(f17, f9Var, notifyInfo);
                java.lang.Object n17 = n(f17, i(str), f9Var2, h17, i17, notifyInfo);
                if (n17 != null) {
                    l(n17);
                    b(n17, i17, f9Var2);
                    f0Var = jz5.f0.f302826a;
                }
            }
        }
        if (f0Var == null) {
            k(str);
        }
        isConsumed[0] = true;
    }

    @Override // vg3.t3
    public void S0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    @Override // vg3.t3
    public void W(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    public abstract void b(java.lang.Object obj, int i17, com.tencent.mm.storage.f9 f9Var);

    public abstract void c(java.lang.Object obj, com.tencent.mm.storage.f9 f9Var, xg3.l0 l0Var);

    public abstract java.lang.Object f(java.lang.String str);

    public et1.b h(com.tencent.mm.storage.f9 latestMsg) {
        kotlin.jvm.internal.o.g(latestMsg, "latestMsg");
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        ((com.tencent.mm.app.u7) Di.w()).getClass();
        qm.a0.d(latestMsg, pString, pString2, pInt, false);
        return new et1.b(pString, pString2);
    }

    public abstract java.lang.Object i(java.lang.String str);

    public abstract void k(java.lang.String str);

    public abstract void l(java.lang.Object obj);

    public abstract boolean m(java.lang.String str);

    public abstract java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.tencent.mm.storage.f9 f9Var, et1.b bVar, int i17, xg3.l0 l0Var);
}
