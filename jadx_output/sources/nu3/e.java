package nu3;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f340199b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f340200c;

    /* renamed from: d, reason: collision with root package name */
    public static long f340201d;

    /* renamed from: e, reason: collision with root package name */
    public static nu3.b f340202e;

    /* renamed from: f, reason: collision with root package name */
    public static nu3.b f340203f;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.List f340204g;

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.e f340198a = new nu3.e();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f340205h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f340206i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f340207j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f340208k = "sns_ready_to_send_video";

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f340209l = jz5.h.b(nu3.d.f340197d);

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "cleanReportStorage");
        f340199b = false;
        f340200c = false;
        f340201d = 0L;
        f340202e = null;
        f340203f = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "cleanSnsOriginPathAndEditPath");
        ((java.util.ArrayList) f340205h).clear();
        ((java.util.ArrayList) f340206i).clear();
        ((java.util.ArrayList) f340207j).clear();
        nu3.f.f340211b = null;
        nu3.f.f340212c = "";
        nu3.f.f340213d = "";
        nu3.f.f340214e = "";
        nu3.f.f340215f = 0;
        nu3.i.f340218a.m(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (r26.n0.B(r2, "gif", false) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nu3.b b(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu3.e.b(java.lang.String):nu3.b");
    }

    public final nu3.b c(java.lang.String str) {
        gp.d dVar;
        nu3.b bVar = new nu3.b(0L, 0L, 0L, null, 0L, 31, null);
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordVideo.CameraEditorReporter", "video filePath empty");
            return bVar;
        }
        android.media.MediaMetadataRetriever mediaMetadataRetriever = null;
        gp.d dVar2 = null;
        try {
            try {
                dVar = new gp.d();
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            dVar.setDataSource(str);
            java.lang.String extractMetadata = dVar.extractMetadata(12);
            nu3.b bVar2 = new nu3.b(com.tencent.mm.vfs.w6.k(str), com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0), com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0), extractMetadata != null ? r26.i0.t(extractMetadata, "video/", "", false) : com.eclipsesource.mmv8.Platform.UNKNOWN, com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0));
            try {
                dVar.release();
            } catch (java.io.IOException unused) {
            }
            bVar = bVar2;
            mediaMetadataRetriever = extractMetadata;
        } catch (java.lang.Exception e18) {
            e = e18;
            dVar2 = dVar;
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordVideo.CameraEditorReporter", "getVideoInfo error: %s", e.toString());
            mediaMetadataRetriever = dVar2;
            if (dVar2 != null) {
                try {
                    dVar2.release();
                    mediaMetadataRetriever = dVar2;
                } catch (java.io.IOException unused2) {
                }
            }
            return bVar;
        } catch (java.lang.Throwable th7) {
            th = th7;
            mediaMetadataRetriever = dVar;
            if (mediaMetadataRetriever != null) {
                try {
                    mediaMetadataRetriever.release();
                } catch (java.io.IOException unused3) {
                }
            }
            throw th;
        }
        return bVar;
    }

    public final com.tencent.mm.autogen.mmdata.rpt.CameraEditorSessionActionStruct d(int i17, long j17, java.lang.String str, int i18) {
        com.tencent.mm.autogen.mmdata.rpt.CameraEditorSessionActionStruct cameraEditorSessionActionStruct = new com.tencent.mm.autogen.mmdata.rpt.CameraEditorSessionActionStruct();
        cameraEditorSessionActionStruct.f55531d = 1;
        boolean z17 = f340199b;
        cameraEditorSessionActionStruct.f55532e = z17 ? 1 : 0;
        cameraEditorSessionActionStruct.f55533f = f340200c ? 1 : 0;
        cameraEditorSessionActionStruct.f55534g = z17 ? 1 : i18 == 0 ? 2 : 3;
        cameraEditorSessionActionStruct.f55535h = i17;
        if (z17) {
            cameraEditorSessionActionStruct.f55537j = cameraEditorSessionActionStruct.b("CameraEnterSessionID", nu3.f.f340213d, true);
            cameraEditorSessionActionStruct.f55538k = cameraEditorSessionActionStruct.b("CameraSessionID", nu3.f.f340212c, true);
        }
        cameraEditorSessionActionStruct.f55539l = cameraEditorSessionActionStruct.b("EditSessionID", java.lang.String.valueOf(f340201d), true);
        cameraEditorSessionActionStruct.f55540m = cameraEditorSessionActionStruct.b("ChatUserName", str, true);
        cameraEditorSessionActionStruct.f55541n = e(str);
        cameraEditorSessionActionStruct.f55542o = cameraEditorSessionActionStruct.b("SvrMsgID", java.lang.String.valueOf(j17), true);
        return cameraEditorSessionActionStruct;
    }

    public final int e(java.lang.String str) {
        if (com.tencent.mm.storage.z3.R4(str)) {
            return ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r10) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu3.e.f(java.util.List):void");
    }
}
