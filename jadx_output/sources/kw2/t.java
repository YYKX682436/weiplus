package kw2;

/* loaded from: classes15.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f313094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f313095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f313096h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw2.f f313097i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kw2.y yVar, java.lang.String str, so2.i3 i3Var, long j17, long j18, kw2.f fVar) {
        super(0);
        this.f313092d = yVar;
        this.f313093e = str;
        this.f313094f = i3Var;
        this.f313095g = j17;
        this.f313096h = j18;
        this.f313097i = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313092d.f313117c;
        java.lang.String str = this.f313093e;
        kw2.h hVar = (kw2.h) concurrentHashMap.get(str);
        if (hVar != null) {
            kw2.y yVar = this.f313092d;
            so2.i3 i3Var = this.f313094f;
            long j17 = this.f313095g;
            long j18 = this.f313096h;
            kw2.f fVar = this.f313097i;
            boolean z17 = hVar.f313019c;
            java.util.ArrayList arrayList = hVar.f313022f;
            if (!z17 && !arrayList.isEmpty()) {
                hVar.f313019c = true;
                kw2.e eVar = (kw2.e) kz5.n0.i0(arrayList);
                if (!eVar.A) {
                    kw2.y.b(yVar, hVar, eVar, i3Var, j17, j18, true, fVar, "onPlayerStop");
                }
                kw2.y.a(yVar, str, hVar, "onPlayerStop");
            } else if (hVar.f313021e && arrayList.isEmpty()) {
                yVar.f313117c.remove(str);
                com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStop pre render item remove " + str + ' ' + yVar.g() + ' ' + hVar);
            } else {
                com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStop invalid item " + str + ' ' + hVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
