package r02;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r02.r f368321d;

    public q(r02.r rVar) {
        this.f368321d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = this.f368321d.f368323d;
        if (downloadMainUI.f97381p == null) {
            android.view.View findViewById = downloadMainUI.findViewById(com.tencent.mm.R.id.imn);
            downloadMainUI.f97381p = findViewById;
            downloadMainUI.f97381p = ((android.view.ViewStub) findViewById).inflate();
        }
        android.view.View view = downloadMainUI.f97381p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
