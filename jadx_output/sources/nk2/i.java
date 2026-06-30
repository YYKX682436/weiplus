package nk2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f337991d;

    /* renamed from: e, reason: collision with root package name */
    public int f337992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f337993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f337995h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f337996i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f337997m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f337998n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f337999o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f338000p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, java.lang.String str, long j18, long j19, int i17, int i18, int i19, org.json.JSONArray jSONArray, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337993f = j17;
        this.f337994g = str;
        this.f337995h = j18;
        this.f337996i = j19;
        this.f337997m = i17;
        this.f337998n = i18;
        this.f337999o = i19;
        this.f338000p = jSONArray;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nk2.i(this.f337993f, this.f337994g, this.f337995h, this.f337996i, this.f337997m, this.f337998n, this.f337999o, this.f338000p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nk2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ts5.d dVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f337992e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ts5.d wi6 = ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).wi(ts5.c.f421732d, ts5.a.f421726h);
            wi6.start();
            int i18 = s26.a.f402368f;
            long e17 = s26.a.e(s26.c.f(this.f337993f, s26.d.f402372g));
            this.f337991d = wi6;
            this.f337992e = 1;
            if (kotlinx.coroutines.k1.b(e17, this) == aVar) {
                return aVar;
            }
            dVar = wi6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (ts5.d) this.f337991d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("commentScene", this.f337994g);
        linkedHashMap.put("liveId", new java.lang.Long(this.f337995h));
        linkedHashMap.put("lengthOfStay", new java.lang.Long(this.f337996i));
        linkedHashMap.put("liveIndex", new java.lang.Integer(this.f337997m));
        linkedHashMap.put("liveIndexV2", new java.lang.Integer(this.f337998n));
        linkedHashMap.put("liveGroupIndex", new java.lang.Integer(this.f337999o));
        nk2.c cVar = nk2.c.f337960a;
        linkedHashMap.put("afterLiveActivities", kz5.n0.g0(nk2.c.f337961b, "-", null, null, 0, null, null, 62, null));
        linkedHashMap.put("recordActions", this.f338000p);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        if (r0Var == null || (str = new java.lang.Integer(r0Var.f327875p).toString()) == null) {
            str = "";
        }
        linkedHashMap.put("exitType", str);
        dVar.a(linkedHashMap);
        return jz5.f0.f302826a;
    }
}
