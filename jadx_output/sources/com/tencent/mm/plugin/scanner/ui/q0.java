package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes4.dex */
public class q0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.d0 f159613d;

    public q0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI, com.tencent.mm.plugin.scanner.model.d0 d0Var) {
        this.f159613d = d0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f159613d);
    }
}
