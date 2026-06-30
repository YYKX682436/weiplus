package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class k2 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f180371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.l2 f180372b;

    public k2(com.tencent.mm.plugin.wallet_core.ui.l2 l2Var, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f180372b = l2Var;
        this.f180371a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f180371a;
        if (z17) {
            com.tencent.mm.plugin.wallet_core.ui.l2 l2Var = this.f180372b;
            l2Var.f180399d.F.setText((java.lang.String) obj);
            l2Var.f180399d.X1 = c0Var.b();
            l2Var.f180399d.U6();
        }
        c0Var.d();
    }
}
