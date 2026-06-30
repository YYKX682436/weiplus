package yr4;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr4.u f465105d;

    public k(yr4.u uVar) {
        this.f465105d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yr4.u uVar = this.f465105d;
        java.util.Iterator it = ((java.util.ArrayList) uVar.f465110d).iterator();
        while (it.hasNext()) {
            com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = (com.tencent.mm.wallet_core.ui.WalletBaseUI) ((java.lang.ref.WeakReference) it.next()).get();
            if (walletBaseUI != null && !walletBaseUI.hasFinish()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PayProcess", "do finish activity: %s", walletBaseUI);
                walletBaseUI.finish();
            }
        }
        ((java.util.ArrayList) uVar.f465110d).clear();
    }
}
