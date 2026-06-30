package kc1;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc1.f f306305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f306306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kc1.l f306308g;

    public k(kc1.l lVar, kc1.f fVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f306308g = lVar;
        this.f306305d = fVar;
        this.f306306e = e9Var;
        this.f306307f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kc1.c cVar;
        kc1.f fVar = this.f306305d;
        fVar.f306295c.clear();
        com.tencent.mm.xeffect.FaceTracker faceTracker = kc1.f.f306292d.f306293a;
        kc1.c cVar2 = kc1.c.ResultOK;
        kc1.c cVar3 = kc1.c.ResultStopFail;
        if (faceTracker != null) {
            faceTracker.a();
            kc1.f.f306292d.f306293a = null;
            cVar = cVar2;
        } else {
            cVar = cVar3;
        }
        int a17 = fVar.a(cVar);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(a17));
        this.f306306e.a(this.f306307f, this.f306308g.p(cVar == cVar2 ? "ok:stop ok" : cVar == cVar3 ? "fail:stop fail" : "fail:undefine error", hashMap));
    }
}
