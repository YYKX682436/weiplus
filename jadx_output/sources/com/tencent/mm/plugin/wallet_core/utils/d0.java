package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class d0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.k0 f180864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.n f180865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l0 f180866f;

    public d0(com.tencent.mm.plugin.wallet_core.utils.l0 l0Var, com.tencent.mm.plugin.wallet_core.utils.k0 k0Var, com.tencent.mm.plugin.wallet_core.utils.n nVar) {
        this.f180866f = l0Var;
        this.f180864d = k0Var;
        this.f180865e = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_core.utils.n nVar = this.f180865e;
        this.f180864d.a(nVar.f180934c);
        com.tencent.mm.plugin.wallet_core.utils.l0.a(this.f180866f, nVar.f180934c);
    }
}
