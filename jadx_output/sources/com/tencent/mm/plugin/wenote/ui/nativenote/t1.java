package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class t1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.o1 f188273d;

    public t1(com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var) {
        this.f188273d = o1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var = this.f188273d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = o1Var.f188247d.f188244d.V1;
        if (u3Var != null) {
            u3Var.dismiss();
            o1Var.f188247d.f188244d.V1 = null;
        }
    }
}
