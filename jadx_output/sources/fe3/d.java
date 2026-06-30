package fe3;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final fe3.d f261540a = new fe3.d();

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "doCleanAll start");
        java.util.List<com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo> e17 = fe3.j.b().e();
        if (e17 != null && (!e17.isEmpty())) {
            for (com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo : e17) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147858d)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "pkgId %s is busy now", wxaMagicPkgInfo.f147858d);
                } else {
                    fe3.j.b().h(wxaMagicPkgInfo);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "doCleanAll end");
    }

    public final void b(java.lang.String pkgId, com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        kotlin.jvm.internal.o.g(pkgId, "pkgId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg start pkgId:%s", pkgId);
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo c17 = fe3.j.b().c(pkgId);
        if (c17 == null || com.tencent.mm.sdk.platformtools.t8.K0(c17.f147858d) || wxaMagicPkgInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147858d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg invaild pkgInfo");
            return;
        }
        java.lang.String d17 = fe3.l.d(c17.f147858d);
        if (d17 == null) {
            return;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(d17, true);
        kotlin.jvm.internal.o.d(i17);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(i17));
        if (r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "pkg patchId:%s,lastpkg patchId:%s", c17.f147865n, wxaMagicPkgInfo.f147865n);
            com.tencent.mm.vfs.r6[] G = r6Var.G();
            if (G != null) {
                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "local path:%s", r6Var2.u());
                    if (!kotlin.jvm.internal.o.b(r6Var2.u(), com.tencent.mm.vfs.w6.i(c17.f147861g, true)) && !kotlin.jvm.internal.o.b(r6Var2.u(), com.tencent.mm.vfs.w6.i(c17.f147862h, true)) && !kotlin.jvm.internal.o.b(r6Var2.u(), com.tencent.mm.vfs.w6.i(wxaMagicPkgInfo.f147861g, true)) && !kotlin.jvm.internal.o.b(r6Var2.u(), com.tencent.mm.vfs.w6.i(wxaMagicPkgInfo.f147862h, true))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "delete old version folder.");
                        com.tencent.mm.vfs.w6.f(r6Var2.u());
                        com.tencent.mm.vfs.w6.h(r6Var2.u());
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "files is empty");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "pkgId %s dir not exist", c17.f147858d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg end");
    }
}
