package wu3;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449806d;

    public u(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView) {
        this.f449806d = editorAudioSearchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView = this.f449806d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) editorAudioSearchView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editorAudioSearchView.f155957n, 0);
        }
    }
}
