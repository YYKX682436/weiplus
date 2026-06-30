package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class jg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147060e;

    public jg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, java.lang.String str) {
        this.f147060e = luckyMoneyNewYearReceiveUIV2;
        this.f147059d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click StatusLayout");
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.Y1;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147060e;
        luckyMoneyNewYearReceiveUIV2.d7(11);
        com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
        hBReportNewStruct.f58415d = 15L;
        hBReportNewStruct.k();
        com.tencent.mm.plugin.luckymoney.model.s4 s4Var = luckyMoneyNewYearReceiveUIV2.V;
        java.lang.String str = s4Var.f145608h;
        java.lang.String str2 = s4Var.f145609i;
        if (luckyMoneyNewYearReceiveUIV2.f146365z1) {
            str = s4Var.f145614q;
            str2 = s4Var.f145615r;
        }
        bi4.c1 c1Var = new bi4.c1();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f355139d = "3";
        j0Var.f355141f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList2.add(j0Var);
        c1Var.b(this.f147059d);
        c1Var.f("red_packet_2022@inner");
        bi4.d1 d1Var = c1Var.f21034a;
        pj4.b0 b0Var = d1Var.f354937d;
        b0Var.f354976h = str;
        b0Var.f354978m = str2;
        com.tencent.mm.plugin.luckymoney.model.s4 s4Var2 = luckyMoneyNewYearReceiveUIV2.V;
        b0Var.f354987v = s4Var2.f145610m;
        b0Var.f354988w = s4Var2.f145611n;
        c1Var.h(s4Var2.f145612o);
        c1Var.g(luckyMoneyNewYearReceiveUIV2.V.f145606f);
        d1Var.f354937d.f354974f = 2;
        c1Var.c(arrayList2);
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Di(luckyMoneyNewYearReceiveUIV2.getContext(), d1Var);
        luckyMoneyNewYearReceiveUIV2.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
