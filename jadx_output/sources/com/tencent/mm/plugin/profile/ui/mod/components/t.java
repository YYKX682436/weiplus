package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f153984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f153985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153986f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153985e = h0Var;
        this.f153986f = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components.t(this.f153985e, this.f153986f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f153984d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f153984d = 1;
            if (kotlinx.coroutines.k1.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.profile.ui.mod.components.s sVar = new com.tencent.mm.plugin.profile.ui.mod.components.s(this.f153985e, this.f153986f, null);
        this.f153984d = 2;
        if (kotlinx.coroutines.l.g(g3Var, sVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
