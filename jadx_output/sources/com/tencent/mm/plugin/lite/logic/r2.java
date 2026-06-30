package com.tencent.mm.plugin.lite.logic;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class r2 implements com.tencent.mm.ipcinvoker.j {
    private r2() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("appId");
        long j17 = bundle.getLong("timeout");
        if (j17 <= 0) {
            j17 = 20000;
        }
        long j18 = j17;
        int i17 = bundle.getInt("from");
        boolean z17 = bundle.getBoolean("syncCheckUpdate");
        com.tencent.mm.plugin.lite.logic.g1.s().p();
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(string, null);
        if (!com.tencent.mm.plugin.lite.logic.g1.s().H(y17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "no need check pay liteapp, info: %s", y17.toString());
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
            return;
        }
        com.tencent.mm.plugin.lite.logic.g1.s().m(string, y17, z17, i17, j18, null, new com.tencent.mm.plugin.lite.logic.p2(this, rVar));
        com.tencent.mm.plugin.lite.logic.k2 k2Var = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.lite.logic.g1.s().f143951e).get(string);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (y17 != null) {
            r45.vc4 vc4Var = new r45.vc4();
            vc4Var.f388097d = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
            vc4Var.f388098e = y17.iLinkVersion;
            linkedList.add(vc4Var);
        }
        ((s80.e) ((t80.h) i95.n0.c(t80.h.class))).Ai(string, null, linkedList, new com.tencent.mm.plugin.lite.logic.q2(this, string, null, y17, k2Var));
    }
}
