package y00;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y00.a f458508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y00.s f458509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f458510f;

    public d(y00.a aVar, y00.s sVar, int i17) {
        this.f458508d = aVar;
        this.f458509e = sVar;
        this.f458510f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a10.f a17 = a10.e.f490a.a();
            y00.a aVar = this.f458508d;
            a17.y0(aVar.f458490a, aVar.f458491b, aVar.f458492c, this.f458509e.f458545a);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsKfProductCardFetcher", th6, "write storage fail msgSvrId=" + this.f458508d.f458490a, new java.lang.Object[0]);
        }
        y00.a aVar2 = this.f458508d;
        java.util.Map a18 = y00.a0.a(aVar2.f458491b, aVar2.f458490a, "MicroMsg.EcsKfProductCardFetcher");
        if (a18 != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new y00.c(this.f458510f, this.f458508d, this.f458509e, a18));
        }
    }
}
