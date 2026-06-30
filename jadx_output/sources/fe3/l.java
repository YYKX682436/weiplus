package fe3;

/* loaded from: classes7.dex */
public abstract class l {
    public static java.lang.String a() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicPath"), true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            return null;
        }
        java.lang.String str = i17 + "/biz";
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgPath", "getMagicBizRoot path:%s", str);
        return str;
    }

    public static java.lang.String b() {
        return com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicDebugPath"), true) + "/";
    }

    public static java.lang.String c() {
        java.lang.String e17 = e();
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            return null;
        }
        return e17 + "/network/temp/";
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.String e17 = e();
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            return null;
        }
        java.lang.String str2 = e17 + "/pkg/" + str;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgPath", "getMagicPkgRoot path:%s", str2);
        return str2;
    }

    public static java.lang.String e() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicPath"), true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            return null;
        }
        java.lang.String str = i17 + "/magicpkg";
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgPath", "getMagicRoot path:%s", str);
        return str;
    }

    public static boolean f(com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        if (wxaMagicPkgInfo != null) {
            try {
                java.lang.String str = wxaMagicPkgInfo.f147861g;
                java.lang.String a17 = com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147863i) ? bf3.b0.f19612a.a(wxaMagicPkgInfo.f147862h) : wxaMagicPkgInfo.f147861g;
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgPath", "pkgFileExist pkgId:%s,pid:%s,md5:%s,wxaPkgPath:%s", wxaMagicPkgInfo.f147858d, wxaMagicPkgInfo.f147865n, wxaMagicPkgInfo.f147860f, a17);
                if (com.tencent.mm.vfs.w6.j(a17) && com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgPath", "wxapkg exist");
                    return true;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicPkgPath", e17, "pkgFileExist", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgPath", "pkg not exist");
        return false;
    }
}
