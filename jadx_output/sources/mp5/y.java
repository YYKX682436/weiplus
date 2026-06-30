package mp5;

/* loaded from: classes9.dex */
public class y implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton f330504d;

    public y(com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton) {
        this.f330504d = wcPayKeyboardAnimationActionButton;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f330504d;
        wcPayKeyboardAnimationActionButton.A = true;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) wcPayKeyboardAnimationActionButton.getLayoutParams();
        int i17 = wcPayKeyboardAnimationActionButton.f213831n;
        int i18 = wcPayKeyboardAnimationActionButton.f213834q;
        layoutParams.height = ((i17 - i18) / 2) + i18;
        wcPayKeyboardAnimationActionButton.setLayoutParams(layoutParams);
        wcPayKeyboardAnimationActionButton.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
