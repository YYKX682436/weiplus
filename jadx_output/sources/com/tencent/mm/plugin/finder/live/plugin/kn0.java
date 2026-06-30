package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f113297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113297e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.kn0(this.f113297e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.kn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113296d;
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f113297e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            wn0Var.f114981x.clear();
            if (zl2.r4.f473950a.w1() && !wn0Var.D1() && !((mm2.c1) wn0Var.P0(mm2.c1.class)).a8()) {
                com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "anchor checkWishEnable");
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
                com.tencent.mm.plugin.finder.live.plugin.jn0 jn0Var = new com.tencent.mm.plugin.finder.live.plugin.jn0(wn0Var, null);
                this.f113296d = 1;
                if (kotlinx.coroutines.l.g(p0Var, jn0Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "anchor checkWishEnable finish");
        wn0Var.getClass();
        wn0Var.f114981x.add(com.tencent.mm.plugin.finder.live.plugin.mm0.f113536d);
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310570c;
        com.tencent.mm.plugin.finder.live.util.y.m(wn0Var, p0Var2, null, new com.tencent.mm.plugin.finder.live.plugin.in0(wn0Var, null), 2, null);
        wn0Var.getClass();
        if (!zl2.r4.f473950a.w1()) {
            ln2.e eVar = (ln2.e) wn0Var.y1().y().getValue();
            wn0Var.y1().y().postValue(new ln2.e(eVar != null ? eVar.f319884a : null, false, (dk2.z7) ((mm2.f7) wn0Var.P0(mm2.f7.class)).f329059g.getValue(), true, eVar != null ? eVar.f319888e : null, false, 32, null));
            wn0Var.u1();
        } else if (wn0Var.C1()) {
            wn0Var.f114981x.add(com.tencent.mm.plugin.finder.live.plugin.mm0.f113537e);
            com.tencent.mm.plugin.finder.live.util.y.m(wn0Var, p0Var2, null, new com.tencent.mm.plugin.finder.live.plugin.pm0(wn0Var, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "getInteractionWishConfig ignore as interactionWishSwitch close.");
            ln2.d dVar = (ln2.d) wn0Var.x1().y().getValue();
            wn0Var.x1().y().postValue(new ln2.d(dVar != null ? dVar.f319878a : null, false, null, true, dVar != null ? dVar.f319882e : null, false, 32, null));
        }
        wn0Var.getClass();
        wn0Var.f114981x.add(com.tencent.mm.plugin.finder.live.plugin.mm0.f113538f);
        com.tencent.mm.plugin.finder.live.util.y.m(wn0Var, p0Var2, null, new com.tencent.mm.plugin.finder.live.plugin.dn0(wn0Var, null), 2, null);
        return jz5.f0.f302826a;
    }
}
