package wu3;

/* loaded from: classes10.dex */
public final class u0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f449807d;

    public u0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView) {
        this.f449807d = editorInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f449807d;
        if (editable == null) {
            editorInputView.f156009x.setVisibility(8);
            return;
        }
        int length = editorInputView.f155996h - editable.length();
        editorInputView.getConfirm().setEnabled(length >= 0 && editorInputView.f156008w.getLineCount() <= editorInputView.f155997i);
        if (length >= 0) {
            editorInputView.f156009x.setVisibility(8);
        } else {
            editorInputView.f156009x.setVisibility(0);
            editorInputView.f156009x.setText(java.lang.String.valueOf(length));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
