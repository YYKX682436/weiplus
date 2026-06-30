package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class pa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f129628d;

    /* renamed from: e, reason: collision with root package name */
    public int f129629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f129630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129630f = finderModifyNameUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.pa(this.f129630f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.pa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f129629e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            this.f129629e = 1;
            x17 = bVar.x1(2, this);
            if (x17 == aVar) {
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
            x17 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m528isSuccessimpl(x17)) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.ui.oa oaVar = new com.tencent.mm.plugin.finder.ui.oa((r45.lk2) x17, this.f129630f, null);
            this.f129628d = x17;
            this.f129629e = 2;
            if (kotlinx.coroutines.l.g(g3Var, oaVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
