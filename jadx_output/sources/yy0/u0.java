package yy0;

/* loaded from: classes5.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468348h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468349i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468350m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f468351n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(yy0.m7 m7Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468344d = m7Var;
        this.f468345e = str;
        this.f468346f = i17;
        this.f468347g = str2;
        this.f468348h = str3;
        this.f468349i = str4;
        this.f468350m = str5;
        this.f468351n = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.u0(this.f468344d, this.f468345e, this.f468346f, this.f468347g, this.f468348h, this.f468349i, this.f468350m, this.f468351n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f468344d.f468229h = null;
        this.f468344d.f468230i = this.f468345e;
        this.f468344d.f468231m = this.f468346f;
        this.f468344d.f468232n = 0;
        this.f468344d.f468233o = this.f468347g;
        this.f468344d.f468234p = this.f468348h;
        this.f468344d.f468235q = this.f468349i;
        this.f468344d.f468236r = null;
        this.f468344d.f468237s = null;
        this.f468344d.f468238t = 0;
        this.f468344d.f468239u = null;
        this.f468344d.f468240v = 0;
        this.f468344d.f468241w = false;
        this.f468344d.f468242x = false;
        this.f468344d.f468243y = false;
        this.f468344d.f468244z = 1;
        yy0.m7 m7Var = this.f468344d;
        iy1.c cVar = iy1.c.MainUI;
        m7Var.A = 30097;
        this.f468344d.B = true;
        this.f468344d.C = false;
        this.f468344d.E = this.f468350m;
        this.f468344d.f468227f = yy0.q0.f468288e;
        boolean booleanValue = ((java.lang.Boolean) kotlinx.coroutines.l.f(null, new yy0.t0(null), 1, null)).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.e(this.f468344d.f468225d, "initMetrics: load so failed!");
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i(this.f468344d.f468225d, "initMetrics: entryType=" + this.f468345e + ", enterScene=" + this.f468346f + ", parentEnterScene=" + this.f468351n + ", sourceFeedID=" + this.f468347g + ", sourceSongID=" + this.f468348h + ", followFeedTemplateID=" + this.f468349i);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        az0.i5 i5Var = az0.i5.f15557a;
        sb6.append(az0.i5.f15565i);
        sb6.append("/MetricsLogs");
        com.tencent.maas.MJMaasCore.e(sb6.toString(), yy0.s0.f468313a);
        if (this.f468344d.f468228g != null) {
            com.tencent.mars.xlog.Log.e(this.f468344d.f468225d, "Error: mjPublisherSessionMetrics is not null. Releasing and recreating.");
            this.f468344d.bj("Leaked");
            com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468344d.f468228g;
            kotlin.jvm.internal.o.d(mJPublisherSessionMetrics);
            mJPublisherSessionMetrics.q2();
            this.f468344d.f468228g = null;
        }
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String str = this.f468344d.f468233o;
        if (str == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("sourceFeedId", str);
        java.lang.String str2 = this.f468344d.f468234p;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("sourceSongId", str2);
        java.lang.String str3 = this.f468344d.f468235q;
        lVarArr[2] = new jz5.l("followFeedTemplateId", str3 != null ? str3 : "");
        this.f468344d.f468228g = com.tencent.maas.MJMaasCore.o(new android.os.Handler(android.os.Looper.getMainLooper()), this.f468345e, this.f468346f, this.f468351n, kz5.c1.k(lVarArr), this.f468344d.E);
        yy0.m7 m7Var2 = this.f468344d;
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics2 = m7Var2.f468228g;
        m7Var2.f468229h = mJPublisherSessionMetrics2 != null ? mJPublisherSessionMetrics2.a() : null;
        this.f468344d.f468227f = yy0.q0.f468289f;
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("view_id", "publisher_in");
        cy1.a aVar2 = (cy1.a) rVar;
        aVar2.yj("publisher_in", null, Ai, 6, false);
        Ai.put("view_id", "post_in");
        aVar2.yj("post_in", null, Ai, 6, false);
        return f0Var;
    }
}
