package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class s extends com.tencent.mm.plugin.wepkg.model.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.wepkg.model.WepkgVersion f188462d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.wepkg.model.o f188463e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f188464f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f188465g;

    public s(int i17, boolean z17, java.lang.String str) {
        super(i17, z17, str);
        this.f188465g = com.tencent.mapsdk.internal.rv.f51270c;
    }

    public com.tencent.xweb.y0 a(java.lang.String str) {
        com.tencent.mm.plugin.wepkg.model.o oVar;
        com.tencent.xweb.y0 y0Var = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.Map map = this.f188464f;
        if (map != null && map.get(str) != null) {
            com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile = (com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile) this.f188464f.get(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wepkgPreloadFile.f188365g)) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(wepkgPreloadFile.f188365g);
                if (r6Var.m() && r6Var.A() && r6Var.C() == wepkgPreloadFile.f188370o) {
                    try {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgInterceptor", "rid hit preload file. rid:%s, localPath:%s", str, wepkgPreloadFile.f188365g);
                        return new com.tencent.xweb.y0(wepkgPreloadFile.f188367i, this.f188465g, com.tencent.mm.vfs.w6.C(r6Var));
                    } catch (java.io.FileNotFoundException unused) {
                    }
                }
            }
        }
        com.tencent.mm.plugin.wepkg.model.o oVar2 = this.f188463e;
        if (oVar2 == null) {
            return null;
        }
        java.lang.String str2 = this.f188465g;
        if (com.tencent.mm.sdk.platformtools.t8.L0(oVar2.f188451f) || oVar2.f188449d < 4 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "mFileIndexList is null");
        } else {
            java.util.Iterator it = oVar2.f188451f.iterator();
            while (it.hasNext()) {
                r45.ps0 ps0Var = (r45.ps0) it.next();
                java.lang.String str3 = ps0Var.f383367d;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.equals(str)) {
                    if (oVar2.e(ps0Var.f383370g)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgReader", "filename (%s) is media resource", str);
                        return y0Var;
                    }
                    int i17 = ps0Var.f383369f;
                    if (i17 <= 5242880) {
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgReader", "rid hit big package. rid:%s", str);
                            oVar = oVar2;
                        } catch (java.io.IOException e17) {
                            e = e17;
                            oVar = oVar2;
                        }
                        try {
                            com.tencent.xweb.y0 y0Var2 = new com.tencent.xweb.y0(ps0Var.f383370g, str2, new a05.b(oVar2.f188446a, oVar2.f188449d + ps0Var.f383368e, ps0Var.f383369f));
                            if (!com.tencent.mm.sdk.platformtools.t8.L0(ps0Var.f383371h)) {
                                java.util.HashMap hashMap = new java.util.HashMap();
                                java.util.Iterator it6 = ps0Var.f383371h.iterator();
                                while (it6.hasNext()) {
                                    r45.js0 js0Var = (r45.js0) it6.next();
                                    hashMap.put(js0Var.f378083d, js0Var.f378084e);
                                }
                                y0Var2.f220625e = hashMap;
                            }
                            return y0Var2;
                        } catch (java.io.IOException e18) {
                            e = e18;
                            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "filename = %s, offset = %d, size = %d, mimeType = %s, e = %s", str, java.lang.Long.valueOf(ps0Var.f383368e), java.lang.Integer.valueOf(ps0Var.f383369f), ps0Var.f383370g, e.getMessage());
                            oVar2 = oVar;
                            y0Var = null;
                        }
                    } else {
                        oVar = oVar2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgReader", "fileSize(%d) > limitSize(%d), filename = %s, offset = %d, mimeType = %s", java.lang.Integer.valueOf(i17), 5242880L, str, java.lang.Long.valueOf(ps0Var.f383368e), ps0Var.f383370g);
                    }
                    oVar2 = oVar;
                    y0Var = null;
                }
            }
        }
        return null;
    }

    public s(com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion, com.tencent.mm.plugin.wepkg.model.o oVar, java.util.Map map) {
        super(0, true, wepkgVersion.f188376f);
        this.f188465g = com.tencent.mapsdk.internal.rv.f51270c;
        this.f188462d = wepkgVersion;
        this.f188463e = oVar;
        this.f188464f = map;
        if (com.tencent.mm.sdk.platformtools.t8.K0(wepkgVersion.f188389v)) {
            return;
        }
        this.f188465g = wepkgVersion.f188389v;
    }
}
