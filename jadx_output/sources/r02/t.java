package r02;

/* loaded from: classes8.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f368333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.r0 f368334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI f368335f;

    public t(com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI, h02.a aVar, com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        this.f368335f = downloadMainUI;
        this.f368333d = aVar;
        this.f368334e = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.model.r0 r0Var = this.f368334e;
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = this.f368335f;
        h02.a aVar = this.f368333d;
        if (aVar == null) {
            com.tencent.mm.plugin.downloader_app.model.o.b(downloadMainUI, r0Var, true);
            return;
        }
        int i17 = aVar.field_status;
        if (i17 == 1) {
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.downloader_app.model.o.f(downloadMainUI, com.tencent.mm.plugin.downloader.model.m0.d(r0Var.f97317f), r0Var, false, null);
        } else {
            com.tencent.mm.plugin.downloader_app.model.o.b(downloadMainUI, r0Var, true);
        }
    }
}
