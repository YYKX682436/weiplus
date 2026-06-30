package fu0;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f266779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f266780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fu0.l f266781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f266782g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f266783h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(org.json.JSONObject jSONObject, fu0.l lVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266780e = jSONObject;
        this.f266781f = lVar;
        this.f266782g = audioCacheInfo;
        this.f266783h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fu0.h(this.f266780e, this.f266781f, this.f266782g, this.f266783h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fu0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        fu0.m mVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f266779d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                org.json.JSONObject jSONObject = this.f266780e;
                this.f266779d = 1;
                obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new fu0.o(jSONObject, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            mVar = (fu0.m) obj;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.MusicPicking", "prepareRecommendContext: exception=" + e17.getMessage());
            mVar = null;
        }
        fu0.l lVar = this.f266781f;
        boolean z17 = lVar.f266789c;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            return f0Var;
        }
        try {
            fu0.l.a(lVar, this.f266782g, this.f266783h, mVar);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MJCC.MusicPicking", "showMusicPicker: exception=" + e18.getMessage());
            lVar.c(null, false);
        }
        return f0Var;
    }
}
