package rp4;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout f398686d;

    public s(com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout) {
        this.f398686d = editorVideoCompositionPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout.R;
        com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout = this.f398686d;
        ct0.b captureInfo = editorVideoCompositionPluginLayout.getCaptureInfo();
        com.tencent.mm.vfs.w6.h(captureInfo != null ? captureInfo.f222209f : null);
        ct0.b captureInfo2 = editorVideoCompositionPluginLayout.getCaptureInfo();
        com.tencent.mm.vfs.w6.h(captureInfo2 != null ? captureInfo2.f222204a : null);
    }
}
