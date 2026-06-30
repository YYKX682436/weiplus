package ju3;

/* loaded from: classes10.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew f301865d;

    public b0(com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew editorVideoPluginLayoutNew) {
        this.f301865d = editorVideoPluginLayoutNew;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew editorVideoPluginLayoutNew = this.f301865d;
        ct0.b captureInfo = editorVideoPluginLayoutNew.getCaptureInfo();
        com.tencent.mm.vfs.w6.h(captureInfo != null ? captureInfo.f222209f : null);
        ct0.b captureInfo2 = editorVideoPluginLayoutNew.getCaptureInfo();
        com.tencent.mm.vfs.w6.h(captureInfo2 != null ? captureInfo2.f222204a : null);
    }
}
