package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ib extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f118661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f118662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f118663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(mm2.n0 n0Var, com.tencent.mm.plugin.finder.live.widget.nb nbVar, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118661e = n0Var;
        this.f118662f = nbVar;
        this.f118663g = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ib(this.f118661e, this.f118662f, this.f118663g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.widget.ib) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118660d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.n0 n0Var = this.f118661e;
            kotlinx.coroutines.flow.f3 f3Var = n0Var.f329265g;
            com.tencent.mm.plugin.finder.live.widget.hb hbVar = new com.tencent.mm.plugin.finder.live.widget.hb(this.f118662f, n0Var, this.f118663g);
            this.f118660d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(hbVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
