package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.h f153885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.profile.ui.mod.components.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153885d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components.c(this.f153885d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.profile.ui.mod.components.a aVar2 = com.tencent.mm.plugin.profile.ui.mod.components.h.f153917u;
        com.tencent.mm.plugin.profile.ui.mod.components.h hVar = this.f153885d;
        com.tencent.mm.storage.z3 W6 = hVar.W6();
        if (W6 == null) {
            return null;
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) hVar.f311393h;
        if (mMLimitedClearEditText != null) {
            java.lang.String obj2 = mMLimitedClearEditText.getText().toString();
            if (W6.r2()) {
                W6.d3(obj2);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(W6.d1(), W6);
                new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent().e();
            } else {
                com.tencent.mm.plugin.profile.ui.mod.components.a.a(com.tencent.mm.plugin.profile.ui.mod.components.h.f153917u, W6, obj2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModDescriptionUI", "doSaveLocalAfterRequest");
        }
        return jz5.f0.f302826a;
    }
}
