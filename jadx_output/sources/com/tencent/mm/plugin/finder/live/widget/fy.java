package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class fy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f118377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget f118378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f118379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget finderLiveVisitorActiveDetailWidget, r45.xn1 xn1Var) {
        super(2, continuation);
        this.f118377d = hVar;
        this.f118378e = finderLiveVisitorActiveDetailWidget;
        this.f118379f = xn1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.fy(this.f118377d, continuation, this.f118378e, this.f118379f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.fy fyVar = (com.tencent.mm.plugin.finder.live.widget.fy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fyVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f118377d).f454381b;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget finderLiveVisitorActiveDetailWidget = this.f118378e;
        java.lang.String str = finderLiveVisitorActiveDetailWidget.f117693d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showDetailWidget fail, nick: ");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.f118379f.getCustom(0);
        sb6.append(finderContact != null ? finderContact.getNickname() : null);
        sb6.append("  ");
        sb6.append(aVar2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        finderLiveVisitorActiveDetailWidget.setVisibility(8);
        return jz5.f0.f302826a;
    }
}
