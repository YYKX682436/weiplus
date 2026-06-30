package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 f154166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154166d = j1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.z0(this.f154166d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r61.a h17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var = this.f154166d;
        com.tencent.mm.contact.o U6 = j1Var.U6();
        if (U6 == null) {
            return null;
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) j1Var.f311480h;
        java.lang.String valueOf = java.lang.String.valueOf(mMLimitedClearEditText != null ? mMLimitedClearEditText.getText() : null);
        yq3.v vVar = (yq3.v) U6;
        com.tencent.mm.storage.z3 z3Var = vVar.f464535f;
        int source = z3Var != null ? z3Var.getSource() : 0;
        if ((source == 10 || source == 11 || source == 13) && (h17 = m61.k.wi().h(vVar.h())) != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.h())) {
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
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = (com.tencent.mm.ui.base.MMLimitedClearEditText) j1Var.f311480h;
        vVar.q(java.lang.String.valueOf(mMLimitedClearEditText2 != null ? mMLimitedClearEditText2.getText() : null));
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "doSaveLocalAfterRequest new Remark: " + vVar.c());
        return jz5.f0.f302826a;
    }
}
