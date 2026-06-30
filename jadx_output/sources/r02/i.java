package r02;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r02.j f368304d;

    public i(r02.j jVar) {
        this.f368304d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r02.j jVar = this.f368304d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(jVar.f368306a);
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = jVar.f368307b;
        if (!K0) {
            java.util.HashMap hashMap = (java.util.HashMap) downloadMainUI.f97377i.f97307b;
            java.lang.String str = jVar.f368306a;
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) hashMap.get(str);
            if (r0Var != null) {
                com.tencent.mm.plugin.downloader_app.model.s0.a(str);
                com.tencent.mm.ipcinvoker.w0.d(new r02.h(this, r0Var), 200L);
            } else {
                db5.e1.s(downloadMainUI, "", downloadMainUI.getResources().getString(com.tencent.mm.R.string.h9x));
            }
        }
        downloadMainUI.V6(downloadMainUI.f97377i, true);
    }
}
