package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget f119785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f119786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f119787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f119788g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget, java.lang.Object obj, yz5.p pVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119785d = finderLiveFinderDetailWidget;
        this.f119786e = obj;
        this.f119787f = pVar;
        this.f119788g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.sj(this.f119785d, this.f119786e, this.f119787f, this.f119788g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.sj sjVar = (com.tencent.mm.plugin.finder.live.widget.sj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sjVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object ret = this.f119786e;
        kotlin.jvm.internal.o.f(ret, "$ret");
        yz5.p pVar = this.f119787f;
        yz5.a aVar2 = this.f119788g;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget.a(this.f119785d, (r45.nw6) ret, pVar, aVar2);
        return jz5.f0.f302826a;
    }
}
