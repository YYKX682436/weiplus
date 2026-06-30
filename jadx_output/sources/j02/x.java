package j02;

/* loaded from: classes8.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f297018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f297019e;

    public x(long j17, com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI) {
        this.f297018d = j17;
        this.f297019e = gameCloudAppDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k02.l.a(this.f297018d, false, null);
        k02.s sVar = k02.s.f303102a;
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = this.f297019e.f97224g;
        if (cloudGameAppInfoWrapper == null) {
            kotlin.jvm.internal.o.o("mAppInfoWrapper");
            throw null;
        }
        java.lang.String str = cloudGameAppInfoWrapper.f96931e;
        if (cloudGameAppInfoWrapper == null) {
            kotlin.jvm.internal.o.o("mAppInfoWrapper");
            throw null;
        }
        java.lang.String str2 = cloudGameAppInfoWrapper.f96934h.f96917f;
        if (cloudGameAppInfoWrapper == null) {
            kotlin.jvm.internal.o.o("mAppInfoWrapper");
            throw null;
        }
        sVar.c(44L, str, str2, cloudGameAppInfoWrapper.f96932f);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
