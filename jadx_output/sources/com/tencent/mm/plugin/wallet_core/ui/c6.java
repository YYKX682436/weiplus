package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f180175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180176e;

    public c6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, android.widget.ImageView imageView) {
        this.f180176e = walletOrderInfoNewUI;
        this.f180175d = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f180175d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180176e;
        layoutParams.width = walletOrderInfoNewUI.Q.getWidth();
        layoutParams.height = walletOrderInfoNewUI.Q.getHeight();
        imageView.setLayoutParams(layoutParams);
    }
}
