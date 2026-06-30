package v73;

/* loaded from: classes9.dex */
public class c0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI f433678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI) {
        super(false);
        this.f433678d = honeyPayGiveCardUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI honeyPayGiveCardUI = this.f433678d;
        java.lang.String str = honeyPayGiveCardUI.f142260d;
        if (!com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.V6(honeyPayGiveCardUI)) {
            com.tencent.mars.xlog.Log.w(honeyPayGiveCardUI.f142260d, "over limit when click");
            return;
        }
        honeyPayGiveCardUI.hideTenpayKB();
        com.tencent.mars.xlog.Log.i(honeyPayGiveCardUI.f142260d, "go to pwd ui");
        long j07 = com.tencent.mm.wallet_core.ui.r1.j0(honeyPayGiveCardUI.f142317g.getText(), "100");
        java.lang.String stringExtra = honeyPayGiveCardUI.getIntent().getStringExtra("key_take_message");
        android.content.Intent intent = new android.content.Intent(honeyPayGiveCardUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.class);
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_credit_line", j07);
        intent.putExtra("key_take_message", stringExtra);
        intent.putExtra("key_username", honeyPayGiveCardUI.f142330w);
        intent.putExtra("key_wishing", honeyPayGiveCardUI.f142331x);
        intent.putExtra("key_cardtype", honeyPayGiveCardUI.f142333z);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(honeyPayGiveCardUI, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayGiveCardUI", "gotoPwdUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        honeyPayGiveCardUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(honeyPayGiveCardUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayGiveCardUI", "gotoPwdUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
