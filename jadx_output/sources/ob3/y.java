package ob3;

/* loaded from: classes9.dex */
public class y implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ob3.a0 f344092a;

    public y(ob3.a0 a0Var) {
        this.f344092a = a0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        ob3.a0 a0Var = this.f344092a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.qr5 qr5Var = (r45.qr5) fVar.f70618d;
            a0Var.f344045f = qr5Var;
            if (qr5Var != null) {
                if (qr5Var.f384229h != 0 || qr5Var.f384225d.equalsIgnoreCase("")) {
                    r45.qr5 qr5Var2 = a0Var.f344045f;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB fail.  sendid = [%s] reqkey = [%s] wxahb_status = [%d]", qr5Var2.f384226e, qr5Var2.f384225d, java.lang.Integer.valueOf(qr5Var2.f384229h));
                    a0Var.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Request errStatus = " + a0Var.f344045f.f384229h + ",errMsg" + a0Var.f344045f.f384230i + "}}"));
                    return null;
                }
                r45.qr5 qr5Var3 = (r45.qr5) fVar.f70618d;
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB succeed sendid = [%s] reqkey = [%s]", qr5Var3.f384226e, qr5Var3.f384225d);
                java.lang.String str = a0Var.f344045f.f384225d;
                ob3.c cVar = a0Var.f344043d;
                if (cVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "doWalletPay() called with: ui == null");
                    return null;
                }
                com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI) cVar;
                wxaLuckyMoneyPrepareUI.mmSetOnActivityResultCallback(a0Var);
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                payInfo.f192114m = str;
                payInfo.f192109e = 37;
                payInfo.f192111g = 50;
                h45.a0.f(wxaLuckyMoneyPrepareUI, payInfo, a0Var.f344047h);
                return null;
            }
            a0Var.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Request resp is nil}}"));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "CgiRequestWxaHB fail. [%d, %d, %s]", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        a0Var.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Request errType = " + fVar.f70615a + ",errCode" + fVar.f70616b + "}}"));
        return null;
    }
}
