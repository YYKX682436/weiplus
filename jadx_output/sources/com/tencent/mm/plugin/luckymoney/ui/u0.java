package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class u0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.r5 f147477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 f147478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2, com.tencent.mm.plugin.luckymoney.model.r5 r5Var) {
        super(false);
        this.f147478e = luckyMoneyBusiReceiveUIV2;
        this.f147477d = r5Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail mCheckDetailLl");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2 = this.f147478e;
        android.content.Intent intent = luckyMoneyBusiReceiveUIV2.getIntent();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(luckyMoneyBusiReceiveUIV2.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_native_url", luckyMoneyBusiReceiveUIV2.f146035v);
        intent.putExtra("key_sendid", this.f147477d.f145581h);
        intent.putExtra("key_static_from_scene", luckyMoneyBusiReceiveUIV2.B);
        intent.putExtra("key_username", luckyMoneyBusiReceiveUIV2.f146036w);
        intent.putExtra("key_from_username", luckyMoneyBusiReceiveUIV2.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("key_hb_kind", 2);
        intent.putExtra("key_msgid", luckyMoneyBusiReceiveUIV2.f146039z);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV22 = this.f147478e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyBusiReceiveUIV22, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2$3", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBusiReceiveUIV22.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyBusiReceiveUIV22, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2$3", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBusiReceiveUIV2.W6(-1, "");
    }
}
