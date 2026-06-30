package kw2;

/* loaded from: classes15.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.b f313070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f313073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw2.f f313074h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ek4.b bVar, kw2.y yVar, java.lang.String str, long j17, kw2.f fVar) {
        super(0);
        this.f313070d = bVar;
        this.f313071e = yVar;
        this.f313072f = str;
        this.f313073g = j17;
        this.f313074h = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ek4.b bVar = this.f313070d;
        sb6.append(bVar.f253629f);
        sb6.append('.');
        int i17 = bVar.f253624a;
        kw2.y yVar = this.f313071e;
        sb6.append(yVar.d(i17));
        sb6.append('.');
        java.lang.String str = this.f313072f;
        jz5.f0 f0Var = null;
        sb6.append(hc2.b0.k(str, 0, 0, 3, null));
        java.lang.String sb7 = sb6.toString();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f313117c;
        kw2.h hVar = (kw2.h) concurrentHashMap.get(str);
        if (hVar != null) {
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerPrepare " + sb7 + " invalid item " + hVar);
        }
        kw2.e a17 = kw2.e.V.a(this.f313073g, str, bVar);
        kw2.h hVar2 = new kw2.h(false, false, false, false, false, new java.util.ArrayList());
        hVar2.f313017a = true;
        kw2.f fVar = this.f313074h;
        if (fVar != null) {
            fVar.a(new kw2.n(sb7, a17));
        }
        kw2.e eVar = (kw2.e) yVar.f313116b.get(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (eVar != null) {
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_onPlayerPrepare#hitPreRender " + sb7 + ' ' + a17);
            hVar2.f313021e = true;
            concurrentHashMap.put(str, hVar2);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            a17.f312980z = true;
            a17.f312972r = c01.id.a();
            kotlin.jvm.internal.o.g(sb7, "<set-?>");
            a17.Q = sb7;
            hVar2.f313020d = i17 == 2;
            hVar2.f313022f.add(a17);
            concurrentHashMap.put(str, hVar2);
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_onPlayerPrepare#itembegin " + sb7 + ' ' + a17);
        }
        return f0Var2;
    }
}
