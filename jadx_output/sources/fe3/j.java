package fe3;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static fe3.j f261554a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f261555b = "magic";

    public static fe3.j b() {
        if (f261554a == null) {
            synchronized (fe3.j.class) {
                f261554a = new fe3.j();
                f();
            }
        }
        return f261554a;
    }

    public static void f() {
        jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicPkgVersionSyncSTORAGE", null);
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "init version fail,storage is nil");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jc3.u0 u0Var = jc3.u0.f298996a;
        for (java.lang.String str : jc3.u0.f299004i) {
            java.lang.Object[] b17 = ((ue3.f) wi6).b(str);
            java.lang.String str2 = ((lc3.z) b17[0]) == lc3.x.f317934a ? (java.lang.String) b17[1] : null;
            if (str2 != null) {
                sb6.append(str);
                sb6.append(str2);
                sb6.append("-");
            }
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "initMagicPkgVersion:%s", sb6.toString());
            f261555b = sb6.toString();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "init version fail,no vaild data");
    }

    public boolean a(java.lang.String str, java.lang.String str2, boolean z17, jc3.m0 m0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "checkMagicPkg pkgId:%s,baseId:%s", str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "checkMagicPkg invaild pkgid");
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo c17 = c(lowerCase);
        java.lang.String str3 = "default";
        if (c17 == null) {
            j(lowerCase, null, 0, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.Check, 0, 0, false);
        } else {
            if (!str2.isEmpty()) {
                str3 = str2;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.f147865n)) {
                str3 = c17.f147865n;
            }
            j(lowerCase, c17, 1, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.Check, 0, 0, false);
        }
        java.lang.String str4 = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "realBaseId is %s", str4);
        oq1.l lVar = (oq1.l) i95.n0.c(oq1.l.class);
        fe3.k kVar = new fe3.k(this, lowerCase, c17, false, m0Var);
        ((nq1.d) lVar).getClass();
        nq1.s sVar = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
        sVar.requireAccountInitialized();
        sVar.f338971d.getClass();
        gm0.j1.d().g(new z73.c(lowerCase, str4, "", z17, kVar));
        return true;
    }

    public com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo c(java.lang.String str) {
        android.os.Bundle bundle;
        try {
            bundle = ue3.i.a("getMagicPkgInfo", str, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "null == bundle, appId:" + str);
            return null;
        }
        bundle.setClassLoader(com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo.class.getClassLoader());
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo = (com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo) bundle.getParcelable("MagicPkg");
        if (!fe3.l.f(wxaMagicPkgInfo)) {
            h(wxaMagicPkgInfo);
            i(wxaMagicPkgInfo);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,patchId:%s,file not exist", wxaMagicPkgInfo.f147858d, wxaMagicPkgInfo.f147865n);
            return null;
        }
        if (d(str) == null && !l(wxaMagicPkgInfo)) {
            h(wxaMagicPkgInfo);
            i(wxaMagicPkgInfo);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,patchId:%s,save to storage fail", wxaMagicPkgInfo.f147858d, wxaMagicPkgInfo.f147865n);
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147867p)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147863i)) {
                wxaMagicPkgInfo.f147867p = bf3.b0.f19612a.a(wxaMagicPkgInfo.f147862h);
            } else {
                wxaMagicPkgInfo.f147867p = wxaMagicPkgInfo.f147861g;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgInfo pkg:%s,md5:%s,version:%s", wxaMagicPkgInfo.f147858d, wxaMagicPkgInfo.f147860f, wxaMagicPkgInfo.f147866o);
        return wxaMagicPkgInfo;
    }

    public com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo d(java.lang.String str) {
        jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicPkgSyncSTORAGE", null);
        if (wi6 != null) {
            java.lang.Object[] b17 = ((ue3.f) wi6).b(str);
            lc3.z zVar = (lc3.z) b17[0];
            java.lang.String str2 = zVar == lc3.x.f317934a ? (java.lang.String) b17[1] : null;
            if (str2 != null) {
                com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo = new com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo();
                wxaMagicPkgInfo.f147858d = str;
                try {
                    java.lang.String[] split = str2.split(",");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    for (java.lang.String str3 : split) {
                        java.lang.String[] split2 = str3.split(":");
                        hashMap.put(split2[0], split2[1]);
                    }
                    wxaMagicPkgInfo.f147859e = (java.lang.String) hashMap.get("url");
                    wxaMagicPkgInfo.f147860f = (java.lang.String) hashMap.get("md5");
                    wxaMagicPkgInfo.f147861g = (java.lang.String) hashMap.get("pkgpath");
                    wxaMagicPkgInfo.f147862h = (java.lang.String) hashMap.get("unzippath");
                    wxaMagicPkgInfo.f147863i = (java.lang.String) hashMap.get("originalName");
                    wxaMagicPkgInfo.f147864m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) hashMap.get("pkgtype"), 3);
                    wxaMagicPkgInfo.f147865n = (java.lang.String) hashMap.get("patchId");
                    wxaMagicPkgInfo.f147866o = (java.lang.String) hashMap.get("version");
                    wxaMagicPkgInfo.f147867p = (java.lang.String) hashMap.get("wxapath");
                    if (!fe3.l.f(wxaMagicPkgInfo)) {
                        i(wxaMagicPkgInfo);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,patchId:%s,file not exist", wxaMagicPkgInfo.f147858d, wxaMagicPkgInfo.f147865n);
                        return null;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147867p)) {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147863i)) {
                            wxaMagicPkgInfo.f147867p = bf3.b0.f19612a.a(wxaMagicPkgInfo.f147862h);
                        } else {
                            wxaMagicPkgInfo.f147867p = wxaMagicPkgInfo.f147861g;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgInfoMulti pkg:%s,md5:%s,version:%s", wxaMagicPkgInfo.f147858d, wxaMagicPkgInfo.f147860f, wxaMagicPkgInfo.f147866o);
                    return wxaMagicPkgInfo;
                } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                    i(wxaMagicPkgInfo);
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e17, "pkg:%s,get info exception", str);
                    return null;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,file not in storage,errNo:%d,errMsg:%s", str, java.lang.Integer.valueOf(zVar.f317944a), zVar.f317945b);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,get storage fail,storage is nil", str);
        }
        return null;
    }

    public java.util.List e() {
        android.os.Bundle bundle;
        try {
            bundle = ue3.i.a("getMagicPkgList", null, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgList bundle is null.");
            return null;
        }
        bundle.setClassLoader(com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo.class.getClassLoader());
        if (bundle.containsKey("MagicPkgList")) {
            return bundle.getParcelableArrayList("MagicPkgList");
        }
        return null;
    }

    public void g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "processMagicBootsCmd pkgId:%s,op:%s,url:%s", str, str4, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "processMagicBootsCmd invaild argc");
            return;
        }
        java.lang.String[] split = str4.split("#", 6);
        if (split.length != 6 || com.tencent.mm.sdk.platformtools.t8.K0(split[0]) || com.tencent.mm.sdk.platformtools.t8.K0(split[1]) || com.tencent.mm.sdk.platformtools.t8.K0(split[2]) || com.tencent.mm.sdk.platformtools.t8.K0(split[3]) || com.tencent.mm.sdk.platformtools.t8.K0(split[4]) || com.tencent.mm.sdk.platformtools.t8.K0(split[5])) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "processMagicBootsCmd invaild op");
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        java.lang.String str5 = split[0];
        java.lang.String str6 = split[1];
        java.lang.String str7 = split[2];
        java.lang.String str8 = split[3];
        java.lang.String str9 = split[4];
        java.lang.String str10 = split[5];
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo c17 = c(lowerCase);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str6) || c17 == null || com.tencent.mm.sdk.platformtools.t8.K0(c17.f147866o) || !str6.equalsIgnoreCase(c17.f147866o)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "processMagicBootsCmd version not match");
            return;
        }
        oq1.q qVar = new oq1.q();
        qVar.f347350e = str3;
        qVar.f347349d = new java.lang.String(android.util.Base64.decode(str2, 0));
        qVar.f347348c = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(str8, 3));
        qVar.f347351f = str9;
        qVar.f347355j = str;
        qVar.f347356k = str9;
        qVar.f347357l = str7;
        qVar.f347358m = str10;
        fe3.i.INSTANCE.a(qVar, c17, lowerCase, null);
    }

    public void h(com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        if (wxaMagicPkgInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "remove db fail,info is nil");
            return;
        }
        com.tencent.mm.vfs.w6.f(wxaMagicPkgInfo.f147862h);
        com.tencent.mm.vfs.w6.h(wxaMagicPkgInfo.f147861g);
        com.tencent.mm.vfs.w6.h(wxaMagicPkgInfo.f147867p);
        try {
            ue3.i.a("removeMagicPkgInfo", wxaMagicPkgInfo.f147858d, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e17, "", new java.lang.Object[0]);
        }
        i(wxaMagicPkgInfo);
    }

    public void i(com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        if (wxaMagicPkgInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "remove storage fail,info is nil");
            return;
        }
        com.tencent.mm.vfs.w6.f(wxaMagicPkgInfo.f147862h);
        com.tencent.mm.vfs.w6.h(wxaMagicPkgInfo.f147861g);
        com.tencent.mm.vfs.w6.h(wxaMagicPkgInfo.f147867p);
        jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicPkgSyncSTORAGE", null);
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,remove storage fail,storage is nil", wxaMagicPkgInfo.f147858d);
            return;
        }
        lc3.z f17 = ((ue3.f) wi6).f(wxaMagicPkgInfo.f147858d);
        if (f17 != lc3.x.f317934a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "remove storage fail,errNo:%d,errMsg:%s", java.lang.Integer.valueOf(f17.f317944a), f17.f317945b);
        }
    }

    public final void j(java.lang.String str, com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo, int i17, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene scene, int i18, int i19, boolean z17) {
        int i27 = i18;
        if (z17) {
            if (i27 == 0) {
                i27 = 3;
            } else if (i27 == 1) {
                i27 = 4;
            } else if (i27 == 2) {
                i27 = 5;
            }
        }
        int i28 = i27;
        kotlin.jvm.internal.o.g(scene, "scene");
        ((je3.i) i95.n0.c(je3.i.class)).Rg(str, wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f147865n : null, wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f147866o : null, wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f147860f : null, i17, scene, i28, i19);
    }

    public void k(final com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        if (wxaMagicPkgInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "app is empty.");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147861g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "app path is empty.");
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(wxaMagicPkgInfo.f147861g);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!a17.f213279f.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "app file isn't exist.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("MagicPkg", wxaMagicPkgInfo);
        try {
            ue3.i.a("insertMagicPkgInfo", wxaMagicPkgInfo.f147858d, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicPkgLogic", e17, "", new java.lang.Object[0]);
        }
        l(wxaMagicPkgInfo);
        jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicPkgVersionSyncSTORAGE", null);
        if (wi6 != null) {
            ue3.f fVar = (ue3.f) wi6;
            lc3.z g17 = fVar.g(wxaMagicPkgInfo.f147858d, wxaMagicPkgInfo.f147866o, "String");
            lc3.z zVar = lc3.x.f317934a;
            if (g17 != zVar) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,update pkg version fail,errNo:%d,errMsg:%s", wxaMagicPkgInfo.f147858d, java.lang.Integer.valueOf(g17.f317944a), g17.f317945b);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.lang.String str2 : jc3.u0.f299004i) {
                    java.lang.Object[] b17 = fVar.b(str2.toLowerCase());
                    java.lang.String str3 = ((lc3.z) b17[0]) == zVar ? (java.lang.String) b17[1] : null;
                    if (str3 != null) {
                        sb6.append(str2.toLowerCase());
                        sb6.append(str3);
                        sb6.append("-");
                    }
                }
                if (sb6.length() > 0) {
                    sb6.deleteCharAt(sb6.length() - 1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "updateMagicPkgVersionStorage magicVersion:%s", sb6.toString());
                    f261555b = sb6.toString();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "update pkg version fail,no vaild data");
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,update pkg version fail,storage is nil", wxaMagicPkgInfo.f147858d);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: fe3.j$$a
            @Override // java.lang.Runnable
            public final void run() {
                ie3.i iVar = (ie3.i) i95.n0.c(ie3.i.class);
                com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo2 = com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo.this;
                ((he3.e) iVar).mj(wxaMagicPkgInfo2.f147858d, com.tencent.mm.sdk.platformtools.t8.P(wxaMagicPkgInfo2.f147866o, -1), wxaMagicPkgInfo2.f147867p);
            }
        });
    }

    public final boolean l(com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        if (wxaMagicPkgInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "update storage fail,info is nil");
            return false;
        }
        jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicPkgSyncSTORAGE", null);
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,update storage fail,storage is nil", wxaMagicPkgInfo.f147858d);
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pkgId", wxaMagicPkgInfo.f147858d);
        hashMap.put("url", wxaMagicPkgInfo.f147859e);
        hashMap.put("md5", wxaMagicPkgInfo.f147860f);
        hashMap.put("pkgpath", wxaMagicPkgInfo.f147861g);
        hashMap.put("unzippath", wxaMagicPkgInfo.f147862h);
        hashMap.put("originalName", wxaMagicPkgInfo.f147863i);
        hashMap.put("pkgtype", java.lang.Integer.toString(wxaMagicPkgInfo.f147864m));
        hashMap.put("patchId", wxaMagicPkgInfo.f147865n);
        hashMap.put("version", wxaMagicPkgInfo.f147866o);
        hashMap.put("wxapath", wxaMagicPkgInfo.f147867p);
        java.util.Set keySet = hashMap.keySet();
        java.lang.String[] strArr = (java.lang.String[]) keySet.toArray(new java.lang.String[keySet.size()]);
        java.util.Arrays.sort(strArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < strArr.length; i17++) {
            if (java.lang.String.valueOf(hashMap.get(strArr[i17])).trim().length() > 0) {
                sb6.append(strArr[i17]);
                sb6.append(":");
                sb6.append(java.lang.String.valueOf(hashMap.get(strArr[i17])).trim());
            }
            if (i17 != strArr.length - 1) {
                sb6.append(",");
            }
        }
        lc3.z g17 = ((ue3.f) wi6).g(wxaMagicPkgInfo.f147858d, sb6.toString(), "String");
        if (g17 == lc3.x.f317934a) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,update storage fail,errNo:%d,errMsg:%s", wxaMagicPkgInfo.f147858d, java.lang.Integer.valueOf(g17.f317944a), g17.f317945b);
        return false;
    }
}
