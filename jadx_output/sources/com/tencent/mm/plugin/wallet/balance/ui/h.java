package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class h implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f177895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177896e;

    public h(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, android.widget.ImageView imageView) {
        this.f177896e = walletBalanceFetchUI;
        this.f177895d = imageView;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet.balance.ui.g(this, bitmap));
    }
}
