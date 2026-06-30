package rp1;

/* loaded from: classes14.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallBlurView f398401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f398402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f398401d = floatBallBlurView;
        this.f398402e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.ball.view.FloatBallBlurView.f93459p;
        com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView = this.f398401d;
        floatBallBlurView.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBlurDone bitmap: ");
        android.graphics.Bitmap bitmap = this.f398402e;
        sb6.append(bitmap);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallBlurView", sb6.toString());
        if (bitmap == null) {
            android.widget.ImageView imageView = floatBallBlurView.f93462f;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("mBlurImageView");
                throw null;
            }
            imageView.setImageBitmap(null);
        } else if (bitmap.isRecycled()) {
            android.widget.ImageView imageView2 = floatBallBlurView.f93462f;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("mBlurImageView");
                throw null;
            }
            imageView2.setImageBitmap(null);
        } else {
            android.widget.ImageView imageView3 = floatBallBlurView.f93462f;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("mBlurImageView");
                throw null;
            }
            imageView3.setImageBitmap(bitmap);
            floatBallBlurView.f93468o = false;
            android.widget.ImageView imageView4 = floatBallBlurView.f93462f;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("mBlurImageView");
                throw null;
            }
            if (floatBallBlurView.f93466m && imageView4.getVisibility() != 0) {
                android.widget.ImageView imageView5 = floatBallBlurView.f93462f;
                if (imageView5 == null) {
                    kotlin.jvm.internal.o.o("mBlurImageView");
                    throw null;
                }
                imageView5.setVisibility(0);
                android.widget.ImageView imageView6 = floatBallBlurView.f93464h;
                if (imageView6 == null) {
                    kotlin.jvm.internal.o.o("mBottomBlurMask");
                    throw null;
                }
                imageView6.setVisibility(0);
                android.widget.ImageView imageView7 = floatBallBlurView.f93464h;
                if (imageView7 == null) {
                    kotlin.jvm.internal.o.o("mBottomBlurMask");
                    throw null;
                }
                imageView7.setAlpha(1.0f);
                floatBallBlurView.f();
            }
        }
        return jz5.f0.f302826a;
    }
}
