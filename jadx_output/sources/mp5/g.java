package mp5;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f330481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330482e;

    public g(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, boolean z17) {
        this.f330482e = wcPayKeyboard;
        this.f330481d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330482e;
        if (wcPayKeyboard.C) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(wcPayKeyboard.getContext(), com.tencent.mm.R.anim.f477876e0);
            loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            loadAnimation.setDuration(330L);
            loadAnimation.setAnimationListener(new mp5.j(wcPayKeyboard, this.f330481d));
            wcPayKeyboard.f213819w.startAnimation(loadAnimation);
            return;
        }
        int height = wcPayKeyboard.f213819w.getHeight();
        if (wcPayKeyboard.F == null) {
            float translationY = wcPayKeyboard.f213819w.getTranslationY();
            wcPayKeyboard.F = android.animation.ObjectAnimator.ofFloat(wcPayKeyboard.f213819w, "translationY", height + translationY, translationY);
            wcPayKeyboard.F.setDuration(300L);
            wcPayKeyboard.F.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        wcPayKeyboard.F.removeAllListeners();
        wcPayKeyboard.F.addListener(new mp5.e(this));
        wcPayKeyboard.F.removeAllUpdateListeners();
        wcPayKeyboard.F.addUpdateListener(new mp5.f(this, height));
        wcPayKeyboard.F.start();
        if (wcPayKeyboard.H != null) {
            float f17 = height;
            o05.j jVar = ((ps4.f) wcPayKeyboard.H).f358150a;
            if (jVar != null) {
                jVar.a(f17);
            }
        }
    }
}
