package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes12.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.f0 f143922d;

    public e0(com.tencent.mm.plugin.lite.logic.f0 f0Var) {
        this.f143922d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        this.f143922d.getClass();
        com.tencent.mm.plugin.lite.logic.h0 h0Var = com.tencent.mm.plugin.lite.logic.h0.f143971a;
        synchronized (com.tencent.mm.plugin.lite.logic.g1.s().f143947a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "doCleanLiteApp start");
            java.util.HashSet<java.lang.String> inProcessAppIds = com.tencent.mm.plugin.lite.LiteAppCenter.getInProcessAppIds();
            java.lang.String str = com.tencent.mm.storage.v3.f196275c + "/pkg/";
            boolean z17 = false;
            java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(str, false);
            j17 = 0;
            if (s17 != null) {
                for (com.tencent.mm.vfs.x1 x1Var : s17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "find pkg " + x1Var.f213232b + "  " + x1Var.f213231a);
                    if (x1Var.f213232b.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "wxalitebaselibrary continue");
                    } else if (inProcessAppIds.contains(x1Var.f213232b)) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[z17 ? 1 : 0] = x1Var.f213232b;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: %s is in process, ignore.", objArr);
                    } else {
                        com.tencent.liteapp.storage.WxaLiteAppInfo z18 = com.tencent.mm.plugin.lite.logic.g1.s().z(x1Var.f213232b);
                        java.lang.String str2 = str + x1Var.f213232b;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "absolutePath: " + str2);
                        if (z18 == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f213232b + ", not in db");
                            j17 += h0Var.a(new com.tencent.mm.vfs.r6(str2));
                            com.tencent.mm.vfs.w6.f(str2);
                        } else if ((java.lang.System.currentTimeMillis() / 1000) - z18.updateTime < 86400) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f213232b + ", has recently update. ignore");
                        } else {
                            java.lang.Iterable s18 = com.tencent.mm.vfs.w6.s(str2, z17);
                            if (s18 != null) {
                                java.util.Iterator it = s18.iterator();
                                while (it.hasNext()) {
                                    java.lang.String str3 = str2 + "/" + ((com.tencent.mm.vfs.x1) it.next()).f213232b;
                                    if (str3.equals(z18.path)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f213232b + ", path: " + str3 + " not need to clear.");
                                    } else {
                                        long l17 = com.tencent.mm.vfs.w6.l(str3);
                                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                        if (java.lang.System.currentTimeMillis() - l17 < 86400000) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f213232b + ", path: " + str3 + " has recently modified.");
                                        } else {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f213232b + ", remove path: " + str3);
                                            j17 += h0Var.a(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3)));
                                            com.tencent.mm.vfs.w6.f(str3);
                                        }
                                    }
                                    z17 = false;
                                }
                            }
                        }
                    }
                }
                java.lang.String g17 = com.tencent.mm.plugin.lite.logic.y2.g();
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(g17);
                if (r6Var.m() && r6Var.y()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "clean tmp file.");
                    java.lang.Iterable<com.tencent.mm.vfs.x1> s19 = com.tencent.mm.vfs.w6.s(g17, true);
                    if (s19 != null) {
                        for (com.tencent.mm.vfs.x1 x1Var2 : s19) {
                            if (!x1Var2.f213236f) {
                                long j18 = x1Var2.f213235e;
                                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                if (java.lang.System.currentTimeMillis() - j18 > 259200000) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "remove tmp file: " + x1Var2.f213231a);
                                    j17 += x1Var2.f213233c;
                                    x1Var2.a();
                                }
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "LiteApp Size: " + j17);
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("packageUsage", j17);
            java.lang.String replaceAll = jSONObject.toString().replaceAll(",", ";");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(30758, "cleanLiteAppPackage," + replaceAll);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppLite.LiteAppCheckerListener", e17, "", new java.lang.Object[0]);
        }
    }
}
