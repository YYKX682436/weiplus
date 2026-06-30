package xb3;

/* loaded from: classes9.dex */
public class l extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb3.m f452909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xb3.m mVar) {
        super(false);
        this.f452909d = mVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        xb3.m mVar = this.f452909d;
        intent.setClass(mVar.f452910a.getContext(), com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI.class);
        intent.putExtra("key_native_url", mVar.f452910a.f145150x);
        intent.putExtra("key_sendid", mVar.f452910a.f145149w);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_username", mVar.f452910a.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_msgid", mVar.f452910a.f145152z);
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = mVar.f452910a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyHKReceiveUI, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyHKReceiveUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyHKReceiveUI, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mVar.f452910a.finish();
    }
}
