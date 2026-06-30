package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class z0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f214273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.q f214274b;

    public z0(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.wallet_core.model.q qVar) {
        this.f214273a = z2Var;
        this.f214274b = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f214273a.B();
        this.f214274b.onCancel();
    }
}
