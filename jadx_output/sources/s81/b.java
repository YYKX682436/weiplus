package s81;

/* loaded from: classes7.dex */
public final class b extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f404725f = {l75.n0.getCreateSQLs(s81.c.A, "AppBrandWxaPkgPreDownloadStatistics2"), "DROP TABLE IF EXISTS AppBrandWxaPkgPreDownloadStatistics"};

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f404726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, s81.c.A, "AppBrandWxaPkgPreDownloadStatistics2", dm.l0.f238150o);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f404726e = db6;
    }

    public final java.lang.String y0(s81.c cVar) {
        return "appId:" + cVar.field_appId + ", version:" + cVar.field_version + ", packageType:" + cVar.field_packageType + ", packageKey:" + cVar.field_packageKey + ", source:" + cVar.field_source + ", reportId:" + cVar.field_reportId;
    }

    public final void z0() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var;
        java.lang.String str2;
        android.database.Cursor all = getAll();
        if (all != null) {
            try {
                if (all.moveToFirst()) {
                    java.util.LinkedList<s81.c> linkedList = new java.util.LinkedList();
                    do {
                        s81.c cVar = new s81.c();
                        cVar.convertFrom(all);
                        linkedList.add(cVar);
                    } while (all.moveToNext());
                    for (s81.c cVar2 : linkedList) {
                        java.lang.String str3 = cVar2.field_appId;
                        java.lang.String str4 = cVar2.field_packageKey;
                        int i17 = cVar2.field_packageType;
                        java.lang.String str5 = "";
                        if (i17 == 0) {
                            str = "";
                        } else if (i17 == 6) {
                            str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.PLUGIN_CODE;
                        } else if (i17 == 12) {
                            str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
                        } else if (i17 == 13) {
                            str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str4) + "$__WITHOUT_PLUGINCODE__";
                        } else if (i17 == 22) {
                            str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
                        } else if (i17 != 23) {
                            str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str4);
                        } else {
                            str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str4) + "$__WITHOUT_MULTI_PLUGINCODE__";
                        }
                        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
                        boolean z17 = true;
                        if (Di != null) {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(str3);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                    str5 = "$" + str;
                                }
                                sb6.append(str5);
                                str2 = sb6.toString();
                            } else {
                                str2 = null;
                            }
                            n9Var = Di.L(str2, cVar2.field_version, 0, "pkgPath");
                        } else {
                            n9Var = null;
                        }
                        if (n9Var != null) {
                            java.lang.String str6 = n9Var.field_pkgPath;
                            if (str6 != null && str6.length() != 0) {
                                z17 = false;
                            }
                        }
                        super.delete(cVar2, new java.lang.String[0]);
                    }
                }
            } finally {
            }
        }
        vz5.b.a(all, null);
    }
}
