package nu3;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static long f340231c;

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.m f340229a = new nu3.m();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct f340230b = new com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f340232d = new java.util.ArrayList();

    public final void a() {
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        sightVideoLogStruct.f60396m = sightVideoLogStruct.b("RouterLog", b(), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReport >> " + f340231c + ", " + f340230b.n());
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct2 = f340230b;
        if (sightVideoLogStruct2.H != 0 && f340231c != 0) {
            sightVideoLogStruct2.k();
        }
        f340231c = 0L;
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = f340232d.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append("#");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return r26.i0.t(sb7, ",", ";", false);
    }

    public final void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setABAPramsUseDaemon >> " + i17);
        f340230b.f60399p = i17;
    }

    public final void d(cl0.g gVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCameraDataJSON >> ");
        sb6.append(gVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", sb6.toString());
        if (gVar == null) {
            return;
        }
        f340230b.f60392i = gVar.optBoolean("isUseCamera2") ? 2 : 1;
        f340230b.f60406w = gVar.optInt("CameraOpenCost");
        f340230b.f60407x = gVar.optInt("CameraFirstFrameCost");
        f340230b.f60408y = gVar.optInt("HighRecordStopWaitTime");
        f340230b.f60409z = gVar.optInt("LowRecordStopWaitTime");
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        sightVideoLogStruct.A = sightVideoLogStruct.b("RecordMuxerType", gVar.optBoolean("RecordMuxerType") ? "ffmpeg" : "mp4v2", true);
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct2 = f340230b;
        long j17 = sightVideoLogStruct2.I;
        if (j17 == 0) {
            j17 = gVar.optLong("OpenCameraTimeStamp");
        }
        sightVideoLogStruct2.I = j17;
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct3 = f340230b;
        long j18 = sightVideoLogStruct3.f60386J;
        if (j18 == 0) {
            j18 = gVar.optLong("StartPreviewTimeStamp");
        }
        sightVideoLogStruct3.f60386J = j18;
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct4 = f340230b;
        long j19 = sightVideoLogStruct4.K;
        if (j19 == 0) {
            j19 = gVar.optLong("PreviewSuccessTImeStamp");
        }
        sightVideoLogStruct4.K = j19;
    }

    public final void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setCaptureHevcEncode:" + i17);
        f340230b.R = (long) i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setConfigProvider");
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        if (recordConfigProvider == null || (str = recordConfigProvider.A) == null) {
            str = "";
        }
        sightVideoLogStruct.f60397n = sightVideoLogStruct.b("EditPathList", str, true);
        f340230b.f60401r = (recordConfigProvider != null ? kotlin.jvm.internal.o.b(recordConfigProvider.f155683u, java.lang.Boolean.TRUE) : 0) ^ 1;
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct2 = f340230b;
        sightVideoLogStruct2.E = sightVideoLogStruct2.b("ConfigParam", java.lang.String.valueOf(recordConfigProvider != null ? recordConfigProvider.f155676n : null), true);
    }

    public final void g(int... editMaterials) {
        kotlin.jvm.internal.o.g(editMaterials, "editMaterials");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setEditElementList");
        cl0.g gVar = new cl0.g();
        gVar.o("emoji", editMaterials[0]);
        gVar.o(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, editMaterials[1]);
        gVar.o("music", editMaterials[2]);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        sightVideoLogStruct.f60398o = sightVideoLogStruct.b("EditElementList", r26.i0.t(gVar2, ",", ";", false), true);
    }

    public final void h(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setEnterScene >> " + i17);
        f340230b.f60388e = i17;
    }

    public final void i(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "exitType: " + i17 + ", sendType: " + j17);
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        sightVideoLogStruct.f60405v = i17;
        sightVideoLogStruct.D = j17;
    }

    public final void j(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setFinishRecordTimeStamp >> " + j17);
        f340230b.M = j17;
    }

    public final void k(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setInitRouterTimeStamp >> timeStamp: " + j17);
        if (f340231c != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReport In setInitRouterTImeStamp");
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
            sightVideoLogStruct.f60396m = sightVideoLogStruct.b("RouterLog", b(), true);
            f340230b.k();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReset");
        f340230b = new com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct();
        f340232d.clear();
        f340231c = j17;
        f340230b.H = j17;
    }

    public final void l(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setJumpToThirdApp >> " + i17);
        f340230b.f60404u = i17;
    }

    public final void m(java.lang.String videoPath) {
        java.lang.String bVar;
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setMixVideoInfo >> ".concat(videoPath));
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(videoPath, true);
        long k17 = com.tencent.mm.vfs.w6.k(videoPath) / 1024;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setMixVideoInfo >> fileSize: " + k17 + " KB");
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        sightVideoLogStruct.G = sightVideoLogStruct.b("MixVideoInfo", (d17 == null || (bVar = d17.toString()) == null) ? "" : r26.i0.t(bVar, ",", ";", false), true);
        f340230b.V = k17;
    }

    public final void n(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setMuxResult >> " + i17);
        f340230b.f60402s = i17;
        i(1, 1L);
    }

    public final void o(java.lang.String videoPath) {
        java.lang.String bVar;
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setPhotoAlbumVideoInfo >> ".concat(videoPath));
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(videoPath, true);
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        sightVideoLogStruct.F = sightVideoLogStruct.b("PhotoAlbumVideoInfo", (d17 == null || (bVar = d17.toString()) == null) ? "" : r26.i0.t(bVar, ",", ";", false), true);
    }

    public final void p(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setRecordCameraRet >> type: " + z17);
        f340230b.f60393j = !z17 ? 1 : 0;
    }

    public final void q(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setRecordHighBitrateVideo >> filePath: " + str);
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        if (d17 == null || (str2 = d17.toString()) == null) {
            str2 = "";
        }
        sightVideoLogStruct.f60394k = sightVideoLogStruct.b("RecordHighBitrateVideo", str2, true);
    }

    public final void r(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setRecordLowBitrateVideo >> filePath: " + str);
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = f340230b;
        if (d17 == null || (str2 = d17.toString()) == null) {
            str2 = "";
        }
        sightVideoLogStruct.f60395l = sightVideoLogStruct.b("RecordLowBitrateVideo", str2, true);
    }

    public final void s(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setSNSDoubleCheck >> " + i17);
        f340230b.f60403t = i17;
    }

    public final void t(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setStartRecordTimeStamp >> " + j17);
        f340230b.L = j17;
    }

    public final void u(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setTecEnterScene >> type: " + i17);
        f340230b.T = i17;
    }

    public final void v(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setUseDaemon >> " + i17);
        f340230b.f60400q = i17;
    }
}
