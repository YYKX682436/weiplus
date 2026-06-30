package r02;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r02.r f368319d;

    public p(r02.r rVar) {
        this.f368319d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = this.f368319d.f368323d;
        downloadMainUI.V6(downloadMainUI.f97377i, false);
    }
}
