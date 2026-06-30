package mp5;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330498d;

    public t(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard) {
        this.f330498d = wcPayKeyboard;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.wallet_core.keyboard.WcPayKeyboard.S;
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330498d;
        wcPayKeyboard.setVisibility(0);
        wcPayKeyboard.f213819w.setVisibility(4);
        wcPayKeyboard.f213819w.post(new mp5.g(wcPayKeyboard, false));
        android.animation.AnimatorSet animatorSet = wcPayKeyboard.f213820x.Q;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
