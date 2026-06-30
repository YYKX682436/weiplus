package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class iy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget f118705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw6 f118706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f118707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f118708g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget, r45.nw6 nw6Var, yz5.l lVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118705d = finderLiveVisitorFinderDetailWidget;
        this.f118706e = nw6Var;
        this.f118707f = lVar;
        this.f118708g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.iy(this.f118705d, this.f118706e, this.f118707f, this.f118708g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.iy iyVar = (com.tencent.mm.plugin.finder.live.widget.iy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iyVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget.a(this.f118705d, this.f118706e, this.f118707f, this.f118708g);
        return jz5.f0.f302826a;
    }
}
