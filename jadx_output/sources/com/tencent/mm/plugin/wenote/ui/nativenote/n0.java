package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes3.dex */
public class n0 implements android.view.View.OnClickListener {
    public n0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.i7();
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
