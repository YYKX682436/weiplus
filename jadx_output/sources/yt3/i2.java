package yt3;

/* loaded from: classes10.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.q2 f465496d;

    public i2(yt3.q2 q2Var) {
        this.f465496d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout = (com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout) this.f465496d.f465608e;
        webviewScreenShotPluginLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "report Save");
        com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct webviewFullSnapshotActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct();
        webviewFullSnapshotActionReportStruct.f62947e = 5L;
        webviewFullSnapshotActionReportStruct.f62949g = 1L;
        yt3.b2 b2Var = webviewScreenShotPluginLayout.editPhotoWrapper;
        qk.o9 o9Var = b2Var.f465360i;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        kotlin.jvm.internal.o.d(b17);
        webviewFullSnapshotActionReportStruct.f62948f = (((f65.r) b17).g() && b2Var.b()) ? 1L : 0L;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = webviewScreenShotPluginLayout.configProvider;
        webviewFullSnapshotActionReportStruct.p(recordConfigProvider != null ? recordConfigProvider.W : null);
        webviewFullSnapshotActionReportStruct.k();
        b2Var.a(false, new ju3.p2(db5.e1.Q(webviewScreenShotPluginLayout.getContext(), webviewScreenShotPluginLayout.getContext().getString(com.tencent.mm.R.string.f490573yv), webviewScreenShotPluginLayout.getContext().getString(com.tencent.mm.R.string.bcr), true, true, ju3.q2.f302000d), webviewScreenShotPluginLayout));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
