package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f112179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f112180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f112179d = hVar;
        this.f112180e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.cn0(this.f112179d, continuation, this.f112180e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.cn0 cn0Var = (com.tencent.mm.plugin.finder.live.plugin.cn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cn0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.tr1 tr1Var = (r45.tr1) ((xg2.i) this.f112179d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBoardEventEntries success, count=");
        java.util.LinkedList list = tr1Var.getList(1);
        sb6.append(list != null ? list.size() : 0);
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", sb6.toString());
        boolean w17 = zl2.r4.f473950a.w1();
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f112180e;
        if (w17) {
            ln2.d dVar = (ln2.d) wn0Var.x1().y().getValue();
            wn0Var.x1().y().postValue(new ln2.d(dVar != null ? dVar.f319878a : null, false, dVar != null ? dVar.f319880c : null, false, tr1Var.getList(1), true));
        } else {
            ln2.e eVar = (ln2.e) wn0Var.y1().y().getValue();
            wn0Var.y1().y().postValue(new ln2.e(eVar != null ? eVar.f319884a : null, false, eVar != null ? eVar.f319886c : null, false, tr1Var.getList(1), true));
        }
        wn0Var.f114981x.remove(com.tencent.mm.plugin.finder.live.plugin.mm0.f113538f);
        wn0Var.u1();
        return jz5.f0.f302826a;
    }
}
