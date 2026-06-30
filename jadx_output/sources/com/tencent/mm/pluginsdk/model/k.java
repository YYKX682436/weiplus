package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f189350d;

    /* renamed from: e, reason: collision with root package name */
    public int f189351e;

    public k(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.pluginsdk.model.k(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.tencent.mm.pluginsdk.model.k((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f189351e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.tencent.mm.pluginsdk.model.b0.A) {
                return f0Var;
            }
            com.tencent.mm.pluginsdk.model.b0.A = true;
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            b0Var.h().B("live_bar_list_last_refresh_time", java.lang.System.currentTimeMillis());
            this.f189350d = 10;
            this.f189351e = 1;
            obj = b0Var.d(10, null, null, this);
            if (obj == aVar) {
                return aVar;
            }
            i17 = 10;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f189350d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.qk qkVar = (r45.qk) obj;
        if (qkVar != null) {
            com.tencent.mm.pluginsdk.model.b0 b0Var2 = com.tencent.mm.pluginsdk.model.b0.f189197a;
            b0Var2.A(i17, qkVar.f384066g);
            b0Var2.z(i17, qkVar.f384067h);
            b0Var2.B(qkVar);
        }
        com.tencent.mm.pluginsdk.model.b0.A = false;
        return f0Var;
    }
}
