package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget f119649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw6 f119650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f119651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f119652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget, r45.nw6 nw6Var, yz5.p pVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119649d = finderLiveFinderDetailWidget;
        this.f119650e = nw6Var;
        this.f119651f = pVar;
        this.f119652g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.rj(this.f119649d, this.f119650e, this.f119651f, this.f119652g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.rj rjVar = (com.tencent.mm.plugin.finder.live.widget.rj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rjVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget.a(this.f119649d, this.f119650e, this.f119651f, this.f119652g);
        return jz5.f0.f302826a;
    }
}
