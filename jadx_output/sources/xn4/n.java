package xn4;

/* loaded from: classes11.dex */
public final class n implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI f455635a;

    public n(com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI) {
        this.f455635a = xUpdateDownloadUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI = this.f455635a;
        xUpdateDownloadUI.b7();
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "hideToDownloadDialog: ");
        ym5.a1.f(new xn4.j(xUpdateDownloadUI));
        xUpdateDownloadUI.d7();
    }
}
