package wt1;

/* loaded from: classes15.dex */
public class l implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.n f449308d;

    public l(wt1.n nVar) {
        this.f449308d = nVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        wt1.m mVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onTimerExpired, do refresh code!");
        wt1.n nVar = this.f449308d;
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onShowTimeExpired()");
        if (nVar.f449310d == null) {
            return true;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) nVar.f449310d).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) nVar.f449310d).get(i17);
            if (weakReference != null && (mVar = (wt1.m) weakReference.get()) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "on show TimeExpired! do update refresh code view!");
                android.os.Message obtain = android.os.Message.obtain();
                com.tencent.mm.plugin.card.ui.r0 r0Var = new com.tencent.mm.plugin.card.ui.r0(null);
                r0Var.f95142a = com.tencent.mm.plugin.card.ui.q0.onShowTimeExpired;
                obtain.obj = r0Var;
                ((com.tencent.mm.plugin.card.ui.b0) mVar).W.sendMessage(obtain);
            }
        }
        return true;
    }
}
