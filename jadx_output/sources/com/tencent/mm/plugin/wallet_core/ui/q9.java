package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class q9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180592d;

    public q9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI) {
        this.f180592d = walletVerifyCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180592d;
        if (walletVerifyCodeUI.f180117n == null) {
            walletVerifyCodeUI.f180117n = "";
        }
        java.lang.String format = java.lang.String.format(c01.z1.I() ? walletVerifyCodeUI.getString(com.tencent.mm.R.string.l0r) : walletVerifyCodeUI.getString(com.tencent.mm.R.string.l0q), walletVerifyCodeUI.f180117n);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) walletVerifyCodeUI.getContext().getSystemService("layout_inflater");
        android.widget.TextView textView = (android.widget.TextView) layoutInflater.inflate(com.tencent.mm.R.layout.f489177bk3, (android.view.ViewGroup) null);
        int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setText(format);
        db5.e1.w(walletVerifyCodeUI.getContext(), walletVerifyCodeUI.getString(com.tencent.mm.R.string.l0s), walletVerifyCodeUI.getString(com.tencent.mm.R.string.kmf), textView, new com.tencent.mm.plugin.wallet_core.ui.j9(walletVerifyCodeUI));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
