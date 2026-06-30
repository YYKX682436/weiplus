package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ActionBarSearchView f210525d;

    public k(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView) {
        this.f210525d = actionBarSearchView;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        android.widget.EditText editText;
        com.tencent.mm.ui.tools.ud c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        boolean z17 = false;
        if (i17 != 67) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        com.tencent.mm.ui.tools.vd vdVar = this.f210525d.f209966i;
        if (vdVar.f210858e && (editText = (android.widget.EditText) vdVar.f210855b.get()) != null && vdVar.f210854a != null) {
            android.text.Editable text = editText.getText();
            int selectionStart = editText.getSelectionStart();
            if (selectionStart == editText.getSelectionEnd() && (c17 = vdVar.c(text, selectionStart)) != null && c17.f210831c) {
                int i18 = c17.f210830b;
                int i19 = c17.f210829a;
                text.delete(i19, i18 + i19);
                editText.setTextKeepState(text);
                editText.setSelection(i19);
                z17 = true;
            }
        }
        yj0.a.i(z17, this, "com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return z17;
    }
}
