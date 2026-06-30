package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pp extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.rp f147332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter f147333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter, com.tencent.mm.plugin.luckymoney.ui.rp rpVar) {
        super(false);
        this.f147333e = luckyMoneyWishFooter;
        this.f147332d = rpVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter = this.f147333e;
        java.lang.String obj = luckyMoneyWishFooter.f146681p.getText().toString();
        com.tencent.mm.plugin.luckymoney.ui.a0 a0Var = (com.tencent.mm.plugin.luckymoney.ui.a0) this.f147332d;
        a0Var.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = a0Var.f146687a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyBusiDetailUI.D)) {
                luckyMoneyBusiDetailUI.doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.e6(luckyMoneyBusiDetailUI.C, obj, luckyMoneyBusiDetailUI.D, "v1.0"));
                luckyMoneyBusiDetailUI.V6();
            }
        }
        luckyMoneyWishFooter.f146681p.setText("");
    }
}
