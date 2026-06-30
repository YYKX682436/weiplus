package v22;

/* loaded from: classes10.dex */
public final class m extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final v22.g f432832f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f432833g;

    /* renamed from: h, reason: collision with root package name */
    public final long f432834h;

    /* renamed from: i, reason: collision with root package name */
    public long f432835i;

    public m(v22.g mixInfo) {
        kotlin.jvm.internal.o.g(mixInfo, "mixInfo");
        this.f432832f = mixInfo;
        this.f432833g = "MicroMsg.EmojiMixTask";
        this.f432834h = mixInfo.f432814b;
    }

    public static final void e(v22.m mVar, boolean z17) {
        v22.g gVar = mVar.f432832f;
        boolean z18 = false;
        if (!z17) {
            qr.e.f366008a.a(gVar.f432814b, false, null);
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = gVar.f432822j;
            emojiInfo.getClass();
            emojiInfo.field_captureUploadErrCode = 11;
            emojiInfo.field_captureStatus = 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCapture", "updateEmojiInfo: " + emojiInfo.getMd5());
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(emojiInfo);
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.d(mVar.f432834h, 3, gVar.f432813a);
            return;
        }
        int i17 = gVar.f432813a;
        if ((i17 == 3 || i17 == 4 || i17 == 5) && (i17 == 4 || i17 == 5)) {
            z18 = true;
        }
        if (!z18) {
            qr.e.f366008a.a(gVar.f432814b, true, null);
        }
        java.lang.String md52 = gVar.f432822j.getMd5();
        kotlin.jvm.internal.o.f(md52, "getMd5(...)");
        java.lang.String filePath = gVar.f432816d;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCapture", "postUploadTask: " + filePath + ", " + md52);
        int k17 = (int) com.tencent.mm.vfs.w6.k(filePath);
        com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(md52);
        if (N != null) {
            if (k17 <= 0) {
                N.field_captureUploadErrCode = 12;
                N.field_captureStatus = 2;
                ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(N);
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.d(N.field_captureEnterTime, 4, N.field_captureScene);
            } else {
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(filePath);
                java.lang.String str = rr.s.f399149a.c() + p17;
                com.tencent.mm.vfs.w6.w(filePath, str);
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCapture", "upload file " + str + " length is " + k17);
                ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().f1(N.getMd5());
                N.field_md5 = p17;
                N.field_captureStatus = 3;
                N.field_size = (int) com.tencent.mm.vfs.w6.k(str);
                if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
                    N.field_wxamMd5 = p17;
                    N.field_externMd5 = p17;
                }
                ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().J0(N);
                qr.a0.f365999a.a(N);
            }
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(19, mVar.f432834h, 0L, 0L, 0L, mVar.f432835i, 0L, 0, 0, gVar.f432813a);
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(1, 1);
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(38, (int) mVar.f432835i);
    }

    @Override // fp0.d
    public void a() {
        v22.g gVar = this.f432832f;
        v22.z zVar = new v22.z(gVar.f432815c, gVar.f432817e, gVar.f432816d, gVar.f432818f, gVar.f432819g, gVar.f432820h, gVar.f432821i, gVar.f432814b);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.ArrayList) gVar.f432817e.f432793a).iterator();
        while (it.hasNext()) {
            ((av3.a) it.next()).d();
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(37, 1);
        v22.l lVar = new v22.l(this, currentTimeMillis);
        zVar.f432884o = java.lang.System.currentTimeMillis();
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        java.lang.String str = zVar.f432870a;
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        double d18 = (d17 != null ? java.lang.Integer.valueOf(d17.f162386e) : null) != null ? 1000.0d / d17.f162386e : 0.0d;
        zVar.f432882m = lVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start decode ");
        sb6.append(java.lang.Thread.currentThread().getId());
        sb6.append(", fps: ");
        sb6.append(d17 != null ? java.lang.Integer.valueOf(d17.f162386e) : null);
        sb6.append(", duration: ");
        sb6.append(d17 != null ? java.lang.Integer.valueOf(d17.f162382a) : null);
        sb6.append(", videoFrameDuration: ");
        sb6.append(d18);
        sb6.append(", removeBackground:");
        boolean z18 = zVar.f432874e;
        sb6.append(z18);
        sb6.append(", path: ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMixer", sb6.toString());
        zVar.f432879j = 0;
        t85.j jVar = zVar.f432875f;
        boolean z19 = jVar != null;
        int i17 = zVar.f432873d;
        boolean z27 = i17 > 1;
        int i18 = d17 != null ? d17.f162382a : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markStartEmojiMix, removeBackground:" + z18 + ", hasSticker:" + z19 + ", speedUp:" + z27 + ", videoDuration:" + i18);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1012L, 17L, 1L);
        if (z18) {
            g0Var.C(1012L, 18L, 1L);
        }
        if (z19) {
            g0Var.C(1012L, 19L, 1L);
        }
        if (z27) {
            g0Var.C(1012L, 20L, 1L);
        }
        if (i18 > 0) {
            g0Var.C(1012L, 36L, i18);
        }
        boolean z28 = zVar.f432876g;
        if (z28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markUseGif");
            g0Var.C(1012L, 31L, 1L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markUseWxam");
            g0Var.C(1012L, 30L, 1L);
        }
        zVar.f432880k = new v22.b(str, zVar.f432871b, i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(zVar.f432872c)) {
            java.lang.String str2 = zVar.f432872c;
            if (zVar.f432880k == null) {
                kotlin.jvm.internal.o.o("syncMgr");
                throw null;
            }
            zVar.f432881l = new v22.f(str2, com.tencent.mapsdk.internal.km.f50100e, com.tencent.mapsdk.internal.km.f50100e, r4.f449822m, zVar.f432876g);
        }
        d32.j jVar2 = new d32.j(com.tencent.mapsdk.internal.km.f50100e, com.tencent.mapsdk.internal.km.f50100e, !z28, jVar);
        zVar.f432878i = jVar2;
        jVar2.f226160m = new v22.u(zVar);
        jVar2.f226158k.post(new d32.f(jVar2, z18, new v22.y(zVar, d17)));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return java.lang.String.valueOf(this.f432834h);
    }
}
