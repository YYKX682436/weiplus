package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f147436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI f147438f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI, com.tencent.mm.plugin.luckymoney.model.e1 e1Var, android.content.Context context) {
        super(false);
        this.f147438f = luckyMoneyBusiDetailUI;
        this.f147436d = e1Var;
        this.f147437e = context;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = this.f147436d;
        boolean isEmpty = android.text.TextUtils.isEmpty(e1Var.N);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = this.f147438f;
        if (isEmpty) {
            com.tencent.mm.wallet_core.ui.r1.q0(12, 1);
            h45.a0.b(luckyMoneyBusiDetailUI.getContext(), 1);
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyBusiDetailUI", "detail.changeUrl is empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "detail.changeUrl:" + e1Var.N);
        if (e1Var.N.startsWith("weixin://wxpay")) {
            com.tencent.mm.wallet_core.ui.r1.q0(12, 1);
            h45.a0.b(luckyMoneyBusiDetailUI.getContext(), 1);
        } else {
            com.tencent.mm.wallet_core.ui.r1.q0(7, 1);
            com.tencent.mm.wallet_core.ui.r1.V(this.f147437e, e1Var.N, true);
        }
    }
}
