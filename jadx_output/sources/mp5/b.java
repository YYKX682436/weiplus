package mp5;

/* loaded from: classes9.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f330474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330475e;

    public b(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, int i17) {
        this.f330475e = wcPayKeyboard;
        this.f330474d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330475e;
        if (wcPayKeyboard.B != null) {
            wcPayKeyboard.B.h4(this.f330474d - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
