package mw1;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw1.b f331695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mw1.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331695d = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mw1.d(this.f331695d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mw1.d dVar = (mw1.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.RenderTargetHolder", "release surface " + this.f331695d, new java.lang.Object[0]);
        mw1.b bVar = this.f331695d;
        android.opengl.EGLSurface eGLSurface = bVar.f331692c;
        if (eGLSurface != null) {
            android.opengl.EGLDisplay eGLDisplay = bVar.f331693d;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            mw1.b bVar2 = this.f331695d;
            bVar2.f331692c = android.opengl.EGL14.EGL_NO_SURFACE;
            bVar2.f331694e = false;
        }
        return jz5.f0.f302826a;
    }
}
