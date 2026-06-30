package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class mm implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147197a;

    public mm(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f147197a = luckyMoneyPickEnvelopeUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        r45.wv3 wv3Var;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147197a;
        int i17 = luckyMoneyPickEnvelopeUI.f146534v;
        if (i17 < 0 || i17 >= ((java.util.ArrayList) luckyMoneyPickEnvelopeUI.f146532t).size()) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) luckyMoneyPickEnvelopeUI.f146532t).get(luckyMoneyPickEnvelopeUI.f146534v);
        if (!zmVar.f147792a || (wv3Var = zmVar.f147793b) == null) {
            return;
        }
        java.lang.String str = wv3Var.f389500f;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("key_red_packet_preview_material_id", str);
        hashMap.put("key_red_packet_preview_scene", "1");
        ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).Ai(luckyMoneyPickEnvelopeUI.getContext(), hashMap);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18892, 3, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146535w + 1), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146534v + 1), luckyMoneyPickEnvelopeUI.K, zmVar.f147793b.f389500f, luckyMoneyPickEnvelopeUI.f146515J, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.a7()), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.k7()), luckyMoneyPickEnvelopeUI.j7());
    }
}
