package uv4;

/* loaded from: classes8.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final int a(java.lang.String targetFolderPath) {
        java.io.InputStream D;
        kotlin.jvm.internal.o.g(targetFolderPath, "targetFolderPath");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(targetFolderPath);
        com.tencent.mm.vfs.z7 z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, com.tencent.mm.vfs.e8.l(a17.f213279f + "/config.conf", false, false), a17.f213280g, a17.f213281h);
        java.util.Properties properties = new java.util.Properties();
        try {
            D = com.tencent.mm.vfs.w6.D(z7Var, com.tencent.mm.vfs.a3.f212781a.m(z7Var, null));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "getFolderVersion %s", targetFolderPath);
        }
        try {
            properties.load(D);
            vz5.b.a(D, null);
            try {
                java.lang.String property = properties.getProperty("version", "1");
                kotlin.jvm.internal.o.f(property, "getProperty(...)");
                return java.lang.Integer.parseInt(property);
            } catch (java.lang.Exception unused) {
                return 1;
            }
        } finally {
        }
    }

    public final java.util.Properties b(com.tencent.mm.vfs.r6 r6Var) {
        java.util.Properties properties = new java.util.Properties();
        if (r6Var != null && r6Var.A()) {
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
        return properties;
    }

    public final int c(java.lang.String templatePath, java.lang.String zipFilePath, int i17, yz5.l lVar) {
        int i18;
        boolean d17;
        int parseInt;
        kotlin.jvm.internal.o.g(templatePath, "templatePath");
        kotlin.jvm.internal.o.g(zipFilePath, "zipFilePath");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "temp/".concat(templatePath));
        if (r6Var.m()) {
            com.tencent.mm.vfs.w6.f(r6Var.o());
        }
        r6Var.J();
        try {
            i18 = com.tencent.mm.mm7zip.SevenZipUtil.extract(com.tencent.mm.vfs.w6.i(zipFilePath, false), com.tencent.mm.vfs.w6.i(r6Var.o(), true));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "SevenZipUtil unzip error", new java.lang.Object[0]);
            i18 = -1;
        }
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseWebSearchTemplate", "unzip fail, ret = " + i18 + ", zipFilePath = " + zipFilePath + ", unzipPath = " + r6Var.o());
            return 1;
        }
        if (lVar != null) {
            java.lang.String o17 = r6Var.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            d17 = ((java.lang.Boolean) lVar.invoke(o17)).booleanValue();
        } else {
            java.lang.String o18 = r6Var.o();
            kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
            d17 = d(o18, i17);
        }
        if (!d17) {
            return 1;
        }
        java.lang.String l17 = com.tencent.mm.vfs.e8.l("config.conf", false, true);
        com.tencent.mm.vfs.z7 z7Var = r6Var.f213166d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str = z7Var.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str + '/' + l17, z7Var.f213280g, z7Var.f213281h);
        }
        java.util.Properties properties = new java.util.Properties();
        try {
            java.io.InputStream D = com.tencent.mm.vfs.w6.D(z7Var, com.tencent.mm.vfs.a3.f212781a.m(z7Var, null));
            try {
                properties.load(D);
                vz5.b.a(D, null);
            } finally {
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e18, "getZipFileVersion %s", zipFilePath);
        }
        try {
            if (kotlin.jvm.internal.o.b(properties.getProperty("debug", "0"), "1")) {
                parseInt = Integer.MAX_VALUE;
            } else {
                java.lang.String property = properties.getProperty("version", "1");
                kotlin.jvm.internal.o.f(property, "getProperty(...)");
                parseInt = java.lang.Integer.parseInt(property);
            }
            return parseInt;
        } catch (java.lang.Exception unused) {
            return 1;
        }
    }

    public final boolean d(java.lang.String targetFolderPath, int i17) {
        kotlin.jvm.internal.o.g(targetFolderPath, "targetFolderPath");
        java.util.Properties b17 = b(new com.tencent.mm.vfs.r6(targetFolderPath, "config.conf"));
        if (i17 != 0) {
            if (i17 == 1 && !kotlin.jvm.internal.o.b(b17.getProperty("business"), "recommend")) {
                return false;
            }
        } else if (!kotlin.jvm.internal.o.b(b17.getProperty("business"), "websearch")) {
            return false;
        }
        java.lang.String property = b17.getProperty("md5map");
        if (com.tencent.mm.sdk.platformtools.t8.K0(property)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(property);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(targetFolderPath, next);
                if (!r6Var.m()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.BaseWebSearchTemplate", "isMd5Valid fail, file not exist %s", r6Var.o());
                    return false;
                }
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.o());
                java.lang.String string = jSONObject.getString(next);
                if (com.tencent.mm.sdk.platformtools.t8.K0(p17) || !kotlin.jvm.internal.o.b(p17, string)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.BaseWebSearchTemplate", "isMd5Valid fail, fileName %s, fileMd5 %s, expect md5 %s", next, p17, string);
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final void e(long j17, long j18, long j19, boolean z17) {
        if (j17 > 0) {
            jx3.f.INSTANCE.idkeyStat(j17, j18, j19, z17);
        }
    }
}
