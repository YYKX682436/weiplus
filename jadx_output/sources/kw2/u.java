package kw2;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f313098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.b f313100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f313102h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313103i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, java.lang.String str, ek4.b bVar, java.lang.String str2, so2.i3 i3Var, kw2.y yVar) {
        super(0);
        this.f313098d = j17;
        this.f313099e = str;
        this.f313100f = bVar;
        this.f313101g = str2;
        this.f313102h = i3Var;
        this.f313103i = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        jz5.f0 f0Var2;
        kw2.d dVar = kw2.e.V;
        long j17 = this.f313098d;
        java.lang.String str4 = this.f313099e;
        ek4.b bVar = this.f313100f;
        kw2.e a17 = dVar.a(j17, str4, bVar);
        a17.D = true;
        java.lang.String str5 = this.f313101g;
        kotlin.jvm.internal.o.g(str5, "<set-?>");
        a17.Q = str5;
        int i17 = bVar.f253624a;
        if (i17 == 4) {
            a17.L = true;
        }
        dVar.c(a17, this.f313102h);
        kw2.y yVar = this.f313103i;
        kw2.e eVar = (kw2.e) yVar.f313116b.get(str4);
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = yVar.f313116b;
        if (eVar != null) {
            long a18 = c01.id.a() - eVar.f312977w;
            f0Var = f0Var3;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PRERENDER_startPreRender ");
            concurrentHashMap = concurrentHashMap2;
            str = "PRERENDER_startPreRender ";
            sb6.append(yVar.d(i17));
            sb6.append(' ');
            sb6.append(str5);
            sb6.append(" duplicated recentRecordDiffMs:");
            sb6.append(a18);
            sb6.append(" mediaId:");
            sb6.append(str4);
            sb6.append(" feedId:");
            sb6.append(pm0.v.u(j17));
            sb6.append(" startRecordMs:");
            sb6.append(eVar.f312977w);
            str3 = " size:";
            sb6.append(str3);
            sb6.append(concurrentHashMap.size());
            str2 = " list:";
            sb6.append(str2);
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", sb6.toString());
            f0Var2 = f0Var;
        } else {
            f0Var = f0Var3;
            concurrentHashMap = concurrentHashMap2;
            str = "PRERENDER_startPreRender ";
            str2 = " list:";
            str3 = " size:";
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", str + yVar.d(i17) + ' ' + str5 + " mediaId:" + str4 + " feedId:" + pm0.v.u(j17) + str3 + concurrentHashMap.size() + str2);
        }
        concurrentHashMap.put(str4, a17);
        return f0Var;
    }
}
