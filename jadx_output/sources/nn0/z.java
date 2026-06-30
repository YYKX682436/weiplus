package nn0;

/* loaded from: classes14.dex */
public final class z extends nn0.s implements nn0.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f338608d = "Finder.OptSVCustomRender_" + hashCode();
    }

    @Override // nn0.s
    public boolean b(nn0.b bVar, java.lang.Object obj) {
        return false;
    }

    @Override // nn0.s, nn0.o
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f338608d, "pause: ");
        h(z17);
    }

    @Override // nn0.p
    public android.opengl.EGLContext getEGLContext() {
        nn0.b bVar = this.f338620s;
        if (bVar != null) {
            return bVar.E;
        }
        return null;
    }

    @Override // nn0.s
    public void i(nn0.b bVar, android.view.Surface surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        if (bVar != null) {
            try {
                bVar.i(surface);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f338608d, e17, "CustomGLRenderImp eglSetupSurface failed!", new java.lang.Object[0]);
            }
        }
    }

    @Override // nn0.s
    public void j(com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture) {
        nn0.b bVar = this.f338620s;
        boolean z17 = false;
        if (bVar != null && bVar.f338552w) {
            z17 = true;
        }
        if (!z17) {
            java.lang.String str = this.f338608d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("renderInternal: render error, has not init, isIsEGLInit=");
            nn0.b bVar2 = this.f338620s;
            sb6.append(bVar2 != null ? java.lang.Boolean.valueOf(bVar2.f338552w) : null);
            com.tencent.mars.xlog.Log.w(str, sb6.toString());
            return;
        }
        if (bVar.E != null) {
            super.j(tXLiteAVTexture);
            return;
        }
        java.lang.String str2 = this.f338608d;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("renderInternal: render error, egl context is null, mCustomGLRenderImp.eglContext14=");
        sb7.append(this.f338620s.E);
        sb7.append(", txLiteAVTexture?.eglContext=");
        sb7.append(tXLiteAVTexture != null ? tXLiteAVTexture.eglContext : null);
        com.tencent.mars.xlog.Log.w(str2, sb7.toString());
    }

    @Override // nn0.s, nn0.o
    public void n7(int i17) {
        this.B = i17;
        pn0.b bVar = this.f338613i;
        if (bVar != null) {
            ((pn0.a) bVar).f356941e = i17;
        }
        this.f338609e = i17 == 2;
    }

    @Override // nn0.p
    public void release() {
        nn0.q qVar;
        com.tencent.mars.xlog.Log.i(this.f338608d, "release: ");
        synchronized (this) {
            nn0.b bVar = this.f338620s;
            if (bVar != null && (qVar = this.f338612h) != null) {
                qVar.obtainMessage(3, bVar).sendToTarget();
            }
        }
        l();
    }

    @Override // nn0.s, nn0.o
    public void startPlay() {
        com.tencent.mars.xlog.Log.i(this.f338608d, "startPlay: ");
        g();
    }

    @Override // nn0.s, nn0.o
    public void stopPlay(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f338608d, "stopPlay: ");
        h(z17);
    }

    @Override // nn0.p
    public void y4(yz5.a afterInit) {
        kotlin.jvm.internal.o.g(afterInit, "afterInit");
        e();
        nn0.y yVar = new nn0.y(this, afterInit);
        nn0.q qVar = this.f338612h;
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e(this.f338608d, "queue: gl handler is null");
        } else {
            qVar.post(yVar);
        }
    }
}
