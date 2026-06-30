package wu3;

/* loaded from: classes10.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final zv3.b f449810a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f449811b;

    /* renamed from: c, reason: collision with root package name */
    public final int f449812c;

    /* renamed from: d, reason: collision with root package name */
    public final int f449813d;

    /* renamed from: e, reason: collision with root package name */
    public final int f449814e;

    /* renamed from: f, reason: collision with root package name */
    public int f449815f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f449816g;

    /* renamed from: h, reason: collision with root package name */
    public float f449817h;

    /* renamed from: i, reason: collision with root package name */
    public int f449818i;

    /* renamed from: j, reason: collision with root package name */
    public int f449819j;

    /* renamed from: k, reason: collision with root package name */
    public int f449820k;

    /* renamed from: l, reason: collision with root package name */
    public float f449821l;

    /* renamed from: m, reason: collision with root package name */
    public float f449822m;

    /* renamed from: n, reason: collision with root package name */
    public float f449823n;

    public v1(java.lang.String videoPath, zv3.b emojiFrameRetriever) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(emojiFrameRetriever, "emojiFrameRetriever");
        this.f449810a = emojiFrameRetriever;
        this.f449811b = "MicroMsg.MixFrameSyncMgr";
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(videoPath, true);
        if (d17 != null) {
            int i17 = d17.f162386e;
            this.f449813d = i17;
            int i18 = d17.f162382a;
            this.f449814e = i18;
            this.f449821l = 1000.0f / i17;
            this.f449812c = (int) (i17 * (i18 / 1000.0d));
        } else {
            this.f449812c = 0;
            this.f449813d = 0;
            this.f449821l = 0.0f;
            this.f449814e = 0;
        }
        this.f449820k = this.f449813d;
        this.f449822m = this.f449821l;
        this.f449818i = this.f449812c;
        this.f449819j = 0;
    }
}
