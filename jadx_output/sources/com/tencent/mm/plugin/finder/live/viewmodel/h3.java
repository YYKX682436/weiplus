package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class h3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f117126d;

    public h3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var) {
        this.f117126d = m3Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var = this.f117126d;
        m3Var.getClass();
        m3Var.f117241e = valueOf;
        m3Var.W6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
