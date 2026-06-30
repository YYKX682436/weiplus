package ju3;

/* loaded from: classes10.dex */
public final class d1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout f301929d;

    public d1(com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout mediaTabCameraKitPluginLayout) {
        this.f301929d = mediaTabCameraKitPluginLayout;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onRequestPermissionsResult: click jump");
        dialogInterface.dismiss();
        this.f301929d.S = true;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
