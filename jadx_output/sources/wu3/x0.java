package wu3;

/* loaded from: classes10.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView f449827d;

    public x0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView) {
        this.f449827d = editorInputView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = this.f449827d;
        if (editorInputView.getMode() == 0 || editorInputView.getMode() == 2) {
            android.text.Editable text = editorInputView.f156000o.getText();
            wu3.a1 textCallback = editorInputView.getTextCallback();
            if (textCallback != null) {
                textCallback.a(text, editorInputView.f156011z, editorInputView.A, editorInputView.C);
            }
            editorInputView.f156000o.clearFocus();
        } else if (editorInputView.getMode() == 1) {
            android.text.Editable text2 = editorInputView.f156008w.getText();
            wu3.b1 tipCallback = editorInputView.getTipCallback();
            if (tipCallback != null) {
                ((yt3.o) tipCallback).a(text2, -1, 0, editorInputView.C);
            }
            editorInputView.f156008w.clearFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
