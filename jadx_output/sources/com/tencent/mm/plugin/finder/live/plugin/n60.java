package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n60 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f113593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.t f113594f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, cm2.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113593e = r60Var;
        this.f113594f = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.n60(this.f113593e, this.f113594f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.n60) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113592d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        cm2.t tVar = this.f113594f;
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f113593e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = ((mm2.f6) r60Var.P0(mm2.f6.class)).L;
            so2.j5 j5Var = ((mm2.f6) r60Var.P0(mm2.f6.class)).f329049w;
            cm2.t tVar2 = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
            java.lang.String str = tVar2 != null ? tVar2.f43396r : null;
            if (j17 == tVar.f43385d && kotlin.jvm.internal.o.b(str, tVar.f43396r)) {
                com.tencent.mars.xlog.Log.i(r60Var.f114098s, "promoteIdHideByVisitor = " + j17 + ", newPromoteInfo.mPromoteId = " + tVar.f43385d + ", only update data");
                ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(tVar);
                return f0Var;
            }
            cm2.t tVar3 = tVar instanceof cm2.t ? tVar : null;
            int i18 = tVar3 != null ? tVar3.f43389h : 0;
            cm2.t tVar4 = tVar instanceof cm2.t ? tVar : null;
            r60Var.D = tVar4 != null ? new java.lang.Long(tVar4.f43385d) : null;
            cm2.t tVar5 = tVar instanceof cm2.t ? tVar : null;
            r60Var.E = tVar5 != null ? tVar5.f43396r : null;
            com.tencent.mars.xlog.Log.i(r60Var.f114098s, "[updatePromoteData] delay:" + i18);
            this.f113592d = 1;
            if (kotlinx.coroutines.k1.b(i18 * 1000, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.m60(r60Var, tVar));
        return f0Var;
    }
}
