package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class xm0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f115110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f115111f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm0(xg2.h hVar, kotlin.coroutines.Continuation continuation, boolean z17, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f115109d = hVar;
        this.f115110e = z17;
        this.f115111f = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.xm0(this.f115109d, continuation, this.f115110e, this.f115111f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.xm0 xm0Var = (com.tencent.mm.plugin.finder.live.plugin.xm0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xm0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f115109d).f454381b).f454379a;
        if (jVar != null) {
            boolean z17 = this.f115110e;
            int i17 = jVar.f397425f;
            if (z17) {
                com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f115111f;
                db5.t7.h(wn0Var.f365323d.getContext(), wn0Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.f493746ow2, java.lang.String.valueOf(i17)));
            }
            com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "deleteRewardWishList error: " + i17 + " msg: " + jVar.f397426g);
        }
        return jz5.f0.f302826a;
    }
}
