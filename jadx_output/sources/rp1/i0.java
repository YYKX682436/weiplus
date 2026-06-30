package rp1;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallBlurView f398418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView) {
        super(0);
        this.f398418d = floatBallBlurView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int defaultBottomMaskColor;
        com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallBlurView", "onLoadImageFailed");
        com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView = this.f398418d;
        floatBallBlurView.f93468o = true;
        android.widget.ImageView imageView = floatBallBlurView.f93462f;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mBlurImageView");
            throw null;
        }
        imageView.setImageBitmap(null);
        android.widget.ImageView imageView2 = floatBallBlurView.f93463g;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("mTopBlurMask");
            throw null;
        }
        imageView2.setAlpha(0.0f);
        if (floatBallBlurView.f93467n != null) {
            android.widget.ImageView imageView3 = floatBallBlurView.f93464h;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("mBottomBlurMask");
                throw null;
            }
            imageView3.setAlpha(1.0f);
            android.widget.ImageView imageView4 = floatBallBlurView.f93464h;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("mBottomBlurMask");
                throw null;
            }
            java.lang.Integer num = floatBallBlurView.f93467n;
            kotlin.jvm.internal.o.d(num);
            imageView4.setBackgroundColor(num.intValue());
        } else {
            android.widget.ImageView imageView5 = floatBallBlurView.f93464h;
            if (imageView5 == null) {
                kotlin.jvm.internal.o.o("mBottomBlurMask");
                throw null;
            }
            imageView5.setAlpha(0.0f);
            android.widget.ImageView imageView6 = floatBallBlurView.f93464h;
            if (imageView6 == null) {
                kotlin.jvm.internal.o.o("mBottomBlurMask");
                throw null;
            }
            defaultBottomMaskColor = floatBallBlurView.getDefaultBottomMaskColor();
            imageView6.setBackgroundColor(defaultBottomMaskColor);
        }
        return jz5.f0.f302826a;
    }
}
