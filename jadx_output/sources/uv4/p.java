package uv4;

/* loaded from: classes8.dex */
public final class p extends uv4.b {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f431444h;

    /* renamed from: i, reason: collision with root package name */
    public int f431445i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f431446j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17, java.lang.String templatePath, java.lang.String zipFileName, java.lang.String assetDir, long j17) {
        super(i17, templatePath, zipFileName, assetDir, j17);
        kotlin.jvm.internal.o.g(templatePath, "templatePath");
        kotlin.jvm.internal.o.g(zipFileName, "zipFileName");
        kotlin.jvm.internal.o.g(assetDir, "assetDir");
        this.f431444h = new java.util.HashMap();
        this.f431445i = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "Init WebSearchTemplateByUDR templatePath:" + templatePath + " zipFileName:" + zipFileName + " assetDir:" + assetDir);
        this.f431422f = "_udr";
    }

    @Override // uv4.b, uv4.g
    public void a(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        int b17 = uv4.x.f431458a.b();
        if (b17 != 1) {
            if (b17 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: level 2, checkResUpdate is disabled");
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: unexpected level=" + b17 + ", fallback to default");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: level 1, use normal directory (without _udr suffix)");
        uv4.a aVar = uv4.b.f431416g;
        aVar.e(this.f431421e, 0L, 1L, false);
        int c17 = aVar.c(this.f431418b, filePath, this.f431417a, null);
        new vu4.i(vu4.h.f440327e, vu4.j.f440339f, ya.b.SUCCESS, b17, c17, this.f431417a).a();
        if (y(filePath, c17, true, "", b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: level 1 update success");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: level 1 update failed");
        }
    }

    @Override // uv4.g
    public int b() {
        if (this.f431445i == 1) {
            x(uv4.x.f431458a.b());
        }
        return this.f431445i;
    }

    @Override // uv4.g
    public java.lang.String c() {
        return l().concat("/app.html");
    }

    @Override // uv4.b, uv4.g
    public void d(java.lang.String filePath) {
        java.lang.String str;
        yz5.l lVar;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        int b17 = uv4.x.f431458a.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: start, expLevel=" + b17 + ", filePath=" + filePath);
        if (b17 != 1) {
            str = "_udr";
            if (b17 != 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: unexpected expLevel=" + b17 + ", fallback to UDR");
                lVar = new uv4.n(this);
            } else {
                lVar = new uv4.m(this);
            }
        } else {
            str = "";
            lVar = null;
        }
        uv4.a aVar = uv4.b.f431416g;
        java.lang.String str2 = this.f431418b;
        int i17 = this.f431417a;
        int c17 = aVar.c(str2, filePath, i17, lVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: zipFileVersion=" + c17 + ", dirType=" + str);
        if (c17 == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: invalid zip file version, abort");
            return;
        }
        boolean g17 = com.tencent.mm.vfs.w6.g(new com.tencent.mm.vfs.r6(n(), str2 + str).o(), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLocalTemplate: delete old directory, result=");
        sb6.append(g17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", sb6.toString());
        if (!g17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: failed to delete old directory");
            return;
        }
        java.lang.String u17 = u(c17, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: target folder: ".concat(u17));
        s(filePath, u17);
        if (lVar != null ? ((java.lang.Boolean) lVar.invoke(u17)).booleanValue() : aVar.d(u17, i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: validation passed, version=" + c17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: validation failed! delete folder, result=" + com.tencent.mm.vfs.w6.g(u17, true));
        }
        k();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: finished, currentH5Version=" + b() + ", currentDirType=" + this.f431422f);
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
        java.util.HashMap hashMap = this.f431444h;
        if (hashMap.isEmpty()) {
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
                            hashMap.put(str, optString);
                        }
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchTemplateByUDR", e18, "getJsFileMap", new java.lang.Object[0]);
            }
        }
        return hashMap;
    }

    @Override // uv4.b, uv4.g
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "checkOrInitTemplate: start, clean both NORMAL and UDR directories");
        t("");
        t("_udr");
        k();
        int b17 = b();
        if (b17 != 1) {
            java.lang.String l17 = l();
            if (!w(l17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "checkOrInitTemplate: current template invalid (version=" + b17 + ", path=" + l17 + "), delete and reset");
                com.tencent.mm.vfs.w6.f(l17);
                k();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "checkOrInitTemplate: finished, currentVersion=" + b() + ", currentDirType=" + this.f431422f);
    }

    @Override // uv4.g
    public java.lang.String h() {
        java.lang.String o17 = new com.tencent.mm.vfs.r6(l(), this.f431419c).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // uv4.b, uv4.g
    public java.lang.String i() {
        java.lang.String o17 = new com.tencent.mm.vfs.r6(n(), this.f431418b + this.f431422f).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // uv4.g
    public java.lang.String j() {
        java.lang.String str = this.f431420d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.lang.String str2 = this.f431419c;
        if (K0) {
            return str2;
        }
        return str + '/' + str2;
    }

    @Override // uv4.g
    public void k() {
        x(uv4.x.f431458a.b());
    }

    @Override // uv4.g
    public java.lang.String l() {
        int b17 = b();
        java.lang.String str = this.f431418b;
        if (b17 == 1) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(n(), str + this.f431422f);
            if (!r6Var.m()) {
                r6Var.J();
            }
            java.lang.String o17 = r6Var.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            return o17;
        }
        if (!this.f431446j) {
            return u(b17, this.f431422f);
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(n(), str + this.f431422f);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getFTSTemplatePath: version " + b17 + " is in root dir, path=" + r6Var2.o());
        java.lang.String o18 = r6Var2.o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        return o18;
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [boolean] */
    public final void t(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(n(), this.f431418b + str);
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): folder not exists, skip");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        uv4.a aVar = uv4.b.f431416g;
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        int a17 = aVar.a(o17);
        boolean z17 = true;
        if (a17 > 1) {
            arrayList.add(new uv4.l(a17, "root", true));
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): found version " + a17 + " in root directory");
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        int i17 = 0;
        if (G != null) {
            int length = G.length;
            int i18 = 0;
            while (i18 < length) {
                com.tencent.mm.vfs.r6 r6Var2 = G[i18];
                if (r6Var2.y() && !kotlin.jvm.internal.o.b(r6Var2.getName(), ".nomedia")) {
                    int P = com.tencent.mm.sdk.platformtools.t8.P(r6Var2.getName(), i17);
                    if (P > 0) {
                        java.lang.String name = r6Var2.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        arrayList.add(new uv4.l(P, name, false));
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): found version " + P + " in subdirectory " + r6Var2.getName());
                    } else {
                        ?? r47 = z17;
                        if (a17 <= r47) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): delete invalid folder " + r6Var2.getName() + " (no root version), result=" + com.tencent.mm.vfs.w6.g(r6Var2.o(), r47));
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): keep folder " + r6Var2.getName() + " (part of root version)");
                        }
                    }
                }
                i18++;
                z17 = true;
                i17 = 0;
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): no valid versions found");
            return;
        }
        kz5.g0.t(arrayList, uv4.k.f431437d);
        uv4.l lVar = (uv4.l) arrayList.get(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): found " + arrayList.size() + " version(s), max version=" + lVar.f431438a + " at " + lVar.f431439b);
        int i19 = 0;
        for (java.lang.Object obj : arrayList) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            uv4.l lVar2 = (uv4.l) obj;
            if (i19 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): keep version " + lVar2.f431438a + " at " + lVar2.f431439b);
            } else {
                boolean z18 = lVar2.f431440c;
                int i28 = lVar2.f431438a;
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): cleaning root directory version " + i28);
                    com.tencent.mm.vfs.r6[] G2 = r6Var.G();
                    if (G2 != null) {
                        for (com.tencent.mm.vfs.r6 r6Var3 : G2) {
                            if (!r6Var3.y()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): delete root file " + r6Var3.getName() + ", result=" + com.tencent.mm.vfs.w6.h(r6Var3.o()));
                            } else if (com.tencent.mm.sdk.platformtools.t8.P(r6Var3.getName(), 0) == 0 && !kotlin.jvm.internal.o.b(r6Var3.getName(), ".nomedia")) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): delete root folder " + r6Var3.getName() + ", result=" + com.tencent.mm.vfs.w6.g(r6Var3.o(), true));
                            }
                        }
                    }
                } else {
                    java.lang.String str2 = lVar2.f431439b;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): delete old version " + i28 + " at " + str2 + ", result=" + com.tencent.mm.vfs.w6.g(new com.tencent.mm.vfs.r6(r6Var, str2).o(), true));
                    i19 = i27;
                }
            }
            i19 = i27;
        }
    }

    public final java.lang.String u(int i17, java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(n(), this.f431418b + str), java.lang.String.valueOf(i17));
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public final uv4.i v(java.lang.String str) {
        boolean z17;
        java.lang.Integer num;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(n(), this.f431418b + str);
        boolean z18 = true;
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getMaxVersionWithLocation (dirType=" + str + "): folder not exists");
            return new uv4.i(1, false);
        }
        uv4.a aVar = uv4.b.f431416g;
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        int a17 = aVar.a(o17);
        int max = java.lang.Math.max(1, a17);
        boolean z19 = a17 > 1;
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            int length = G.length;
            int i17 = 0;
            while (i17 < length) {
                com.tencent.mm.vfs.r6 r6Var2 = G[i17];
                if (!r6Var2.y() || kotlin.jvm.internal.o.b(r6Var2.getName(), ".nomedia")) {
                    z17 = z18;
                } else {
                    try {
                        java.lang.String name = r6Var2.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        num = r26.h0.h(name);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchTemplateByUDR", e17, "getMaxVersionWithLocation: parse folder name failed", new java.lang.Object[0]);
                        num = null;
                    }
                    if (num == null || num.intValue() <= 0) {
                        java.lang.String o18 = r6Var2.o();
                        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                        num = java.lang.Integer.valueOf(aVar.a(o18));
                        com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getMaxVersionWithLocation (dirType=" + str + "): fallback to getFolderVersion for folder '" + r6Var2.getName() + "', got version=" + num);
                    }
                    if (num.intValue() > max) {
                        z17 = true;
                        if (num.intValue() != 1) {
                            max = num.intValue();
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getMaxVersionWithLocation (dirType=" + str + "): found valid version " + num + " in " + r6Var2.getName());
                            z19 = false;
                        }
                    } else {
                        z17 = true;
                    }
                }
                i17++;
                z18 = z17;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getMaxVersionWithLocation (dirType=" + str + "): final maxVersion=" + max + ", isInRootDir=" + z19);
        return new uv4.i(max, z19);
    }

    public final boolean w(java.lang.String targetFolderPath) {
        kotlin.jvm.internal.o.g(targetFolderPath, "targetFolderPath");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(targetFolderPath, "config.conf");
        java.util.Properties properties = new java.util.Properties();
        if (r6Var.A()) {
            try {
                java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var);
                try {
                    properties.load(C);
                    vz5.b.a(C, null);
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
            }
        }
        java.lang.String property = properties.getProperty("md5map");
        if (com.tencent.mm.sdk.platformtools.t8.K0(property)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "isTemplateValidForUDR: md5map is null or empty");
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(property);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(targetFolderPath, next);
                if (!r6Var2.m()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "isTemplateValidForUDR: file not exist: " + r6Var2.o());
                    return false;
                }
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var2.o());
                java.lang.String string = jSONObject.getString(next);
                if (com.tencent.mm.sdk.platformtools.t8.K0(p17) || !r26.i0.p(p17, string, true)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "isTemplateValidForUDR: md5 mismatch, file=" + next + ", actual=" + p17 + ", expected=" + string);
                    return false;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "isTemplateValidForUDR: validation passed for ".concat(targetFolderPath));
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchTemplateByUDR", e18, "isTemplateValidForUDR: exception during validation", new java.lang.Object[0]);
            return false;
        }
    }

    public final void x(int i17) {
        if (i17 != 1) {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: unexpected expLevel=" + i17 + ", should be 1 or 2");
                return;
            }
            uv4.i v17 = v("_udr");
            this.f431422f = "_udr";
            int i18 = v17.f431435a;
            if (i18 <= 0) {
                this.f431445i = 1;
                this.f431446j = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: level 2, no valid UDR version found, set to Default");
                return;
            }
            this.f431445i = i18;
            this.f431446j = v17.f431436b;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: level 2, use UDR directory only, version=" + this.f431445i + ", isInRootDir=" + this.f431446j);
            return;
        }
        uv4.i v18 = v("");
        uv4.i v19 = v("_udr");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshCurrentH5Config: level 1, normalMaxVersion=");
        int i19 = v18.f431435a;
        sb6.append(i19);
        sb6.append(", udrMaxVersion=");
        int i27 = v19.f431435a;
        sb6.append(i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", sb6.toString());
        if (i19 <= 0 && i27 <= 0) {
            this.f431445i = 1;
            this.f431446j = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: no valid version found, set to Default");
            return;
        }
        if (i19 >= i27) {
            this.f431422f = "";
            this.f431445i = i19;
            this.f431446j = v18.f431436b;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: use normal directory (higher version), version=" + this.f431445i + ", isInRootDir=" + this.f431446j);
            return;
        }
        this.f431422f = "_udr";
        this.f431445i = i27;
        this.f431446j = v19.f431436b;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: use UDR directory (higher version), version=" + this.f431445i + ", isInRootDir=" + this.f431446j);
    }

    public final boolean y(java.lang.String str, int i17, boolean z17, java.lang.String str2, int i18) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: zip file not exist: " + str);
            long j17 = this.f431421e;
            if (j17 > 0) {
                jx3.f.INSTANCE.idkeyStat(j17, 1L, 1L, false);
            }
            return false;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: invalid zip file version");
            long j18 = this.f431421e;
            if (j18 > 0) {
                jx3.f.INSTANCE.idkeyStat(j18, 1L, 1L, false);
            }
            return false;
        }
        long j19 = this.f431421e;
        if (j19 > 0) {
            jx3.f.INSTANCE.idkeyStat(j19, 2L, 1L, false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: zipFileVersion=" + i17 + ", shouldCheckVersion=" + z17 + ", dirType=" + str2);
        int b17 = b();
        java.lang.String u17 = u(i17, str2);
        vu4.j jVar = kotlin.jvm.internal.o.b(str2, "_udr") ? vu4.j.f440340g : vu4.j.f440339f;
        if (z17 && i17 <= b17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: zipFileVersion (" + i17 + ") <= currentVersion (" + b17 + "), skip update");
            long j27 = this.f431421e;
            if (j27 > 0) {
                jx3.f.INSTANCE.idkeyStat(j27, 3L, 1L, false);
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: update from " + b17 + " to " + i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: target folder: ".concat(u17));
        long j28 = this.f431421e;
        if (j28 > 0) {
            jx3.f.INSTANCE.idkeyStat(j28, 4L, 1L, false);
        }
        for (int i19 = 0; i19 < 3; i19++) {
            s(str, u17);
            if (w(u17)) {
                break;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: invalid md5, retryTimes:" + i19);
        }
        if (!w(u17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: validation failed! delete folder, result:" + com.tencent.mm.vfs.w6.g(u17, true));
            long j29 = this.f431421e;
            if (j29 > 0) {
                jx3.f.INSTANCE.idkeyStat(j29, 5L, 1L, false);
            }
            new vu4.i(vu4.h.f440328f, jVar, "fail", i18, i17, this.f431417a).a();
            return false;
        }
        long j37 = this.f431421e;
        if (j37 > 0) {
            jx3.f.INSTANCE.idkeyStat(j37, 6L, 1L, false);
        }
        new vu4.i(vu4.h.f440328f, jVar, ya.b.SUCCESS, i18, i17, this.f431417a).a();
        k();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: switched to version " + i17 + ", path: " + u17);
        return true;
    }

    public void z(java.lang.String udrFilePath) {
        kotlin.jvm.internal.o.g(udrFilePath, "udrFilePath");
        uv4.a aVar = uv4.b.f431416g;
        aVar.e(this.f431421e, 0L, 1L, false);
        int b17 = uv4.x.f431458a.b();
        int c17 = aVar.c(this.f431418b, udrFilePath, this.f431417a, new uv4.o(this));
        new vu4.i(vu4.h.f440327e, vu4.j.f440340g, ya.b.SUCCESS, b17, c17, this.f431417a).a();
        boolean z17 = b17 == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByUDR: expLevel=" + b17 + ", shouldCheckVersion=" + z17 + ", zipFileVersion=" + c17);
        if (y(udrFilePath, c17, z17, "_udr", b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByUDR: update success");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByUDR: update failed");
        }
    }
}
