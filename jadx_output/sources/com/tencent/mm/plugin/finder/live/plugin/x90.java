package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f115063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var) {
        super(2, continuation);
        this.f115062d = hVar;
        this.f115063e = ea0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.x90(this.f115062d, continuation, this.f115063e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.x90 x90Var = (com.tencent.mm.plugin.finder.live.plugin.x90) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x90Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f115063e.f112390t, "FinderLiveGetProductPromoteReplayWidgetRequest failed");
        return jz5.f0.f302826a;
    }
}
