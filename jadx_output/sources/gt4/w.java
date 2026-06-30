package gt4;

/* loaded from: classes9.dex */
public class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView f275571d;

    public w(com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView) {
        this.f275571d = walletAwardShakeAnimView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f275571d.f180702d.setRotation(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
