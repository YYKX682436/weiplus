package pb3;

/* loaded from: classes9.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb3.k f353177a;

    public h(pb3.k kVar) {
        this.f353177a = kVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        pb3.k kVar = this.f353177a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB success");
            r45.b25 b25Var = (r45.b25) fVar.f70618d;
            int i18 = b25Var.f370465d;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB error wxahb_status = [%d] errorwording = [%s]", java.lang.Integer.valueOf(i18), ((r45.b25) fVar.f70618d).f370484z);
                int i19 = ((r45.b25) fVar.f70618d).f370465d;
                kVar.getClass();
                if (i19 == 1) {
                    kVar.a(new android.content.Intent().putExtra("result_error_code", 20001).putExtra("result_error_msg", "fail:the red packet is expired"));
                } else if (i19 == 2) {
                    kVar.a(new android.content.Intent().putExtra("result_error_code", 20002).putExtra("result_error_msg", "fail:the red packet has been received completly"));
                } else if (i19 != 3) {
                    kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{unknow open retun errCode:" + i19 + "}"));
                } else {
                    kVar.a(new android.content.Intent().putExtra("result_error_code", 20003).putExtra("result_error_msg", "fail:risk control"));
                }
            } else {
                pb3.b bVar = kVar.f353180a;
                if (bVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.CgiOpenWxaHB end. ui == null");
                } else {
                    kVar.f353184e = b25Var;
                    com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI) bVar;
                    wxaLuckyMoneyReceiveUI.f145054r.setVisibility(0);
                    com.tencent.mm.plugin.luckymoney.model.m5.H(wxaLuckyMoneyReceiveUI.f145055s);
                    r45.lj5 lj5Var = kVar.f353184e.f370483y;
                    if (lj5Var != null) {
                        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
                        kVar.f353185f = realnameGuideHelper;
                        java.lang.String valueOf = java.lang.String.valueOf(lj5Var.f379523d);
                        r45.lj5 lj5Var2 = kVar.f353184e.f370483y;
                        realnameGuideHelper.d(valueOf, lj5Var2.f379524e, lj5Var2.f379525f, lj5Var2.f379526g, lj5Var2.f379527h, 1003);
                        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper2 = kVar.f353185f;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("realname_verify_process_jump_activity", ".appbrand.ui.receive.WxaLuckyMoneyReceiveUI");
                        bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                        com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI2 = (com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI) kVar.f353180a;
                        wxaLuckyMoneyReceiveUI2.getClass();
                        if (!realnameGuideHelper2.a(wxaLuckyMoneyReceiveUI2, bundle, new pb3.j(kVar), null)) {
                            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{launch realname fail}}"));
                        }
                    } else {
                        kVar.b();
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB failed [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error open errType = " + fVar.f70615a + ",errCode" + fVar.f70616b + "}}"));
        }
        return null;
    }
}
