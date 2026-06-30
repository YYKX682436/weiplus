package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sm0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f114281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f114280d = hVar;
        this.f114281e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.sm0(this.f114280d, continuation, this.f114281e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.sm0 sm0Var = (com.tencent.mm.plugin.finder.live.plugin.sm0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sm0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.vu1 vu1Var = (r45.vu1) ((xg2.i) this.f114280d).f454393b;
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "anchor checkWishEnable is_active: " + vu1Var.getBoolean(5));
        mm2.f7 f7Var = (mm2.f7) this.f114281e.P0(mm2.f7.class);
        r45.i82 i82Var = new r45.i82();
        i82Var.set(0, java.lang.Boolean.valueOf(vu1Var.getBoolean(5)));
        f7Var.f329058f.postValue(i82Var);
        return jz5.f0.f302826a;
    }
}
