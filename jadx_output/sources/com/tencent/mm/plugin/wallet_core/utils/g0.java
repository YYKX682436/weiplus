package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class g0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.k0 f180892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.n f180893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f180894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l0 f180895d;

    public g0(com.tencent.mm.plugin.wallet_core.utils.l0 l0Var, com.tencent.mm.plugin.wallet_core.utils.k0 k0Var, com.tencent.mm.plugin.wallet_core.utils.n nVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f180895d = l0Var;
        this.f180892a = k0Var;
        this.f180893b = nVar;
        this.f180894c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet_core.utils.n nVar = this.f180893b;
        this.f180892a.a(nVar.f180933b);
        com.tencent.mm.plugin.wallet_core.utils.l0.a(this.f180895d, nVar.f180933b);
        this.f180894c.B();
    }
}
