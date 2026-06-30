package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f115148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f115149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f115150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(xg2.h hVar, kotlin.coroutines.Continuation continuation, az2.f fVar, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, yz5.a aVar) {
        super(2, continuation);
        this.f115147d = hVar;
        this.f115148e = fVar;
        this.f115149f = v3Var;
        this.f115150g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.y2(this.f115147d, continuation, this.f115148e, this.f115149f, this.f115150g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.y2 y2Var = (com.tencent.mm.plugin.finder.live.plugin.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.l71 l71Var = (r45.l71) ((xg2.i) this.f115147d).f454393b;
        this.f115148e.b();
        r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
        if (nw1Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f115149f;
            v3Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "updateLiveInfo replayStatus：" + nw1Var.getInteger(31));
            km2.b bVar = v3Var.S;
            if (bVar != null) {
                bVar.f309070t = nw1Var;
                v3Var.E1(bVar);
            }
            this.f115150g.invoke();
        } else {
            com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "get live info success, but liveInfo is null");
        }
        return jz5.f0.f302826a;
    }
}
