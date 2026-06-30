package gt4;

/* loaded from: classes9.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView f275511d;

    public r(com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView switchPhoneItemGroupView) {
        this.f275511d = switchPhoneItemGroupView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/SwitchPhoneItemGroupView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView switchPhoneItemGroupView = this.f275511d;
        java.util.Iterator it = ((java.util.ArrayList) switchPhoneItemGroupView.f180695d).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView) it.next()).f180700f.setImageResource(com.tencent.mm.R.raw.radio_off);
        }
        ((com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView) view).f180700f.setImageResource(com.tencent.mm.R.raw.radio_on);
        gt4.s sVar = switchPhoneItemGroupView.f180696e;
        if (sVar != null) {
            com.tencent.mm.plugin.wallet_core.ui.z8 z8Var = (com.tencent.mm.plugin.wallet_core.ui.z8) sVar;
            z8Var.getClass();
            if (view.getTag() != null) {
                int intValue = ((java.lang.Integer) view.getTag()).intValue();
                com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI = z8Var.f180835a;
                if (intValue == -1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "do bind new card");
                    int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI.f180102g;
                    walletSwitchVerifyPhoneUI.getInput().putBoolean("key_is_changing_balance_phone_num", true);
                    walletSwitchVerifyPhoneUI.getInput().putInt("key_pay_flag", 2);
                    com.tencent.mm.wallet_core.a.d(walletSwitchVerifyPhoneUI, walletSwitchVerifyPhoneUI.getInput());
                } else if (intValue == -2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "do verify idcard tail");
                    walletSwitchVerifyPhoneUI.getInput().putBoolean("key_forward_to_id_verify", true);
                    com.tencent.mm.wallet_core.a.d(walletSwitchVerifyPhoneUI, walletSwitchVerifyPhoneUI.getInput());
                } else {
                    r45.jd jdVar = (r45.jd) ((java.util.LinkedList) walletSwitchVerifyPhoneUI.f180104e).get(intValue);
                    walletSwitchVerifyPhoneUI.getInput().putBoolean("key_balance_change_phone_need_confirm_phone", false);
                    walletSwitchVerifyPhoneUI.getInput().putBoolean("key_forward_to_id_verify", false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "select wx phone: %s", java.lang.Boolean.valueOf(jdVar.f377710d.equals("wx")));
                    walletSwitchVerifyPhoneUI.getNetController().d(jdVar);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/SwitchPhoneItemGroupView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
