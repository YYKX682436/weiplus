package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class h2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f206751d;

    public h2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f206751d = contactRemarkInfoModUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int f17 = com.tencent.mm.ui.tools.v4.f(editable.toString());
        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "afterTextChanged() MAX_REMARK_NAME_LENGTH:%s curLength:%s", 64, java.lang.Integer.valueOf(f17));
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = this.f206751d;
        if (f17 >= 64) {
            contactRemarkInfoModUI.H1.setVisibility(8);
        }
        int i17 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.T1;
        contactRemarkInfoModUI.Y6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
