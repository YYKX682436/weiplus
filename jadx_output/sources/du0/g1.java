package du0;

/* loaded from: classes5.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f243354d;

    /* renamed from: e, reason: collision with root package name */
    public int f243355e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f243356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f243357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243357g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        du0.g1 g1Var = new du0.g1(this.f243357g, continuation);
        g1Var.f243356f = obj;
        return g1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.g1) create((com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243355e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3 = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) this.f243356f;
            if (this.f243357g && audioCacheInfo3 != null && !audioCacheInfo3.f155716m) {
                java.lang.String str = audioCacheInfo3.f155712f;
                if (str == null || str.length() == 0) {
                    this.f243356f = audioCacheInfo3;
                    this.f243354d = audioCacheInfo3;
                    this.f243355e = 1;
                    kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                    rVar.k();
                    rVar.m(new ev0.g(audioCacheInfo3));
                    wt3.c1 c1Var = wt3.c1.f449387b;
                    wt3.c1.f449387b.c(audioCacheInfo3, new ev0.h(rVar));
                    java.lang.Object j17 = rVar.j();
                    pz5.a aVar2 = pz5.a.f359186d;
                    if (j17 == aVar) {
                        return aVar;
                    }
                    audioCacheInfo = audioCacheInfo3;
                    obj = j17;
                    audioCacheInfo2 = audioCacheInfo;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        audioCacheInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) this.f243354d;
        audioCacheInfo2 = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) this.f243356f;
        kotlin.ResultKt.throwOnFailure(obj);
        audioCacheInfo.f155715i = (java.lang.String) obj;
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        audioCacheInfo2.f155716m = ((c61.p7) ((m40.k0) c17)).ij(audioCacheInfo2.f155715i);
        return jz5.f0.f302826a;
    }
}
