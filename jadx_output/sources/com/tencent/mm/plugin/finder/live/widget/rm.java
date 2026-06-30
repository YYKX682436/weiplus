package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f119659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(com.tencent.mm.plugin.finder.live.widget.wm wmVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119659d = wmVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.rm(this.f119659d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.rm rmVar = (com.tencent.mm.plugin.finder.live.widget.rm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rmVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f119659d.n();
        return jz5.f0.f302826a;
    }
}
