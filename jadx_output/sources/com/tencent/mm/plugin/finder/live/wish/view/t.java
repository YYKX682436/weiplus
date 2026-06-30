package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f120651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qs5.s f120654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.wish.view.x xVar, com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView, qs5.s sVar) {
        super(2, continuation);
        this.f120651d = hVar;
        this.f120652e = xVar;
        this.f120653f = maxHeightWxRecyclerView;
        this.f120654g = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.wish.view.t(this.f120651d, continuation, this.f120652e, this.f120653f, this.f120654g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.wish.view.t tVar = (com.tencent.mm.plugin.finder.live.wish.view.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.wish.view.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
