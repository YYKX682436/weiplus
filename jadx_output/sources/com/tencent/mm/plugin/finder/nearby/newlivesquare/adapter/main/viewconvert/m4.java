package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes.dex */
public final class m4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f121810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f121811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(xg2.h hVar, kotlin.coroutines.Continuation continuation, long j17) {
        super(2, continuation);
        this.f121810d = hVar;
        this.f121811e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m4(this.f121810d, continuation, this.f121811e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m4 m4Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.RecentWatchListConvert", "requestDelete success feedId: " + this.f121811e);
        return jz5.f0.f302826a;
    }
}
