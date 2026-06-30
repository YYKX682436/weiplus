package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f119814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f119815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f119816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zi2.w f119818h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(r45.kv1 kv1Var, com.tencent.mm.plugin.finder.live.widget.wm wmVar, java.lang.String str, zi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119815e = kv1Var;
        this.f119816f = wmVar;
        this.f119817g = str;
        this.f119818h = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.sm(this.f119815e, this.f119816f, this.f119817g, this.f119818h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.sm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f119814d;
        java.lang.String str = this.f119817g;
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.f119816f;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(wmVar.f120208f, "onUpdateOuterGift: load gift failed, giftId=" + str + ", error=" + e17.getMessage());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.live.widget.rm rmVar = new com.tencent.mm.plugin.finder.live.widget.rm(wmVar, null);
            this.f119814d = 3;
            if (kotlinx.coroutines.l.g(g3Var, rmVar, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.u7 u7Var = dk2.u7.f234181a;
            r45.kv1 kv1Var = this.f119815e;
            this.f119814d = 1;
            if (u7Var.k(kv1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.live.widget.qm qmVar = new com.tencent.mm.plugin.finder.live.widget.qm(str, wmVar, this.f119818h, null);
        this.f119814d = 2;
        if (kotlinx.coroutines.l.g(g3Var2, qmVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
