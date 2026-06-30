package st3;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final st3.t f412597a = new st3.t();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.modelcontrol.VideoTransPara f412598b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f412599c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f412600d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f412601e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f412602f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f412603g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f412604h = -1;

    public static final void a(android.graphics.Point cropPreviewSize) {
        kotlin.jvm.internal.o.g(cropPreviewSize, "cropPreviewSize");
        int i17 = cropPreviewSize.x;
        int i18 = cropPreviewSize.y;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen, cropPreviewWidth:" + i17 + ", cropPreviewHeight:" + i18 + ", recorderType:" + di3.w.f232770d.f232700a + ", resolutionLimit:" + f412599c);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = f412598b;
        if (videoTransPara != null) {
            if (di3.w.f232770d.f232700a == 1) {
                if (i18 > videoTransPara.f71191d) {
                    int i19 = f412599c;
                    if (i19 == 1080) {
                        videoTransPara.f71191d = i18 / 2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen ffempg 1080p, videoWidth:" + videoTransPara.f71191d);
                    } else if (i19 == 720) {
                        videoTransPara.f71191d = (int) (i18 * 0.75d);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen ffempg 720p, videoWidth:" + videoTransPara.f71191d);
                    }
                    videoTransPara.f71192e = (int) ((i17 / i18) * videoTransPara.f71191d);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen ffmpeg use crop preview size");
                    videoTransPara.f71191d = i18;
                    videoTransPara.f71192e = i17;
                }
                int i27 = videoTransPara.f71191d;
                if (i27 % 2 != 0) {
                    videoTransPara.f71191d = i27 - 1;
                }
                int i28 = videoTransPara.f71192e;
                if (i28 % 2 != 0) {
                    videoTransPara.f71192e = i28 - 1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen ffmpeg final videoSize:" + videoTransPara.f71191d + 'x' + videoTransPara.f71192e);
                return;
            }
            int i29 = f412599c;
            if ((i29 == 720 || i29 == 540) && i18 < videoTransPara.f71191d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 720p or 540p:" + f412599c + ", adjust video size");
                int i37 = f412599c;
                if (i37 == 540) {
                    videoTransPara.f71191d = i18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 540p, videoWidth:" + videoTransPara.f71191d);
                } else if (i37 == 720) {
                    videoTransPara.f71191d = (int) (i18 * 0.75d);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 720p, videoWidth:" + videoTransPara.f71191d);
                }
                float f17 = i17 / i18;
                int i38 = videoTransPara.f71191d;
                videoTransPara.f71192e = (int) (f17 * i38);
                videoTransPara.f71191d = ai3.d.a(i38);
                videoTransPara.f71192e = ai3.d.a(videoTransPara.f71192e);
                com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "afterCameraOpen final adjust video size:" + videoTransPara.f71191d + 'x' + videoTransPara.f71192e);
            }
        }
    }

    public final boolean b() {
        di3.f0 f0Var = di3.w.f232770d;
        if (f0Var == null || !f412601e) {
            return false;
        }
        boolean z17 = f0Var.f232700a == 1;
        java.lang.Object b17 = bm5.o1.f22719a.b(bm5.h0.RepairerConfig_Media_CaptureCpuCrop_Int, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cpuCrop: recorderTypeCpuCrop:");
        sb6.append(z17);
        sb6.append(", serverConfigUseCpuCrop:");
        sb6.append(f412600d);
        sb6.append(", swEnableHevc:");
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = f412598b;
        sb6.append(videoTransPara != null ? java.lang.Integer.valueOf(videoTransPara.K) : null);
        sb6.append(", hwEnableHevc:");
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = f412598b;
        sb6.append(videoTransPara2 != null ? java.lang.Integer.valueOf(videoTransPara2.f71190J) : null);
        sb6.append(", repairerConfig:");
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", sb6.toString());
        if (!kotlin.jvm.internal.o.b(b17, 0)) {
            return kotlin.jvm.internal.o.b(b17, 1);
        }
        if (!z17 && !f412600d) {
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara3 = f412598b;
            if (!(videoTransPara3 != null && videoTransPara3.K == 1)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x00a2, code lost:
    
        if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, -1) != (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00ba, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00b8, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00b6, code lost:
    
        if (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, -1) != (-1)) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.tencent.mm.modelcontrol.VideoTransPara r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st3.t.c(com.tencent.mm.modelcontrol.VideoTransPara, int, boolean):void");
    }

    public final java.lang.String d() {
        return "cpuCrop:" + b() + ", recorderType:" + e() + ", resolutionLimit:" + f412599c + ", videoParams:" + f412598b;
    }

    public final int e() {
        java.lang.Object b17 = bm5.o1.f22719a.b(bm5.h0.RepairerConfig_Media_CaptureSoft_Int, 0);
        if (!kotlin.jvm.internal.o.b(b17, 0)) {
            return kotlin.jvm.internal.o.b(b17, 1) ? 1 : 2;
        }
        di3.f0 f0Var = di3.w.f232770d;
        if (f0Var == null || !f412601e) {
            return 2;
        }
        return f0Var.f232700a;
    }
}
