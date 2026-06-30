package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class gn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f112717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f112718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f112717d = hVar;
        this.f112718e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.gn0(this.f112717d, continuation, this.f112718e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.gn0 gn0Var = (com.tencent.mm.plugin.finder.live.plugin.gn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gn0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f112717d).f454381b;
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f112718e;
        wn0Var.f114981x.remove(com.tencent.mm.plugin.finder.live.plugin.mm0.f113536d);
        rm0.j jVar = aVar2.f454379a;
        if (jVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRewardWishList fail,errCode: ");
            int i17 = jVar.f397425f;
            sb6.append(i17);
            sb6.append(" errType: ");
            sb6.append(jVar.f397424e);
            sb6.append(" errMsg: ");
            sb6.append(jVar.f397426g);
            com.tencent.mars.xlog.Log.w("FinderLiveWishPanelPlug", sb6.toString());
            db5.t7.g(wn0Var.f365323d.getContext(), wn0Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.f493747ow3, java.lang.String.valueOf(i17)));
        }
        return jz5.f0.f302826a;
    }
}
