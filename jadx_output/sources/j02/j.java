package j02;

/* loaded from: classes8.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f296997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper f296998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f296999f;

    public j(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f296997d = gameCloudAppDownloadUI;
        this.f296998e = cloudGameAppInfoWrapper;
        this.f296999f = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f296997d;
        gameCloudAppDownloadUI.f97222e = true;
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f296998e;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.V6(gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f96933g, cloudGameAppInfoWrapper.f96932f, cloudGameAppInfoWrapper.f96931e, false);
        this.f296999f.B();
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.U6(gameCloudAppDownloadUI, gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f96930d);
        k02.s.f303102a.c(40L, cloudGameAppInfoWrapper.f96931e, cloudGameAppInfoWrapper.f96934h.f96917f, cloudGameAppInfoWrapper.f96932f);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
