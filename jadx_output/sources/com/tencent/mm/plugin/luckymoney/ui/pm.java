package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pm implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f147326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147327b;

    public pm(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, boolean z17) {
        this.f147327b = luckyMoneyPickEnvelopeUI;
        this.f147326a = z17;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.co3 co3Var = (r45.co3) obj;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147327b;
        android.app.Dialog dialog = luckyMoneyPickEnvelopeUI.B;
        if (dialog != null && dialog.isShowing()) {
            luckyMoneyPickEnvelopeUI.B.dismiss();
        }
        luckyMoneyPickEnvelopeUI.f146538y = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do get show source net callback");
        if (co3Var == null) {
            com.tencent.mm.wallet_core.ui.r1.K(luckyMoneyPickEnvelopeUI.getContext(), "");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(co3Var.f371703d));
        if (co3Var.f371703d != 0) {
            com.tencent.mm.wallet_core.ui.r1.L(co3Var.f371704e);
            return;
        }
        luckyMoneyPickEnvelopeUI.f146540z = co3Var.f371707h;
        luckyMoneyPickEnvelopeUI.A = co3Var.f371706g;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_LAST_RECEIVE_TIMESTAMP_LONG_SYNC, java.lang.Long.valueOf(co3Var.f371711o));
        boolean z17 = this.f147326a;
        if (z17) {
            ((java.util.ArrayList) luckyMoneyPickEnvelopeUI.f146532t).clear();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "updateByResp use netscene, hasMore: %s, pagedata: %s", java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146540z), luckyMoneyPickEnvelopeUI.A);
        luckyMoneyPickEnvelopeUI.p7(co3Var, z17);
        if (z17) {
            luckyMoneyPickEnvelopeUI.f146521i.post(new com.tencent.mm.plugin.luckymoney.ui.ml(luckyMoneyPickEnvelopeUI));
            luckyMoneyPickEnvelopeUI.l7();
        }
    }
}
