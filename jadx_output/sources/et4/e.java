package et4;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f256609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ et4.i f256610e;

    public e(et4.i iVar, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f256610e = iVar;
        this.f256609d = bankcard;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierBankcardDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f256609d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierBankcardDialog", "go to url %s", bankcard.field_forbid_url);
        intent.putExtra("rawUrl", bankcard.field_forbid_url);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        com.tencent.mm.wallet_core.ui.r1.U(this.f256610e.f256621i, intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierBankcardDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
