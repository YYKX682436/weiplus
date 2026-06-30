package j02;

/* loaded from: classes.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f297021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dm.t3 f297022e;

    public z(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, dm.t3 t3Var) {
        this.f297021d = gameCloudAppDownloadUI;
        this.f297022e = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k02.l.d(this.f297021d.getContext(), this.f297022e.field_appId, j02.y.f297020a);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
