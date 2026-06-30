package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.w1 f211937d;

    public o1(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.ui.widget.dialog.w1 w1Var) {
        this.f211937d = w1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.w1 w1Var = this.f211937d;
        if (w1Var != null) {
            w1Var.a(false, null);
        }
    }
}
