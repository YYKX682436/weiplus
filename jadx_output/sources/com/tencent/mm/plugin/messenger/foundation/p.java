package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes11.dex */
public final class p implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof com.tencent.mm.pluginsdk.model.m3;
            com.tencent.mm.plugin.messenger.foundation.o oVar = com.tencent.mm.plugin.messenger.foundation.o.f148701a;
            if (!z17) {
                if (m1Var instanceof l41.h0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd MMFunc_VerifyOpenIMContact, tpUsername: ");
                    l41.h0 h0Var = (l41.h0) m1Var;
                    sb6.append(h0Var.f315823f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateOnSceneEnd", sb6.toString());
                    oVar.b(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h0Var.f315823f, true));
                    return;
                }
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSceneEnd rtVERIFYUSER, verifyUser: ");
            com.tencent.mm.pluginsdk.model.m3 m3Var = (com.tencent.mm.pluginsdk.model.m3) m1Var;
            sb7.append(m3Var.f189379f.size());
            sb7.append(", op=");
            sb7.append(m3Var.f189380g);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateOnSceneEnd", sb7.toString());
            if (m3Var.f189380g == 3) {
                java.util.List<java.lang.String> list = m3Var.f189379f;
                kotlin.jvm.internal.o.f(list, "getVerifyUser(...)");
                for (java.lang.String str2 : list) {
                    oVar.a(str2, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true).J0());
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateOnSceneEnd", "onSceneEnd rtVERIFYUSER, notify beforeAddContact: " + str2);
                }
            }
        }
    }
}
