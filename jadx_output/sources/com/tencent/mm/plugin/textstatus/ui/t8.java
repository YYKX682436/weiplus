package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class t8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174319d;

    public t8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174319d = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f174319d.i7().requestFocus();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.textstatus.ui.s8 s8Var = new com.tencent.mm.plugin.textstatus.ui.s8(this.f174319d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(s8Var, 200L, false);
    }
}
