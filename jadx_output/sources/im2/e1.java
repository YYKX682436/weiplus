package im2;

/* loaded from: classes3.dex */
public final class e1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292303d;

    public e1(im2.z3 z3Var) {
        this.f292303d = z3Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        im2.z3 z3Var = this.f292303d;
        z3Var.f292652m2 = true;
        z3Var.R6();
        java.lang.String obj = z3Var.d7().getText().toString();
        if (r26.n0.D(obj, "\n\n", false, 2, null)) {
            int selectionEnd = z3Var.d7().getSelectionEnd();
            z3Var.d7().setText(r26.i0.t(obj, "\n\n", "\n", false));
            com.tencent.mm.ui.widget.MMEditText d76 = z3Var.d7();
            int i17 = selectionEnd - 1;
            if (i17 < 0) {
                i17 = 0;
            }
            d76.setSelection(i17);
        } else if (r26.i0.y(obj, "\n", false)) {
            int selectionEnd2 = z3Var.d7().getSelectionEnd();
            z3Var.d7().setText(r26.n0.W(obj, "\n"));
            com.tencent.mm.ui.widget.MMEditText d77 = z3Var.d7();
            int i18 = selectionEnd2 - 1;
            if (i18 < 0) {
                i18 = 0;
            }
            d77.setSelection(i18);
        }
        com.tencent.mm.ui.widget.MMEditText d78 = z3Var.d7();
        kotlin.jvm.internal.o.f(d78, "access$getMEditView(...)");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) z3Var.E).getValue();
        kotlin.jvm.internal.o.f(textView, "access$getMLimitText(...)");
        ck5.f b17 = ck5.f.b(d78);
        b17.f42561f = 0;
        int i19 = z3Var.O1;
        b17.f42560e = i19;
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        b17.f42556a = true;
        b17.d(new im2.d0(textView, i19, 10));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
