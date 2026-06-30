package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes10.dex */
public class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.x1 f211951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f211952e;

    public q1(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.ui.widget.dialog.x1 x1Var) {
        this.f211952e = u1Var;
        this.f211951d = x1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.x1 x1Var = this.f211951d;
        if (x1Var != null) {
            this.f211952e.getClass();
            ((c61.a7) x1Var).a(true, null);
        }
    }
}
