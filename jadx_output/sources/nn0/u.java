package nn0;

/* loaded from: classes14.dex */
public final class u extends nn0.h implements nn0.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f338563d = "OptCustomRender_" + hashCode();
    }

    @Override // nn0.h
    public boolean a(nn0.b bVar, java.lang.Object obj) {
        return false;
    }

    @Override // nn0.h, nn0.o
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f338563d, "pause: ");
        e(z17);
    }

    @Override // nn0.h
    public void g(nn0.b bVar, android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        try {
            android.view.Surface surface = this.f338573q;
            if (surface == null) {
                surface = new android.view.Surface(surfaceTexture);
            }
            this.f338574r = surface;
            if (bVar != null) {
                bVar.i(surface);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f338563d, e17, "CustomGLRenderImp eglSetupSurface failed!", new java.lang.Object[0]);
        }
    }

    @Override // nn0.p
    public android.opengl.EGLContext getEGLContext() {
        nn0.b bVar = this.A;
        if (bVar != null) {
            return bVar.E;
        }
        return null;
    }

    @Override // nn0.h
    public void h(com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture) {
        nn0.b bVar = this.A;
        boolean z17 = false;
        if (bVar != null && bVar.f338552w) {
            z17 = true;
        }
        if (!z17) {
            java.lang.String str = this.f338563d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("renderInternal: render error, has not init, isIsEGLInit=");
            nn0.b bVar2 = this.A;
            sb6.append(bVar2 != null ? java.lang.Boolean.valueOf(bVar2.f338552w) : null);
            com.tencent.mars.xlog.Log.w(str, sb6.toString());
            return;
        }
        if (bVar.E != null) {
            super.h(tXLiteAVTexture);
            return;
        }
        java.lang.String str2 = this.f338563d;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("renderInternal: render error, egl context is null, mCustomGLRenderImp.eglContext14=");
        sb7.append(this.A.E);
        sb7.append(", txLiteAVTexture?.eglContext=");
        sb7.append(tXLiteAVTexture != null ? tXLiteAVTexture.eglContext : null);
        com.tencent.mars.xlog.Log.w(str2, sb7.toString());
    }

    @Override // nn0.h, nn0.o
    public void n7(int i17) {
        this.N = i17;
        this.f338564e = i17 == 2;
    }

    @Override // nn0.p
    public void release() {
        nn0.g gVar;
        com.tencent.mars.xlog.Log.i(this.f338563d, "release: ");
        synchronized (this) {
            nn0.b bVar = this.A;
            if (bVar != null && (gVar = this.f338567h) != null) {
                gVar.obtainMessage(3, bVar).sendToTarget();
            }
        }
        i();
    }

    @Override // nn0.h, nn0.o
    public void startPlay() {
        com.tencent.mars.xlog.Log.i(this.f338563d, "startPlay: ");
        d();
    }

    @Override // nn0.h, nn0.o
    public void stopPlay(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f338563d, "stopPlay: ");
        e(z17);
    }

    @Override // nn0.p
    public void y4(yz5.a afterInit) {
        kotlin.jvm.internal.o.g(afterInit, "afterInit");
        c();
        nn0.t tVar = new nn0.t(this, afterInit);
        nn0.g gVar = this.f338567h;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e(this.f338563d, "queue: gl handler is null");
        } else {
            gVar.post(tVar);
        }
    }
}
