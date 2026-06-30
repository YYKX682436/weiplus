package xn4;

/* loaded from: classes11.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI f455634a;

    public m(com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI) {
        this.f455634a = xUpdateDownloadUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        int i17 = com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI.f175512q;
        com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI = this.f455634a;
        xUpdateDownloadUI.c7();
        xn4.c0 c0Var = xn4.c0.f455604a;
        java.lang.String cdnUrl = xUpdateDownloadUI.V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(c0Var.g(cdnUrl));
        java.lang.String cdnUrl2 = xUpdateDownloadUI.V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl2, "cdnUrl");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_FILE_NAME").remove(cdnUrl2);
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_MEDIA_ID").remove(cdnUrl2);
        xUpdateDownloadUI.finish();
    }
}
