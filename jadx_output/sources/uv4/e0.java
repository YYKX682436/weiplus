package uv4;

/* loaded from: classes8.dex */
public final class e0 extends uv4.b {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f431428h;

    /* renamed from: i, reason: collision with root package name */
    public int f431429i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i17, java.lang.String templatePath, java.lang.String zipFileName, java.lang.String assetDir, long j17) {
        super(i17, templatePath, zipFileName, assetDir, j17);
        kotlin.jvm.internal.o.g(templatePath, "templatePath");
        kotlin.jvm.internal.o.g(zipFileName, "zipFileName");
        kotlin.jvm.internal.o.g(assetDir, "assetDir");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "Init WebSearchVersionTemplate templatePath:" + templatePath + " zipFileName:" + zipFileName + " assetDir:" + assetDir);
        this.f431428h = new java.util.HashMap();
        this.f431429i = 1;
    }

    @Override // uv4.b, uv4.g
    public void a(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        uv4.a aVar = uv4.b.f431416g;
        aVar.e(this.f431421e, 0L, 1L, false);
        java.lang.String str = this.f431418b;
        int i17 = this.f431417a;
        int c17 = aVar.c(str, filePath, i17, null);
        int b17 = b();
        if (c17 == 1) {
            aVar.e(this.f431421e, 1L, 1L, false);
        } else {
            aVar.e(this.f431421e, 2L, 1L, false);
        }
        java.lang.String t17 = t(c17);
        if (c17 <= b17) {
            aVar.e(this.f431421e, 3L, 1L, false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate update template currentVersion %d zipFileVersion %d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(c17));
        aVar.e(this.f431421e, 4L, 1L, false);
        for (int i18 = 0; i18 < 3; i18++) {
            s(filePath, t17);
            if (aVar.d(t17, i17)) {
                break;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate invalid md5 and delete template folder retryTimes:%s", java.lang.Integer.valueOf(i18));
        }
        if (aVar.d(t17, i17)) {
            aVar.e(this.f431421e, 6L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate final update success version %d", java.lang.Integer.valueOf(c17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate final md5 is invalid! deleteResult:" + com.tencent.mm.vfs.w6.g(t17, true));
            aVar.e(this.f431421e, 5L, 1L, false);
        }
        k();
    }

    @Override // uv4.g
    public int b() {
        if (this.f431429i == 1) {
            k();
        }
        return this.f431429i;
    }

    @Override // uv4.g
    public java.lang.String c() {
        return l().concat("/app.html");
    }

    @Override // uv4.b, uv4.g
    public void d(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        uv4.a aVar = uv4.b.f431416g;
        java.lang.String str = this.f431418b;
        int i17 = this.f431417a;
        int c17 = aVar.c(str, filePath, i17, null);
        if (c17 == 1 || !com.tencent.mm.vfs.w6.g(new com.tencent.mm.vfs.r6(n(), str).o(), true)) {
            return;
        }
        java.lang.String t17 = t(c17);
        s(filePath, t17);
        if (!aVar.d(t17, i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateLocalTemplate final md5 is invalid! deleteResult:" + com.tencent.mm.vfs.w6.g(t17, true));
        }
        k();
    }

    @Override // uv4.g
    public java.lang.String e() {
        java.lang.String str = this.f431420d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "config.conf";
        }
        return str + "/config.conf";
    }

    @Override // uv4.g
    public java.util.HashMap f() {
        int b17 = b();
        java.util.HashMap hashMap = this.f431428h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b17);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(valueOf, obj);
        }
        java.util.HashMap hashMap2 = (java.util.HashMap) obj;
        if (hashMap2.isEmpty()) {
            try {
                com.tencent.mm.vfs.r6 p17 = p();
                java.util.Properties properties = new java.util.Properties();
                if (p17.A()) {
                    try {
                        java.io.InputStream C = com.tencent.mm.vfs.w6.C(p17);
                        try {
                            properties.load(C);
                            vz5.b.a(C, null);
                        } finally {
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
                    }
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(properties.getProperty("md5map"));
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (next != null && r26.i0.n(next, ".js", false)) {
                        java.lang.String str = l() + '/' + next;
                        if (com.tencent.mm.vfs.w6.j(str)) {
                            java.lang.String optString = jSONObject.optString(next, "");
                            kotlin.jvm.internal.o.d(optString);
                            hashMap2.put(str, optString);
                        }
                    }
                }
                hashMap.put(java.lang.Integer.valueOf(b17), hashMap2);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchVersionTemplate", e18, "", new java.lang.Object[0]);
            }
        }
        return hashMap2;
    }

    @Override // uv4.b, uv4.g
    public void g() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(n(), this.f431418b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                if (!kotlin.jvm.internal.o.b(r6Var2.getName(), ".nomedia")) {
                    arrayList.add(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(r6Var2.getName(), 0)), r6Var2.getName()));
                }
            }
        }
        kz5.g0.t(arrayList, uv4.d0.f431427d);
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            jz5.l lVar = (jz5.l) obj;
            if (i17 >= 1 || ((java.lang.Number) lVar.f302833d).intValue() == 0) {
                com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var, (java.lang.String) lVar.f302834e);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "delete lower version:" + r6Var3.o() + " deleteResult:" + (r6Var3.y() ? com.tencent.mm.vfs.w6.g(r6Var3.o(), true) : com.tencent.mm.vfs.w6.h(r6Var3.o())));
            }
            i17 = i18;
        }
        int m17 = m();
        int b17 = b();
        boolean z17 = b17 < m17;
        int i19 = this.f431417a;
        uv4.a aVar = uv4.b.f431416g;
        if (!z17 && !aVar.d(l(), i19)) {
            com.tencent.mm.vfs.w6.f(r6Var.o());
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "current template invalid needInitTemplate");
            z17 = true;
        }
        if (z17) {
            java.lang.String t17 = t(m17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate update template currentVersion %d assetVersion %d targetFolderPath %s", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(m17), t17);
            for (int i27 = 0; i27 < 3; i27++) {
                r(t17);
                if (aVar.d(t17, i19)) {
                    break;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate invalid md5 and delete template folder retryTimes:%s", java.lang.Integer.valueOf(i27));
            }
            if (!aVar.d(t17, i19)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate final md5 is invalid! deleteResult:" + com.tencent.mm.vfs.w6.g(t17, true));
                aVar.e(this.f431421e, 7L, 1L, false);
            }
            k();
        }
    }

    @Override // uv4.g
    public java.lang.String h() {
        java.lang.String o17 = new com.tencent.mm.vfs.r6(l(), this.f431419c).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // uv4.b, uv4.g
    public java.lang.String i() {
        java.lang.String o17 = new com.tencent.mm.vfs.r6(n(), this.f431418b).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // uv4.g
    public java.lang.String j() {
        java.lang.String str = this.f431420d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "config.conf";
        }
        return str + '/' + this.f431419c;
    }

    @Override // uv4.g
    public void k() {
        com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(n(), this.f431418b).G();
        int i17 = 0;
        if (G != null) {
            int i18 = 0;
            for (com.tencent.mm.vfs.r6 r6Var : G) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(r6Var.getName(), 0);
                if (P > i18) {
                    i18 = P;
                }
            }
            i17 = i18;
        }
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "refreshCurrentH5Config maxVersion is zero");
            return;
        }
        this.f431429i = uv4.b.f431416g.a(t(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "refreshCurrentH5Config " + i17);
    }

    @Override // uv4.g
    public java.lang.String l() {
        return t(b());
    }

    @Override // uv4.b
    public void q() {
        r(t(m()));
    }

    public final java.lang.String t(int i17) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(n(), this.f431418b), java.lang.String.valueOf(i17));
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }
}
