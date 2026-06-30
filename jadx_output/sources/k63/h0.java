package k63;

/* loaded from: classes14.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.m0 f304545d;

    public h0(k63.m0 m0Var) {
        this.f304545d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        k63.m0 m0Var = this.f304545d;
        m0Var.getClass();
        m0Var.getClass();
        k63.w wVar = m0Var.f304561o;
        if (wVar != null) {
            java.lang.System.currentTimeMillis();
            long j17 = m0Var.f304562p;
            m0Var.f304562p = java.lang.System.currentTimeMillis();
            is0.c c17 = m0Var.f304557h.c();
            wVar.H = c17 != null ? c17.f294395e : -1;
            wVar.o();
            java.lang.System.currentTimeMillis();
            is0.c cVar = wVar.f348000i;
            if (cVar != null) {
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                android.opengl.EGLContext eglContext = m0Var.c().f399294c;
                int i17 = cVar.f294395e;
                int i18 = cVar.f294400m;
                int i19 = cVar.f294401n;
                ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
                kotlin.jvm.internal.o.g(eglContext, "eglContext");
                tn0.w0 w0Var2 = dk2.ef.f233378d;
                if (w0Var2 != null) {
                    w0Var2.s0(eglContext, i17, i18, i19, 0L, false);
                }
                if (java.lang.System.currentTimeMillis() - m0Var.f304563q > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                    m0Var.f304563q = java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveRenderManager", "send external data: " + cVar.f294395e + " size:" + cVar.f294400m + ' ' + cVar.f294401n + " cost:" + (java.lang.System.currentTimeMillis() - m0Var.f304562p));
                }
            }
        }
    }
}
