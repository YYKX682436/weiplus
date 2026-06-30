package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public abstract class n0 {
    public static void a() {
        gm0.j1.u().c().w(69121, "");
    }

    public static boolean b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppNewIconUtil", "markNew fail, appId is empty");
            return false;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppNewIconUtil", "markNew fail, cfgStg is null");
            return false;
        }
        com.tencent.mm.pluginsdk.ui.tools.m0 m0Var = new com.tencent.mm.pluginsdk.ui.tools.m0(null);
        m0Var.a((java.lang.String) c17.l(69121, null));
        if (!((java.util.ArrayList) m0Var.f191769a).contains(str)) {
            ((java.util.ArrayList) m0Var.f191769a).add(str);
        }
        c17.w(69121, m0Var.b());
        return true;
    }

    public static boolean c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppNewIconUtil", "unmarkNew fail, appId is empty");
            return false;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppNewIconUtil", "unmarkNew fail, cfgStg is null");
            return false;
        }
        com.tencent.mm.pluginsdk.ui.tools.m0 m0Var = new com.tencent.mm.pluginsdk.ui.tools.m0(null);
        m0Var.a((java.lang.String) c17.l(69121, null));
        if (((java.util.ArrayList) m0Var.f191769a).contains(str)) {
            ((java.util.ArrayList) m0Var.f191769a).remove(str);
        }
        c17.w(69121, m0Var.b());
        return true;
    }
}
