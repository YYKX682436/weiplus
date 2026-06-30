package xn4;

/* loaded from: classes11.dex */
public final class o implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI f455636a;

    public o(com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI) {
        this.f455636a = xUpdateDownloadUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        int i17 = com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI.f175512q;
        com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI = this.f455636a;
        xUpdateDownloadUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "hideToDownloadDialog: ");
        ym5.a1.f(new xn4.j(xUpdateDownloadUI));
        xUpdateDownloadUI.finish();
    }
}
