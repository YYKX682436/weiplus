package z83;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f470745e;

    public l(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI, int i17) {
        this.f470744d = kidsWatchRegGetInfoUI;
        this.f470745e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.f143139t;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470744d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(kidsWatchRegGetInfoUI.T6().f443998j.getHeight());
        int i18 = this.f470745e;
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i18));
        if (kidsWatchRegGetInfoUI.T6().f443998j.getHeight() > i18) {
            kidsWatchRegGetInfoUI.T6().f444004p.scrollBy(0, kidsWatchRegGetInfoUI.T6().f443998j.getHeight() - i18);
        }
    }
}
