package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180287e;

    public g5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, java.lang.String str) {
        this.f180287e = walletOrderInfoNewUI;
        this.f180286d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180287e;
        java.lang.String str = walletOrderInfoNewUI.f180032p;
        java.lang.String str2 = this.f180286d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "leadViewInfo h5 url：%s，mTransactionId：%s", str2, str);
        com.tencent.mm.wallet_core.ui.r1.X(walletOrderInfoNewUI, str2, true);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
