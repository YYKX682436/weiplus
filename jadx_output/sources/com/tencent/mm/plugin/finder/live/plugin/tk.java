package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f114415g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114416h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce2.i f114417i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vg2.m f114418m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114419n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.hm hmVar, int i17, java.lang.String str, ce2.i iVar, vg2.m mVar, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f114413e = hVar;
        this.f114414f = hmVar;
        this.f114415g = i17;
        this.f114416h = str;
        this.f114417i = iVar;
        this.f114418m = mVar;
        this.f114419n = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.tk(this.f114413e, continuation, this.f114414f, this.f114415g, this.f114416h, this.f114417i, this.f114418m, this.f114419n);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.tk) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114412d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f114414f;
            com.tencent.mars.xlog.Log.i(hmVar.f112831r, "AIGC gift image upload completed. " + this.f114415g + ", " + this.f114416h);
            this.f114412d = 1;
            if (hmVar.M1(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.qk(this.f114417i, this.f114418m, this.f114419n));
        return jz5.f0.f302826a;
    }
}
