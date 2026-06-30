package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class b8 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f198720d;

    public b8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        this.f198720d = y8Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.chatting.component.gp gpVar = this.f198720d.f200305z;
        if (gpVar != null) {
            gpVar.c();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
