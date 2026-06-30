package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f118952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f118953f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(zi2.w wVar, com.tencent.mm.plugin.finder.live.widget.wm wmVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118952e = wVar;
        this.f118953f = wmVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.lm(this.f118952e, this.f118953f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.widget.lm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118951d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.f3 f3Var = ((om2.g) this.f118952e.P0(om2.g.class)).f346303g;
            com.tencent.mm.plugin.finder.live.widget.km kmVar = new com.tencent.mm.plugin.finder.live.widget.km(this.f118953f);
            this.f118951d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(kmVar, this) == aVar) {
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
