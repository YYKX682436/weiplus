package yt3;

/* loaded from: classes3.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.q2 f465462d;

    public g2(yt3.q2 q2Var) {
        this.f465462d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout = (com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout) this.f465462d.f465608e;
        webviewScreenShotPluginLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "do Retransmit");
        webviewScreenShotPluginLayout.editPhotoWrapper.a(true, new ju3.o2(webviewScreenShotPluginLayout));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
