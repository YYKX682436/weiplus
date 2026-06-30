package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.u f179493a;

    public t(com.tencent.mm.plugin.wallet_core.id_verify.u uVar) {
        this.f179493a = uVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.wallet_core.id_verify.u uVar = this.f179493a;
        if (uVar.f338833a.isFinishing() || uVar.f338833a.isDestroyed() || fVar.f70615a != 0 || fVar.f70616b != 0) {
            return null;
        }
        r45.pj5 pj5Var = (r45.pj5) fVar.f70618d;
        if (pj5Var.f383103d == 0 || com.tencent.mm.sdk.platformtools.t8.K0(pj5Var.f383104e)) {
            return null;
        }
        com.tencent.mm.wallet_core.ui.r1.L(((r45.pj5) fVar.f70618d).f383104e);
        return null;
    }
}
