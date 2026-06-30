package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ss extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119829d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f119830e;

    /* renamed from: f, reason: collision with root package name */
    public int f119831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f119833h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(com.tencent.mm.plugin.finder.live.widget.et etVar, r45.dz1 dz1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119832g = etVar;
        this.f119833h = dz1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ss(this.f119832g, this.f119833h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.ss) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.widget.et etVar;
        r45.uc5 uc5Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f119831f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int integer = this.f119833h.getInteger(0);
            etVar = this.f119832g;
            jz5.l l07 = etVar.l0(integer);
            r45.uc5 uc5Var2 = l07 != null ? (r45.uc5) l07.f302834e : null;
            if (uc5Var2 != null) {
                this.f119829d = etVar;
                this.f119830e = uc5Var2;
                this.f119831f = 1;
                java.lang.Object e07 = com.tencent.mm.plugin.finder.live.widget.et.e0(etVar, uc5Var2, this);
                if (e07 == aVar) {
                    return aVar;
                }
                uc5Var = uc5Var2;
                obj = e07;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uc5Var = (r45.uc5) this.f119830e;
        etVar = (com.tencent.mm.plugin.finder.live.widget.et) this.f119829d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Boolean) obj).booleanValue()) {
            etVar.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.es(etVar, uc5Var));
        }
        return jz5.f0.f302826a;
    }
}
