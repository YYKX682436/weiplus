package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class bn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f112059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f112060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f112059d = hVar;
        this.f112060e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.bn0(this.f112059d, continuation, this.f112060e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.bn0 bn0Var = (com.tencent.mm.plugin.finder.live.plugin.bn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bn0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f112059d).f454381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBoardEventEntries fail: ");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397425f) : null);
        sb6.append(' ');
        rm0.j jVar2 = aVar2.f454379a;
        sb6.append(jVar2 != null ? jVar2.f397426g : null);
        com.tencent.mars.xlog.Log.w("FinderLiveWishPanelPlug", sb6.toString());
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f112060e;
        wn0Var.f114981x.remove(com.tencent.mm.plugin.finder.live.plugin.mm0.f113538f);
        wn0Var.u1();
        return jz5.f0.f302826a;
    }
}
