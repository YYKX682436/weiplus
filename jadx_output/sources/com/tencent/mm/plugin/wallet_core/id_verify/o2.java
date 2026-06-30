package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class o2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f179452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.a3 f179453b;

    public o2(com.tencent.mm.plugin.wallet_core.id_verify.a3 a3Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f179453b = a3Var;
        this.f179452a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet_core.id_verify.a3 a3Var = this.f179453b;
        com.tencent.mm.wallet_core.ui.r1.V(a3Var.f179334d.getContext(), a3Var.f179334d.G.f385632h, true);
        this.f179452a.B();
    }
}
