package h63;

/* loaded from: classes7.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f279230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f279233g;

    public g0(com.tencent.mm.plugin.appbrand.o6 o6Var, android.content.Context context, java.lang.String str, int i17) {
        this.f279230d = o6Var;
        this.f279231e = context;
        this.f279232f = str;
        this.f279233g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.n7 N2 = this.f279230d.N2();
        ce.g gVar = N2 != null ? (ce.g) N2.B1(ce.g.class) : null;
        if (gVar != null) {
            ((ce.o) gVar).V(true, false, new de.c());
        }
        java.lang.String str = this.f279232f;
        int i17 = this.f279233g;
        h63.v[] vVarArr = h63.v.f279284d;
        com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest(str, i17, 1, 0, null, null, 0, 0L, 248, null);
        h63.f0 f0Var = h63.f0.f279228a;
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(this.f279231e, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, gameLiveAppbrandProcessService$EnterFinderLiveRequest, f0Var, null);
    }
}
