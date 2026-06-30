package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.u f179487a;

    public s(com.tencent.mm.plugin.wallet_core.id_verify.u uVar) {
        this.f179487a = uVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.wallet_core.id_verify.u uVar = this.f179487a;
        if (!uVar.f338833a.isFinishing()) {
            com.tencent.mm.ui.MMActivity mMActivity = uVar.f338833a;
            if (!mMActivity.isDestroyed()) {
                ((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).hideProgress();
                if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                    r45.tj5 tj5Var = (r45.tj5) fVar.f70618d;
                    if (tj5Var.f386506d == 0) {
                        uVar.f179499d.o(mMActivity, 0, new android.os.Bundle());
                    } else {
                        com.tencent.mm.wallet_core.ui.r1.M(mMActivity, tj5Var.f386507e);
                    }
                    return java.lang.Boolean.TRUE;
                }
                com.tencent.mm.wallet_core.ui.r1.K(mMActivity, fVar.f70617c);
            }
        }
        return null;
    }
}
