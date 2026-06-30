package wu3;

/* loaded from: classes10.dex */
public final class v0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f449809d;

    public v0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView) {
        this.f449809d = editorInputView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (this.f449809d.getPanelActionCallback() != null) {
            nu3.i.c(nu3.i.f340218a, "KEY_CLICK_NEW_LINE_COUNT", 0, 2, null);
        }
        return false;
    }
}
