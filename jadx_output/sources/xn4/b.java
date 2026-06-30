package xn4;

/* loaded from: classes11.dex */
public final class b implements xn4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI f455600a;

    public b(com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI dialogDownloadUI) {
        this.f455600a = dialogDownloadUI;
    }

    @Override // xn4.q
    public void a(java.lang.String mediaId, double d17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadProgress: " + d17);
        xn4.c0 c0Var = xn4.c0.f455604a;
        com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI dialogDownloadUI = this.f455600a;
        java.lang.String cdnUrl = dialogDownloadUI.V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        c0Var.i(cdnUrl, 1);
        dialogDownloadUI.X6(d17);
    }

    @Override // xn4.q
    public void b(java.lang.String mediaId, r45.mm6 info) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(info, "info");
        xn4.c0 c0Var = xn4.c0.f455604a;
        com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI dialogDownloadUI = this.f455600a;
        java.lang.String cdnUrl = dialogDownloadUI.V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        c0Var.i(cdnUrl, 4);
        dialogDownloadUI.a7(mediaId, info);
    }

    @Override // xn4.q
    public void c(java.lang.String mediaId, java.lang.String path) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadSuccess: ".concat(path));
        xn4.c0 c0Var = xn4.c0.f455604a;
        com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI dialogDownloadUI = this.f455600a;
        java.lang.String cdnUrl = dialogDownloadUI.V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        c0Var.i(cdnUrl, 2);
        dialogDownloadUI.Y6(dialogDownloadUI.V6());
    }

    @Override // xn4.q
    public void d(java.lang.String mediaId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "onDownloadFail: ".concat(msg));
        xn4.c0 c0Var = xn4.c0.f455604a;
        com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI dialogDownloadUI = this.f455600a;
        java.lang.String cdnUrl = dialogDownloadUI.V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        c0Var.i(cdnUrl, 0);
        java.lang.String cdnUrl2 = dialogDownloadUI.V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl2, "cdnUrl");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_FILE_NAME").remove(cdnUrl2);
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_MEDIA_ID").remove(cdnUrl2);
        dialogDownloadUI.W6(msg);
    }
}
