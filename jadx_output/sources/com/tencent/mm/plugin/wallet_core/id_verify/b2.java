package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class b2 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f179341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.c2 f179342b;

    public b2(com.tencent.mm.plugin.wallet_core.id_verify.c2 c2Var, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f179342b = c2Var;
        this.f179341a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f179341a;
        if (z17) {
            this.f179342b.f179347d.A.f179473u.setValue(java.lang.Integer.valueOf(c0Var.b()));
        }
        c0Var.d();
    }
}
