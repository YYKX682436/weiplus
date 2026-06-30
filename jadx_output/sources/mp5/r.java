package mp5;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330496d;

    public r(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard) {
        this.f330496d = wcPayKeyboard;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330496d;
        if (wcPayKeyboard.C) {
            wcPayKeyboard.setWindowViewBottomMargin(wcPayKeyboard.f213819w.getHeight());
        }
    }
}
