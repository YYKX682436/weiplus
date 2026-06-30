package j02;

/* loaded from: classes8.dex */
public final class d0 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f296983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper f296984b;

    public d0(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper) {
        this.f296983a = gameCloudAppDownloadUI;
        this.f296984b = cloudGameAppInfoWrapper;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f296984b;
        int i17 = cloudGameAppInfoWrapper.f96933g;
        java.lang.String str = cloudGameAppInfoWrapper.f96932f;
        java.lang.String str2 = cloudGameAppInfoWrapper.f96931e;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f296983a;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.V6(gameCloudAppDownloadUI, i17, str, str2, true);
        gameCloudAppDownloadUI.finish();
    }
}
