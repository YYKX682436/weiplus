package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g f154027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154027d = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.b(this.f154027d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g gVar = this.f154027d;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) gVar.f311480h;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (mMLimitedClearEditText == null) {
            return f0Var;
        }
        java.lang.String obj2 = mMLimitedClearEditText.getText().toString();
        com.tencent.mm.contact.o U6 = gVar.U6();
        if (U6 == null) {
            return f0Var;
        }
        yq3.v vVar = (yq3.v) U6;
        kotlin.jvm.internal.o.g(obj2, "<set-?>");
        vVar.f464549t.b(vVar, yq3.v.f464529z[1], obj2);
        if (vVar.k()) {
            new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent().e();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModDescriptionUI", "doSaveLocalAfterRequest");
        return f0Var;
    }
}
