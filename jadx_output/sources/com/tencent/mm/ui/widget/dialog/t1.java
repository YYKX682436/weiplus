package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes11.dex */
public class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.v1 f211976d;

    public t1(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.ui.widget.dialog.v1 v1Var) {
        this.f211976d = v1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.v1 v1Var = this.f211976d;
        if (v1Var != null) {
            v1Var.a(false, null, dialogInterface == null ? false : ((com.tencent.mm.ui.widget.dialog.j0) dialogInterface).f211838s.isChecked());
        }
    }
}
