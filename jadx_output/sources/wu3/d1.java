package wu3;

/* loaded from: classes10.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f449727d;

    public d1(com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView) {
        this.f449727d = editorInputView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f449727d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) editorInputView.getContext().getSystemService("input_method");
        if (editorInputView.getMode() == 0 || editorInputView.getMode() == 2) {
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(editorInputView.f156000o, 0);
            }
        } else if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editorInputView.f156008w, 0);
        }
    }
}
