package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f112898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f112899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f112900i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ km2.b f112901m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, java.lang.String str, boolean z17, boolean z18, boolean z19, km2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112896e = v3Var;
        this.f112897f = str;
        this.f112898g = z17;
        this.f112899h = z18;
        this.f112900i = z19;
        this.f112901m = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.i3(this.f112896e, this.f112897f, this.f112898g, this.f112899h, this.f112900i, this.f112901m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112895d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.live.plugin.h3 h3Var = new com.tencent.mm.plugin.finder.live.plugin.h3(this.f112896e, this.f112897f, this.f112898g, this.f112899h, this.f112900i, this.f112901m, null);
            this.f112895d = 1;
            if (kotlinx.coroutines.l.g(p0Var, h3Var, this) == aVar) {
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
