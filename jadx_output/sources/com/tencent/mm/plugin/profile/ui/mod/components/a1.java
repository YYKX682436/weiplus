package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.k1 f153877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153877d = k1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components.a1(this.f153877d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r61.a h17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.plugin.profile.ui.mod.components.k1.f153942u;
        com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var = this.f153877d;
        com.tencent.mm.storage.z3 W6 = k1Var.W6();
        if (W6 == null) {
            return null;
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) k1Var.f311393h;
        java.lang.String valueOf = java.lang.String.valueOf(mMLimitedClearEditText != null ? mMLimitedClearEditText.getText() : null);
        int source = W6.getSource();
        if ((source == 10 || source == 11 || source == 13) && (h17 = m61.k.wi().h(W6.d1())) != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.h())) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(valueOf)) {
                h17.f392801q |= 1;
            } else {
                h17.f392801q &= -2;
            }
            r61.b wi6 = m61.k.wi();
            if (wi6 != null) {
                qz5.b.d(wi6.j(h17.e(), h17));
            }
        }
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(W6.d1());
        if ((z07 == null || com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) && !com.tencent.mm.sdk.platformtools.t8.K0(W6.J0())) {
            z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(W6.J0());
        }
        if (z07 != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
            ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).y0(z07.field_encryptUsername);
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = (com.tencent.mm.ui.base.MMLimitedClearEditText) k1Var.f311393h;
        W6.n1(java.lang.String.valueOf(mMLimitedClearEditText2 != null ? mMLimitedClearEditText2.getText() : null));
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(W6.d1(), W6);
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "doSaveLocalAfterRequest new Remark: " + W6.w0());
        return jz5.f0.f302826a;
    }
}
