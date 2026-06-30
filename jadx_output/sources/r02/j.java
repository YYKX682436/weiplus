package r02;

/* loaded from: classes8.dex */
public class j implements com.tencent.mm.plugin.downloader_app.model.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI f368307b;

    public j(com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI, java.lang.String str) {
        this.f368307b = downloadMainUI;
        this.f368306a = str;
    }

    @Override // com.tencent.mm.plugin.downloader_app.model.p0
    public void a(boolean z17) {
        com.tencent.mm.ipcinvoker.w0.c(true, new r02.g(this));
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = this.f368307b;
        if (z17) {
            downloadMainUI.f97377i = com.tencent.mm.plugin.downloader_app.model.q0.a();
            com.tencent.mm.sdk.platformtools.u3.h(new r02.i(this));
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f368306a)) {
                return;
            }
            db5.e1.s(downloadMainUI, "", downloadMainUI.getResources().getString(com.tencent.mm.R.string.awx));
        }
    }
}
