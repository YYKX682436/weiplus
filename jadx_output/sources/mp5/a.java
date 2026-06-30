package mp5;

/* loaded from: classes9.dex */
public class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f330470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f330471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330472f;

    public a(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, int i17, boolean z17) {
        this.f330472f = wcPayKeyboard;
        this.f330470d = i17;
        this.f330471e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "hide keyboard anim end");
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330472f;
        wcPayKeyboard.f213819w.setVisibility(4);
        android.widget.LinearLayout linearLayout = wcPayKeyboard.f213819w;
        linearLayout.setTranslationY(linearLayout.getTranslationY() - this.f330470d);
        if (this.f330471e) {
            wcPayKeyboard.setVisibility(8);
        }
        if (wcPayKeyboard.E != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "do nextAction");
            wcPayKeyboard.E.run();
            wcPayKeyboard.E = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
