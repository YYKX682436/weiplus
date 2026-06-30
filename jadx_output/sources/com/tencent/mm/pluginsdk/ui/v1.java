package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public class v1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.z1 f192031d;

    public v1(com.tencent.mm.pluginsdk.ui.z1 z1Var, com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView) {
        this.f192031d = z1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.pluginsdk.ui.z1 z1Var = this.f192031d;
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = z1Var.f192104e;
        int i27 = com.tencent.mm.pluginsdk.ui.MultiSelectContactView.f189783x;
        multiSelectContactView.b();
        com.tencent.mm.pluginsdk.ui.b2 b2Var = z1Var.f192104e.f189789i;
        if (b2Var != null) {
            b2Var.L(charSequence.toString());
        }
    }
}
