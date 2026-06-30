package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes3.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 f156326d;

    public y0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var) {
        this.f156326d = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.EditText editText;
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchInputViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var = this.f156326d;
        android.widget.EditText editText2 = b1Var.f156174o;
        boolean z17 = false;
        if (editText2 != null && (text = editText2.getText()) != null) {
            if (!(text.length() == 0)) {
                z17 = true;
            }
        }
        if (z17 && (editText = b1Var.f156174o) != null) {
            editText.setText((java.lang.CharSequence) null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchInputViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
