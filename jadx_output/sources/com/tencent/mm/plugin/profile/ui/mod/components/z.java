package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f154014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f154015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154014d = j0Var;
        this.f154015e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components.z(this.f154014d, this.f154015e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.profile.ui.mod.components.z zVar = (com.tencent.mm.plugin.profile.ui.mod.components.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f154014d;
        ((java.util.ArrayList) j0Var.f153931s).addAll(this.f154015e);
        j0Var.e7();
        return jz5.f0.f302826a;
    }
}
