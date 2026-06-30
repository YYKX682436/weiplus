package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f178238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.l5 f178239e;

    public k5(com.tencent.mm.plugin.wallet.balance.ui.lqt.l5 l5Var, android.graphics.Bitmap bitmap) {
        this.f178239e = l5Var;
        this.f178238d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l5 l5Var = this.f178239e;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = l5Var.f178261d;
        if (walletLqtSaveFetchUI.U == null || (imageView = walletLqtSaveFetchUI.f178061o) == null || imageView.getTag() == null || !l5Var.f178261d.f178061o.getTag().equals(l5Var.f178261d.U.field_bindSerial)) {
            return;
        }
        l5Var.f178261d.f178061o.setImageBitmap(this.f178238d);
    }
}
