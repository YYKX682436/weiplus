package yy0;

/* loaded from: classes5.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f468369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f468370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468371i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468372m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468373n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468374o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(yy0.m7 m7Var, java.lang.String str, int i17, int i18, boolean z17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468366d = m7Var;
        this.f468367e = str;
        this.f468368f = i17;
        this.f468369g = i18;
        this.f468370h = z17;
        this.f468371i = str2;
        this.f468372m = str3;
        this.f468373n = str4;
        this.f468374o = str5;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.v0(this.f468366d, this.f468367e, this.f468368f, this.f468369g, this.f468370h, this.f468371i, this.f468372m, this.f468373n, this.f468374o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yy0.m7 m7Var = this.f468366d;
        yy0.q0 q0Var = m7Var.f468227f;
        yy0.q0 q0Var2 = yy0.q0.f468287d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (q0Var != q0Var2) {
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initMetricsIfNotInitialized: entryType=");
        sb6.append(this.f468367e);
        sb6.append(", enterScene=");
        sb6.append(this.f468368f);
        sb6.append(", parentEnterScene=");
        sb6.append(this.f468369g);
        sb6.append(", shouldBeginShootComposing=");
        boolean z17 = this.f468370h;
        sb6.append(z17);
        sb6.append(", sourceFeedID=");
        sb6.append(this.f468371i);
        sb6.append(", sourceSongID=");
        sb6.append(this.f468372m);
        sb6.append(", followFeedTemplateID=");
        sb6.append(this.f468373n);
        com.tencent.mars.xlog.Log.i(m7Var.f468225d, sb6.toString());
        java.lang.String str = this.f468367e;
        int i17 = this.f468368f;
        int i18 = this.f468369g;
        java.lang.String str2 = this.f468374o;
        java.lang.String str3 = this.f468371i;
        java.lang.String str4 = this.f468372m;
        java.lang.String str5 = this.f468373n;
        i95.m c17 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (pp0.h0.Q2((pp0.h0) c17, false, 1, null)) {
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.u0(m7Var, str, i17, str3, str4, str5, str2, i18, null), 3, null);
        }
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.o2(m7Var, null), 3, null);
        if (z17) {
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.q2(m7Var, null), 3, null);
            i95.m c18 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            w40.e.eh((w40.e) c18, "SCMaasInit", "MJShootComposing", null, 0, 12, null);
            i95.m c19 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            w40.e.eh((w40.e) c19, "SCFirstImpression", "MJShootComposing", null, 0, 12, null);
            i95.m c27 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            w40.e.eh((w40.e) c27, "SCLoadFirstTemplate", "MJShootComposing", null, 0, 12, null);
            i95.m c28 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c28, "getService(...)");
            w40.e.eh((w40.e) c28, "SCLoadTemplateList", "MJShootComposing", null, 0, 12, null);
        } else {
            m7Var.ij();
        }
        i95.m c29 = i95.n0.c(pp0.m0.class);
        kotlin.jvm.internal.o.f(c29, "getService(...)");
        pp0.m0.n3((pp0.m0) c29, "mjtc_publisher", null, 2, null);
        return f0Var;
    }
}
