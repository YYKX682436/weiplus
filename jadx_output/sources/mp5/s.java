package mp5;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330497d;

    public s(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard) {
        this.f330497d = wcPayKeyboard;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330497d;
        android.animation.AnimatorSet animatorSet = wcPayKeyboard.f213820x.M;
        if (animatorSet != null) {
            animatorSet.start();
        }
        wcPayKeyboard.j(false);
    }
}
