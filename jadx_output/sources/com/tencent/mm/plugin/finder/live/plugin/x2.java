package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f115020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(xg2.h hVar, kotlin.coroutines.Continuation continuation, az2.f fVar) {
        super(2, continuation);
        this.f115019d = hVar;
        this.f115020e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.x2(this.f115019d, continuation, this.f115020e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.x2 x2Var = (com.tencent.mm.plugin.finder.live.plugin.x2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f115019d).f454381b;
        this.f115020e.b();
        com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "get live info failed " + aVar2.f454379a);
        return jz5.f0.f302826a;
    }
}
