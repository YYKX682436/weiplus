package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class yj extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f6 f147744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, com.tencent.mm.plugin.luckymoney.model.f6 f6Var) {
        super(false);
        this.f147745e = luckyMoneyNotHookReceiveUI;
        this.f147744d = f6Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.model.f6 f6Var = this.f147744d;
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = f6Var.f145285p;
        if (realnameGuideHelper != null) {
            intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f147745e;
        intent.setClass(luckyMoneyNotHookReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
        intent.putExtra("key_swipe", luckyMoneyNotHookReceiveUI.A1);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_native_url", f6Var.f145282m);
        intent.putExtra("key_sendid", f6Var.f145281i);
        intent.putExtra("key_username", luckyMoneyNotHookReceiveUI.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_from_username", luckyMoneyNotHookReceiveUI.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("scene_id", luckyMoneyNotHookReceiveUI.f146489y0);
        intent.putExtra("key_emoji_switch", f6Var.f145287r);
        intent.putExtra("key_detail_emoji_md5", f6Var.f145288s);
        intent.putExtra("key_detail_emoji_type", f6Var.f145289t);
        intent.putExtra("key_msgid", luckyMoneyNotHookReceiveUI.W);
        luckyMoneyNotHookReceiveUI.Z6(intent);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI2 = this.f147745e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyNotHookReceiveUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$27", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNotHookReceiveUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyNotHookReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$27", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNotHookReceiveUI.finish();
    }
}
