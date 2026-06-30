package j02;

/* loaded from: classes8.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f297015d;

    public u(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI) {
        this.f297015d = gameCloudAppDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f297015d;
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = gameCloudAppDownloadUI.f97224g;
        if (cloudGameAppInfoWrapper == null) {
            kotlin.jvm.internal.o.o("mAppInfoWrapper");
            throw null;
        }
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.T6(gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f96934h);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
