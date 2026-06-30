package e04;

/* loaded from: classes12.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final e04.t2 f246106a = new e04.t2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f246108c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.repairer.config.scan.RepairerConfigOcrTranslateDcRoute f246109d = new com.tencent.mm.repairer.config.scan.RepairerConfigOcrTranslateDcRoute();

    /* renamed from: b, reason: collision with root package name */
    public static final dn.k f246107b = new e04.p2();

    public static final void a(java.lang.String str, java.lang.String str2, int i17, e04.q2 uploadCallback) {
        kotlin.jvm.internal.o.g(uploadCallback, "uploadCallback");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        boolean z17 = true;
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(str2, options);
        java.lang.String str3 = options.outMimeType;
        if ((str3 == null || str3.length() == 0) || (!r26.i0.o(str3, "hevc", false, 2, null) && !r26.i0.n(str3, "wxpc", false) && !r26.i0.n(str3, "wxam", false))) {
            z17 = false;
        }
        e04.t2 t2Var = f246106a;
        if (!z17) {
            t2Var.b(str, str2, i17, uploadCallback);
            return;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str2 + com.tencent.mm.vfs.w6.l(str2));
        ((com.tencent.mm.plugin.scanner.u0) ((com.tencent.mm.plugin.scanner.a0) i95.n0.c(com.tencent.mm.plugin.scanner.a0.class))).getClass();
        com.tencent.mm.plugin.scanner.m1.Ai().Ri();
        java.lang.String str4 = com.tencent.mm.plugin.scanner.m1.Ai().Ni() + java.lang.String.format("%s_%s.%s", "tmp", a17, "jpg");
        if (!com.tencent.mm.vfs.w6.j(str4)) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new e04.s2(str4, str2, str, i17, uploadCallback, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "addUploadTask hevc image exist");
            t2Var.b(str, str4, i17, uploadCallback);
        }
    }

    public static final java.lang.String c(java.lang.String str) {
        return c01.z1.r() + '_' + str + '_' + java.lang.System.currentTimeMillis();
    }

    public final void b(java.lang.String str, java.lang.String str2, int i17, e04.q2 q2Var) {
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_ScannerCdnService";
        mVar.f241787f = f246107b;
        mVar.field_mediaId = str;
        mVar.field_fullpath = str2;
        mVar.field_fileType = i17;
        mVar.field_priority = 2;
        boolean z17 = false;
        mVar.field_needStorage = false;
        mVar.field_needCompressImage = true;
        mVar.field_isStreamMedia = false;
        mVar.field_force_aeskeycdn = true;
        mVar.field_trysafecdn = false;
        int h17 = bm5.o1.f22719a.h(f246109d);
        if (h17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "doUpload, isDcRoute: false, disabled by repairer.");
        } else if (h17 != 1) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_ocr_translate_dc_route_enabled, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "doUpload, isDcRoute: " + z17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "doUpload, isDcRoute: true, enabled by repairer.");
            z17 = true;
        }
        if (z17) {
            mVar.f241789h = 5;
            mVar.field_appType = 100;
        }
        ((java.util.HashMap) f246108c).put(str, q2Var);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }
}
