package dl4;

/* loaded from: classes3.dex */
public final class y0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f235497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235499c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o11.g f235500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f235501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p11.k f235502f;

    public y0(long j17, java.lang.String str, java.lang.String str2, o11.g gVar, com.tencent.mm.sdk.platformtools.w1 w1Var, p11.k kVar) {
        this.f235497a = j17;
        this.f235498b = str;
        this.f235499c = str2;
        this.f235500d = gVar;
        this.f235501e = w1Var;
        this.f235502f = kVar;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        long j17 = this.f235497a;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingImageLoader", "loadImage session: %s, download success and try decode", java.lang.Long.valueOf(j17));
            pm0.v.X(new dl4.w0(this.f235497a, this.f235498b, this.f235499c, this.f235500d, this.f235501e, this.f235502f));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingImageLoader", "loadImage session: %s, download failed", java.lang.Long.valueOf(j17));
            pm0.v.X(new dl4.x0(this.f235502f, this.f235498b, objArr));
        }
    }
}
