package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class x implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f158023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f158024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f158025f;

    public x(com.tencent.mm.plugin.remittance.ui.b0 b0Var, android.widget.EditText editText, com.tencent.mm.ui.widget.dialog.j0 j0Var) {
        this.f158025f = b0Var;
        this.f158023d = editText;
        this.f158024e = j0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = this.f158023d.length();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f158024e;
        if (length > 0) {
            j0Var.B(this.f158025f.f157640a.getResources().getColor(com.tencent.mm.R.color.Link_100));
        } else {
            j0Var.B(-2141754475);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
