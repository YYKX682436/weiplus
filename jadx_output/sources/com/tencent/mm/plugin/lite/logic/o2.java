package com.tencent.mm.plugin.lite.logic;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class o2 implements com.tencent.mm.ipcinvoker.j {
    private o2() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("appId");
        long j17 = bundle.getLong("timeout");
        int i17 = bundle.getInt("from");
        boolean z17 = bundle.getBoolean("syncCheckUpdate");
        com.tencent.mm.plugin.lite.logic.g1.s().p();
        if (j17 <= 0) {
            j17 = 20000;
        }
        long j18 = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp appId:%s", string);
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(string, null);
        if (!com.tencent.mm.plugin.lite.logic.g1.s().H(y17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "no need download, local pkg is debug");
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
            return;
        }
        if (!com.tencent.mm.plugin.lite.logic.g1.s().m(string, y17, z17, i17, j18, null, new com.tencent.mm.plugin.lite.logic.l2(this, rVar))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "appId: %s, not need to checkUpdate.");
            return;
        }
        com.tencent.mm.plugin.lite.logic.k2 k2Var = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.lite.logic.g1.s().f143951e).get(string);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "begin to check appId: %s", string);
        boolean l17 = j62.e.g().l("clicfg_liteapp_update_use_ilink", true, true, true);
        if (l17) {
            if (!((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.lite.logic.g1.s().f143952f).contains(string)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "udr register appId: %s", string);
                ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).aj(string, com.tencent.mm.plugin.lite.logic.LiteAppUDRCheckService.class.getName());
                ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.lite.logic.g1.s().f143952f).add(string);
            }
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c(string);
            qVar.f217549f = new java.util.LinkedList(com.tencent.mm.plugin.lite.logic.LiteAppUDRCheckService.configCheckParameters());
            qVar.f217550g[3] = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(string);
            com.tencent.mm.plugin.lite.logic.g1.s().M(arrayList, "ilink", false);
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
            return;
        }
        java.lang.String str2 = "";
        if (java.util.Arrays.asList(j62.e.g().a("clicfg_liteapp_use_raven_list", "", true, true).split(",")).contains(string) || l17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (y17 != null) {
                arrayList2.add(new e70.v(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, y17.iLinkVersion));
            }
            e70.w wVar = new e70.w(string, null, arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(string);
            com.tencent.mm.plugin.lite.logic.g1.s().M(arrayList3, "ilink", false);
            ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Bi(wVar, new com.tencent.mm.plugin.lite.logic.m2(this, k2Var, y17, string));
            return;
        }
        if (y17 != null && (str = y17.patchId) != null && !str.isEmpty()) {
            str2 = y17.patchId;
        }
        oq1.r rVar2 = new oq1.r();
        rVar2.f347368a = string;
        rVar2.f347369b = string;
        rVar2.f347370c = str2;
        if (y17 == null || z17) {
            rVar2.f347371d = 1;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(string);
        com.tencent.mm.plugin.lite.logic.g1.s().M(arrayList4, com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_DIRECTORY_NAME, false);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).wi(rVar2, new com.tencent.mm.plugin.lite.logic.n2(this, k2Var, string, y17));
    }
}
