package ms4;

/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ms4.j0 f331046e = ms4.c0.f331005a;

    /* renamed from: a, reason: collision with root package name */
    public r45.nl4 f331047a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f331048b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f331049c;

    /* renamed from: d, reason: collision with root package name */
    public ks4.h f331050d;

    public j0(kotlin.jvm.internal.i iVar) {
        com.tencent.midas.api.APMidasPayAPI.setLogCallback(com.tencent.mm.plugin.wallet.wecoin.model.MidasPayLogCallbackImpl.class);
    }

    public final void a(android.content.Context context, r45.nl4 nl4Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "is midas sdk already initialized: " + this.f331048b);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wecoin_init_midas_sdk_once, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinUtils", "isMidasInitOnceABTest, %s", java.lang.Integer.valueOf(Ni));
        if ((Ni != 0) && this.f331048b) {
            return;
        }
        com.tencent.midas.api.request.APMidasGameRequest aPMidasGameRequest = new com.tencent.midas.api.request.APMidasGameRequest();
        aPMidasGameRequest.offerId = nl4Var.f381485d;
        aPMidasGameRequest.openId = nl4Var.f381486e;
        aPMidasGameRequest.openKey = nl4Var.f381487f;
        aPMidasGameRequest.sessionId = nl4Var.f381488g;
        aPMidasGameRequest.sessionType = nl4Var.f381489h;
        aPMidasGameRequest.f53140pf = nl4Var.f381490i;
        aPMidasGameRequest.pfKey = nl4Var.f381491m;
        aPMidasGameRequest.reserv = "enableX5=0";
        com.tencent.midas.api.APMidasPayAPI.setEnv("release");
        com.tencent.midas.api.APMidasPayAPI.setLogEnable(false);
        com.tencent.midas.api.APMidasPayAPI.setLogCallback(com.tencent.mm.plugin.wallet.wecoin.model.MidasPayLogCallbackImpl.class);
        com.tencent.midas.api.APMidasPayAPI.init(context, aPMidasGameRequest);
        this.f331048b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.content.Context activity, js4.o oVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "initSDK.");
        r45.nl4 nl4Var = this.f331047a;
        if (nl4Var == null) {
            pq5.g h17 = new ks4.d().l().h(new ms4.f0(oVar, this, activity));
            if (activity instanceof com.tencent.mm.ui.MMActivity) {
                h17.f((im5.b) activity);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "initSDK already initialized.");
        a(activity, nl4Var);
        ((ku5.t0) ku5.t0.f312615d).B(new ms4.e0(oVar));
    }

    public final void c(android.app.Activity context, js4.n info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        java.lang.String str = info.f301545c;
        java.lang.String str2 = str == null ? uuid : str;
        f(context, true);
        int d17 = os4.h.d(info.f301543a);
        e(d17, str2, uuid, 3, 1, 0, "");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 20);
        r45.gc5 gc5Var = new r45.gc5();
        gc5Var.f375088h = info.f301544b;
        gc5Var.f375084d = uuid;
        gc5Var.f375085e = info.f301548f;
        gc5Var.f375086f = info.f301547e;
        gc5Var.f375091n = info.f301543a;
        gc5Var.f375092o = str2;
        gc5Var.f375087g = info.f301550h;
        gc5Var.f375089i = info.f301553k;
        gc5Var.f375090m = info.f301554l;
        ks4.h hVar = new ks4.h(gc5Var);
        this.f331050d = hVar;
        pq5.g l17 = hVar.l();
        if (l17 != null) {
            l17.h(new ms4.g0(this, context, info, d17, str2, uuid, gc5Var));
        }
    }

    public final void d(android.app.Activity activity, r45.hc5 response, java.lang.String env, js4.n info, java.lang.String uniqueId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(response, "response");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        if (response.f376048d != null) {
            java.lang.String str = response.f376050f;
            if (!(str == null || str.length() == 0)) {
                com.tencent.midas.api.request.APMidasGoodsRequest aPMidasGoodsRequest = new com.tencent.midas.api.request.APMidasGoodsRequest();
                r45.nl4 nl4Var = response.f376048d;
                aPMidasGoodsRequest.offerId = nl4Var.f381485d;
                aPMidasGoodsRequest.openId = nl4Var.f381486e;
                aPMidasGoodsRequest.openKey = nl4Var.f381487f;
                aPMidasGoodsRequest.sessionId = nl4Var.f381488g;
                aPMidasGoodsRequest.sessionType = nl4Var.f381489h;
                aPMidasGoodsRequest.f53140pf = nl4Var.f381490i;
                aPMidasGoodsRequest.pfKey = nl4Var.f381491m;
                aPMidasGoodsRequest.zoneId = "1";
                aPMidasGoodsRequest.goodsTokenUrl = response.f376050f;
                aPMidasGoodsRequest.mpInfo.payChannel = "wechat";
                com.tencent.midas.api.APMidasPayAPI.setLogEnable(false);
                com.tencent.midas.api.APMidasPayAPI.setEnv(env);
                aPMidasGoodsRequest.tokenType = 1;
                aPMidasGoodsRequest.prodcutId = info.f301548f;
                aPMidasGoodsRequest.saveValue = response.f376051g;
                int d17 = os4.h.d(info.f301543a);
                java.lang.String sceneSessionID = info.f301545c;
                kotlin.jvm.internal.o.f(sceneSessionID, "sceneSessionID");
                e(d17, sceneSessionID, uniqueId, 4, 1, 0, "");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 23);
                com.tencent.midas.api.APMidasPayAPI.launchPay(activity, aPMidasGoodsRequest, new ms4.b0(response.f376049e, info, uniqueId));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeCoinMidasInitializer", "rechargeByMidasSDK param error.");
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2, int i18, int i19, int i27, java.lang.String str3) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22129, java.lang.Integer.valueOf(i17), str, str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3);
    }

    public final void f(android.app.Activity activity, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        if (z17) {
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(activity, activity.getString(com.tencent.mm.R.string.ggc), true, 3, new ms4.i0(activity, this));
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f331049c;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            u3Var = null;
        }
        this.f331049c = u3Var;
    }
}
