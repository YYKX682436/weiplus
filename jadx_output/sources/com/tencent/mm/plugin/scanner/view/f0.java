package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes11.dex */
public final class f0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159931d;

    public f0(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        this.f159931d = t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159931d;
        com.tencent.mm.sdk.platformtools.b4 b4Var = t0Var.f159993w;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = t0Var.f159983J;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = t0Var.Q;
        if (b4Var3 != null) {
            b4Var3.d();
        }
        com.tencent.mm.plugin.scanner.view.u uVar = t0Var.f159989s;
        if (uVar != null) {
            com.tencent.mm.autogen.events.ScanPassportResultEvent scanPassportResultEvent = new com.tencent.mm.autogen.events.ScanPassportResultEvent();
            scanPassportResultEvent.f54733g.f8319a = 0;
            scanPassportResultEvent.e();
            ((com.tencent.mm.plugin.scanner.ui.p1) uVar).f159609a.finish();
        }
    }
}
