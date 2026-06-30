package ma1;

/* loaded from: classes7.dex */
public final /* synthetic */ class i$$e implements ta1.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ma1.i f325178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325179b;

    public /* synthetic */ i$$e(ma1.i iVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325178a = iVar;
        this.f325179b = c0Var;
    }

    public final void a(long j17) {
        ma1.i iVar = this.f325178a;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: relative ticks in ms: %d", java.lang.Long.valueOf(j17));
        ma1.a aVar = iVar.f325165g;
        aVar.u(this.f325179b);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch stamp change: %d", java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("state", "timeUpdate");
        hashMap.put("currentTime", java.lang.Long.valueOf(j17));
        aVar.t(hashMap);
        aVar.m();
    }
}
