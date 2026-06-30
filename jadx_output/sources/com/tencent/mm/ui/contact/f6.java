package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class f6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f206705d;

    public f6(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI, com.tencent.mm.ui.contact.v5 v5Var) {
        this.f206705d = modRemarkNameUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.tools.v4.b(400, editable.toString());
        int i17 = com.tencent.mm.ui.contact.ModRemarkNameUI.f206466y1;
        this.f206705d.X6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
