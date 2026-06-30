package pq2;

/* loaded from: classes2.dex */
public final class h extends pq2.c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public r45.qt2 f357596o;

    /* renamed from: p, reason: collision with root package name */
    public int f357597p;

    /* renamed from: q, reason: collision with root package name */
    public qp2.z f357598q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f357599r = "12";

    /* renamed from: s, reason: collision with root package name */
    public final oq2.a f357600s = new oq2.a();

    @Override // pq2.c
    public void b() {
        r45.qt2 qt2Var = this.f357596o;
        if (qt2Var == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        com.tencent.mars.xlog.Log.i(this.f357578d, "fetchLiveSquareTabs, contextObj:" + qt2Var);
        this.f357584m.c("doScene");
        rq2.s sVar = rq2.s.f398879a;
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "tickTabCgiStart");
        rq2.s.f398887i = c01.id.c();
        this.f357598q = new qp2.z(qt2Var, this.f357597p, null, null, null, null, 60, null);
        gm0.j1.d().a(4210, this);
        gm0.j1.d().g(this.f357598q);
    }

    @Override // pq2.c
    public void h() {
        java.lang.String memoryCacheFlag = this.f357599r;
        oq2.a aVar = this.f357600s;
        aVar.getClass();
        kotlin.jvm.internal.o.g(memoryCacheFlag, "memoryCacheFlag");
        com.tencent.mars.xlog.Log.i("PreloadCacheManager", "getPreloadSquareTabsCache memoryCacheFlag:".concat(memoryCacheFlag));
        ey2.c3 c3Var = aVar.f347372a;
        c3Var.getClass();
        az2.w wVar = (az2.w) c3Var.f257335g.get(memoryCacheFlag);
        boolean z17 = true;
        if (wVar != null && !d(wVar)) {
            this.f357581g = wVar;
            c(wVar, pq2.f.f357594d);
            z17 = false;
        }
        if (z17) {
            super.h();
        } else {
            com.tencent.mars.xlog.Log.i(this.f357578d, "startPreload return for use cache tabs.");
        }
    }

    @Override // pq2.c
    public void i() {
        gm0.j1.d().q(4210, this);
        super.i();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i(this.f357578d, "onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scene:" + scene);
        this.f357584m.c("onSceneEnd");
        rq2.s sVar = rq2.s.f398879a;
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "tickTabCgiEnd");
        rq2.s.f398888j = c01.id.c() - rq2.s.f398887i;
        az2.w wVar = new az2.w(i17, i18, str, scene, android.os.SystemClock.elapsedRealtime());
        this.f357581g = wVar;
        java.lang.String memoryCacheFlag = this.f357599r;
        oq2.a aVar = this.f357600s;
        aVar.getClass();
        kotlin.jvm.internal.o.g(memoryCacheFlag, "memoryCacheFlag");
        com.tencent.mars.xlog.Log.i("PreloadCacheManager", "storePreloadSquareTabsCache memoryCacheFlag:".concat(memoryCacheFlag));
        ey2.c3 c3Var = aVar.f347372a;
        c3Var.getClass();
        c3Var.f257335g.put(memoryCacheFlag, wVar);
        c(this.f357581g, new pq2.g(this));
    }
}
