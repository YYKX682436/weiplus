package dl4;

/* loaded from: classes3.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f235504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o11.g f235507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f235508h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p11.k f235509i;

    public z0(long j17, java.lang.String str, java.lang.String str2, o11.g gVar, com.tencent.mm.sdk.platformtools.w1 w1Var, p11.k kVar) {
        this.f235504d = j17;
        this.f235505e = str;
        this.f235506f = str2;
        this.f235507g = gVar;
        this.f235508h = w1Var;
        this.f235509i = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dl4.d1 d1Var = dl4.d1.f235383a;
        long j17 = this.f235504d;
        java.lang.String str = this.f235505e;
        java.lang.String str2 = this.f235506f;
        o11.g gVar = this.f235507g;
        dl4.d1.b(d1Var, j17, str, str2, gVar, new dl4.y0(j17, str, str2, gVar, this.f235508h, this.f235509i));
    }
}
