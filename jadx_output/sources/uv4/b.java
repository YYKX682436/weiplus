package uv4;

/* loaded from: classes8.dex */
public abstract class b implements uv4.g {

    /* renamed from: g, reason: collision with root package name */
    public static final uv4.a f431416g = new uv4.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f431417a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f431418b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f431419c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f431420d;

    /* renamed from: e, reason: collision with root package name */
    public final long f431421e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f431422f;

    public b(int i17, java.lang.String templatePath, java.lang.String zipFileName, java.lang.String assetDir, long j17) {
        kotlin.jvm.internal.o.g(templatePath, "templatePath");
        kotlin.jvm.internal.o.g(zipFileName, "zipFileName");
        kotlin.jvm.internal.o.g(assetDir, "assetDir");
        this.f431417a = i17;
        this.f431418b = templatePath;
        this.f431419c = zipFileName;
        this.f431420d = assetDir;
        this.f431421e = j17;
        this.f431422f = "";
    }

    @Override // uv4.g
    public void a(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        uv4.a aVar = f431416g;
        aVar.e(this.f431421e, 0L, 1L, false);
        java.lang.String str = this.f431418b;
        int i17 = this.f431417a;
        int c17 = aVar.c(str, filePath, i17, null);
        if (c17 == 1) {
            aVar.e(this.f431421e, 1L, 1L, false);
        } else {
            aVar.e(this.f431421e, 2L, 1L, false);
        }
        if (c17 <= b()) {
            aVar.e(this.f431421e, 3L, 1L, false);
            return;
        }
        aVar.e(this.f431421e, 4L, 1L, false);
        int i18 = 0;
        while (i18 < 3) {
            s(filePath, l());
            if (aVar.d(l(), i17)) {
                break;
            }
            i18++;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchTemplate", "checkResUpdate invalid md5 and delete template folder retryTimes:%s", java.lang.Integer.valueOf(i18));
        }
        if (aVar.d(l(), i17)) {
            aVar.e(this.f431421e, 6L, 1L, false);
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.BaseWebSearchTemplate", "checkResUpdate final update success version %d", java.lang.Integer.valueOf(c17));
        } else {
            aVar.e(this.f431421e, 5L, 1L, false);
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.BaseWebSearchTemplate", "checkResUpdate final md5 is invalid!");
        }
    }

    @Override // uv4.g
    public void d(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        s(filePath, l());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[LOOP:0: B:11:0x0044->B:15:0x0055, LOOP_START, PHI: r3
  0x0044: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:10:0x0042, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // uv4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r13 = this;
            int r0 = r13.m()
            int r1 = r13.b()
            java.lang.String r2 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
            r3 = 0
            r4 = 1
            if (r1 != r4) goto L15
            java.lang.String r0 = "first time init template"
            com.tencent.mars.xlog.Log.i(r2, r0)
        L13:
            r0 = r4
            goto L2b
        L15:
            if (r1 >= r0) goto L2a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "update template currentVersion %d assetVersion %d"
            com.tencent.mars.xlog.Log.i(r2, r1, r0)
            goto L13
        L2a:
            r0 = r3
        L2b:
            int r1 = r13.f431417a
            uv4.a r5 = uv4.b.f431416g
            if (r0 != 0) goto L41
            java.lang.String r6 = r13.l()
            boolean r6 = r5.d(r6, r1)
            if (r6 != 0) goto L41
            java.lang.String r0 = "check md5 invalid needInitTemplate"
            com.tencent.mars.xlog.Log.i(r2, r0)
            goto L42
        L41:
            r4 = r0
        L42:
            if (r4 == 0) goto L7e
        L44:
            r0 = 3
            if (r3 >= r0) goto L65
            r13.q()
            java.lang.String r0 = r13.l()
            boolean r0 = r5.d(r0, r1)
            if (r0 == 0) goto L55
            goto L65
        L55:
            int r3 = r3 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "checkWebSearchTemplate invalid md5 and delete template folder retryTimes:%s"
            com.tencent.mars.xlog.Log.i(r2, r4, r0)
            goto L44
        L65:
            java.lang.String r0 = r13.l()
            boolean r0 = r5.d(r0, r1)
            if (r0 != 0) goto L7e
            java.lang.String r0 = "checkWebSearchTemplate final md5 is invalid!"
            com.tencent.mars.xlog.Log.w(r2, r0)
            long r6 = r13.f431421e
            r8 = 7
            r10 = 1
            r12 = 0
            r5.e(r6, r8, r10, r12)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uv4.b.g():void");
    }

    @Override // uv4.g
    public java.lang.String i() {
        return l();
    }

    public int m() {
        java.lang.String str = "assets:///" + e();
        java.util.Properties properties = new java.util.Properties();
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(str);
            try {
                properties.load(E);
                vz5.b.a(E, null);
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "getAssetH5Version", new java.lang.Object[0]);
        }
        try {
            java.lang.String property = properties.getProperty("version", "1");
            kotlin.jvm.internal.o.f(property, "getProperty(...)");
            return java.lang.Integer.parseInt(property);
        } catch (java.lang.Exception unused) {
            return 1;
        }
    }

    public java.lang.String n() {
        java.lang.String h17 = lp0.b.h();
        kotlin.jvm.internal.o.f(h17, "DATAROOT_PUBLIC_PATH(...)");
        return h17;
    }

    public java.lang.String o() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(n(), this.f431418b);
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public com.tencent.mm.vfs.r6 p() {
        java.lang.String targetFolderPath = l();
        kotlin.jvm.internal.o.g(targetFolderPath, "targetFolderPath");
        return new com.tencent.mm.vfs.r6(targetFolderPath, "config.conf");
    }

    public void q() {
        r(l());
    }

    public final void r(java.lang.String targetFolderPath) {
        kotlin.jvm.internal.o.g(targetFolderPath, "targetFolderPath");
        try {
            byte[] N = com.tencent.mm.vfs.w6.N("assets:///" + j(), 0, -1);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "websearch/" + this.f431419c);
            if (r6Var.m()) {
                r6Var.l();
            }
            com.tencent.mm.vfs.r6 s17 = r6Var.s();
            if (s17 != null) {
                s17.J();
            }
            com.tencent.mm.vfs.w6.R(r6Var.o(), N);
            java.lang.String o17 = r6Var.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            s(o17, targetFolderPath);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "initAssetTemplateToPath", new java.lang.Object[0]);
        }
    }

    public final void s(java.lang.String zipFilePath, java.lang.String targetFolderPath) {
        int i17;
        kotlin.jvm.internal.o.g(zipFilePath, "zipFilePath");
        kotlin.jvm.internal.o.g(targetFolderPath, "targetFolderPath");
        if (!com.tencent.mm.vfs.w6.j(zipFilePath)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseWebSearchTemplate", "zipFile not exist: ".concat(zipFilePath));
            return;
        }
        if (com.tencent.mm.vfs.w6.j(targetFolderPath)) {
            com.tencent.mm.vfs.w6.f(targetFolderPath);
        }
        com.tencent.mm.vfs.w6.u(targetFolderPath);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(targetFolderPath, ".nomedia");
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "create nomedia file error", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.vfs.w6.u(targetFolderPath);
        try {
            i17 = com.tencent.mm.mm7zip.SevenZipUtil.extract(com.tencent.mm.vfs.w6.i(zipFilePath, false), com.tencent.mm.vfs.w6.i(targetFolderPath, true));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e18, "SevenZipUtil unzip error", new java.lang.Object[0]);
            i17 = -1;
        }
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseWebSearchTemplate", "unzip fail, ret = " + i17 + ", zipFilePath = " + zipFilePath + ", unzipPath = " + targetFolderPath);
            return;
        }
        k();
        sg0.a2 a2Var = (sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class));
        a2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onTemplateApplyed, 0");
        a2Var.nj();
        a2Var.Ai();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchTemplate", "Unzip Path=%s version=%d", targetFolderPath, java.lang.Integer.valueOf(b()));
    }
}
