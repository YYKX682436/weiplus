package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes5.dex */
public class u3 implements com.tencent.mm.modelbase.u0 {
    public u3(com.tencent.mm.plugin.fts.logic.c4 c4Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ns.l) {
            com.tencent.mm.pluginsdk.model.m3 m3Var = (com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var);
            if (m3Var.f189382i.get("FTSAddContactTestNetScene") != null) {
                java.util.List list = m3Var.f189379f;
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "bind contact %s success", list.toString());
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSSearchTestLogic", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i18 == -44) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(1);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put((java.lang.String) list.get(0), 0);
                    java.lang.String str2 = (java.lang.String) m3Var.f189382i.get("verifyTicket");
                    ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).getClass();
                    com.tencent.mm.pluginsdk.model.m3 m3Var2 = new com.tencent.mm.pluginsdk.model.m3(2, list, linkedList, null, "你好，我是珍惜", str2, hashMap, str2, "");
                    m3Var2.f189382i.put("FTSAddContactTestNetScene", java.lang.Boolean.TRUE);
                    gm0.j1.d().g(m3Var2);
                }
                if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
                }
            }
        }
    }
}
