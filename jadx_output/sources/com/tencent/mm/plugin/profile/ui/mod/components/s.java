package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f153981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153981d = h0Var;
        this.f153982e = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components.s(this.f153981d, this.f153982e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.profile.ui.mod.components.s sVar = (com.tencent.mm.plugin.profile.ui.mod.components.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f153982e;
        this.f153981d.f310123d = db5.e1.Q(j0Var.getActivity(), j0Var.getActivity().getString(com.tencent.mm.R.string.f490573yv), j0Var.getString(com.tencent.mm.R.string.gga), true, true, null);
        return jz5.f0.f302826a;
    }
}
