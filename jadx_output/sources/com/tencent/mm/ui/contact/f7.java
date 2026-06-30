package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class f7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f206706d = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.contact.e7(this), false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f206707e;

    public f7(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f206707e = onlyChatContactMgrUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f206706d;
        b4Var.d();
        b4Var.c(500L, 500L);
    }
}
