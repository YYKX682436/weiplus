package nr0;

/* loaded from: classes14.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339104d = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.s(this.f339104d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr0.s sVar = (nr0.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "unbindSurface");
        rs0.g gVar = rs0.i.f399296a;
        nr0.x xVar = this.f339104d;
        rs0.h hVar = xVar.f339123o;
        android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
        kotlin.jvm.internal.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
        gVar.p(hVar, EGL_NO_SURFACE);
        xVar.f339129u = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "unbindSurface finish");
        return jz5.f0.f302826a;
    }
}
