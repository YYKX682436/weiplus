package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget f120192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f120193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f120194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f120195g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f120196h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f120197i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget, int i17, r45.xn1 xn1Var, kotlinx.coroutines.y0 y0Var, yz5.p pVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120192d = finderLiveFinderDetailWidget;
        this.f120193e = i17;
        this.f120194f = xn1Var;
        this.f120195g = y0Var;
        this.f120196h = pVar;
        this.f120197i = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.wj(this.f120192d, this.f120193e, this.f120194f, this.f120195g, this.f120196h, this.f120197i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.wj wjVar = (com.tencent.mm.plugin.finder.live.widget.wj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wjVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.wj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
