package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class e5 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f146863d;

    public e5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        this.f146863d = luckyMoneyHistoryEnvelopeUI;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 f2Var, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "long click envelope: %s", java.lang.Integer.valueOf(i17));
        in5.c cVar = (in5.c) ((in5.s0) k3Var).f293125i;
        if (cVar instanceof com.tencent.mm.plugin.luckymoney.ui.i5) {
            r45.wv3 wv3Var = ((com.tencent.mm.plugin.luckymoney.ui.i5) cVar).f147015d;
            int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI.C;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f146863d;
            luckyMoneyHistoryEnvelopeUI.getClass();
            if (wv3Var != null) {
                if ("0".equals(wv3Var.f389500f)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "can not delete default envelope");
                } else {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyHistoryEnvelopeUI.getContext(), 1, true);
                    android.widget.TextView textView = new android.widget.TextView(luckyMoneyHistoryEnvelopeUI.getContext());
                    textView.setPadding(0, 0, 0, i65.a.b(luckyMoneyHistoryEnvelopeUI.getContext(), 9));
                    textView.setMinHeight(i65.a.h(luckyMoneyHistoryEnvelopeUI.getContext(), com.tencent.mm.R.dimen.f479579v));
                    textView.setTextSize(14.0f);
                    textView.setTextColor(luckyMoneyHistoryEnvelopeUI.getResources().getColor(com.tencent.mm.R.color.t_));
                    textView.setText(com.tencent.mm.R.string.gms);
                    textView.setGravity(81);
                    k0Var.s(textView, true);
                    k0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.g5(luckyMoneyHistoryEnvelopeUI);
                    k0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.h5(luckyMoneyHistoryEnvelopeUI, wv3Var);
                    k0Var.v();
                }
            }
        }
        return false;
    }
}
