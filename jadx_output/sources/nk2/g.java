package nk2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f337969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f337970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f337971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f337972h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337973i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f337974m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337975n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f337976o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f337977p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f337978q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, long j18, long j19, float f17, java.lang.String str, org.json.JSONArray jSONArray, java.lang.String str2, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337969e = j17;
        this.f337970f = j18;
        this.f337971g = j19;
        this.f337972h = f17;
        this.f337973i = str;
        this.f337974m = jSONArray;
        this.f337975n = str2;
        this.f337976o = i17;
        this.f337977p = i18;
        this.f337978q = i19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nk2.g(this.f337969e, this.f337970f, this.f337971g, this.f337972h, this.f337973i, this.f337974m, this.f337975n, this.f337976o, this.f337977p, this.f337978q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nk2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f337968d;
        long j17 = this.f337969e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = s26.a.f402368f;
            long e17 = s26.a.e(s26.c.f(j17, s26.d.f402372g));
            this.f337968d = 1;
            if (kotlinx.coroutines.k1.b(e17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        float f17 = com.tencent.mm.plugin.performance.watchdogs.b0.B.g().f343968y / 1024.0f;
        com.tencent.mars.xlog.Log.i("FinderLivePerformanceReportTools", "#recordExitLive exit" + j17 + "SecondsMemoryPss=" + f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("liveId", this.f337970f);
        jSONObject.put("lengthOfStay", this.f337971g);
        jSONObject.put("exitMomentMemoryPss", new java.lang.Float(this.f337972h));
        nk2.c cVar = nk2.c.f337960a;
        jSONObject.put("afterLiveActivities", kz5.n0.g0(nk2.c.f337961b, "-", null, null, 0, null, null, 62, null));
        jSONObject.put("commentScene", this.f337973i);
        jSONObject.put("recordActions", this.f337974m);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        if (r0Var == null || (str = new java.lang.Integer(r0Var.f327875p).toString()) == null) {
            str = "";
        }
        jSONObject.put("exitType", str);
        jSONObject.put(this.f337975n, new java.lang.Float(f17));
        jSONObject.put("liveIndex", this.f337976o);
        jSONObject.put("liveIndexV2", this.f337977p);
        jSONObject.put("liveGroupIndex", this.f337978q);
        ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(ts5.a.f421724f, jSONObject);
        return jz5.f0.f302826a;
    }
}
