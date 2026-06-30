package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.p3 f207999d;

    public q3(com.tencent.mm.ui.conversation.p3 p3Var) {
        this.f207999d = p3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.p3 p3Var = this.f207999d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationLongClickListener", "dismiss conv confirm:%s", p3Var.f207958d.f208040g);
        p3Var.f207958d.d(14);
        if (com.tencent.mm.storage.z3.w4(p3Var.f207958d.f208040g) || com.tencent.mm.storage.z3.W3(p3Var.f207958d.f208040g)) {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).n(p3Var.f207958d.f208040g);
        } else {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str = p3Var.f207958d.f208040g;
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(str)) {
                rv.u2 u2Var2 = (rv.u2) i95.n0.c(rv.u2.class);
                java.lang.String str2 = p3Var.f207958d.f208040g;
                ((qv.o) u2Var2).getClass();
                if (!r01.z.g(str2)) {
                    c01.h2.j(p3Var.f207958d.f208040g);
                }
            }
            r01.q3.aj().z0(p3Var.f207958d.f208040g);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(p3Var.f207958d.f208040g);
        }
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str3 = p3Var.f207958d.f208040g;
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.I(str3, 14);
    }
}
