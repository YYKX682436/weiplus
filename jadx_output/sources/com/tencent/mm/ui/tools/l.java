package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class l implements al5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ActionBarSearchView f210537a;

    public l(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView) {
        this.f210537a = actionBarSearchView;
    }

    public void a(android.widget.EditText editText, int i17, int i18) {
        android.widget.EditText editText2;
        com.tencent.mm.ui.tools.vd vdVar = this.f210537a.f209966i;
        if (vdVar.f210858e && (editText2 = (android.widget.EditText) vdVar.f210855b.get()) != null && editText == editText2) {
            android.text.Editable text = editText2.getText();
            int selectionStart = editText2.getSelectionStart();
            int selectionEnd = editText2.getSelectionEnd();
            if (selectionStart < 0 || selectionEnd < selectionStart) {
                return;
            }
            if (selectionStart == selectionEnd) {
                com.tencent.mm.ui.tools.ud c17 = vdVar.c(text, selectionStart);
                if (c17 == null || !c17.f210831c) {
                    return;
                }
                editText2.setTextKeepState(text);
                editText2.setSelection(c17.f210829a + c17.f210830b);
                return;
            }
            com.tencent.mm.ui.tools.ud c18 = vdVar.c(text, selectionStart);
            if (c18 != null && c18.f210831c) {
                selectionStart = c18.f210829a + c18.f210830b;
            }
            if (selectionStart >= selectionEnd) {
                editText2.setTextKeepState(text);
                editText2.setSelection(selectionStart);
                return;
            }
            com.tencent.mm.ui.tools.ud c19 = vdVar.c(text, selectionEnd);
            if (c19 == null || !c19.f210831c) {
                return;
            }
            editText2.setTextKeepState(text);
            editText2.setSelection(selectionStart, c19.f210829a);
        }
    }
}
