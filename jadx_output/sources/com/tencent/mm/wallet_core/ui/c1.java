package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class c1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.o1 f214119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f214120b;

    public c1(com.tencent.mm.wallet_core.ui.o1 o1Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f214119a = o1Var;
        this.f214120b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.wallet_core.ui.o1 o1Var = this.f214119a;
        if (o1Var != null) {
            o1Var.a();
        }
        this.f214120b.B();
    }
}
