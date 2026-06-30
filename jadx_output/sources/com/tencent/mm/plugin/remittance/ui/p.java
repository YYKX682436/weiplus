package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f157866d;

    public p(com.tencent.mm.plugin.remittance.ui.b0 b0Var) {
        this.f157866d = b0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.remittance.ui.a0 a0Var = this.f157866d.f157641b;
        if (a0Var != null) {
            a0Var.onCancel();
        }
    }
}
