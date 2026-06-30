package mp5;

/* loaded from: classes9.dex */
public class a0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton f330473d;

    public a0(com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton) {
        this.f330473d = wcPayKeyboardAnimationActionButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f330473d;
        wcPayKeyboardAnimationActionButton.f213836s = intValue;
        int i17 = wcPayKeyboardAnimationActionButton.f213836s;
        wcPayKeyboardAnimationActionButton.invalidate();
    }
}
