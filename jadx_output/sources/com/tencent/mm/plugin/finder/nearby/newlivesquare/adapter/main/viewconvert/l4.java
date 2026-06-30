package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes.dex */
public final class l4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f121783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f121784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(xg2.h hVar, kotlin.coroutines.Continuation continuation, long j17) {
        super(2, continuation);
        this.f121783d = hVar;
        this.f121784e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l4(this.f121783d, continuation, this.f121784e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l4 l4Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.RecentWatchListConvert", "requestDelete fail feedId: " + this.f121784e + " error: " + ((xg2.a) ((xg2.b) this.f121783d).f454381b));
        return jz5.f0.f302826a;
    }
}
