package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154122d = h0Var;
        this.f154123e = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.r(this.f154122d, this.f154123e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.r rVar = (com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var = this.f154123e;
        this.f154122d.f310123d = db5.e1.Q(i0Var.getActivity(), i0Var.getActivity().getString(com.tencent.mm.R.string.f490573yv), i0Var.getString(com.tencent.mm.R.string.gga), true, true, null);
        return jz5.f0.f302826a;
    }
}
