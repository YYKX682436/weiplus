package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f114779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114780g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114781h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce2.i f114782i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vg2.m f114783m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, int i17, kotlin.jvm.internal.h0 h0Var, java.lang.String str, ce2.i iVar, vg2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114778e = hmVar;
        this.f114779f = i17;
        this.f114780g = h0Var;
        this.f114781h = str;
        this.f114782i = iVar;
        this.f114783m = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.vk(this.f114778e, this.f114779f, this.f114780g, this.f114781h, this.f114782i, this.f114783m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.vk) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114777d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.live.plugin.uk ukVar = new com.tencent.mm.plugin.finder.live.plugin.uk(this.f114778e, this.f114779f, this.f114780g, this.f114781h, this.f114782i, this.f114783m, null);
            this.f114777d = 1;
            if (kotlinx.coroutines.l.g(p0Var, ukVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
