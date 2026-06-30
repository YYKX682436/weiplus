package kw2;

/* loaded from: classes15.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f313085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f313086g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f313087h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek4.b f313088i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f313089m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kw2.f f313090n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f313091o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kw2.y yVar, java.lang.String str, long j17, so2.i3 i3Var, boolean z17, ek4.b bVar, long j18, kw2.f fVar, long j19) {
        super(0);
        this.f313083d = yVar;
        this.f313084e = str;
        this.f313085f = j17;
        this.f313086g = i3Var;
        this.f313087h = z17;
        this.f313088i = bVar;
        this.f313089m = j18;
        this.f313090n = fVar;
        this.f313091o = j19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kw2.y yVar = this.f313083d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f313116b;
        java.lang.String str = this.f313084e;
        kw2.e eVar = (kw2.e) concurrentHashMap.get(str);
        kw2.d dVar = kw2.e.V;
        jz5.f0 f0Var = null;
        so2.i3 i3Var = this.f313086g;
        if (eVar != null) {
            long j17 = this.f313085f;
            if (j17 > 0) {
                eVar.f312961g = j17;
                eVar.f312960f = j17 / 1000;
            }
            eVar.E = true;
            dVar.d(eVar, i3Var);
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PRERENDER_stopPreRenderForStartPlay " + eVar.Q + ' ' + str + " item:" + eVar);
        } else {
            eVar = null;
        }
        kw2.h hVar = (kw2.h) yVar.f313117c.get(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (hVar != null) {
            java.util.ArrayList arrayList = hVar.f313022f;
            boolean z17 = (arrayList.isEmpty() ^ true) && !((kw2.e) kz5.n0.i0(arrayList)).A;
            boolean z18 = this.f313087h;
            if (z18 && z17) {
                kw2.e eVar2 = (kw2.e) kz5.n0.i0(arrayList);
                if (z18 && eVar2.O > 0) {
                    eVar2.P += c01.id.a() - eVar2.O;
                    eVar2.O = 0L;
                }
                com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStart " + str + " isManualStart item " + hVar);
            } else if (!hVar.f313017a || hVar.f313019c) {
                com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStart " + str + " invalid item " + hVar);
            } else if (hVar.f313018b || arrayList.size() != 1) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                ek4.b bVar = this.f313088i;
                sb6.append(yVar.d(bVar.f253624a));
                sb6.append(' ');
                sb6.append(bVar.f253629f);
                sb6.append(' ');
                sb6.append(str);
                java.lang.String sb7 = sb6.toString();
                kw2.e a17 = dVar.a(this.f313089m, str, bVar);
                a17.f312980z = true;
                a17.f312972r = c01.id.a();
                kotlin.jvm.internal.o.g(sb7, "<set-?>");
                a17.Q = sb7;
                a17.f312979y = arrayList.size();
                if (eVar != null) {
                    hVar.f313021e = false;
                    a17.S = eVar;
                    if (((int) eVar.f312955a) == 5) {
                        a17.B = true;
                        a17.C = false;
                    }
                    dVar.c(a17, i3Var);
                    com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_onPlayerStart#hasPreRender " + sb7 + ' ' + a17);
                } else {
                    kw2.f fVar = this.f313090n;
                    if (fVar != null) {
                        fVar.a(new kw2.r(sb7, a17));
                    }
                }
                com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_onPlayerStart#itembegin " + sb7 + ' ' + a17);
                arrayList.add(a17);
            } else {
                hVar.f313018b = true;
                kw2.e eVar3 = (kw2.e) kz5.n0.X(arrayList);
                eVar3.f312980z = true;
                eVar3.f312974t = this.f313091o;
                eVar3.f312979y = 0L;
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStart invalid item " + str + ' ' + yVar);
        }
        return f0Var2;
    }
}
