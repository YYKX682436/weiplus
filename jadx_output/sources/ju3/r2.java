package ju3;

/* loaded from: classes10.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout f302008d;

    public r2(com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout) {
        this.f302008d = webviewScreenShotPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout = this.f302008d;
        android.content.Context context = webviewScreenShotPluginLayout.getContext();
        if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) != null) {
            android.content.Context context2 = webviewScreenShotPluginLayout.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
            com.tencent.mm.ui.widget.snackbar.j.c(webviewScreenShotPluginLayout.getContext().getString(com.tencent.mm.R.string.f_p), null, (android.app.Activity) context2, null, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "report share");
        com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct webviewFullSnapshotActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct();
        webviewFullSnapshotActionReportStruct.f62947e = 3L;
        webviewFullSnapshotActionReportStruct.f62949g = 1L;
        qk.o9 o9Var = webviewScreenShotPluginLayout.getEditPhotoWrapper().f465360i;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        kotlin.jvm.internal.o.d(b17);
        webviewFullSnapshotActionReportStruct.f62948f = (((f65.r) b17).g() && webviewScreenShotPluginLayout.getEditPhotoWrapper().b()) ? 1L : 0L;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = webviewScreenShotPluginLayout.getConfigProvider();
        webviewFullSnapshotActionReportStruct.p(configProvider != null ? configProvider.W : null);
        webviewFullSnapshotActionReportStruct.k();
    }
}
