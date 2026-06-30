package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f157983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f157984e;

    public v(com.tencent.mm.plugin.remittance.ui.b0 b0Var, android.widget.EditText editText) {
        this.f157984e = b0Var;
        this.f157983d = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.widget.EditText editText = this.f157983d;
        if (editText.length() > 0) {
            com.tencent.mm.plugin.remittance.ui.b0 b0Var = this.f157984e;
            if (b0Var.f157641b != null) {
                dialogInterface.dismiss();
                b0Var.f157641b.onINputName(editText.getText().toString());
            }
        }
    }
}
