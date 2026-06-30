package n81;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final n81.o f335627d = new n81.o();

    public o() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.lang.String str;
        java.lang.Iterable s17;
        java.lang.Iterable s18;
        java.lang.Iterable s19;
        java.lang.String Ai;
        java.lang.Iterable<com.tencent.mm.vfs.x1> s27;
        n81.e it = (n81.e) obj;
        kotlin.jvm.internal.o.g(it, "it");
        n81.p pVar = n81.p.f335628a;
        long j17 = it.f335615b;
        gm0.m b17 = gm0.j1.b();
        java.lang.String j18 = b17 != null ? b17.j() : null;
        if (j18 == null) {
            j18 = "";
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str2 = it.f335614a;
        java.lang.String str3 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.f(str2).f76276e;
        if (str3 != null && (s27 = com.tencent.mm.vfs.w6.s(str3, false)) != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s27) {
                java.lang.String name = x1Var.f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                boolean z18 = (r26.i0.n(name, ".data", false) || r26.i0.y(name, "store_", false) || r26.i0.n(name, ".nomedia", false)) ? false : true;
                java.lang.String str4 = x1Var.f213232b;
                if (z18) {
                    n81.p.c(linkedHashMap, "fsTmp", pVar.e(str3) + str4);
                } else {
                    n81.p.c(linkedHashMap, "fsStore", pVar.e(str3) + str4);
                }
            }
        }
        java.lang.String str5 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.i(j18, str2).f76225d;
        if (str5 != null && com.tencent.mm.vfs.w6.j(str5)) {
            n81.p.c(linkedHashMap, "fsUsr", str5);
        }
        java.lang.String str6 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.j(j18, str2).f76225d;
        if (str6 != null && com.tencent.mm.vfs.w6.j(str6)) {
            n81.p.c(linkedHashMap, "fsOther", str6);
        }
        java.lang.String str7 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.k(j18, str2).f76225d;
        if (str7 != null && com.tencent.mm.vfs.w6.j(str7)) {
            n81.p.c(linkedHashMap, "fsOther", str7);
        }
        java.lang.String str8 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.c(j18, str2).f76225d;
        if (str8 != null && com.tencent.mm.vfs.w6.j(str8)) {
            n81.p.c(linkedHashMap, "fsOther", str8);
        }
        java.lang.String str9 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.l(j18, str2).f76225d;
        if (str9 != null && com.tencent.mm.vfs.w6.j(str9)) {
            n81.p.c(linkedHashMap, "fsOther", str9);
        }
        java.lang.String fileSystemPath = com.tencent.mm.minigame.j1.f69084a.getFileSystemPath(str2);
        if (fileSystemPath != null && com.tencent.mm.vfs.w6.j(fileSystemPath)) {
            n81.p.c(linkedHashMap, "vaGame", fileSystemPath);
        }
        j81.k kVar = (j81.k) i95.n0.c(j81.k.class);
        if (kVar != null && (Ai = ((k81.a) kVar).Ai(str2)) != null && pVar.j(Ai)) {
            n81.p.c(linkedHashMap, "xnetModel", Ai);
        }
        java.lang.String str10 = new te.a(j18, str2).f417764d;
        if (str10 != null && pVar.j(str10)) {
            n81.p.c(linkedHashMap, "wxAudio", str10);
        }
        java.lang.String a17 = ri1.q.a(str2);
        if (a17 != null && pVar.j(a17)) {
            n81.p.c(linkedHashMap, "renderCache", a17);
        }
        java.lang.String a18 = com.tencent.mm.plugin.appbrand.jsruntime.u1.a();
        if (!(a18 == null || a18.length() == 0) && (s19 = com.tencent.mm.vfs.w6.s(a18, false)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : s19) {
                java.lang.String name2 = ((com.tencent.mm.vfs.x1) obj2).f213232b;
                kotlin.jvm.internal.o.f(name2, "name");
                if (r26.n0.B(name2, str2, false)) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                n81.p.c(linkedHashMap, "codeCache", pVar.e(a18) + ((com.tencent.mm.vfs.x1) it6.next()).f213232b);
            }
        }
        java.lang.String c17 = com.tencent.mm.plugin.appbrand.jsruntime.u1.c();
        if (!(c17 == null || c17.length() == 0) && (s18 = com.tencent.mm.vfs.w6.s(c17, false)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : s18) {
                java.lang.String name3 = ((com.tencent.mm.vfs.x1) obj3).f213232b;
                kotlin.jvm.internal.o.f(name3, "name");
                if (r26.n0.B(name3, str2, false)) {
                    arrayList2.add(obj3);
                }
            }
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                n81.p.c(linkedHashMap, "codeCache", pVar.e(c17) + ((com.tencent.mm.vfs.x1) it7.next()).f213232b);
            }
        }
        java.lang.String c18 = com.tencent.mm.plugin.appbrand.page.sb.f87090c.c();
        if (!(c18 == null || c18.length() == 0) && (s17 = com.tencent.mm.vfs.w6.s(c18, false)) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : s17) {
                java.lang.String name4 = ((com.tencent.mm.vfs.x1) obj4).f213232b;
                kotlin.jvm.internal.o.f(name4, "name");
                if (r26.n0.B(name4, str2, false)) {
                    arrayList3.add(obj4);
                }
            }
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                n81.p.c(linkedHashMap, "pagesScript", pVar.e(c18) + ((com.tencent.mm.vfs.x1) it8.next()).f213232b);
            }
        }
        java.lang.String a19 = com.tencent.mm.plugin.appbrand.jsruntime.d2.a();
        if (!(a19 == null || a19.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            kotlin.jvm.internal.o.d(a19);
            sb6.append(pVar.e(a19));
            sb6.append(str2);
            java.lang.String sb7 = sb6.toString();
            if (com.tencent.mm.vfs.w6.j(sb7)) {
                n81.p.c(linkedHashMap, "wasmCache", sb7);
            }
        }
        java.lang.String a27 = com.tencent.mm.plugin.appbrand.jsruntime.l1.a();
        if (!(a27 == null || a27.length() == 0)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            kotlin.jvm.internal.o.d(a27);
            sb8.append(pVar.e(a27));
            sb8.append(str2);
            java.lang.String sb9 = sb8.toString();
            if (com.tencent.mm.vfs.w6.j(sb9)) {
                n81.p.c(linkedHashMap, "shaderCache", sb9);
            }
        }
        java.lang.String g17 = pVar.g();
        java.lang.Iterable s28 = com.tencent.mm.vfs.w6.s(g17, false);
        if (s28 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj5 : s28) {
                java.lang.String name5 = ((com.tencent.mm.vfs.x1) obj5).f213232b;
                kotlin.jvm.internal.o.f(name5, "name");
                if (r26.n0.B(name5, str2, false)) {
                    arrayList4.add(obj5);
                }
            }
            java.util.Iterator it9 = arrayList4.iterator();
            while (it9.hasNext()) {
                n81.p.c(linkedHashMap, "pagesIdx", pVar.e(g17) + ((com.tencent.mm.vfs.x1) it9.next()).f213232b);
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
        if (Di != null) {
            for (com.tencent.mm.plugin.appbrand.appcache.n9 n9Var : Di.n(str2)) {
                java.lang.String str11 = n9Var != null ? n9Var.field_pkgPath : null;
                if (str11 != null && com.tencent.mm.vfs.w6.j(str11) && r26.n0.B(str11, "appbrand/pkg/general/", false)) {
                    if (!((n9Var == null || (str = n9Var.field_appId) == null) ? false : r26.i0.n(str, "$__PLUGINCODE__", false))) {
                        if ((n9Var != null ? n9Var.field_appId : null) != null) {
                            java.util.LinkedHashSet<java.lang.String> linkedHashSet = new java.util.LinkedHashSet();
                            linkedHashSet.addAll(k91.e3.f305571b);
                            i95.m c19 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
                            kotlin.jvm.internal.o.e(c19, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
                            java.util.List wi6 = ((com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1) c19).wi();
                            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(wi6, 10));
                            java.util.Iterator it10 = wi6.iterator();
                            while (it10.hasNext()) {
                                arrayList5.add(((com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) it10.next()).f75780d);
                            }
                            linkedHashSet.addAll(arrayList5);
                            for (java.lang.String str12 : linkedHashSet) {
                                java.lang.String field_appId = n9Var.field_appId;
                                kotlin.jvm.internal.o.f(field_appId, "field_appId");
                                if (r26.n0.B(field_appId, str12, false)) {
                                    z17 = true;
                                    break;
                                }
                            }
                        }
                        z17 = false;
                        if (!z17) {
                            n81.p.c(linkedHashMap, "releasePkg", str11);
                        }
                    }
                }
            }
        }
        java.util.List r17 = kz5.d0.r(linkedHashMap.values());
        if (((java.util.ArrayList) r17).isEmpty()) {
            return null;
        }
        n81.h hVar = new n81.h(str2, r17);
        int i17 = it.f335616c;
        return new n81.d(str2, i17 != 4 ? i17 != 7 ? 2 : 8 : 4, j17, r17, linkedHashMap, new n81.f(r17), new n81.g(linkedHashMap), hVar);
    }
}
