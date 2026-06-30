package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f197841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.EditPreference f197842e;

    public m(com.tencent.mm.ui.base.preference.EditPreference editPreference, android.widget.EditText editText) {
        this.f197842e = editPreference;
        this.f197841d = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.base.preference.EditPreference editPreference = this.f197842e;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = editPreference.N;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        editPreference.P = this.f197841d.getText().toString();
        com.tencent.mm.ui.base.preference.o oVar = editPreference.M;
        if (oVar != null) {
            oVar.a(true);
        }
        com.tencent.mm.ui.base.preference.q0 q0Var = editPreference.L;
        if (q0Var != null) {
            q0Var.a(editPreference, editPreference.P);
        }
    }
}
