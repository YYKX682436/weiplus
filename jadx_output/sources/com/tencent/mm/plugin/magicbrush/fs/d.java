package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.appstorage.y0 implements com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147957d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.magicbrush.fs.b[] f147958e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f147959f = new java.util.HashMap();

    public d(java.lang.String str, java.lang.String pkgPath) {
        this.f147957d = str;
        com.tencent.mm.plugin.magicbrush.fs.s sVar = (com.tencent.mm.plugin.magicbrush.fs.s) c();
        sVar.getClass();
        kotlin.jvm.internal.o.g(pkgPath, "pkgPath");
        if (sVar.f147997d) {
            return;
        }
        sVar.c(new com.tencent.mm.plugin.magicbrush.fs.q(sVar, pkgPath));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 b17 = b(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        if (b17 != j1Var) {
            return b17;
        }
        if (str.length() == 0) {
            return j1Var;
        }
        java.lang.String b18 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        if (!b18.substring(b18.length() - 1).equals("/")) {
            b18 = b18.concat("/");
        }
        com.tencent.mm.plugin.magicbrush.fs.s sVar = (com.tencent.mm.plugin.magicbrush.fs.s) c();
        sVar.getClass();
        java.util.List<java.lang.String> list = (java.util.List) sVar.b(new com.tencent.mm.plugin.magicbrush.fs.p(sVar));
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        for (java.lang.String str2 : list) {
            if (str2 == null) {
                str2 = "";
            }
            if (str2.startsWith(b18)) {
                return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
            }
        }
        return b17;
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.j1 b(java.lang.String str) {
        return !(((com.tencent.mm.plugin.magicbrush.fs.s) c()).a(str) != null) ? com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS : com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    public final com.tencent.mm.plugin.magicbrush.fs.b c() {
        com.tencent.mm.plugin.magicbrush.fs.b[] bVarArr = this.f147958e;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                com.tencent.mm.plugin.magicbrush.fs.b[] bVarArr2 = this.f147958e;
                if (bVarArr2[0] == null) {
                    bVarArr2[0] = new com.tencent.mm.plugin.magicbrush.fs.s(this.f147957d);
                }
            }
        }
        return this.f147958e[0];
    }

    public final void d(java.lang.String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
            return;
        }
        while (!str.equals("")) {
            if (str.endsWith("/")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
                return;
            }
            str = str.substring(0, str.lastIndexOf("/"));
            boolean equals = str.equals("");
            java.util.Map map = this.f147959f;
            if (equals) {
                ((java.util.HashMap) map).put("/", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            } else {
                ((java.util.HashMap) map).put(str.concat("/"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        if (!z17) {
            if (isdir(str) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                return null;
            }
        }
        com.tencent.mm.plugin.magicbrush.fs.a a17 = ((com.tencent.mm.plugin.magicbrush.fs.s) c()).a(com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true));
        if (a17 == null) {
            return null;
        }
        java.lang.String a18 = com.tencent.mm.plugin.appbrand.appcache.y5.a(a17.f147944a, a17.f147946c);
        if (android.text.TextUtils.isEmpty(a18)) {
            return null;
        }
        return new com.tencent.mm.vfs.r6(a18);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 isdir(java.lang.String str) {
        return readDir(str, new ik1.b0());
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info openReadPartialInfo(java.lang.String str) {
        com.tencent.mm.plugin.magicbrush.fs.a a17 = ((com.tencent.mm.plugin.magicbrush.fs.s) c()).a(com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true));
        if (a17 != null) {
            return new com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info(a17.f147945b, a17.f147946c, a17.f147947d, a17.f147948e);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 b17 = b(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (b17 == j1Var) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_IS_FILE;
        }
        java.lang.String b18 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        com.tencent.mm.plugin.magicbrush.fs.s sVar = (com.tencent.mm.plugin.magicbrush.fs.s) c();
        sVar.getClass();
        java.util.List<java.lang.String> list = (java.util.List) sVar.b(new com.tencent.mm.plugin.magicbrush.fs.p(sVar));
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        if (list == null) {
            return j1Var2;
        }
        java.lang.String quote = java.util.regex.Pattern.quote(b18);
        for (java.lang.String str2 : list) {
            if ((str2 == null ? "" : str2).startsWith(b18)) {
                java.lang.String replaceFirst = str2.replaceFirst(quote, "");
                if (replaceFirst.split("/").length <= 1) {
                    com.tencent.mm.plugin.appbrand.appstorage.h1 h1Var = new com.tencent.mm.plugin.appbrand.appstorage.h1();
                    h1Var.f76193a = replaceFirst;
                    b0Var.f291824a = b0Var.f291824a == null ? new java.util.LinkedList() : (java.util.List) b0Var.f291824a;
                    ((java.util.List) b0Var.f291824a).add(h1Var);
                }
            }
        }
        return b0Var.f291824a == null ? j1Var2 : j1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        long available;
        java.nio.ByteBuffer byteBuffer;
        boolean z17 = true;
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        com.tencent.mm.plugin.magicbrush.fs.a a17 = ((com.tencent.mm.plugin.magicbrush.fs.s) c()).a(b17);
        java.io.InputStream c17 = a17 != null ? a17.f147944a.c(a17.f147946c) : null;
        if (c17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        if (j18 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            try {
                available = c17.available() - j17;
            } catch (java.lang.Exception e17) {
                e = e17;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", e, "readFile", new java.lang.Object[0]);
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
                return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
                throw th;
            }
        } else {
            available = j18;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 a18 = a(j17, available, c17.available());
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (a18 != j1Var) {
            com.tencent.mm.sdk.platformtools.t8.v1(c17);
            return a18;
        }
        if (j17 != 0 || available != c17.available()) {
            z17 = false;
        }
        if (z17 && (c17 instanceof nf.a)) {
            byteBuffer = java.nio.ByteBuffer.allocateDirect(c17.available());
            byteBuffer.put(((nf.a) c17).f336572d);
        } else {
            byte[] c18 = ik1.f.c(c17, j17, available);
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(c18.length);
            allocateDirect.put(java.nio.ByteBuffer.wrap(c18));
            byteBuffer = allocateDirect;
        }
        byteBuffer.rewind();
        b0Var.f291824a = byteBuffer;
        try {
            try {
                d(b17);
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
                return j1Var;
            } catch (java.lang.Exception e18) {
                e = e18;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", e, "readFile", new java.lang.Object[0]);
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
                return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mm.sdk.platformtools.t8.v1(c17);
            throw th;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readZipEntry(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return com.tencent.mm.plugin.appbrand.appstorage.l1.e(getAbsoluteFile(str, false).o(), b0Var, str2, j17, j18);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        com.tencent.mm.plugin.magicbrush.fs.b[] bVarArr = this.f147958e;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                if (this.f147958e[0] == null) {
                    return;
                }
            }
        }
        com.tencent.mm.plugin.magicbrush.fs.s sVar = (com.tencent.mm.plugin.magicbrush.fs.s) this.f147958e[0];
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushPkgMergeDirReader", "close, customName:" + sVar.f147994a + ", hash:" + sVar.hashCode());
        sVar.c(new com.tencent.mm.plugin.magicbrush.fs.m(sVar));
        sVar.f147997d = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        boolean z17 = true;
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        com.tencent.mm.plugin.magicbrush.fs.a a17 = ((com.tencent.mm.plugin.magicbrush.fs.s) c()).a(b17);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (a17 != null) {
            a17.f147944a.q().fillAnother(fileStructStat);
            fileStructStat.st_size = a17.f147948e;
            return j1Var;
        }
        if (!b17.endsWith("/")) {
            b17 = b17.concat("/");
        }
        if (!b17.startsWith("/")) {
            b17 = "/".concat(b17);
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 b18 = b(b17);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        if (b18 == j1Var2) {
            java.lang.String b19 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(b17, true);
            com.tencent.mm.plugin.magicbrush.fs.s sVar = (com.tencent.mm.plugin.magicbrush.fs.s) c();
            sVar.getClass();
            if (b19 != null && b19.length() != 0) {
                z17 = false;
            }
            com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = z17 ? null : (com.tencent.mm.plugin.appbrand.appcache.y8) sVar.b(new com.tencent.mm.plugin.magicbrush.fs.n(sVar, b19));
            if (y8Var != null) {
                y8Var.q().fillAnother(fileStructStat);
                fileStructStat.makeItIsDir();
                fileStructStat.st_size = 0L;
                java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) this.f147959f).get(b19);
                if (l17 == null) {
                    return j1Var;
                }
                fileStructStat.st_atime = l17.longValue();
                return j1Var;
            }
        }
        return j1Var2;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 statDir(java.lang.String str, java.util.List list) {
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", "statDir: path = [%s] is illegal", str);
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
        }
        com.tencent.mm.plugin.magicbrush.fs.s sVar = (com.tencent.mm.plugin.magicbrush.fs.s) c();
        sVar.getClass();
        for (java.lang.String str2 : (java.util.List) sVar.b(new com.tencent.mm.plugin.magicbrush.fs.p(sVar))) {
            if (str2 != null && str2.startsWith(str)) {
                com.tencent.mm.plugin.appbrand.appstorage.h2 h2Var = new com.tencent.mm.plugin.appbrand.appstorage.h2(str2);
                java.lang.String name = stat(str2, h2Var).name();
                if (name.equals("OK")) {
                    list.add(h2Var);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", "statDir: stat [%s] fail:[%s]", str2, name);
                }
            }
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        com.tencent.mm.plugin.magicbrush.fs.a a17 = ((com.tencent.mm.plugin.magicbrush.fs.s) c()).a(b17);
        java.io.InputStream c17 = a17 != null ? a17.f147944a.c(a17.f147946c) : null;
        try {
            if (c17 == null) {
                return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
            }
            try {
                int available = c17.available();
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
                return readFile(b17, 0L, available, b0Var);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MBPkgFileSystemWithModularizingNewImpl", e17, "readFile", new java.lang.Object[0]);
                com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
                com.tencent.mm.sdk.platformtools.t8.v1(c17);
                return j1Var;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.t8.v1(c17);
            throw th6;
        }
    }
}
