package wu3;

/* loaded from: classes5.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f449773d;

    public k1(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder) {
        this.f449773d = editorPanelHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f449773d;
        editorPanelHolder.setVisibility(8);
        editorPanelHolder.f156014m = false;
    }
}
