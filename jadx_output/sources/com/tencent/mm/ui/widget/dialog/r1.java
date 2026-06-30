package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes10.dex */
public class r1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.x1 f211960d;

    public r1(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.ui.widget.dialog.x1 x1Var) {
        this.f211960d = x1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.x1 x1Var = this.f211960d;
        if (x1Var != null) {
            ((c61.a7) x1Var).a(false, null);
        }
    }
}
