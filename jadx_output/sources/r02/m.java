package r02;

/* loaded from: classes8.dex */
public class m implements r02.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI f368313a;

    public m(com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI) {
        this.f368313a = downloadMainUI;
    }

    public void a(boolean z17) {
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = this.f368313a;
        if (z17) {
            downloadMainUI.f97373e.setVisibility(0);
            downloadMainUI.f97373e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(downloadMainUI, com.tencent.mm.R.anim.f477750ad));
            downloadMainUI.f97374f.setVisibility(0);
            downloadMainUI.f97374f.startAnimation(android.view.animation.AnimationUtils.loadAnimation(downloadMainUI, com.tencent.mm.R.anim.f477917f5));
            return;
        }
        downloadMainUI.f97373e.setVisibility(8);
        downloadMainUI.f97373e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(downloadMainUI, com.tencent.mm.R.anim.f477751ae));
        downloadMainUI.f97374f.setVisibility(8);
        downloadMainUI.f97374f.startAnimation(android.view.animation.AnimationUtils.loadAnimation(downloadMainUI, com.tencent.mm.R.anim.f477918f6));
    }
}
