package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.messenger.foundation.o f148701a = new com.tencent.mm.plugin.messenger.foundation.o();

    public final void a(java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = ((fs.c) fs.g.f(vg3.s4.class)).all().iterator();
        while (it.hasNext()) {
            vg3.s4 s4Var = (vg3.s4) ((fs.q) it.next()).get();
            if (s4Var != null) {
                s4Var.i(str, str2);
            }
        }
        com.tencent.mm.plugin.messenger.foundation.n.f148699f.i(str, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateHelper", "notifyBeforeAddContact " + str + ", " + str2);
    }

    public final void b(com.tencent.mm.storage.z3 z3Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(vg3.s4.class)).all().iterator();
        while (it.hasNext()) {
            vg3.s4 s4Var = (vg3.s4) ((fs.q) it.next()).get();
            if (s4Var != null) {
                s4Var.f(z3Var);
            }
        }
        com.tencent.mm.plugin.messenger.foundation.n.f148699f.f(z3Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyBeforeAddOpenIMContact ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateHelper", sb6.toString());
    }

    public final void c(com.tencent.mm.storage.z3 z3Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(vg3.s4.class)).all().iterator();
        while (it.hasNext()) {
            vg3.s4 s4Var = (vg3.s4) ((fs.q) it.next()).get();
            if (s4Var != null) {
                s4Var.t(z3Var);
            }
        }
        com.tencent.mm.plugin.messenger.foundation.n.f148699f.t(z3Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyBeforeDelContact ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateHelper", sb6.toString());
    }

    public final void d(com.tencent.mm.storage.z3 z3Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(vg3.s4.class)).all().iterator();
        while (it.hasNext()) {
            vg3.s4 s4Var = (vg3.s4) ((fs.q) it.next()).get();
            if (s4Var != null) {
                s4Var.q(z3Var);
            }
        }
        com.tencent.mm.plugin.messenger.foundation.n.f148699f.q(z3Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyBeforeDelOpenIMContact ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateHelper", sb6.toString());
    }
}
