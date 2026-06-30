package mp5;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330495d;

    public q(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard) {
        this.f330495d = wcPayKeyboard;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f330495d.u();
    }
}
