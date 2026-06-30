package uo5;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: l, reason: collision with root package name */
    public static final uo5.t f429740l = new uo5.t(null);

    /* renamed from: m, reason: collision with root package name */
    public static final short[] f429741m = {128, 96, 240, 160, 320, 240, 480, 360, 640, 480, 1280, 720, 1920, 1080};

    /* renamed from: n, reason: collision with root package name */
    public static final int[][] f429742n = {new int[]{32, 48, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224, 240, 256, 272, 288, 304, com.tencent.mapsdk.internal.km.f50100e}, new int[]{48, 64, 96, 112, 144, 176, 192, 224, 240, 272, 288, com.tencent.mapsdk.internal.km.f50100e, 336, com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, 384, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, com.tencent.wcdb.FileUtils.S_IRWXU, 480}, new int[]{64, 96, 128, 160, 192, 224, 256, 288, com.tencent.mapsdk.internal.km.f50100e, com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, 384, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, com.tencent.wcdb.FileUtils.S_IRWXU, 480, 512, 544, 576, com.hilive.mediasdk.SdkInfo.ErrCode.kErrCodeNotFound, 640}, new int[]{128, 192, 256, com.tencent.mapsdk.internal.km.f50100e, 384, com.tencent.wcdb.FileUtils.S_IRWXU, 512, 576, 640, 704, 768, 832, ce1.h.CTRL_INDEX, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, 1024, 1088, dc1.e.CTRL_INDEX, com.tencent.mm.plugin.appbrand.jsapi.pay.p0.CTRL_INDEX, 1280}, new int[]{192, 288, 384, 480, 576, 672, 768, td1.i.CTRL_INDEX, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, yc1.s.CTRL_INDEX, dc1.e.CTRL_INDEX, 1248, 1344, 1440, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX, 1632, 1728, 1824, 1920}};

    /* renamed from: o, reason: collision with root package name */
    public static final short[] f429743o = {75, 56, 100, 50};

    /* renamed from: a, reason: collision with root package name */
    public final int f429744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f429745b;

    /* renamed from: c, reason: collision with root package name */
    public final short f429746c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f429747d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f429748e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f429749f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f429750g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f429751h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f429752i;

    /* renamed from: j, reason: collision with root package name */
    public final byte f429753j;

    /* renamed from: k, reason: collision with root package name */
    public final short f429754k;

    public u(int i17, int i18, short s17, byte b17, byte b18, byte b19, boolean z17, boolean z18, boolean z19, byte b27, short s18, kotlin.jvm.internal.i iVar) {
        this.f429744a = i17;
        this.f429745b = i18;
        this.f429746c = s17;
        this.f429747d = b17;
        this.f429748e = b18;
        this.f429749f = b19;
        this.f429750g = z17;
        this.f429751h = z18;
        this.f429752i = z19;
        this.f429753j = b27;
        this.f429754k = s18;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof uo5.u)) {
            return false;
        }
        uo5.u uVar = (uo5.u) obj;
        return uVar.f429744a == this.f429744a && uVar.f429745b == this.f429745b && uVar.f429746c == this.f429746c;
    }

    public int hashCode() {
        return (((((((((((((((((this.f429744a * 31) + this.f429745b) * 31) + this.f429746c) * 31) + this.f429747d) * 31) + (this.f429748e & 255)) * 31) + this.f429749f) * 31) + java.lang.Boolean.hashCode(this.f429750g)) * 31) + java.lang.Boolean.hashCode(this.f429751h)) * 31) + java.lang.Boolean.hashCode(this.f429752i)) * 31) + this.f429753j;
    }

    public java.lang.String toString() {
        return "QoSParams(width=" + this.f429744a + ", height=" + this.f429745b + ", kbps=" + ((int) this.f429746c) + ", fps=" + ((int) this.f429747d) + ", iPeriod=" + ((java.lang.Object) java.lang.String.valueOf(this.f429748e & 255)) + ", codecType=" + ((int) this.f429749f) + ", hwEnable=" + this.f429750g + ", skipFrame=" + this.f429751h + ", requestI=" + this.f429752i + ", resvd=" + ((int) this.f429753j) + ", windowMode=" + ((int) this.f429754k) + ')';
    }
}
