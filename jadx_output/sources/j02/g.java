package j02;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f296990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper f296991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f296992f;

    public g(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f296990d = gameCloudAppDownloadUI;
        this.f296991e = cloudGameAppInfoWrapper;
        this.f296992f = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f296991e;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.V6(this.f296990d, cloudGameAppInfoWrapper.f96933g, cloudGameAppInfoWrapper.f96932f, cloudGameAppInfoWrapper.f96931e, true);
        this.f296992f.B();
        k02.s.f303102a.c(4L, cloudGameAppInfoWrapper.f96931e, cloudGameAppInfoWrapper.f96934h.f96917f, cloudGameAppInfoWrapper.f96932f);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
