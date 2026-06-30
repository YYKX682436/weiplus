package j02;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f297000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper f297001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f297002f;

    public k(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f297000d = gameCloudAppDownloadUI;
        this.f297001e = cloudGameAppInfoWrapper;
        this.f297002f = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f297001e;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.V6(this.f297000d, cloudGameAppInfoWrapper.f96933g, cloudGameAppInfoWrapper.f96932f, cloudGameAppInfoWrapper.f96931e, true);
        this.f297002f.B();
        k02.s.f303102a.c(4L, cloudGameAppInfoWrapper.f96931e, cloudGameAppInfoWrapper.f96934h.f96917f, cloudGameAppInfoWrapper.f96932f);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
