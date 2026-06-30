package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f158058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f158059e;

    public z(com.tencent.mm.plugin.remittance.ui.b0 b0Var, android.widget.EditText editText) {
        this.f158059e = b0Var;
        this.f158058d = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.widget.EditText editText = this.f158058d;
        if (editText.length() > 0) {
            com.tencent.mm.plugin.remittance.ui.b0 b0Var = this.f158059e;
            if (b0Var.f157641b != null) {
                dialogInterface.dismiss();
                b0Var.f157641b.onINputName(editText.getText().toString());
            }
        }
    }
}
