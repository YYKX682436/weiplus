package zu3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer f475806d;

    public g(com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer) {
        this.f475806d = editorItemContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f475806d;
        android.view.View view = editorItemContainer.B;
        if (view != null) {
            kotlin.jvm.internal.o.d(view);
            editorItemContainer.h(view, false);
        }
    }
}
