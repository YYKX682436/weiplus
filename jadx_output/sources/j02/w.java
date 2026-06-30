package j02;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f297016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f297017e;

    public w(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, long j17) {
        this.f297016d = gameCloudAppDownloadUI;
        this.f297017e = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.f97220m;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f297016d;
        gameCloudAppDownloadUI.W6().f16812k.setVisibility(0);
        vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
        androidx.appcompat.app.AppCompatActivity context = gameCloudAppDownloadUI.getContext();
        long j17 = this.f297017e;
        j02.v vVar = new j02.v();
        ((uz.c2) a2Var).getClass();
        com.tencent.mm.plugin.downloader.model.j1.f(context, j17, false, false, false, vVar);
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = gameCloudAppDownloadUI.f97224g;
        if (cloudGameAppInfoWrapper == null) {
            kotlin.jvm.internal.o.o("mAppInfoWrapper");
            throw null;
        }
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.V6(gameCloudAppDownloadUI, cloudGameAppInfoWrapper.f96933g, cloudGameAppInfoWrapper.f96932f, cloudGameAppInfoWrapper.f96931e, false);
        k02.s sVar = k02.s.f303102a;
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper2 = gameCloudAppDownloadUI.f97224g;
        if (cloudGameAppInfoWrapper2 == null) {
            kotlin.jvm.internal.o.o("mAppInfoWrapper");
            throw null;
        }
        sVar.c(23L, cloudGameAppInfoWrapper2.f96931e, cloudGameAppInfoWrapper2.f96934h.f96917f, cloudGameAppInfoWrapper2.f96932f);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
