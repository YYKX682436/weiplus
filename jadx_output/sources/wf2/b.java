package wf2;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.j f445564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wf2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445564e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wf2.b(this.f445564e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wf2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f445563d;
        wf2.j jVar = this.f445564e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = jVar.f445589r;
            if (r2Var != null) {
                this.f445563d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (jVar.f445586o != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#executeWork calling entrance show with cached frames");
            android.graphics.Bitmap bitmap = jVar.f445586o;
            kotlin.jvm.internal.o.d(bitmap);
            android.graphics.Bitmap bitmap2 = jVar.f445587p;
            android.graphics.Bitmap bitmap3 = jVar.f445588q;
            jVar.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveScreenShotEventSubscribeController", "#callEntranceShow");
            wf2.a0 a0Var = (wf2.a0) jVar.controller(wf2.a0.class);
            if (a0Var != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveScreenShotShareEntranceController", "#showEntrance bitmap.width=" + bitmap.getWidth() + " height=" + bitmap.getHeight());
                kotlinx.coroutines.r2 r2Var2 = a0Var.f445562s;
                if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
                    com.tencent.mars.xlog.Log.i("FinderLiveScreenShotShareEntranceController", "#showEntrance clickJob?.isActive, return.");
                } else {
                    a0Var.f445557n = null;
                    a0Var.f445558o = null;
                    kotlinx.coroutines.r2 r2Var3 = a0Var.f445561r;
                    if (r2Var3 != null) {
                        kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
                    }
                    a0Var.f445561r = com.tencent.mm.plugin.finder.live.util.y.d(a0Var, null, null, new wf2.z(a0Var, bitmap2, bitmap3, bitmap, null), 3, null);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveScreenShotEventSubscribeController", "#executeWork cachedStreamFrame is null, cannot show entrance");
        }
        return jz5.f0.f302826a;
    }
}
