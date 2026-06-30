package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class p4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.q4 f159612d;

    public p4(com.tencent.mm.plugin.scanner.ui.q4 q4Var) {
        this.f159612d = q4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.scanner.ui.q4 q4Var = this.f159612d;
        d17.d((com.tencent.mm.modelbase.m1) q4Var.f159617d.f159625f);
        q4Var.f159617d.f159626g = null;
    }
}
