package yc1;

/* loaded from: classes7.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f460766d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f460767e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f460768f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f460769g;

    /* renamed from: h, reason: collision with root package name */
    public int f460770h;

    /* renamed from: i, reason: collision with root package name */
    public int f460771i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f460772m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f460773n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yc1.c0 f460774o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f460775p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, yc1.c0 c0Var2, org.json.JSONArray jSONArray, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f460772m = c0Var;
        this.f460773n = i17;
        this.f460774o = c0Var2;
        this.f460775p = jSONArray;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yc1.b0(this.f460772m, this.f460773n, this.f460774o, this.f460775p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yc1.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yc1.c0 c0Var;
        java.lang.Object f17;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2;
        java.lang.String str;
        int i17;
        jc1.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f460771i;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jc1.d dVar2 = jc1.f.f298912a;
            org.json.JSONArray domainList = this.f460775p;
            e06.k m17 = e06.p.m(0, domainList.length());
            kotlin.jvm.internal.o.f(domainList, "$domainList");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                java.lang.String string = domainList.getString(((kz5.x0) it).b());
                if (string != null) {
                    arrayList.add(string);
                }
            }
            com.tencent.mm.plugin.appbrand.service.c0 c0Var3 = this.f460772m;
            this.f460766d = c0Var3;
            c0Var = this.f460774o;
            this.f460767e = c0Var;
            this.f460768f = dVar2;
            this.f460769g = "result";
            int i19 = this.f460773n;
            this.f460770h = i19;
            this.f460771i = 1;
            if (arrayList.isEmpty()) {
                f17 = kz5.q0.f314001d;
            } else {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                f17 = kotlinx.coroutines.z0.f(new com.tencent.mm.plugin.appbrand.networking.w0(arrayList, android.os.SystemClock.elapsedRealtime(), null), this);
            }
            if (f17 == aVar) {
                return aVar;
            }
            c0Var2 = c0Var3;
            str = "result";
            i17 = i19;
            java.lang.Object obj2 = f17;
            dVar = dVar2;
            obj = obj2;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f460770h;
            str = (java.lang.String) this.f460769g;
            dVar = (jc1.d) this.f460768f;
            c0Var = (yc1.c0) this.f460767e;
            c0Var2 = (com.tencent.mm.plugin.appbrand.service.c0) this.f460766d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.net.InetAddress inetAddress = (java.net.InetAddress) entry.getValue();
            linkedHashMap.put(key, java.lang.String.valueOf(inetAddress != null ? inetAddress.getHostAddress() : null));
        }
        c0Var2.a(i17, c0Var.q(null, dVar, kz5.b1.e(new jz5.l(str, linkedHashMap))));
        return jz5.f0.f302826a;
    }
}
