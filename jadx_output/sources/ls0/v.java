package ls0;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final hs0.a f320929a;

    /* renamed from: b, reason: collision with root package name */
    public fs0.g f320930b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.p f320931c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f320933e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f320934f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f320935g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.HandlerThread f320936h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.r f320937i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f320938j;

    public v(hs0.a mediaExtractor, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(mediaExtractor, "mediaExtractor");
        this.f320929a = mediaExtractor;
        this.f320933e = new java.lang.Object();
        this.f320935g = "MicroMsg.MediaCodecCheckVideoCropRect";
        android.os.Looper myLooper = android.os.Looper.myLooper();
        this.f320934f = new com.tencent.mm.sdk.platformtools.n3((myLooper == null || z17) ? android.os.Looper.getMainLooper() : myLooper);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecCheckVideoCropRect", "create MediaCodecCheckVideoCropRect");
        mediaExtractor.g();
        this.f320937i = new ls0.p(this);
        this.f320938j = new ls0.r(this);
    }
}
