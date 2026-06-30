package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f180305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180306g;

    public h5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, java.lang.String str, java.lang.String str2, int i17) {
        this.f180306g = walletOrderInfoNewUI;
        this.f180303d = str;
        this.f180304e = str2;
        this.f180305f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f180305f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = this.f180306g.f180032p;
        java.lang.String str2 = this.f180303d;
        java.lang.String str3 = this.f180304e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "leadViewInfo click app username：%s，path：%s，version：%s ,mTransactionId：%s", str2, str3, valueOf, str);
        com.tencent.mm.wallet_core.ui.r1.b0(str2, str3, i17, 8);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
