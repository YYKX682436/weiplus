package kw2;

/* loaded from: classes15.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f313046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f313047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f313048h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f313049i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kw2.f f313050m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kw2.y yVar, java.lang.String str, boolean z17, so2.i3 i3Var, long j17, long j18, kw2.f fVar) {
        super(0);
        this.f313044d = yVar;
        this.f313045e = str;
        this.f313046f = z17;
        this.f313047g = i3Var;
        this.f313048h = j17;
        this.f313049i = j18;
        this.f313050m = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kw2.y yVar;
        java.lang.String str;
        jz5.f0 f0Var;
        kw2.y yVar2 = this.f313044d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar2.f313117c;
        java.lang.String str2 = this.f313045e;
        kw2.h hVar = (kw2.h) concurrentHashMap.get(str2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (hVar != null) {
            kw2.y yVar3 = this.f313044d;
            so2.i3 i3Var = this.f313047g;
            long j17 = this.f313048h;
            long j18 = this.f313049i;
            kw2.f fVar = this.f313050m;
            if (!hVar.f313019c) {
                java.util.ArrayList arrayList = hVar.f313022f;
                if (!arrayList.isEmpty()) {
                    kw2.e eVar = (kw2.e) kz5.n0.i0(arrayList);
                    if (eVar.A) {
                        com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerPause invalid item stopPlayHit " + eVar.Q + "  " + hVar);
                        yVar = yVar2;
                        str = "FinderNetworkFlowReport";
                    } else {
                        boolean z17 = this.f313046f;
                        yVar = yVar2;
                        if (z17) {
                            eVar.O = c01.id.a();
                        }
                        str = "FinderNetworkFlowReport";
                        kw2.y.b(yVar3, hVar, eVar, i3Var, j17, j18, !z17, fVar, "onPlayerPause");
                    }
                    f0Var = f0Var2;
                }
            }
            yVar = yVar2;
            str = "FinderNetworkFlowReport";
            com.tencent.mars.xlog.Log.w(str, "PLAY_onPlayerPause invalid item hitStop " + str2 + ' ' + hVar);
            f0Var = f0Var2;
        } else {
            yVar = yVar2;
            str = "FinderNetworkFlowReport";
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(str, "PLAY_onPlayerPause invalid item " + str2 + ' ' + yVar);
        }
        return f0Var2;
    }
}
