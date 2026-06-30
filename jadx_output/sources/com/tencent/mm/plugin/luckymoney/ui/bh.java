package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class bh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f146755d;

    public bh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f146755d = luckyMoneyNewYearSendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f146755d;
        if (id6 == com.tencent.mm.R.id.f485802j43) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13079, 5, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "mSendBtn click!");
            int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.F1;
            luckyMoneyNewYearSendUI.W6(0);
        } else if (view.getId() == com.tencent.mm.R.id.f485805j46) {
            luckyMoneyNewYearSendUI.finish();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13079, 6, 1);
            luckyMoneyNewYearSendUI.V = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = luckyMoneyNewYearSendUI.V;
            hBReportNewStruct.f58415d = 11L;
            hBReportNewStruct.k();
            luckyMoneyNewYearSendUI.Z6(2);
        } else if (view.getId() == com.tencent.mm.R.id.j3g || view.getId() == com.tencent.mm.R.id.j3o) {
            luckyMoneyNewYearSendUI.V = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct2 = luckyMoneyNewYearSendUI.V;
            hBReportNewStruct2.f58415d = 3L;
            hBReportNewStruct2.k();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.V6(luckyMoneyNewYearSendUI);
        } else if (view.getId() == com.tencent.mm.R.id.j3k) {
            luckyMoneyNewYearSendUI.T = null;
            luckyMoneyNewYearSendUI.U = null;
            luckyMoneyNewYearSendUI.Y6(0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_STRING, "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13079, 3, 1);
            luckyMoneyNewYearSendUI.V = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct3 = luckyMoneyNewYearSendUI.V;
            hBReportNewStruct3.f58415d = 5L;
            hBReportNewStruct3.k();
        } else if (view.getId() == com.tencent.mm.R.id.f485799j40) {
            luckyMoneyNewYearSendUI.f146392z.b();
            luckyMoneyNewYearSendUI.X6();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13079, 4, 1);
            luckyMoneyNewYearSendUI.V = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct4 = luckyMoneyNewYearSendUI.V;
            hBReportNewStruct4.f58415d = 2L;
            hBReportNewStruct4.k();
        } else if (view.getId() == com.tencent.mm.R.id.f485800j41) {
            ((com.tencent.mm.feature.emoji.f2) ((com.tencent.mm.feature.emoji.api.i6) i95.n0.c(com.tencent.mm.feature.emoji.api.i6.class))).wi(luckyMoneyNewYearSendUI.f146378p1);
            luckyMoneyNewYearSendUI.c7(false);
            luckyMoneyNewYearSendUI.Y6(4);
        } else if (view.getId() == com.tencent.mm.R.id.j3f) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.V6(luckyMoneyNewYearSendUI);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
