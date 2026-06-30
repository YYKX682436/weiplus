package rg1;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public final class h extends i95.w implements sg1.f {

    /* renamed from: d, reason: collision with root package name */
    public static final rg1.h f395218d = new rg1.h();

    public static final sg1.e wi(rg1.h hVar, r45.me3 me3Var) {
        hVar.getClass();
        sg1.e eVar = new sg1.e();
        r45.jr5 jr5Var = me3Var.f380405n;
        eVar.f388073d = jr5Var.f378070d;
        java.lang.String str = jr5Var.f378072f;
        if (str == null) {
            str = "";
        }
        eVar.f388074e = str;
        eVar.f388075f = jr5Var.f378073g;
        eVar.f388076g = me3Var.f380402h;
        if (me3Var.f380404m) {
            java.lang.String str2 = me3Var.f380407p;
            if (!(str2 == null || str2.length() == 0)) {
                eVar.f407878h = me3Var.f380407p;
                eVar.f407879i = me3Var.f380399e;
                eVar.f407880m = me3Var.f380401g;
                return eVar;
            }
        }
        eVar.f407878h = me3Var.f380400f;
        eVar.f407879i = me3Var.f380399e;
        eVar.f407880m = me3Var.f380401g;
        return eVar;
    }

    public void Ai(java.util.List list) {
        java.lang.String str;
        boolean z17;
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            kotlin.jvm.internal.o.g(pair, "<this>");
            sg1.e eVar = (sg1.e) pair.first;
            java.lang.String str2 = (java.lang.String) pair.second;
            if (eVar != null) {
                java.lang.String str3 = eVar.f388073d;
                if (!(str3 == null || str3.length() == 0)) {
                    java.lang.String str4 = eVar.f407878h;
                    if (!(str4 == null || str4.length() == 0)) {
                        if (str2 != null && com.tencent.mm.vfs.w6.j(str2)) {
                            java.lang.String str5 = eVar.f388073d;
                            java.lang.String str6 = eVar.f388074e;
                            int i17 = eVar.f388075f;
                            if (i17 == 0) {
                                str = "";
                            } else if (i17 == 6) {
                                str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.PLUGIN_CODE;
                            } else if (i17 == 12) {
                                str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
                            } else if (i17 == 13) {
                                str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str6) + "$__WITHOUT_PLUGINCODE__";
                            } else if (i17 == 22) {
                                str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
                            } else if (i17 != 23) {
                                str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str6);
                            } else {
                                str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str6) + "$__WITHOUT_MULTI_PLUGINCODE__";
                            }
                            java.lang.String str7 = null;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(str5);
                                sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : "$" + str);
                                str7 = sb6.toString();
                            }
                            kotlin.jvm.internal.o.f(str7, "toString(...)");
                            com.tencent.mm.plugin.appbrand.appcache.n9 L = com.tencent.mm.plugin.appbrand.app.r9.Di().L(str7, eVar.f388076g, 0, "versionMd5", "NewMd5");
                            if (L != null) {
                                java.lang.String f17 = com.tencent.mm.plugin.appbrand.appcache.e9.f(str7, eVar.f388076g);
                                kotlin.jvm.internal.o.d(str2);
                                java.lang.String calcFileMD5 = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).calcFileMD5(com.tencent.mm.vfs.w6.i(str2, false));
                                boolean b17 = com.tencent.mm.plugin.appbrand.appcache.gc.b(str2);
                                if (b17) {
                                    if (!kotlin.jvm.internal.o.b(calcFileMD5, eVar.f407878h)) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk rejected zstd file checksum invalid appId[" + eVar.f388073d + "] key[" + eVar.f388074e + "] type[" + eVar.f388075f + "] version[" + eVar.f388076g + "] fileMD5[" + calcFileMD5 + ']');
                                    } else if (com.tencent.mm.plugin.appbrand.appcache.gc.a(str2, f17)) {
                                        kotlin.jvm.internal.o.d(f17);
                                        java.lang.String calcFileMD52 = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).calcFileMD5(com.tencent.mm.vfs.w6.i(f17, false));
                                        java.lang.String[] strArr = {L.field_versionMd5, L.field_NewMd5};
                                        for (int i18 = 0; i18 < 2; i18++) {
                                            java.lang.String str8 = strArr[i18];
                                            if (!(str8 == null || str8.length() == 0) && kotlin.jvm.internal.o.b(str8, calcFileMD52)) {
                                                z17 = true;
                                                break;
                                            }
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk rejected zstd uncompress failed appId[" + eVar.f388073d + "] key[" + eVar.f388074e + "] type[" + eVar.f388075f + "] version[" + eVar.f388076g + "] fileMD5[" + calcFileMD5 + ']');
                                    }
                                    z17 = false;
                                } else {
                                    java.lang.String[] strArr2 = {L.field_versionMd5, L.field_NewMd5};
                                    for (int i19 = 0; i19 < 2; i19++) {
                                        java.lang.String str9 = strArr2[i19];
                                        if (!(str9 == null || str9.length() == 0) && kotlin.jvm.internal.o.b(str9, calcFileMD5)) {
                                            z17 = true;
                                            break;
                                        }
                                    }
                                    z17 = false;
                                }
                                if (z17) {
                                    if (!b17) {
                                        com.tencent.mm.vfs.w6.w(str2, f17);
                                    }
                                    com.tencent.mm.plugin.appbrand.app.r9.Di().F(str7, 0, eVar.f388076g, f17);
                                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                    if (z65.c.a()) {
                                        pm0.v.X(new rg1.a(eVar, b17));
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk accepted appId[" + eVar.f388073d + "] key[" + eVar.f388074e + "] type[" + eVar.f388075f + "] version[" + eVar.f388076g + "] fileMD5[" + calcFileMD5 + "] zstd?[" + b17 + ']');
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk rejected appId[" + eVar.f388073d + "] key[" + eVar.f388074e + "] type[" + eVar.f388075f + "] version[" + eVar.f388076g + "] fileMD5[" + calcFileMD5 + "] zstd?[" + b17 + ']');
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public km5.q Bi(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "prefetchContactAndPkgDownloadInfo EMPTY USERNAME");
            return pq5.h.d(null);
        }
        pq5.g q17 = pq5.h.a().q(new rg1.c(str)).q(new rg1.f(x6Var, str2, str));
        kotlin.jvm.internal.o.f(q17, "$logic(...)");
        return q17;
    }

    public void Di(java.lang.String str, r.a aVar) {
        if (!(str == null || str.length() == 0)) {
            com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75859a.a(kz5.b0.c(str), k91.h1.WX_OPEN_SDK_PRE_FETCH, new rg1.g(aVar, str));
        } else if (aVar != null) {
        }
    }
}
