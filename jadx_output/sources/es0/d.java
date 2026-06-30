package es0;

/* loaded from: classes10.dex */
public class d extends es0.a {

    /* renamed from: b, reason: collision with root package name */
    public int f256312b;

    /* renamed from: c, reason: collision with root package name */
    public int f256313c;

    /* renamed from: d, reason: collision with root package name */
    public int f256314d;

    /* renamed from: e, reason: collision with root package name */
    public int f256315e;

    /* renamed from: f, reason: collision with root package name */
    public final int f256316f;

    /* renamed from: g, reason: collision with root package name */
    public int f256317g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f256318h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f256319i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f256320j;

    /* renamed from: k, reason: collision with root package name */
    public int f256321k;

    /* renamed from: l, reason: collision with root package name */
    public int f256322l;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.MediaCodecInfo f256323m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f256324n;

    public d(boolean z17) {
        this.f256316f = com.tencent.tav.decoder.EncoderWriter.OUTPUT_VIDEO_COLOR_FORMAT;
        this.f256317g = 1;
        this.f256324n = "video/avc";
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCodecConfig", "init, enableHevc:" + z17);
        if (z17) {
            android.media.MediaCodecInfo a17 = a("video/hevc");
            this.f256323m = a17;
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoCodecConfig", "cannot found hevc codec info! fallback to select avc codec");
                this.f256323m = a("video/avc");
                this.f256324n = "video/avc";
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1280L, 61L, 1L);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success select hevc codec:");
                sb6.append(a17 != null ? a17.getName() : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoCodecConfig", sb6.toString());
                this.f256324n = "video/hevc";
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1280L, 60L, 1L);
            }
        } else {
            this.f256323m = a("video/avc");
            this.f256324n = "video/avc";
        }
        android.media.MediaCodecInfo mediaCodecInfo = this.f256323m;
        if (mediaCodecInfo == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1047L, 0L, 1L);
            this.f256319i = true;
            return;
        }
        kotlin.jvm.internal.o.d(mediaCodecInfo);
        java.lang.String name = mediaCodecInfo.getName();
        this.f256318h = name;
        this.f256317g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_media_iframe, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCodecConfig", "codecInfo.name : " + name + "  iFrameInterval " + this.f256317g);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(3:58|59|(21:63|(10:66|67|68|69|70|71|72|(2:(1:75)(1:87)|(2:81|82))(2:(1:104)(1:93)|(2:99|100))|83|64)|108|109|110|(2:112|(2:116|(1:120)))(2:121|(2:125|(1:129)))|4|5|6|(2:12|(1:14)(2:15|(1:17)(1:18)))|19|20|(1:22)(1:54)|23|(2:29|(1:32))|33|(1:35)(1:53)|36|(2:38|(5:40|(1:42)|43|(1:47)|48)(1:49))|50|51))|3|4|5|6|(4:8|10|12|(0)(0))|19|20|(0)(0)|23|(4:25|27|29|(1:32))|33|(0)(0)|36|(0)|50|51|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f1, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCodecConfig", "trySetBitRateMode error: %s", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01cf A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:6:0x01b6, B:8:0x01bc, B:10:0x01c2, B:12:0x01c8, B:14:0x01cf, B:15:0x01d9, B:17:0x01e0, B:18:0x01ea), top: B:5:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d9 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:6:0x01b6, B:8:0x01bc, B:10:0x01c2, B:12:0x01c8, B:14:0x01cf, B:15:0x01d9, B:17:0x01e0, B:18:0x01ea), top: B:5:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01bc A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:6:0x01b6, B:8:0x01bc, B:10:0x01c2, B:12:0x01c8, B:14:0x01cf, B:15:0x01d9, B:17:0x01e0, B:18:0x01ea), top: B:5:0x01b6 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.media.MediaFormat b() {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es0.d.b():android.media.MediaFormat");
    }

    public java.lang.String toString() {
        return "VideoCodecConfig(targetWidth=" + this.f256312b + ", targetHeight=" + this.f256313c + ", bitrate=" + this.f256314d + ", frameRate=" + this.f256315e + ", colorFormat=" + this.f256316f + ", iFrameInterval=" + this.f256317g + ", name=" + this.f256318h + ", initError=" + this.f256319i + ", forceCQ=" + this.f256320j + ", codecInfo=" + this.f256323m + ')';
    }

    public /* synthetic */ d(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}
