package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class h0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.k0 f180899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.n f180900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f180901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l0 f180902d;

    public h0(com.tencent.mm.plugin.wallet_core.utils.l0 l0Var, com.tencent.mm.plugin.wallet_core.utils.k0 k0Var, com.tencent.mm.plugin.wallet_core.utils.n nVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f180902d = l0Var;
        this.f180899a = k0Var;
        this.f180900b = nVar;
        this.f180901c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet_core.utils.n nVar = this.f180900b;
        this.f180899a.a(nVar.f180934c);
        com.tencent.mm.plugin.wallet_core.utils.l0.a(this.f180902d, nVar.f180934c);
        this.f180901c.B();
    }
}
