package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class te extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f6 f147458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(com.tencent.mm.plugin.luckymoney.model.f6 f6Var, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        super(false);
        this.f147458d = f6Var;
        this.f147459e = luckyMoneyNewReceiveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.model.f6 f6Var = this.f147458d;
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = f6Var.f145285p;
        if (realnameGuideHelper != null) {
            intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147459e;
        intent.setClass(luckyMoneyNewReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
        intent.putExtra("key_swipe", luckyMoneyNewReceiveUI.C1);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_native_url", f6Var.f145282m);
        intent.putExtra("key_sendid", f6Var.f145281i);
        intent.putExtra("key_username", luckyMoneyNewReceiveUI.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_from_username", luckyMoneyNewReceiveUI.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("scene_id", luckyMoneyNewReceiveUI.f146306p1);
        intent.putExtra("key_emoji_switch", f6Var.f145287r);
        intent.putExtra("key_detail_emoji_md5", f6Var.f145288s);
        intent.putExtra("key_detail_emoji_type", f6Var.f145289t);
        intent.putExtra("key_msgid", luckyMoneyNewReceiveUI.Y);
        luckyMoneyNewReceiveUI.b7(intent);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI2 = this.f147459e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyNewReceiveUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$openLuckyDetail$1", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNewReceiveUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyNewReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$openLuckyDetail$1", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNewReceiveUI.finish();
    }
}
