package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class il extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f112985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vg2.m f112987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.hm hmVar, vg2.m mVar) {
        super(2, continuation);
        this.f112985e = hVar;
        this.f112986f = hmVar;
        this.f112987g = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.il(this.f112985e, continuation, this.f112986f, this.f112987g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.il) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112984d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f112984d = 1;
            if (this.f112986f.M1(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.fl(this.f112987g));
        return jz5.f0.f302826a;
    }
}
