package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class jy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget f118787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f118788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f118789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f118790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget, java.lang.Object obj, yz5.l lVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118787d = finderLiveVisitorFinderDetailWidget;
        this.f118788e = obj;
        this.f118789f = lVar;
        this.f118790g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.jy(this.f118787d, this.f118788e, this.f118789f, this.f118790g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.jy jyVar = (com.tencent.mm.plugin.finder.live.widget.jy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jyVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object ret = this.f118788e;
        kotlin.jvm.internal.o.f(ret, "$ret");
        yz5.l lVar = this.f118789f;
        yz5.a aVar2 = this.f118790g;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget.a(this.f118787d, (r45.nw6) ret, lVar, aVar2);
        return jz5.f0.f302826a;
    }
}
