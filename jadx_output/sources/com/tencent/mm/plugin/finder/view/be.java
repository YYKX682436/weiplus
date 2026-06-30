package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class be implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f131720a;

    public be(com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        this.f131720a = finderLiveShoppingCouponView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.widget.ImageView backgroundIv;
        android.widget.ImageView backgroundIv2;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f131720a;
        if (bitmap == null) {
            backgroundIv = finderLiveShoppingCouponView.getBackgroundIv();
            backgroundIv.setVisibility(8);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCouponView", "on load coupon background, width = " + bitmap.getWidth() + ", height = " + bitmap.getHeight());
        backgroundIv2 = finderLiveShoppingCouponView.getBackgroundIv();
        backgroundIv2.post(new com.tencent.mm.plugin.finder.view.ae(bitmap, finderLiveShoppingCouponView));
    }
}
