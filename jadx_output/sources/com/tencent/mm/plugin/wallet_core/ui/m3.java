package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.o3 f180489d;

    public m3(com.tencent.mm.plugin.wallet_core.ui.o3 o3Var) {
        this.f180489d = o3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletChangeBankcardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof java.lang.String) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str = (java.lang.String) view.getTag();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletChangeBankcardAdapter", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("pay_channel", 1);
            android.content.Context context = this.f180489d.f180550d;
            int i17 = com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.f178651z;
            com.tencent.mm.wallet_core.ui.r1.U(context, intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletChangeBankcardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
