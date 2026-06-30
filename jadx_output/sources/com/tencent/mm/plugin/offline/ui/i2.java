package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f152646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f152647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f152648f;

    public i2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, java.lang.Integer num, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f152646d = num;
        this.f152647e = imageView;
        this.f152648f = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intValue = this.f152646d.intValue();
        android.widget.ImageView imageView = this.f152647e;
        if (imageView instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) imageView).setEnableColorFilter(false);
        }
        imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.S(this.f152648f, intValue, intValue, true, false));
    }
}
