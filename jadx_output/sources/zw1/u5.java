package zw1;

/* loaded from: classes14.dex */
public class u5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476822d;

    public u5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.b3 b3Var) {
        this.f476822d = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f476822d.f450128d0.setRotation(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
