package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class b9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f206627d = false;

    public b9(com.tencent.mm.ui.contact.x8 x8Var) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (this.f206627d) {
            return;
        }
        this.f206627d = true;
        fo3.s.INSTANCE.O6(3, 2, 10);
    }
}
