package com.tencent.mm.plugin.game.commlib.util;

/* loaded from: classes8.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f139419a = lp0.b.e() + "game/";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f139420b = lp0.b.D() + "game/";

    public static boolean a(com.tencent.mm.vfs.r6 r6Var, long j17) {
        com.tencent.mm.vfs.r6[] G;
        if (r6Var == null || !r6Var.m()) {
            return false;
        }
        if (r6Var.A()) {
            if (java.lang.System.currentTimeMillis() - r6Var.B() <= j17) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameFileManager", "remove file:%s, lifetime:%d", r6Var.o(), java.lang.Long.valueOf(j17));
            r6Var.l();
            return true;
        }
        if (!r6Var.y() || (G = r6Var.G()) == null) {
            return true;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            a(r6Var2, j17);
        }
        return true;
    }

    public static java.lang.String b(com.tencent.mm.plugin.game.commlib.util.l lVar) {
        return f139420b + lVar.name() + "/";
    }

    public static java.lang.String c(com.tencent.mm.plugin.game.commlib.util.l lVar) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String e17 = com.tencent.mm.vfs.e8.e(com.tencent.mm.vfs.a3.f212781a.c(), "account");
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            str = f139420b;
        } else {
            str = lp0.b.D() + e17 + "/game/";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFileManager", "getGameSdcardRootPathByUin, validPath:%s", str);
        sb6.append(str);
        sb6.append(lVar.name());
        sb6.append("/");
        return sb6.toString();
    }

    public static java.lang.String d() {
        java.lang.String str;
        java.lang.String e17 = com.tencent.mm.vfs.e8.e(com.tencent.mm.vfs.a3.f212781a.c(), "account");
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            str = f139419a;
        } else {
            str = lp0.b.e() + e17 + "/game/";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFileManager", "getGameDataRootPathByUin, validPath:%s", str);
        return str;
    }

    public static java.lang.String e(com.tencent.mm.plugin.game.commlib.util.l lVar) {
        return d() + lVar.name() + "/";
    }

    public static void f(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFileManager", "delete file:%s, ret:%b", str, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.h(str)));
    }
}
