package o93;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.appstorage.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f343723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f343724e;

    /* renamed from: f, reason: collision with root package name */
    public long f343725f;

    public c(java.lang.String str, java.lang.String str2, long j17) {
        this.f343723d = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).o();
        this.f343724e = str2;
        this.f343725f = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.tencent.mm.plugin.webview.model.o5.d(str);
        return (d17 == null || !com.tencent.mm.vfs.w6.j(d17)) ? com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS : com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str) {
        java.lang.String str2 = this.f343723d;
        com.tencent.mm.vfs.w6.u(str2);
        return new com.tencent.mm.vfs.r6(str2 + "/" + str);
    }

    public final java.nio.ByteBuffer b(com.tencent.mm.vfs.r6 r6Var, long j17, long j18) {
        if (r6Var == null || !r6Var.m() || !r6Var.A()) {
            return java.nio.ByteBuffer.allocateDirect(0);
        }
        int C = (int) r6Var.C();
        if (C >= 0 && (j17 + j18) - 1 <= C - 1) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(C);
            long j19 = C;
            if (j18 < 0) {
                j18 = j19;
            }
            try {
                java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(r6Var.o(), false);
                try {
                    B.getChannel().read(allocateDirect);
                    allocateDirect.flip();
                    if (j17 == 0 && j18 == j19) {
                        B.close();
                        return allocateDirect;
                    }
                    int i17 = (int) j18;
                    byte[] bArr = new byte[i17];
                    allocateDirect.position((int) j17);
                    allocateDirect.get(bArr, 0, i17);
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                    B.close();
                    return wrap;
                } catch (java.lang.Throwable th6) {
                    try {
                        B.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("WxaLiteApp.LiteAppAppBrandFileSystem", e17, "readAsDirectByteBuffer", new java.lang.Object[0]);
                nf.a.a(allocateDirect);
                return java.nio.ByteBuffer.allocateDirect(0);
            } catch (java.nio.BufferOverflowException unused) {
                com.tencent.mars.xlog.Log.e("WxaLiteApp.LiteAppAppBrandFileSystem", "BufferOverflow, file_length %d, byte_allocated %d", java.lang.Long.valueOf(r6Var.C()), java.lang.Integer.valueOf(allocateDirect.capacity()));
                nf.a.a(allocateDirect);
                return java.nio.ByteBuffer.allocateDirect(0);
            }
        }
        return java.nio.ByteBuffer.allocateDirect(0);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandFileSystem", "createTempFileFrom src[%s]", r6Var);
        b0Var.f291824a = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).wi(r6Var.o()).f182736e;
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str, boolean z17) {
        return getAbsoluteFile(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var) {
        b0Var.f291824a = this.f343723d;
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        if (com.tencent.mm.vfs.w6.u(this.f343723d)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("WxaLiteApp.LiteAppAppBrandFileSystem", "Initialization Failed");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.tencent.mm.plugin.webview.model.o5.d(str);
        if (d17 != null && com.tencent.mm.vfs.w6.j(d17)) {
            b0Var.f291824a = b(new com.tencent.mm.vfs.r6(d17), 0L, -1L);
            return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public final java.io.InputStream readStream(java.lang.String str) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.tencent.mm.plugin.webview.model.o5.d(str);
        if (d17 != null && com.tencent.mm.vfs.w6.j(d17)) {
            try {
                return com.tencent.mm.vfs.w6.E(d17);
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.tencent.mm.plugin.webview.model.o5.d(str);
        if (d17 == null || !com.tencent.mm.vfs.w6.j(d17)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
        return (fileStructStat != null && com.tencent.mm.plugin.appbrand.appstorage.FileStat.vfsStat(d17, fileStructStat) == 0) ? com.tencent.mm.plugin.appbrand.appstorage.j1.OK : j1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 getAbsoluteFile(java.lang.String str) {
        java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(this.f343724e, this.f343725f, str);
        if (zj6 != null && zj6.contains("DefaultWxaCacheManager")) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.lite.logic.y2.f(this.f343724e, null, null) + "DefaultWxaCacheManager");
            if (!r6Var.m()) {
                r6Var.J();
            }
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(zj6));
            if (r6Var2.m()) {
                com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var, r6Var2.getName());
                if (r6Var2.L(r6Var3)) {
                    return r6Var3;
                }
                return null;
            }
        }
        if (zj6 == null || zj6.isEmpty()) {
            return null;
        }
        return new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(zj6));
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.tencent.mm.plugin.webview.model.o5.d(str);
        if (d17 != null && com.tencent.mm.vfs.w6.j(d17)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(d17);
            long C = j18 == com.tencent.wcdb.core.Database.DictDefaultMatchValue ? r6Var.C() - j17 : j18;
            com.tencent.mm.plugin.appbrand.appstorage.j1 a17 = a(j17, C, r6Var.C());
            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
            if (a17 != j1Var) {
                return a17;
            }
            b0Var.f291824a = b(r6Var, j17, C);
            return j1Var;
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
    }
}
