package wu3;

/* loaded from: classes5.dex */
public final class p implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449789d;

    public p(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView) {
        this.f449789d = editorAudioSearchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (3 != i17) {
            return false;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView = this.f449789d;
        java.lang.String str = editorAudioSearchView.f155968y;
        if (str != null) {
            java.lang.CharSequence text = textView.getText();
            if (!com.tencent.mm.sdk.platformtools.t8.D0(str, text != null ? text.toString() : null)) {
                editorAudioSearchView.f();
                wt3.u uVar = wt3.v.f449504h;
                wt3.v.f449506j.f61552e = 2L;
                uVar.a();
                wt3.v.f449506j.f61556i = editorAudioSearchView.getMRelatedRecId();
            }
        }
        java.lang.CharSequence text2 = textView.getText();
        editorAudioSearchView.f155968y = text2 != null ? text2.toString() : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(editorAudioSearchView.f155968y)) {
            return false;
        }
        editorAudioSearchView.e();
        return false;
    }
}
