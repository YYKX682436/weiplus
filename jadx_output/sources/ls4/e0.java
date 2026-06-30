package ls4;

/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.m f321047a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f321048b;

    public e0(pr4.m parameter) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        this.f321047a = parameter;
    }

    public static final void a(ls4.e0 e0Var, r45.ic5 ic5Var) {
        e0Var.getClass();
        com.tencent.midas.api.request.APMidasGoodsRequest aPMidasGoodsRequest = new com.tencent.midas.api.request.APMidasGoodsRequest();
        r45.nl4 nl4Var = ic5Var.f376930d;
        aPMidasGoodsRequest.offerId = nl4Var.f381485d;
        aPMidasGoodsRequest.openId = nl4Var.f381486e;
        aPMidasGoodsRequest.openKey = nl4Var.f381487f;
        aPMidasGoodsRequest.sessionId = nl4Var.f381488g;
        aPMidasGoodsRequest.sessionType = nl4Var.f381489h;
        aPMidasGoodsRequest.f53140pf = nl4Var.f381490i;
        aPMidasGoodsRequest.pfKey = nl4Var.f381491m;
        aPMidasGoodsRequest.goodsTokenUrl = ic5Var.f376932f;
        pr4.m mVar = e0Var.f321047a;
        android.app.Activity activity = mVar.f358036a;
        e0Var.f321048b = com.tencent.mm.ui.widget.dialog.u3.f(activity, activity.getString(com.tencent.mm.R.string.ggc), false, 3, null);
        com.tencent.midas.api.APMidasPayAPI.launchPaySign(mVar.f358036a, aPMidasGoodsRequest, new ls4.z(e0Var));
    }

    public final void b() {
        pr4.m mVar = this.f321047a;
        r45.ic5 ic5Var = new r45.ic5();
        try {
            ic5Var.parseFrom(mVar.f358037b);
            if (ic5Var.f376934h == null) {
                c(ic5Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "intercept");
            os4.h.f(mVar.f358036a, ic5Var.f376934h, new ls4.y(this, ic5Var));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("WeCoinSubscribeLogic", "parse failed, exception: " + e17.getMessage());
            mVar.f358038c.invoke(new pr4.n(pr4.p.f358041d));
        }
    }

    public final void c(r45.ic5 ic5Var) {
        com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "showAgreement");
        r45.ka7 agreement_half_page = ic5Var.f376933g;
        pr4.m mVar = this.f321047a;
        if (agreement_half_page == null) {
            mVar.f358038c.invoke(new pr4.n(pr4.p.f358041d));
            return;
        }
        android.app.Activity activity = mVar.f358036a;
        kotlin.jvm.internal.o.f(agreement_half_page, "agreement_half_page");
        new ns4.j4(activity, new ns4.k4(agreement_half_page, new ls4.a0(this, ic5Var), new ls4.b0(this))).f339561c.s();
    }

    public final void d() {
        if (((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).c()) {
            com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "already auth");
            b();
        } else {
            com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "start auth");
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).f(this.f321047a.f358036a, new ls4.c0(this));
        }
    }
}
