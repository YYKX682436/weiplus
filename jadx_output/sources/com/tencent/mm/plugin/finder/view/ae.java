package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ae implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f131634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f131635e;

    public ae(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        this.f131634d = bitmap;
        this.f131635e = finderLiveShoppingCouponView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView backgroundIv;
        android.widget.ImageView backgroundIv2;
        android.widget.ImageView backgroundIv3;
        android.widget.ImageView backgroundIv4;
        android.graphics.Bitmap bitmap = this.f131634d;
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f131635e;
        backgroundIv = finderLiveShoppingCouponView.getBackgroundIv();
        backgroundIv.setVisibility(0);
        backgroundIv2 = finderLiveShoppingCouponView.getBackgroundIv();
        android.view.ViewGroup.LayoutParams layoutParams = backgroundIv2.getLayoutParams();
        backgroundIv3 = finderLiveShoppingCouponView.getBackgroundIv();
        layoutParams.width = (int) (backgroundIv3.getHeight() * (bitmap.getWidth() / bitmap.getHeight()));
        backgroundIv4 = finderLiveShoppingCouponView.getBackgroundIv();
        backgroundIv4.setImageBitmap(bitmap);
    }
}
