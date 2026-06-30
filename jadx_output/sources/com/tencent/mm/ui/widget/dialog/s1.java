package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes11.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.v1 f211967d;

    public s1(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.ui.widget.dialog.v1 v1Var) {
        this.f211967d = v1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.v1 v1Var = this.f211967d;
        if (v1Var != null) {
            v1Var.a(true, dialogInterface == null ? null : ((com.tencent.mm.ui.widget.dialog.j0) dialogInterface).h(), dialogInterface == null ? false : ((com.tencent.mm.ui.widget.dialog.j0) dialogInterface).f211838s.isChecked());
        }
    }
}
