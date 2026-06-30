package pp4;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout f357509d;

    public a(com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout) {
        this.f357509d = timelineEditorBaseVideoPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f357509d.getPluginLayout().setVisibility(4);
    }
}
