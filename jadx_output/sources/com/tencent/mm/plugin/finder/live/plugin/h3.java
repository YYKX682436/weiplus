package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class h3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f112761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f112762h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f112763i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ km2.b f112764m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, java.lang.String str, boolean z17, boolean z18, boolean z19, km2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112759e = v3Var;
        this.f112760f = str;
        this.f112761g = z17;
        this.f112762h = z18;
        this.f112763i = z19;
        this.f112764m = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.h3(this.f112759e, this.f112760f, this.f112761g, this.f112762h, this.f112763i, this.f112764m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.h3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112758d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f112758d = 1;
            if (com.tencent.mm.plugin.finder.live.plugin.v3.u1(this.f112759e, this.f112760f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f112759e;
        boolean z17 = this.f112761g;
        boolean z18 = this.f112762h;
        boolean z19 = this.f112763i;
        com.tencent.mm.plugin.finder.live.plugin.v3.v1(v3Var, z17, z18, z19, false, new com.tencent.mm.plugin.finder.live.plugin.g3(v3Var, this.f112764m, z17, z18, z19));
        return jz5.f0.f302826a;
    }
}
