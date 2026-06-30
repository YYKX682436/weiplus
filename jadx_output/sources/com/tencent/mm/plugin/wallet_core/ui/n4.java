package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes.dex */
public class n4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.ECardInfo f180513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f180514e;

    public n4(com.tencent.mm.plugin.wallet_core.model.ECardInfo eCardInfo, android.content.Context context) {
        this.f180513d = eCardInfo;
        this.f180514e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f180513d.f179635m;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIdCardTip", "go to url %s", str);
        intent.putExtra("rawUrl", str);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        com.tencent.mm.wallet_core.ui.r1.T(this.f180514e, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
