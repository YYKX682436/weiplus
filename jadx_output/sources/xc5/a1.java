package xc5;

/* loaded from: classes12.dex */
public final class a1 implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f453374a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f453375b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453376c;

    /* renamed from: d, reason: collision with root package name */
    public final gg3.c f453377d;

    /* renamed from: e, reason: collision with root package name */
    public final sf3.g f453378e;

    /* renamed from: f, reason: collision with root package name */
    public final float f453379f;

    /* renamed from: g, reason: collision with root package name */
    public final float f453380g;

    /* renamed from: h, reason: collision with root package name */
    public float f453381h;

    /* renamed from: i, reason: collision with root package name */
    public float f453382i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f453383j;

    public a1(xc5.k1 k1Var, mf3.k mediaInfo, com.tencent.mm.storage.f9 msgInfo, java.lang.String imageMediaId, java.lang.String videoMediaId, gg3.c forceVideoLoadParam, sf3.g forceImageLoadParam) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(imageMediaId, "imageMediaId");
        kotlin.jvm.internal.o.g(videoMediaId, "videoMediaId");
        kotlin.jvm.internal.o.g(forceVideoLoadParam, "forceVideoLoadParam");
        kotlin.jvm.internal.o.g(forceImageLoadParam, "forceImageLoadParam");
        this.f453383j = k1Var;
        this.f453374a = mediaInfo;
        this.f453375b = imageMediaId;
        this.f453376c = videoMediaId;
        this.f453377d = forceVideoLoadParam;
        this.f453378e = forceImageLoadParam;
        j15.d dVar = new j15.d();
        java.lang.String j17 = msgInfo.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        dVar.fromXml(j17);
        long r17 = dVar.o().r();
        r17 = r17 < 0 ? 0L : r17;
        j15.c t17 = dVar.o().t();
        long o17 = t17 != null ? t17.o() : 0L;
        o17 = o17 < 0 ? 0L : o17;
        long j18 = r17 + o17;
        if (j18 <= 0) {
            this.f453379f = 0.5f;
            this.f453380g = 0.5f;
        } else {
            float f17 = (float) r17;
            float f18 = (float) j18;
            this.f453379f = f17 / f18;
            this.f453380g = ((float) o17) / f18;
        }
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        java.lang.String str;
        if (n1Var == null || (str = n1Var.f71104b) == null) {
            return;
        }
        dn.g gVar = n1Var.f71107e;
        float f17 = gVar != null ? (float) gVar.field_finishedLength : 0.0f;
        float f18 = gVar != null ? (float) gVar.field_toltalLength : -1.0f;
        if (f18 <= 0.0f) {
            return;
        }
        float f19 = f17 / f18;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        if (kotlin.jvm.internal.o.b(str, this.f453375b)) {
            this.f453381h = f19;
        } else if (!kotlin.jvm.internal.o.b(str, this.f453376c)) {
            return;
        } else {
            this.f453382i = f19;
        }
        float f27 = (this.f453381h * this.f453379f) + (this.f453382i * this.f453380g);
        this.f453374a.getId();
        xc5.k1 k1Var = this.f453383j;
        mf3.k kVar = this.f453374a;
        vf3.e eVar = vf3.e.f436380g;
        k1Var.Y6(kVar, eVar, new vf3.f(eVar, null, 0, f27, 6, null), this.f453377d, this.f453378e);
    }
}
