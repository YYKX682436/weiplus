package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class dj extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f146845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146846e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, boolean z17) {
        super(false);
        this.f146846e = luckyMoneyNotHookReceiveUI;
        this.f146845d = z17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        gb3.o.f270035a.a(5);
        boolean z17 = this.f146845d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f146846e;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            int i17 = luckyMoneyNotHookReceiveUI.D1.f145432y;
            g0Var.d(11701, 6, java.lang.Integer.valueOf(i17 == 1 ? 1 : i17 == 0 ? 2 : 0), java.lang.Integer.valueOf(luckyMoneyNotHookReceiveUI.X6()), 0, 1);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(luckyMoneyNotHookReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
        intent.putExtra("key_swipe", luckyMoneyNotHookReceiveUI.A1);
        intent.putExtra("key_native_url", luckyMoneyNotHookReceiveUI.D1.f145421n);
        intent.putExtra("key_sendid", luckyMoneyNotHookReceiveUI.D1.f145420m);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_username", luckyMoneyNotHookReceiveUI.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_from_username", luckyMoneyNotHookReceiveUI.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("scene_id", luckyMoneyNotHookReceiveUI.f146489y0);
        intent.putExtra("key_msgid", luckyMoneyNotHookReceiveUI.W);
        luckyMoneyNotHookReceiveUI.Z6(intent);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI2 = this.f146846e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyNotHookReceiveUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$10", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNotHookReceiveUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyNotHookReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$10", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNotHookReceiveUI.finish();
        luckyMoneyNotHookReceiveUI.d7(ml2.f5.f327465p, true);
    }
}
