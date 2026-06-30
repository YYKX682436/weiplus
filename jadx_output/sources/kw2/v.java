package kw2;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f313104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.b f313106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f313107g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313108h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j17, java.lang.String str, ek4.b bVar, so2.i3 i3Var, kw2.y yVar) {
        super(0);
        this.f313104d = j17;
        this.f313105e = str;
        this.f313106f = bVar;
        this.f313107g = i3Var;
        this.f313108h = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kw2.e eVar;
        jz5.f0 f0Var;
        kw2.e eVar2;
        kw2.d dVar = kw2.e.V;
        long j17 = this.f313104d;
        java.lang.String str = this.f313105e;
        ek4.b bVar = this.f313106f;
        kw2.e a17 = dVar.a(j17, str, bVar);
        java.lang.String str2 = bVar.f253629f;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        a17.Q = str2;
        a17.F = this.f313107g.field_cacheSize;
        kw2.y yVar = this.f313108h;
        kw2.e eVar3 = (kw2.e) yVar.f313115a.get(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f313115a;
        if (eVar3 != null) {
            eVar = a17;
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PRELOAD_startPreload " + eVar3.Q + " duplicated recentRecordDiffMs:" + (c01.id.a() - eVar3.f312977w) + " mediaId:" + str + " feedId:" + pm0.v.u(j17) + " startRecordMs:" + eVar3.f312977w + " size:" + concurrentHashMap.size() + " list:");
            f0Var = f0Var2;
        } else {
            eVar = a17;
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PRELOAD_startPreload ");
            eVar2 = eVar;
            sb6.append(eVar2.Q);
            sb6.append(" mediaId:");
            sb6.append(str);
            sb6.append(" feedId:");
            sb6.append(pm0.v.u(j17));
            sb6.append(" size:");
            sb6.append(concurrentHashMap.size());
            sb6.append(" list:");
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", sb6.toString());
        } else {
            eVar2 = eVar;
        }
        concurrentHashMap.put(str, eVar2);
        return f0Var2;
    }
}
