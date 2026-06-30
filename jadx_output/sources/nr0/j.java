package nr0;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339088e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.j(this.f339088e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339087d;
        nr0.x xVar = this.f339088e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.Surface surface = xVar.f339120i;
            if (!(surface != null && surface.isValid())) {
                this.f339087d = 1;
                if (xVar.m("getGLInputTexture", new nr0.k(xVar, true, null), this) == aVar) {
                    return aVar;
                }
            }
            return xVar.f339120i;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        xVar.f339120i = new android.view.Surface(xVar.f339119h);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create texture:[");
        sb6.append(xVar.f339118g);
        sb6.append("] surface:[");
        android.view.Surface surface2 = xVar.f339120i;
        sb6.append(surface2 != null ? new java.lang.Integer(surface2.hashCode()) : null);
        sb6.append("] name:");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", sb6.toString());
        return xVar.f339120i;
    }
}
