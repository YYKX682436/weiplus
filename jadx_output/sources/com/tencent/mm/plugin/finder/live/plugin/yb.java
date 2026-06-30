package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f115178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ac f115179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f115180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(com.tencent.mm.plugin.finder.live.plugin.ac acVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115179e = acVar;
        this.f115180f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.yb(this.f115179e, this.f115180f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.plugin.yb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f115178d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.ac acVar = this.f115179e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.e0) acVar.P0(mm2.e0.class)).f328966f;
            com.tencent.mm.plugin.finder.live.plugin.xb xbVar = new com.tencent.mm.plugin.finder.live.plugin.xb(this.f115180f, acVar);
            this.f115178d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(xbVar, this) == aVar) {
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
