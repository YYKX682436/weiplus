package com.tencent.mm.wexnet;

/* loaded from: classes.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f214349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f214350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f214351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wexnet.p f214352i;

    public a0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, com.tencent.mm.wexnet.p pVar) {
        this.f214347d = str;
        this.f214348e = str2;
        this.f214349f = i17;
        this.f214350g = i18;
        this.f214351h = i19;
        this.f214352i = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String filePath = this.f214347d;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.String originalMd5 = this.f214348e;
        kotlin.jvm.internal.o.g(originalMd5, "originalMd5");
        com.tencent.mm.wexnet.p scene = this.f214352i;
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.XNET.XNetLibResHelper", "[processXnetSoResourceUpdate] from scene:" + scene, filePath);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XNET.XNetLibResHelper", "account not ready");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isResourceProcessSuccess#");
        int i17 = this.f214350g;
        sb6.append(i17);
        int i18 = this.f214351h;
        sb6.append(i18);
        int i19 = this.f214349f;
        sb6.append(i19);
        if (L.getBoolean(sb6.toString(), false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.XNET.XNetLibResHelper", "The resource has been processed. resType=" + i17 + " ,subType=" + i18 + ",fileVersion=" + i19);
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(filePath);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XNET.XNetLibResHelper", "file not exits :%s", filePath);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(filePath);
        com.tencent.mars.xlog.Log.i("MicroMsg.XNET.XNetLibResHelper", "getFileMD5String cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        if (android.text.TextUtils.isEmpty(p17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XNET.XNetLibResHelper", "current_file_md5 is empty");
            return;
        }
        if (!kotlin.jvm.internal.o.b(p17, originalMd5)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1868L, 6L, 1L, true);
            com.tencent.mars.xlog.Log.e("MicroMsg.XNET.XNetLibResHelper", "md5 is diff, current md5:%s, original md5:%s", p17, originalMd5);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XNET.XNetLibResHelper", "md5 is same, current md5:%s, original md5:%s", p17, originalMd5);
        java.lang.String c17 = com.tencent.mm.wexnet.y.f214380a.c();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c17);
        if (!r6Var.m()) {
            try {
                r6Var.J();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XNET.XNetLibResHelper", e17, "create file:%s", r6Var);
            }
        }
        java.lang.String str2 = c17 + '/' + i19;
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str2);
        if (r6Var2.m()) {
            r6Var2.l();
        }
        try {
            r6Var2.J();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XNET.XNetLibResHelper", e18, "create file:%s", str2);
        }
        int Q = com.tencent.mm.vfs.w6.Q(filePath, str2);
        if (Q < 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1868L, 5L, 1L, true);
            com.tencent.mars.xlog.Log.e("MicroMsg.XNET.XNetLibResHelper", "unzip fail, ret = " + Q + ", zipFilePath = " + filePath + ", unzipPath = " + str2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XNET.XNetLibResHelper", "unzip file success, unzipFolder file :%s to path:%s", filePath, str2);
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ri(i17, i18, i19);
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("isResourceProcessSuccess#" + i17 + i18 + i19, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1868L, 4L, 1L, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.XNET.XNetLibResHelper", "recycleOldVersionSo current fileVersion", java.lang.Integer.valueOf(i19));
        int i27 = i19 + (-2);
        if (i27 < 0) {
            return;
        }
        while (-1 < i27) {
            java.lang.String str3 = c17 + '/' + i27;
            if (com.tencent.mm.vfs.w6.j(str3)) {
                com.tencent.mm.vfs.w6.f(str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.XNET.XNetLibResHelper", "delete versionFolder:%s", str3);
            }
            i27--;
        }
    }
}
