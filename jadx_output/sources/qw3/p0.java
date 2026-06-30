package qw3;

/* loaded from: classes4.dex */
public class p0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI f367189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI bankRemitDetailUI) {
        super(false);
        this.f367189d = bankRemitDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitDetailUI", "click finish btn");
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.LauncherUI"));
        intent.addFlags(67108864);
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI bankRemitDetailUI = this.f367189d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bankRemitDetailUI, arrayList.toArray(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bankRemitDetailUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(bankRemitDetailUI, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
