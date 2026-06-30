package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class qe0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f113995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113995d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.qe0(this.f113995d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.qe0 qe0Var = (com.tencent.mm.plugin.finder.live.plugin.qe0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qe0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e("FinderLiveVisitorAfterPlugin", "get live info failed " + ((xg2.a) ((xg2.b) this.f113995d).f454381b).f454379a);
        return jz5.f0.f302826a;
    }
}
