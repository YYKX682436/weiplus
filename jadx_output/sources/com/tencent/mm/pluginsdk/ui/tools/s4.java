package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes11.dex */
public abstract class s4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public al5.o1 f191896d = null;

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        al5.o1 o1Var = this.f191896d;
        if (o1Var != null) {
            com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = ((com.tencent.mm.ui.contact.w5) o1Var).f207229a;
            if (modRemarkNameUI.f206468d.getText().toString().trim().length() > 0) {
                modRemarkNameUI.enableOptionMenu(true);
            }
        }
    }
}
