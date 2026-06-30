package j02;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f296986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f296987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper f296988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f296989g;

    public f(boolean z17, h02.a aVar, com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper, com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI) {
        this.f296986d = z17;
        this.f296987e = aVar;
        this.f296988f = cloudGameAppInfoWrapper;
        this.f296989g = gameCloudAppDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f296986d;
        k02.s sVar = k02.s.f303102a;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f296989g;
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f296988f;
        if (z17) {
            h02.a aVar = this.f296987e;
            if (aVar != null) {
                k02.l.a(aVar.field_downloadId, false, null);
                sVar.c(44L, cloudGameAppInfoWrapper.f96931e, cloudGameAppInfoWrapper.f96934h.f96917f, cloudGameAppInfoWrapper.f96932f);
            }
        } else {
            com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.T6(gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f96934h);
            sVar.c(23L, cloudGameAppInfoWrapper.f96931e, cloudGameAppInfoWrapper.f96934h.f96917f, cloudGameAppInfoWrapper.f96932f);
        }
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.V6(gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f96933g, cloudGameAppInfoWrapper.f96932f, cloudGameAppInfoWrapper.f96931e, false);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
