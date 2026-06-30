package y00;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f458500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y00.a f458501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y00.s f458502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f458503g;

    public c(int i17, y00.a aVar, y00.s sVar, java.util.Map map) {
        this.f458500d = i17;
        this.f458501e = aVar;
        this.f458502f = sVar;
        this.f458503g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int h17 = gm0.j1.b().h();
        int i17 = this.f458500d;
        y00.a aVar = this.f458501e;
        if (h17 == i17) {
            y00.h.b(this.f458502f.f458545a, aVar.f458490a, this.f458503g, aVar.f458492c);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardFetcher", "memcache put skipped: uin changed, msgSvrId=" + aVar.f458490a);
    }
}
