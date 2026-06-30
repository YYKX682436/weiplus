package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f118894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f118895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q4 f118896g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.l71 f118897h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(kotlin.jvm.internal.h0 h0Var, r45.nw1 nw1Var, com.tencent.mm.plugin.finder.live.widget.q4 q4Var, r45.l71 l71Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118894e = h0Var;
        this.f118895f = nw1Var;
        this.f118896g = q4Var;
        this.f118897h = l71Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.l4(this.f118894e, this.f118895f, this.f118896g, this.f118897h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.l4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.i72 i72Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118893d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            long longValue = ((java.lang.Number) this.f118894e.f310123d).longValue();
            this.f118893d = 1;
            obj = ((c61.l7) b6Var).pl(longValue, null, 0, this);
            if (obj == aVar) {
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
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        long j17 = 0;
        long id6 = finderObject != null ? finderObject.getId() : 0L;
        r45.nw1 nw1Var = this.f118895f;
        if (nw1Var != null && (i72Var = (r45.i72) nw1Var.getCustom(44)) != null) {
            j17 = i72Var.getLong(13);
        }
        com.tencent.mm.plugin.finder.live.widget.q4 q4Var = this.f118896g;
        com.tencent.mars.xlog.Log.i(q4Var.f119486c, "checkPreloadReplayFeed, replayFeedId:" + pm0.v.u(id6) + ", replay_control_flag:" + j17);
        if (finderObject != null) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127975v).getValue()).r()).intValue() == 1 || pm0.v.A(j17, 1L)) {
                ((com.tencent.mm.plugin.finder.service.l2) ((zy2.a7) i95.n0.c(zy2.a7.class))).Bi(finderObject, 65, 1);
            }
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.live.widget.k4 k4Var = new com.tencent.mm.plugin.finder.live.widget.k4(finderObject, this.f118897h, q4Var, null);
        this.f118893d = 2;
        if (kotlinx.coroutines.l.g(g3Var, k4Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
