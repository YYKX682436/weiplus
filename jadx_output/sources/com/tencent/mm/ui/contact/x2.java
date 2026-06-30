package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class x2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f207244d;

    public x2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI, com.tencent.mm.ui.contact.h2 h2Var) {
        this.f207244d = contactRemarkInfoModUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.T1;
        this.f207244d.Y6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
