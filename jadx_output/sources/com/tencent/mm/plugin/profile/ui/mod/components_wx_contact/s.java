package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f154125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154127f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154126e = h0Var;
        this.f154127f = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.s(this.f154126e, this.f154127f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f154125d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f154125d = 1;
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
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.r rVar = new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.r(this.f154126e, this.f154127f, null);
        this.f154125d = 2;
        if (kotlinx.coroutines.l.g(g3Var, rVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
