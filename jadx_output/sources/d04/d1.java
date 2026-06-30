package d04;

/* loaded from: classes3.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView f225404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView) {
        super(0);
        this.f225404d = scanInfoMaskView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView.f159699z;
        com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView = this.f225404d;
        android.view.animation.Animation animation = scanInfoMaskView.f159708o;
        if (animation != null) {
            animation.cancel();
        }
        android.view.View view = scanInfoMaskView.f159703g;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingIcon");
            throw null;
        }
        view.clearAnimation();
        if (scanInfoMaskView.f159708o == null) {
            scanInfoMaskView.f159708o = android.view.animation.AnimationUtils.loadAnimation(scanInfoMaskView.getContext(), com.tencent.mm.R.anim.f477731s);
            float dimensionPixelSize = scanInfoMaskView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db) / 2.0f;
            android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 360.0f, dimensionPixelSize, dimensionPixelSize);
            scanInfoMaskView.f159708o = rotateAnimation;
            rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            rotateAnimation.setRepeatMode(-1);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(1000L);
        }
        android.view.View view2 = scanInfoMaskView.f159703g;
        if (view2 != null) {
            view2.startAnimation(scanInfoMaskView.f159708o);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("loadingIcon");
        throw null;
    }
}
