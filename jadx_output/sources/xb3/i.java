package xb3;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.r43 f452903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI f452904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI, r45.r43 r43Var) {
        super(false);
        this.f452904e = luckyMoneyHKReceiveUI;
        this.f452903d = r43Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f452904e;
        intent.setClass(luckyMoneyHKReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI.class);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_native_url", luckyMoneyHKReceiveUI.f145150x);
        intent.putExtra("key_sendid", luckyMoneyHKReceiveUI.f145149w);
        intent.putExtra("key_username", luckyMoneyHKReceiveUI.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_msgid", luckyMoneyHKReceiveUI.f145152z);
        com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch();
        r45.r43 r43Var = this.f452903d;
        luckyMoneyEmojiSwitch.f145155f = r43Var.f384521J;
        luckyMoneyEmojiSwitch.f145156g = r43Var.K;
        intent.putExtra("key_emoji_switch", luckyMoneyEmojiSwitch);
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI2 = this.f452904e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyHKReceiveUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$4", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyHKReceiveUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyHKReceiveUI2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$4", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyHKReceiveUI.finish();
    }
}
