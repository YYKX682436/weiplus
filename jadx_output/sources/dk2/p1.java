package dk2;

/* loaded from: classes3.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f233887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f233889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f233890h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.u f233891i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(dk2.r4 r4Var, long j17, android.content.Context context, int i17, com.tencent.mm.protobuf.g gVar, yz5.u uVar) {
        super(0);
        this.f233886d = r4Var;
        this.f233887e = j17;
        this.f233888f = context;
        this.f233889g = i17;
        this.f233890h = gVar;
        this.f233891i = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek2.e0 e0Var;
        dk2.x4 x4Var;
        java.lang.String str;
        android.content.Intent intent;
        java.lang.String stringExtra;
        dk2.r4 r4Var = this.f233886d;
        r45.o72 K = r4Var.K(((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.getLong(0));
        java.lang.Long l17 = vd2.a2.f435642m;
        if (l17 != null && l17.longValue() == 0) {
            long j17 = this.f233887e;
            vd2.a2.f435642m = java.lang.Long.valueOf(j17);
            com.tencent.mars.xlog.Log.i("FinderLiveDataLoader", "setLiveReportObj " + pm0.v.u(j17) + ", refObjectId:" + pm0.v.u(K.getLong(9)));
            vd2.a2.f435641l = K;
        }
        java.lang.String l07 = zl2.r4.f473950a.l0("sessionBuffer");
        if (l07 == null) {
            l07 = "";
        }
        K.set(12, l07);
        android.content.Context context = this.f233888f;
        if (context != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar = (com.tencent.mm.plugin.finder.viewmodel.component.ye) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.ye.class);
            if (yeVar != null) {
                yeVar.f136565d = K;
            }
        }
        boolean z17 = context instanceof android.app.Activity;
        android.app.Activity activity = z17 ? (android.app.Activity) context : null;
        java.lang.String str2 = (activity == null || (intent = activity.getIntent()) == null || (stringExtra = intent.getStringExtra("key_enter_live_param_source_web_url")) == null) ? "" : stringExtra;
        android.app.Activity activity2 = z17 ? (android.app.Activity) context : null;
        android.content.Intent intent2 = activity2 != null ? activity2.getIntent() : null;
        if (intent2 != null && intent2.getBooleanExtra("intent_key_ignore_back", false)) {
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "remove INTENT_KEY_IGNORE_BACK");
            intent2.removeExtra("intent_key_ignore_back");
        }
        long j18 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.getLong(0);
        byte[] bArr = ((mm2.e1) r4Var.m(mm2.e1.class)).f328985o;
        java.lang.String f17 = xy2.c.f(r4Var.f234008c);
        long j19 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328983m;
        java.lang.String str3 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328992v;
        java.lang.String str4 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328984n;
        java.lang.String str5 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328993w;
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        int integer = g92.b.f269769e.k2().getInteger(4);
        java.lang.String str6 = ((mm2.c1) r4Var.m(mm2.c1.class)).f328905w4;
        int i17 = ((mm2.c1) r4Var.m(mm2.c1.class)).f328913x4;
        r45.qt2 qt2Var = r4Var.f234008c;
        r45.jc1 jc1Var = ((mm2.c1) r4Var.m(mm2.c1.class)).f328827j5;
        tn0.w0 w0Var = dk2.ef.f233378d;
        java.lang.String str7 = w0Var != null ? w0Var.Z : null;
        km2.n nVar = dk2.ef.H;
        java.lang.String str8 = (nVar == null || (x4Var = nVar.f309155g) == null || (str = x4Var.f234332z) == null) ? "" : str;
        java.lang.String str9 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328995y;
        long j27 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328981h;
        java.lang.String str10 = ((mm2.c1) r4Var.m(mm2.c1.class)).f328883s6;
        boolean z18 = dk2.ef.W;
        km2.n nVar2 = dk2.ef.H;
        ek2.e0 e0Var2 = new ek2.e0(j18, bArr, f17, j19, this.f233889g, str3, str4, str5, str6, i17, qt2Var, 0, jc1Var, str7, str8, integer, str9, K, j27, 0, str2, this.f233890h, str10, z18, nVar2 != null ? nVar2.f309161m : 0, 526336, null);
        if (context != null) {
            pf5.z zVar2 = pf5.z.f353948a;
            boolean z19 = context instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z19) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
            im2.t6 t6Var = (im2.t6) zVar2.a(appCompatActivity).a(im2.t6.class);
            e0Var = e0Var2;
            r45.gc1 gc1Var = e0Var.f253439w;
            t6Var.P6(gc1Var);
            if (!z19) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((im2.t6) zVar2.a(appCompatActivity).a(im2.t6.class)).Q6(((mm2.e1) r4Var.m(mm2.e1.class)).f328981h, (r45.kv0) gc1Var.getCustom(1));
        } else {
            e0Var = e0Var2;
        }
        pq5.g l18 = e0Var.l();
        l18.K(new dk2.o1(this.f233886d, this.f233887e, this.f233891i, this.f233889g));
        if (r4Var.M() != null && (r4Var.M() instanceof com.tencent.mm.ui.MMActivity) && !((mm2.t2) r4Var.m(mm2.t2.class)).f329428g) {
            android.content.Context M = r4Var.M();
            kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l18.f((com.tencent.mm.ui.MMActivity) M);
        }
        return jz5.f0.f302826a;
    }
}
