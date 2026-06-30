package mp5;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f330492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330493e;

    public o(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, int i17) {
        this.f330493e = wcPayKeyboard;
        this.f330492d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.wallet_core.keyboard.WcPayKeyboard.S;
        this.f330493e.l(this.f330492d);
    }
}
