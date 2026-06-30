package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ph implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147319d;

    public ph(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147319d = luckyMoneyNewYearSendUIV2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147319d;
        if (id6 == com.tencent.mm.R.id.f485802j43 || view.getId() == com.tencent.mm.R.id.j4_) {
            int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
            luckyMoneyNewYearSendUIV2.h7(5);
            if (luckyMoneyNewYearSendUIV2.f146424q2 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "mSendBtn click, but need wait upload voice result");
                luckyMoneyNewYearSendUIV2.f146432u2 = true;
                luckyMoneyNewYearSendUIV2.n7();
                android.view.View view2 = luckyMoneyNewYearSendUIV2.f146405h;
                if (view2 != null) {
                    view2.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.oh(this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "mSendBtn click!");
                luckyMoneyNewYearSendUIV2.a7(0);
            }
        } else if (view.getId() == com.tencent.mm.R.id.f485805j46) {
            luckyMoneyNewYearSendUIV2.finish();
            int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
            luckyMoneyNewYearSendUIV2.h7(6);
            luckyMoneyNewYearSendUIV2.Y1 = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = luckyMoneyNewYearSendUIV2.Y1;
            hBReportNewStruct.f58415d = 11L;
            hBReportNewStruct.k();
            luckyMoneyNewYearSendUIV2.j7(2);
        } else if (view.getId() == com.tencent.mm.R.id.j3g || view.getId() == com.tencent.mm.R.id.j3o || view.getId() == com.tencent.mm.R.id.j3v) {
            luckyMoneyNewYearSendUIV2.Y1 = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct2 = luckyMoneyNewYearSendUIV2.Y1;
            hBReportNewStruct2.f58415d = 3L;
            hBReportNewStruct2.k();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.W6(luckyMoneyNewYearSendUIV2);
        } else if (view.getId() == com.tencent.mm.R.id.j3k || view.getId() == com.tencent.mm.R.id.j3l) {
            luckyMoneyNewYearSendUIV2.W1 = null;
            luckyMoneyNewYearSendUIV2.X1 = null;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_NEW_STRING, "");
            luckyMoneyNewYearSendUIV2.c7();
            luckyMoneyNewYearSendUIV2.h7(3);
            luckyMoneyNewYearSendUIV2.Y1 = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct3 = luckyMoneyNewYearSendUIV2.Y1;
            hBReportNewStruct3.f58415d = 5L;
            hBReportNewStruct3.k();
        } else if (view.getId() == com.tencent.mm.R.id.f485799j40 || view.getId() == com.tencent.mm.R.id.f485753iy0 || view.getId() == com.tencent.mm.R.id.j4b) {
            luckyMoneyNewYearSendUIV2.F.b();
            luckyMoneyNewYearSendUIV2.b7();
            luckyMoneyNewYearSendUIV2.c7();
            luckyMoneyNewYearSendUIV2.h7(4);
            luckyMoneyNewYearSendUIV2.Y1 = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct4 = luckyMoneyNewYearSendUIV2.Y1;
            hBReportNewStruct4.f58415d = 2L;
            hBReportNewStruct4.k();
        } else if (view.getId() == com.tencent.mm.R.id.f485800j41) {
            ((com.tencent.mm.feature.emoji.f2) ((com.tencent.mm.feature.emoji.api.i6) i95.n0.c(com.tencent.mm.feature.emoji.api.i6.class))).wi(luckyMoneyNewYearSendUIV2.f146406h2);
            luckyMoneyNewYearSendUIV2.p7(false);
            luckyMoneyNewYearSendUIV2.d7(3);
        } else if (view.getId() == com.tencent.mm.R.id.j3f) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.W6(luckyMoneyNewYearSendUIV2);
        } else if (view.getId() == com.tencent.mm.R.id.r3p) {
            int i19 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
            luckyMoneyNewYearSendUIV2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "showVoiceOperateSheet");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyNewYearSendUIV2, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.qh(luckyMoneyNewYearSendUIV2);
            k0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.rh(luckyMoneyNewYearSendUIV2);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
