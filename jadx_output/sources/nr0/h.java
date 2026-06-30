package nr0;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339083d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339085f = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        nr0.h hVar = new nr0.h(this.f339085f, continuation);
        hVar.f339084e = obj;
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339083d;
        nr0.x xVar = this.f339085f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f339084e;
            zr0.p pVar = xVar.f339122n;
            this.f339084e = y0Var2;
            this.f339083d = 1;
            if (pVar.j(this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f339084e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        is0.c cVar = xVar.f339118g;
        if (cVar != null) {
            cVar.close();
        }
        rs0.i.f399296a.u(xVar.f339123o);
        xVar.f339123o = null;
        xVar.f339117f = null;
        android.os.HandlerThread handlerThread = xVar.f339116e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        xVar.f339116e = null;
        android.graphics.SurfaceTexture surfaceTexture = xVar.f339119h;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        xVar.f339119h = null;
        android.view.Surface surface = xVar.f339120i;
        if (surface != null) {
            surface.release();
        }
        xVar.f339120i = null;
        kotlinx.coroutines.y0 y0Var3 = xVar.f339124p;
        if (y0Var3 != null) {
            kotlinx.coroutines.z0.c(y0Var3, null);
        }
        xVar.f339124p = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "destroyGLEnv finish hash:" + y0Var.hashCode());
        return jz5.f0.f302826a;
    }
}
