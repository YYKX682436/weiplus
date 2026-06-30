package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f111961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f111962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.b f111963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, km2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f111962e = v3Var;
        this.f111963f = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.b2(this.f111962e, this.f111963f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f111961d;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f111962e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (v3Var.T == null) {
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "jumpReplayFinderObject is null, attempting to fetch");
                this.f111961d = 1;
                if (com.tencent.mm.plugin.finder.live.plugin.v3.w1(v3Var, this.f111963f, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (v3Var.T != null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "Attempting to jump to replay feed");
            i95.m c17 = i95.n0.c(com.tencent.mm.feature.finder.live.v4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = v3Var.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            s40.w0.ba((s40.w0) c17, context, v3Var.T, false, null, 12, null);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.LiveAnchorAfterPlugin", "Failed to obtain jumpReplayFinderObject");
        }
        return jz5.f0.f302826a;
    }
}
