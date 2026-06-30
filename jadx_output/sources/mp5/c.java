package mp5;

/* loaded from: classes9.dex */
public class c implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f330476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330477b;

    public c(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, boolean z17) {
        this.f330477b = wcPayKeyboard;
        this.f330476a = z17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330477b;
        wcPayKeyboard.f213820x.setVisibility(4);
        if (this.f330476a) {
            wcPayKeyboard.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
