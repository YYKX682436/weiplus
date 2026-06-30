package zu3;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer f475807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475808e;

    public h(com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer, android.view.View view) {
        this.f475807d = editorItemContainer;
        this.f475808e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f475807d;
        editorItemContainer.f156127p.removeView(editorItemContainer.f156136y);
        yz5.l itemChangeListener = editorItemContainer.getItemChangeListener();
        if (itemChangeListener != null) {
            itemChangeListener.invoke(editorItemContainer.f156136y);
        }
        editorItemContainer.f156136y = null;
        editorItemContainer.B = null;
        android.view.View view = this.f475808e;
        if (view instanceof zu3.z) {
            editorItemContainer.setLocationView(null);
        } else if (view instanceof zu3.v) {
            editorItemContainer.setLyricsView(null);
        } else if (view instanceof zu3.c0) {
            editorItemContainer.setTipItemView(null);
        }
    }
}
