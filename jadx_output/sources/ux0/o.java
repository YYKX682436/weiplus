package ux0;

/* loaded from: classes14.dex */
public final class o implements ux0.d, android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f431825d;

    /* renamed from: e, reason: collision with root package name */
    public volatile android.view.Surface f431826e;

    /* renamed from: f, reason: collision with root package name */
    public pp0.p0 f431827f;

    /* renamed from: g, reason: collision with root package name */
    public rs0.h f431828g;

    /* renamed from: h, reason: collision with root package name */
    public is0.c f431829h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f431830i;

    /* renamed from: m, reason: collision with root package name */
    public ux0.i f431831m;

    /* renamed from: n, reason: collision with root package name */
    public ux0.h f431832n;

    /* renamed from: o, reason: collision with root package name */
    public ux0.h f431833o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f431835q;

    /* renamed from: s, reason: collision with root package name */
    public final android.os.HandlerThread f431837s;

    /* renamed from: t, reason: collision with root package name */
    public final android.os.Handler f431838t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f431839u;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f431834p = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public xr0.j f431836r = new xr0.j(0, 0);

    public o(int i17) {
        this.f431825d = i17;
        int i18 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("ShootComposing-Use", -2);
        this.f431837s = a17;
        this.f431839u = new java.util.ArrayList();
        a17.start();
        this.f431838t = new android.os.Handler(a17.getLooper());
    }

    public static final void e(ux0.o oVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) oVar.f431839u;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ux0.c) it.next()).f431785a.close();
        }
        arrayList.clear();
        ux0.i iVar = oVar.f431831m;
        if (iVar != null) {
            for (ux0.c cVar : iVar.f431813b) {
                cVar.f431785a.close();
            }
        }
        oVar.f431831m = null;
        ux0.h hVar = oVar.f431832n;
        if (hVar != null) {
            int[] iArr = hVar.f431803d;
            if (iArr[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
                iArr[0] = 0;
            }
            int i17 = hVar.f431804e;
            if (i17 != 0) {
                android.opengl.GLES20.glDeleteProgram(i17);
                hVar.f431804e = 0;
            }
        }
        oVar.f431832n = null;
        ux0.h hVar2 = oVar.f431833o;
        if (hVar2 != null) {
            int[] iArr2 = hVar2.f431803d;
            if (iArr2[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr2, 0);
                iArr2[0] = 0;
            }
            int i18 = hVar2.f431804e;
            if (i18 != 0) {
                android.opengl.GLES20.glDeleteProgram(i18);
                hVar2.f431804e = 0;
            }
        }
        oVar.f431833o = null;
        is0.c cVar2 = oVar.f431829h;
        if (cVar2 != null) {
            cVar2.close();
        }
        oVar.f431829h = null;
        rs0.h hVar3 = oVar.f431828g;
        if (hVar3 != null) {
            rs0.i.f399296a.u(hVar3);
            oVar.f431828g = null;
        }
    }

    public static final void f(ux0.o oVar, pp0.p0 p0Var, xr0.j jVar) {
        synchronized (oVar.f431834p) {
            oVar.f431835q = false;
        }
        oVar.f431828g = rs0.i.f399296a.m(null, null, 1, 1, p0Var.J0());
        oVar.f431829h = new is0.c(false, 24L);
        is0.c cVar = oVar.f431829h;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar != null ? cVar.f294395e : 0);
        surfaceTexture.setDefaultBufferSize(jVar.f456173a, jVar.f456174b);
        surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f431838t);
        oVar.f431830i = surfaceTexture;
        oVar.f431826e = new android.view.Surface(oVar.f431830i);
        oVar.f431831m = new ux0.i(oVar.f431825d, jVar);
        oVar.f431832n = new ux0.h(ux0.g.TEXTURE_OES, true);
    }

    @Override // ux0.d
    public void a(com.tencent.maas.camstudio.frame.VideoFrame frame) {
        kotlin.jvm.internal.o.g(frame, "frame");
        if (!(frame instanceof ux0.c)) {
            throw new java.lang.IllegalArgumentException("frame is not CamSessionTextureVideoFrame");
        }
        this.f431838t.post(new ux0.m(this, frame));
    }

    @Override // ux0.d
    public java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        this.f431838t.post(new ux0.j(this, nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // ux0.d
    public void c() {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ux0.n nVar = new ux0.n(this);
            android.os.HandlerThread handlerThread = this.f431837s;
            if (handlerThread.isAlive()) {
                this.f431838t.post(nVar);
            }
            kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(handlerThread.quitSafely()));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    @Override // ux0.d
    public void d(pp0.p0 camManager, xr0.j frameSize) {
        kotlin.jvm.internal.o.g(camManager, "camManager");
        kotlin.jvm.internal.o.g(frameSize, "frameSize");
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        ux0.k kVar = new ux0.k(countDownLatch, this, frameSize, camManager);
        if (this.f431837s.isAlive()) {
            this.f431838t.post(kVar);
        }
        countDownLatch.await();
    }

    @Override // ux0.d
    public android.view.Surface getSurface() {
        return this.f431826e;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Object m521constructorimpl;
        ux0.c cVar;
        int i17;
        int i18;
        xr0.j jVar;
        synchronized (this.f431834p) {
            if (surfaceTexture == null) {
                return;
            }
            if (this.f431828g == null) {
                return;
            }
            if (this.f431835q) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    surfaceTexture.updateTexImage();
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                return;
            }
            ux0.h hVar = this.f431832n;
            if (hVar == null) {
                return;
            }
            ux0.i iVar = this.f431831m;
            if (iVar == null) {
                return;
            }
            pp0.p0 p0Var = this.f431827f;
            if (p0Var == null) {
                return;
            }
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(hVar.f431802c);
                iVar.f431813b[iVar.f431814c].a();
                int i19 = iVar.f431814c;
                iVar.f431814c = (i19 + 1) % iVar.f431812a;
                cVar = iVar.f431813b[i19];
                cVar.f431786b = surfaceTexture.getTimestamp();
                is0.c cVar2 = this.f431829h;
                i17 = cVar2 != null ? cVar2.f294395e : 0;
                i18 = cVar.f431785a.f294395e;
                jVar = this.f431836r;
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            if (!hVar.c(i17, i18, jVar.f456173a, jVar.f456174b)) {
                com.tencent.mars.xlog.Log.e("TextureVideoFrameSender", "Failed to render texture");
                return;
            }
            cVar.f431787c = android.opengl.GLES30.glFenceSync(37143, 0);
            android.opengl.GLES20.glFlush();
            p0Var.d0(cVar);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("TextureVideoFrameSender", "Failed to render: " + m524exceptionOrNullimpl);
            }
            return;
        }
    }

    @Override // ux0.d
    public void onPause() {
        synchronized (this.f431834p) {
            this.f431835q = true;
        }
    }

    @Override // ux0.d
    public void onResume() {
        synchronized (this.f431834p) {
            this.f431835q = false;
        }
    }

    @Override // ux0.d
    public void release() {
        ux0.l lVar = new ux0.l(this);
        if (this.f431837s.isAlive()) {
            this.f431838t.post(lVar);
        }
    }
}
