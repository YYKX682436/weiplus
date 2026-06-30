package pb3;

/* loaded from: classes9.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb3.k f353176a;

    public g(pb3.k kVar) {
        this.f353176a = kVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        pb3.k kVar = this.f353176a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB succeed, wxahb_status = [%d],receive_status = [%d],sendId = [%s]", java.lang.Integer.valueOf(((r45.kk5) fVar.f70618d).f378781d), java.lang.Integer.valueOf(((r45.kk5) fVar.f70618d).f378787m), kVar.f353182c);
            r45.kk5 kk5Var = (r45.kk5) fVar.f70618d;
            if (kk5Var.f378781d != 1 && (gVar = kk5Var.f378785h) != null) {
                kVar.f353183d = gVar.g();
            }
            r45.kk5 kk5Var2 = (r45.kk5) fVar.f70618d;
            int i18 = kk5Var2.f378781d;
            kVar.f353186g = i18;
            pb3.b bVar = kVar.f353180a;
            if (bVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB succeed but ui == null");
            } else {
                int i19 = kk5Var2.f378788n;
                if ((i19 == 1 && kk5Var2.f378789o == 0) || kk5Var2.f378787m == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onLuckyMoneyReceived shouldSkipToDetailUI");
                    kVar.b();
                } else if (i18 == 1) {
                    java.lang.String str = kk5Var2.f378783f;
                    java.lang.String str2 = kk5Var2.f378784g;
                    java.lang.String str3 = kk5Var2.f378791q;
                    boolean z17 = i19 == 1;
                    boolean z18 = kk5Var2.f378789o == 1;
                    com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI) bVar;
                    wxaLuckyMoneyReceiveUI.f145047h = i18;
                    wxaLuckyMoneyReceiveUI.f145048i = 1;
                    wxaLuckyMoneyReceiveUI.a7();
                    com.tencent.mm.plugin.luckymoney.model.m5.b(wxaLuckyMoneyReceiveUI.f145050n, str2, null);
                    com.tencent.mm.plugin.luckymoney.model.m5.E(wxaLuckyMoneyReceiveUI.getContext(), wxaLuckyMoneyReceiveUI.f145051o, str);
                    wxaLuckyMoneyReceiveUI.Z6(null, str3);
                    wxaLuckyMoneyReceiveUI.f145054r.setOnClickListener(null);
                    wxaLuckyMoneyReceiveUI.f145054r.setVisibility(8);
                    wxaLuckyMoneyReceiveUI.f145055s.setVisibility(8);
                    wxaLuckyMoneyReceiveUI.X6(z17, z18);
                    wxaLuckyMoneyReceiveUI.Y6();
                } else if (i18 == 0) {
                    java.lang.String str4 = kk5Var2.f378783f;
                    java.lang.String str5 = kk5Var2.f378784g;
                    java.lang.String str6 = kk5Var2.f378790p;
                    java.lang.String str7 = kk5Var2.f378782e;
                    boolean z19 = i19 == 1;
                    boolean z27 = kk5Var2.f378789o == 1;
                    com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI2 = (com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI) bVar;
                    wxaLuckyMoneyReceiveUI2.a7();
                    com.tencent.mm.plugin.luckymoney.model.m5.b(wxaLuckyMoneyReceiveUI2.f145050n, str5, null);
                    com.tencent.mm.plugin.luckymoney.model.m5.E(wxaLuckyMoneyReceiveUI2.getContext(), wxaLuckyMoneyReceiveUI2.f145051o, str4);
                    wxaLuckyMoneyReceiveUI2.Z6(str6, str7);
                    wxaLuckyMoneyReceiveUI2.f145054r.setOnClickListener(new pb3.c(wxaLuckyMoneyReceiveUI2));
                    wxaLuckyMoneyReceiveUI2.f145054r.setVisibility(0);
                    wxaLuckyMoneyReceiveUI2.X6(z19, z27);
                    wxaLuckyMoneyReceiveUI2.Y6();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "back.resp.wxahb_status is invalid.resp. wxahb_status = [%d] receive_status = [%d] hb_type = [%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(kk5Var2.f378787m), java.lang.Integer.valueOf(kk5Var2.f378789o));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB failed [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Receive errType = " + fVar.f70615a + ",errCode" + fVar.f70616b + "}}"));
        }
        return null;
    }
}
