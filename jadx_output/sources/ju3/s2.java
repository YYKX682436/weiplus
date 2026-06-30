package ju3;

/* loaded from: classes10.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout f302014d;

    public s2(com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout) {
        this.f302014d = webviewScreenShotPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout = this.f302014d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = webviewScreenShotPluginLayout.getConfigProvider();
        com.tencent.mm.vfs.w6.h(configProvider != null ? configProvider.D : null);
        com.tencent.mm.vfs.w6.h((java.lang.String) ((jz5.n) webviewScreenShotPluginLayout.getEditPhotoWrapper().f465359h).getValue());
    }
}
