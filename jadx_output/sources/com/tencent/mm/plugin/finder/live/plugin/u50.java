package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u50 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.t f114525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f114526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.t f114527g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(cm2.t tVar, com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, cm2.t tVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114525e = tVar;
        this.f114526f = r60Var;
        this.f114527g = tVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.u50(this.f114525e, this.f114526f, this.f114527g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.u50) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114524d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f114525e.f43390i * 1000;
            this.f114524d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f114526f;
        so2.j5 j5Var = ((mm2.f6) r60Var.P0(mm2.f6.class)).f329049w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        long j18 = tVar != null ? tVar.f43385d : 0L;
        java.lang.String str = r60Var.f114098s;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkAndLaunchDelayDismissJob] after dalay curPromoteDataId = ");
        sb6.append(j18);
        sb6.append(" , remotePromoteDataId = ");
        cm2.t tVar2 = this.f114527g;
        sb6.append(tVar2.f43385d);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (j18 == tVar2.f43385d) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null) {
                qo0.b bVar = qo0.b.O2;
                android.os.Bundle bundle = new android.os.Bundle();
                r45.f52 f52Var = new r45.f52();
                f52Var.set(0, java.lang.Integer.valueOf(tVar2.f43392n));
                com.tencent.mm.protobuf.g gVar = tVar2.f43391m;
                if (gVar != null) {
                    byte[] g17 = gVar.g();
                    f52Var.set(2, new com.tencent.mm.protobuf.g(g17, 0, g17.length));
                }
                f52Var.set(4, java.lang.Long.valueOf(tVar2.f43385d));
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
                k0Var.statusChange(bVar, bundle);
            }
        }
        return jz5.f0.f302826a;
    }
}
