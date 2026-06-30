package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class r implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f157906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f157907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f157908f;

    public r(com.tencent.mm.plugin.remittance.ui.b0 b0Var, com.tencent.mm.ui.widget.dialog.u1 u1Var, android.widget.EditText editText) {
        this.f157908f = b0Var;
        this.f157906d = u1Var;
        this.f157907e = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = this.f157906d;
        if (u1Var.f211998c != null) {
            if (this.f157907e.length() > 0) {
                u1Var.f211998c.B(this.f157908f.f157640a.getResources().getColor(com.tencent.mm.R.color.Link_100));
                u1Var.f211998c.f(-1).setEnabled(true);
            } else {
                u1Var.f211998c.B(-2141754475);
                u1Var.f211998c.f(-1).setEnabled(false);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
