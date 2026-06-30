package wf2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.j f445566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wf2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445566e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wf2.c(this.f445566e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wf2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        kotlinx.coroutines.r2 r2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f445565d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        wf2.j jVar = this.f445566e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames fetching stream frame");
                this.f445565d = 1;
                obj = wf2.j.a7(jVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            bitmap = (android.graphics.Bitmap) obj;
            r2Var = jVar.f445589r;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveScreenShotEventSubscribeController", e17, "#fetchAndCacheFrames failed", new java.lang.Object[0]);
            java.lang.String str = wf2.j.f445583v;
            jVar.b7();
        }
        if (!(r2Var != null && r2Var.a())) {
            com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames fetch stream frame done but job is not active");
            return f0Var;
        }
        jVar.f445586o = bitmap;
        dk2.u4 u4Var = ((mm2.o4) jVar.business(mm2.o4.class)).Z;
        java.lang.Integer num = u4Var != null ? new java.lang.Integer(u4Var.f234158e) : null;
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames battleStatus=" + num);
        if (num != null && num.intValue() == 2) {
            com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames fetching pk frame");
            jVar.f445587p = wf2.j.Z6(jVar);
        }
        jVar.f445588q = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#fetchAndCacheFrames success, streamFrame=");
        sb6.append(jVar.f445586o != null);
        sb6.append(", pkFrame=");
        if (jVar.f445587p == null) {
            z17 = false;
        }
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", sb6.toString());
        return f0Var;
    }
}
