package mp5;

/* loaded from: classes9.dex */
public class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton f330505d;

    public z(com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton) {
        this.f330505d = wcPayKeyboardAnimationActionButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f330505d;
        wcPayKeyboardAnimationActionButton.f213837t = intValue;
        int i17 = wcPayKeyboardAnimationActionButton.f213837t;
        wcPayKeyboardAnimationActionButton.invalidate();
    }
}
