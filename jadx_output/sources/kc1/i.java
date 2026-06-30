package kc1;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc1.f f306301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f306302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kc1.j f306304g;

    public i(kc1.j jVar, kc1.f fVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f306304g = jVar;
        this.f306301d = fVar;
        this.f306302e = e9Var;
        this.f306303f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kc1.c cVar;
        kc1.f fVar = this.f306301d;
        fVar.getClass();
        com.tencent.mm.xeffect.FaceTracker faceTracker = kc1.f.f306292d.f306293a;
        kc1.c cVar2 = kc1.c.ResultOK;
        kc1.c cVar3 = kc1.c.ResultInited;
        if (faceTracker == null) {
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            p05.a3 a3Var = p05.a3.f350439a;
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            p05.e5.a();
            kc1.f.f306292d.f306293a = new com.tencent.mm.xeffect.FaceTracker(p05.r3.a(p05.r3.f350674a, null, false, null, 7, null));
            cVar = cVar2;
        } else {
            cVar = cVar3;
        }
        int a17 = fVar.a(cVar);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(a17));
        this.f306302e.a(this.f306303f, this.f306304g.p(cVar == cVar2 ? "ok:init ok" : cVar == cVar3 ? "fail: already init" : cVar == kc1.c.ResultInitFail ? "fail:init fail" : "fail:undefine error", hashMap));
    }
}
