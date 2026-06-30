package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public abstract class z {
    public static boolean a(com.tencent.mm.vfs.r6 r6Var, java.util.Map map) {
        com.tencent.mm.vfs.r6[] G;
        if (map == null) {
            map = new java.util.HashMap();
        }
        if (r6Var == null || !r6Var.y() || (G = r6Var.G()) == null || G.length == 0) {
            return false;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            com.tencent.mm.vfs.r6[] G2 = r6Var2.G();
            if (G2 != null && G2.length != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.tencent.mm.vfs.r6 r6Var3 : G2) {
                    com.tencent.mm.plugin.wepkg.model.y yVar = new com.tencent.mm.plugin.wepkg.model.y(null);
                    yVar.f188479a = r6Var3.getName();
                    java.lang.String str = r6Var3.o() + "/package";
                    if (com.tencent.mm.vfs.w6.j(str)) {
                        yVar.f188480b = str;
                    }
                    com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(r6Var3.o() + "/preload_files");
                    if (r6Var4.y()) {
                        com.tencent.mm.vfs.r6[] G3 = r6Var4.G();
                        if (G3 == null || G3.length == 0) {
                            arrayList.add(yVar);
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (com.tencent.mm.vfs.r6 r6Var5 : G3) {
                                arrayList2.add(r6Var5.getName());
                            }
                            yVar.f188481c = arrayList2;
                            arrayList.add(yVar);
                        }
                    } else {
                        arrayList.add(yVar);
                    }
                }
                map.put(r6Var2.getName(), arrayList);
            }
        }
        return true;
    }

    public static void b(kh0.f fVar) {
        java.lang.String c17 = com.tencent.mm.plugin.wepkg.model.l.c();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c17);
        if ((!r6Var.m() || !r6Var.y()) && fVar != null) {
            fVar.a(null);
        }
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 1001;
        wepkgCrossProcessTask.f188350r = new com.tencent.mm.plugin.wepkg.model.u(wepkgCrossProcessTask, c17, r6Var, fVar);
        wepkgCrossProcessTask.d();
    }

    public static com.tencent.mm.plugin.wepkg.model.o c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "pkgid or pkgPath or md5 is null, pkg invalid");
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3));
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, pkgPath:%s, file dont exist", str3);
            f(str);
            com.tencent.mm.plugin.wepkg.utils.a.c("PkgModified", null, str, str2, 1L, 0L, null);
            return null;
        }
        if (r6Var.C() != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, [server_pkgSize:%d] != [local_pkgSize:%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(r6Var.C()));
            r6Var.l();
            f(str);
            com.tencent.mm.plugin.wepkg.utils.a.c("PkgModified", null, str, str2, 2L, 0L, null);
            return null;
        }
        if (r6Var.C() <= 5242880) {
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
            if (!str4.equalsIgnoreCase(p17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage, [server_md5:%s] != [local_md5:%s]", str4, p17);
                r6Var.l();
                f(str);
                com.tencent.mm.plugin.wepkg.utils.a.c("PkgModified", null, str, str2, 3L, 0L, null);
                return null;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage fileLength(%d) > checkSize(%d). dont check md5", java.lang.Long.valueOf(r6Var.C()), 5242880L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "this is big package. localPath: %s", str3);
        com.tencent.mm.plugin.wepkg.model.o oVar = new com.tencent.mm.plugin.wepkg.model.o(r6Var);
        if (oVar.f188447b && oVar.f188450e != null) {
            return oVar;
        }
        com.tencent.mm.plugin.wepkg.model.i.c().g(str, 2, 4);
        return null;
    }

    public static java.util.Map d(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List<com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile> c17 = com.tencent.mm.plugin.wepkg.model.o0.c(str);
        if (com.tencent.mm.sdk.platformtools.t8.L0(c17)) {
            return hashMap;
        }
        boolean z18 = false;
        for (com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile : c17) {
            if (wepkgPreloadFile != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(wepkgPreloadFile.f188365g)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, pkgPath is null, isAtomic:%s", java.lang.Boolean.valueOf(z17));
                    if (z17) {
                        e(wepkgPreloadFile.f188363e, wepkgPreloadFile.f188366h);
                        z18 = true;
                    } else {
                        com.tencent.mm.plugin.wepkg.model.o0.g(str, wepkgPreloadFile.f188366h, "", false, null);
                    }
                } else {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(wepkgPreloadFile.f188365g);
                    if (r6Var.m()) {
                        long C = r6Var.C();
                        int i17 = wepkgPreloadFile.f188370o;
                        if (C != i17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, [server_pkgSize:%d] != [local_pkgSize:%d], isAtomic:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(r6Var.C()), java.lang.Boolean.valueOf(z17));
                            if (z17) {
                                e(wepkgPreloadFile.f188363e, wepkgPreloadFile.f188366h);
                                r6Var.l();
                                z18 = true;
                            } else {
                                com.tencent.mm.plugin.wepkg.model.o0.g(str, wepkgPreloadFile.f188366h, "", false, null);
                            }
                        } else {
                            hashMap.put(wepkgPreloadFile.f188366h, wepkgPreloadFile);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, pkgPath:%s, file dont exist, isAtomic:%s", wepkgPreloadFile.f188365g, java.lang.Boolean.valueOf(z17));
                        if (z17) {
                            e(wepkgPreloadFile.f188363e, wepkgPreloadFile.f188366h);
                            z18 = true;
                        } else {
                            com.tencent.mm.plugin.wepkg.model.o0.g(str, wepkgPreloadFile.f188366h, "", false, null);
                        }
                    }
                }
            }
        }
        if (z18) {
            return null;
        }
        return hashMap;
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        com.tencent.mm.plugin.wepkg.model.o0.g(str, str2, "", false, new com.tencent.mm.plugin.wepkg.model.x(str, new com.tencent.mm.plugin.wepkg.model.w()));
    }

    public static void f(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.wepkg.model.o0.h(str, "", false, new com.tencent.mm.plugin.wepkg.model.v());
    }
}
