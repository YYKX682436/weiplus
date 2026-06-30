package qj4;

/* loaded from: classes11.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f363948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f363950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f363951h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f363952i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f363953m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f363954n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f363955o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363956p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f363957q;

    public r(android.content.Context context, long j17, java.lang.String str, mj4.h hVar, long j18, long j19, long j27, long j28, java.lang.Integer num, java.lang.String str2, long j29) {
        this.f363947d = context;
        this.f363948e = j17;
        this.f363949f = str;
        this.f363950g = hVar;
        this.f363951h = j18;
        this.f363952i = j19;
        this.f363953m = j27;
        this.f363954n = j28;
        this.f363955o = num;
        this.f363956p = str2;
        this.f363957q = j29;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        android.content.Context context = this.f363947d;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String actionResult = this.f363949f;
        kotlin.jvm.internal.o.g(actionResult, "actionResult");
        java.lang.String statusOwnerUserName = this.f363956p;
        kotlin.jvm.internal.o.g(statusOwnerUserName, "statusOwnerUserName");
        com.tencent.mm.protobuf.f Ui = ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
        if (Ui == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.tsReport", "report null err :".concat(context.getClass().getSimpleName()));
            Ui = new pj4.p0();
            z17 = false;
        } else {
            z17 = true;
        }
        mj4.h hVar = this.f363950g;
        if (hVar == null) {
            hVar = ai4.m0.f5173a.M(((pj4.p0) Ui).f355237e);
        }
        if (hVar == null && !com.tencent.mm.sdk.platformtools.t8.K0(statusOwnerUserName)) {
            hVar = ai4.m0.f5173a.M(statusOwnerUserName);
        }
        if (hVar == null) {
            return;
        }
        long j17 = this.f363948e;
        if (31 <= j17 && j17 < 39) {
            di4.i.f232782a.c();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("has_multi_status_reddot", 0);
            actionResult = jSONObject.toString();
            kotlin.jvm.internal.o.f(actionResult, "toString(...)");
        }
        java.lang.String str = (j17 == 28 && ai4.m0.f5173a.M(en1.a.a()) == null) ? "" : actionResult;
        com.tencent.mm.autogen.mmdata.rpt.TextStateCardExposeStruct textStateCardExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.TextStateCardExposeStruct();
        pj4.p0 p0Var = (pj4.p0) Ui;
        textStateCardExposeStruct.f61094d = textStateCardExposeStruct.b("SessionID", p0Var.f355236d, true);
        textStateCardExposeStruct.D = textStateCardExposeStruct.b("SceneSessionID", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ai(), true);
        textStateCardExposeStruct.E = textStateCardExposeStruct.b("PageID", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).wi(), true);
        pj4.o0 a17 = xe0.j0.a(hVar, false, 1, null);
        textStateCardExposeStruct.f61095e = textStateCardExposeStruct.b("TopicID", a17.f355213d, true);
        textStateCardExposeStruct.f61093J = a17.f355225s;
        textStateCardExposeStruct.K = textStateCardExposeStruct.b("ClusterID", mj4.d.b(a17), true);
        mj4.k kVar = (mj4.k) hVar;
        textStateCardExposeStruct.f61096f = textStateCardExposeStruct.b("TextStatusID", kVar.l(), true);
        textStateCardExposeStruct.f61098h = textStateCardExposeStruct.b("IconID", kVar.h(), true);
        java.lang.String d17 = wi4.a.d(a17);
        if (d17 == null) {
            d17 = "";
        }
        textStateCardExposeStruct.f61099i = textStateCardExposeStruct.b("SourceID", d17, true);
        textStateCardExposeStruct.f61100j = textStateCardExposeStruct.b("SourceActivityID", wi4.a.a(a17), true);
        java.lang.String e17 = wi4.a.e(a17);
        textStateCardExposeStruct.f61101k = textStateCardExposeStruct.b("SourceName", e17 != null ? r26.i0.u(e17, ',', ';', false, 4, null) : null, true);
        textStateCardExposeStruct.f61102l = textStateCardExposeStruct.b("SourceExtraInfo", p0Var.f355238f, true);
        textStateCardExposeStruct.f61103m = textStateCardExposeStruct.b("CurrLikeIcon", p0Var.f355239g, true);
        textStateCardExposeStruct.f61104n = p0Var.f355240h;
        textStateCardExposeStruct.f61105o = p0Var.f355241i;
        textStateCardExposeStruct.f61106p = textStateCardExposeStruct.b("AuthorUsername", p0Var.f355237e, true);
        textStateCardExposeStruct.f61107q = kotlin.jvm.internal.o.b(en1.a.a(), p0Var.f355237e) ? 1L : 2L;
        textStateCardExposeStruct.f61108r = p0Var.f355242m;
        textStateCardExposeStruct.I = this.f363955o != null ? r3.intValue() : 0L;
        textStateCardExposeStruct.f61109s = p0Var.f355243n > 0 ? 1L : 0L;
        long j18 = this.f363953m;
        if (j18 == -1) {
            j18 = p0Var.f355244o;
        }
        textStateCardExposeStruct.f61110t = j18;
        textStateCardExposeStruct.f61111u = j17;
        textStateCardExposeStruct.f61112v = textStateCardExposeStruct.b("ActionResult", r26.i0.u(str, ',', ';', false, 4, null), true);
        if (!z17) {
            textStateCardExposeStruct.f61112v = textStateCardExposeStruct.b("ActionResult", textStateCardExposeStruct.f61112v + "_error", true);
        }
        textStateCardExposeStruct.f61113w = c01.id.c();
        textStateCardExposeStruct.f61114x = p0Var.f355245p;
        textStateCardExposeStruct.f61115y = textStateCardExposeStruct.b("SourceFeedID", p0Var.f355246q, true);
        textStateCardExposeStruct.f61116z = p0Var.f355247r;
        textStateCardExposeStruct.A = p0Var.f355248s;
        textStateCardExposeStruct.B = p0Var.f355249t;
        textStateCardExposeStruct.C = ((kVar.s() & 4) > 0L ? 1 : ((kVar.s() & 4) == 0L ? 0 : -1)) != 0 ? 1L : 2L;
        textStateCardExposeStruct.F = this.f363951h;
        textStateCardExposeStruct.G = this.f363952i;
        textStateCardExposeStruct.H = this.f363954n;
        qj4.s sVar = qj4.s.f363958a;
        textStateCardExposeStruct.L = sVar.b();
        textStateCardExposeStruct.M = textStateCardExposeStruct.b("CustomTitle", bk4.i.a().a(kVar.h()) ? bk4.i.a().m(a17) : "", true);
        textStateCardExposeStruct.O = kVar.x() ? 1L : 2L;
        textStateCardExposeStruct.N = kVar.f327067b.field_MediaType;
        long j19 = this.f363957q;
        if (j19 > 0) {
            textStateCardExposeStruct.f61108r = j19;
        }
        jz5.l i17 = sVar.i(kVar.o(), true);
        textStateCardExposeStruct.P = ((java.lang.Number) i17.f302833d).longValue();
        textStateCardExposeStruct.Q = textStateCardExposeStruct.b("CoExistStatusList", (java.lang.String) i17.f302834e, true);
        textStateCardExposeStruct.k();
        sVar.y(textStateCardExposeStruct);
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.TextStatus.tsReport", "report22216: action=" + textStateCardExposeStruct.f61111u + ", scene=" + textStateCardExposeStruct.f61108r, new java.lang.Object[0]);
    }
}
