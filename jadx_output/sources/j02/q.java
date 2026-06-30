package j02;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f297010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f297011e;

    public q(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, long j17) {
        this.f297010d = gameCloudAppDownloadUI;
        this.f297011e = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.f97220m;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f297010d;
        gameCloudAppDownloadUI.W6().f16812k.setVisibility(8);
        ((uz.c2) ((vz.a2) i95.n0.c(vz.a2.class))).wi(gameCloudAppDownloadUI.getContext(), this.f297011e, true, true, new j02.p());
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
