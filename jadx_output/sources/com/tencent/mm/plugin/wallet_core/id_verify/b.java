package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class b implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.d f179336a;

    public b(com.tencent.mm.plugin.wallet_core.id_verify.d dVar) {
        this.f179336a = dVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.wallet_core.id_verify.d dVar = this.f179336a;
        dVar.f179354g.f(dVar.f179351d, dVar.f179353f);
    }

    @Override // q80.f0
    public void success() {
    }
}
