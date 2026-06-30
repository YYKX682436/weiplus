package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class ly extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget f118984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f118985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118984d = finderLiveVisitorFinderDetailWidget;
        this.f118985e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ly(this.f118984d, this.f118985e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.ly lyVar = (com.tencent.mm.plugin.finder.live.widget.ly) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lyVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f118984d.setVisibility(8);
        this.f118985e.invoke();
        return jz5.f0.f302826a;
    }
}
