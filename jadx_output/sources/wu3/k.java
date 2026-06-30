package wu3;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449771d;

    public k(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView) {
        this.f449771d = editorAudioSearchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.EditText editText;
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView = this.f449771d;
        android.widget.EditText editText2 = editorAudioSearchView.f155957n;
        boolean z17 = false;
        if (editText2 != null && (text = editText2.getText()) != null) {
            if (!(text.length() == 0)) {
                z17 = true;
            }
        }
        if (z17 && (editText = editorAudioSearchView.f155957n) != null) {
            editText.setText((java.lang.CharSequence) null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
