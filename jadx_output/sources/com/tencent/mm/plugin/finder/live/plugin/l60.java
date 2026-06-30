package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class l60 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.t f113353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f113354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(cm2.t tVar, com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113353e = tVar;
        this.f113354f = r60Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.l60(this.f113353e, this.f113354f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.l60) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113352d;
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f113354f;
        cm2.t tVar = this.f113353e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cm2.t tVar2 = tVar instanceof cm2.t ? tVar : null;
            int i18 = tVar2 != null ? tVar2.f43389h : 0;
            com.tencent.mars.xlog.Log.i(r60Var.f114098s, "[addPromoteData] delay:" + i18);
            cm2.t tVar3 = tVar instanceof cm2.t ? tVar : null;
            r60Var.D = tVar3 != null ? new java.lang.Long(tVar3.f43385d) : null;
            cm2.t tVar4 = tVar instanceof cm2.t ? tVar : null;
            r60Var.E = tVar4 != null ? tVar4.f43396r : null;
            this.f113352d = 1;
            if (kotlinx.coroutines.k1.b(i18 * 1000, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.k60(tVar, r60Var));
        return jz5.f0.f302826a;
    }
}
