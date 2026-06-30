package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.k0 f180857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.n f180858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l0 f180859f;

    public c0(com.tencent.mm.plugin.wallet_core.utils.l0 l0Var, com.tencent.mm.plugin.wallet_core.utils.k0 k0Var, com.tencent.mm.plugin.wallet_core.utils.n nVar) {
        this.f180859f = l0Var;
        this.f180857d = k0Var;
        this.f180858e = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_core.utils.n nVar = this.f180858e;
        this.f180857d.a(nVar.f180933b);
        com.tencent.mm.plugin.wallet_core.utils.l0.a(this.f180859f, nVar.f180933b);
    }
}
