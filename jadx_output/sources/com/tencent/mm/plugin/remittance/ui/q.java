package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class q implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f157880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f157881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f157882f;

    public q(com.tencent.mm.plugin.remittance.ui.b0 b0Var, android.widget.EditText editText, com.tencent.mm.ui.widget.dialog.j0 j0Var) {
        this.f157882f = b0Var;
        this.f157880d = editText;
        this.f157881e = j0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = this.f157880d.length();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f157881e;
        if (length > 0) {
            j0Var.B(this.f157882f.f157640a.getResources().getColor(com.tencent.mm.R.color.Link_100));
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
