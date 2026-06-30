package jj3;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jj3.c f300018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(jj3.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300018d = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jj3.i(this.f300018d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jj3.i iVar = (jj3.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.RenderTargetHolder", "release surface " + this.f300018d, new java.lang.Object[0]);
        jj3.c cVar = this.f300018d;
        android.opengl.EGLSurface eGLSurface = cVar.f300006c;
        if (eGLSurface != null) {
            android.opengl.EGLDisplay eGLDisplay = cVar.f300007d;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            jj3.c cVar2 = this.f300018d;
            cVar2.f300006c = android.opengl.EGL14.EGL_NO_SURFACE;
            cVar2.f300008e = false;
        }
        return jz5.f0.f302826a;
    }
}
