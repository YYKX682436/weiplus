package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class u1 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f178515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178516e;

    public u1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI, android.widget.ImageView imageView) {
        this.f178516e = walletBalanceSaveUI;
        this.f178515d = imageView;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet.balance.ui.t1(this, bitmap));
    }
}
