package mp5;

/* loaded from: classes9.dex */
public class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton f330503d;

    public x(com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton) {
        this.f330503d = wcPayKeyboardAnimationActionButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f330503d;
        wcPayKeyboardAnimationActionButton.f213836s = intValue;
        int i17 = wcPayKeyboardAnimationActionButton.f213836s;
        if (wcPayKeyboardAnimationActionButton.f213836s <= wcPayKeyboardAnimationActionButton.f213834q) {
            wcPayKeyboardAnimationActionButton.A = true;
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) wcPayKeyboardAnimationActionButton.getLayoutParams();
            int i18 = wcPayKeyboardAnimationActionButton.f213831n;
            int i19 = wcPayKeyboardAnimationActionButton.f213834q;
            layoutParams.height = ((i18 - i19) / 2) + i19;
            wcPayKeyboardAnimationActionButton.setLayoutParams(layoutParams);
        }
        wcPayKeyboardAnimationActionButton.invalidate();
    }
}
