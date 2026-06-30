package ju3;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout f302042d;

    public z(com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout editPhotoPluginLayout) {
        this.f302042d = editPhotoPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout editPhotoPluginLayout = this.f302042d;
        editPhotoPluginLayout.getEditCropPhotoPlugin().onClick(editPhotoPluginLayout);
    }
}
