package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f114270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg2.m f114272h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.hm hmVar, int i17, java.lang.String str, vg2.m mVar) {
        super(2, continuation);
        this.f114268d = hVar;
        this.f114269e = hmVar;
        this.f114270f = i17;
        this.f114271g = str;
        this.f114272h = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.sk(this.f114268d, continuation, this.f114269e, this.f114270f, this.f114271g, this.f114272h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.sk skVar = (com.tencent.mm.plugin.finder.live.plugin.sk) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        skVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e(this.f114269e.f112831r, "AIGC gift image upload failed. " + this.f114270f + ", " + this.f114271g);
        d75.b.g(new com.tencent.mm.plugin.finder.live.plugin.rk(this.f114272h));
        return jz5.f0.f302826a;
    }
}
