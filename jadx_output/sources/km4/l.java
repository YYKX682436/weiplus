package km4;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final km4.l f309296a = new km4.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f309297b = new java.lang.Object();

    public static final void c(yz5.l lVar, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.pigeon.ting.TingADErrorCode tingADErrorCode) {
        synchronized (f309297b) {
            if (c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.TingADResult(java.lang.Long.valueOf(tingADErrorCode.ordinal())))));
            d(h0Var);
        }
    }

    public static final void d(kotlin.jvm.internal.h0 h0Var) {
        android.app.ProgressDialog progressDialog = (android.app.ProgressDialog) h0Var.f310123d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        h0Var.f310123d = null;
    }

    public final void a(int i17, java.lang.String str) {
        ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Bi("AdOpen", i17, str);
    }

    public final void b(bw5.q80 adSchemeInfo, long j17, yz5.l callback, android.content.Context context) {
        kotlin.jvm.internal.o.g(adSchemeInfo, "adSchemeInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(context, "context");
        bw5.c80 c80Var = adSchemeInfo.f31997g[1] ? adSchemeInfo.f31994d : new bw5.c80();
        java.lang.String str = c80Var.f25973i[1] ? c80Var.f25968d : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAdHelper", "openAD appId:" + str + ", scene:" + j17);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (str == null || r26.n0.N(str)) {
            c(callback, c0Var, h0Var, com.tencent.pigeon.ting.TingADErrorCode.OPEN_FAIL);
            return;
        }
        a(1, null);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Bi("", str, -1, false);
        int i17 = 0;
        h0Var.f310123d = db5.e1.Q(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490573yv), j65.q.a(context).getString(com.tencent.mm.R.string.f490604zq), true, true, new km4.j(callback, c0Var, h0Var));
        ku5.u0 u0Var = ku5.t0.f312615d;
        km4.k kVar = new km4.k(h0Var, callback, c0Var);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 30000L, false);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str;
        b1Var.f317032k = (int) j17;
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ting.RepairerConfigTingOpenAdType()) == 0) {
            i17 = 2;
        }
        b1Var.f317016c = i17;
        b1Var.f317037o = new km4.i(callback, c0Var, h0Var);
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        km4.g gVar = new km4.g(c0Var2, context, b1Var, h0Var2, c0Var, currentTimeMillis, h0Var, callback, str);
        h0Var2.f310123d = gVar;
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(str, gVar);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).ij(b1Var, new km4.h(callback, c0Var, h0Var));
    }
}
