package dr4;

/* loaded from: classes14.dex */
public final class h extends dr4.d2 {
    public dr4.q A;
    public android.util.Size B;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.p f242635w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f242636x;

    /* renamed from: y, reason: collision with root package name */
    public android.media.ImageReader f242637y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f242638z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.p scope) {
        super(true, scope);
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f242635w = scope;
    }

    public static final void n(dr4.h hVar, android.util.Size size) {
        boolean z17;
        java.lang.Object obj;
        hVar.getClass();
        if (!vq4.b0.q() || size.getWidth() <= 1 || size.getHeight() <= 1) {
            return;
        }
        android.media.ImageReader imageReader = hVar.f242637y;
        if (imageReader != null) {
            if (imageReader.getWidth() == size.getWidth()) {
                return;
            }
        }
        android.media.ImageReader imageReader2 = hVar.f242637y;
        if (imageReader2 != null) {
            imageReader2.close();
        }
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(size.getWidth(), size.getHeight(), 1, 1);
        if (newInstance == null) {
            return;
        }
        hVar.f242637y = newInstance;
        android.view.Surface surface = newInstance.getSurface();
        kotlin.jvm.internal.o.f(surface, "getSurface(...)");
        hVar.A = new dr4.q(surface, size.getWidth(), size.getHeight());
        pq4.c l17 = hVar.f242636x ? gq4.v.Bi().l("ENCODE") : gq4.v.Bi().l("CAMERA");
        dr4.q qVar = hVar.A;
        kotlin.jvm.internal.o.d(qVar);
        rs0.h hVar2 = l17 != null ? l17.f357683d : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.RenderTools", "createSurface:" + qVar);
        if (qVar.b()) {
            synchronized (qVar.f242733f) {
                z17 = qVar.f242732e;
            }
            if (!z17 && (obj = qVar.f242729b) != null && hVar2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RenderTools", "start createEGLSurface:" + obj.hashCode());
                qVar.f242730c = rs0.i.f399296a.k(hVar2.f399292a, obj);
                qVar.c(false);
                com.tencent.mars.xlog.Log.i("MicroMsg.RenderTools", "createSurface finished:" + obj.hashCode() + ", " + qVar.a().hashCode());
            }
        }
        android.media.ImageReader imageReader3 = hVar.f242637y;
        if (imageReader3 != null) {
            imageReader3.setOnImageAvailableListener(new dr4.e(hVar), null);
        }
    }

    public static final void o(dr4.h hVar, java.nio.ByteBuffer byteBuffer, int i17, int i18, boolean z17) {
        int i19;
        hVar.getClass();
        if (z17) {
            i19 = gq4.v.Bi().i(null, 0, 0, i17, i18, 1, true);
        } else {
            if (byteBuffer == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EncodeWindowSurfaceRenderer", "send data is null and should not allowed to send");
                return;
            }
            i19 = gq4.v.Bi().i(byteBuffer, byteBuffer.capacity(), 4, i17, i18, 0, false);
        }
        yz5.q qVar = hVar.f242693s;
        if (qVar != null) {
        }
    }

    @Override // dr4.d2, dr4.o
    public void b(yz5.l lVar, dr4.c0 c0Var, boolean z17) {
        if (c0Var != null) {
            rs0.h hVar = c0Var.f242601d;
            android.opengl.EGLContext eGLContext = hVar != null ? hVar.f399294c : null;
            if (eGLContext != null) {
                this.f242622u = eGLContext;
                m(true);
            }
            dr4.b bVar = new dr4.b(this);
            java.util.ArrayList arrayList = c0Var.f242611n;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
            int i17 = c0Var.f242598a;
            this.f242688n = i17;
            int i18 = c0Var.f242599b;
            this.f242689o = i18;
            dr4.r1 r1Var = this.f242686l;
            if (r1Var != null) {
                r1Var.w(i17, i18);
            }
        }
    }

    @Override // dr4.d2, dr4.o
    public void d(final yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f242635w.invoke(this.f242636x ? "ENCODE" : "CAMERA", new java.lang.Runnable(callback) { // from class: dr4.g

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f242632d;

            {
                kotlin.jvm.internal.o.g(callback, "function");
                this.f242632d = callback;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f242632d.invoke();
            }
        });
    }

    @Override // dr4.o
    public void f() {
        com.tencent.mars.xlog.Log.e("MicroMsg.EncodeWindowSurfaceRenderer", "do release encode surface render ");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f242638z;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        this.f242638z = null;
        android.media.ImageReader imageReader = this.f242637y;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    @Override // dr4.d2, dr4.o
    public void h() {
        d(new dr4.f(this));
    }

    @Override // dr4.d2, dr4.o
    public void l(android.util.Size renderSize) {
        kotlin.jvm.internal.o.g(renderSize, "renderSize");
        super.l(renderSize);
        this.B = renderSize;
    }

    @Override // dr4.d2
    public void m(boolean z17) {
        vq4.b0 b0Var = vq4.b0.f439270a;
        this.f242636x = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_encode_thread_independence_new, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.EncodeWindowSurfaceRenderer", "encodeThreadProcess:" + this.f242636x);
        if (!this.f242636x) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("encodeVoipHandler");
            this.f242638z = n3Var;
            n3Var.setLogging(false);
        }
        if (this.f242621t) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EncodeWindowSurfaceRenderer", "createEGLContext, isUseShareContext:" + z17 + ", shareGLContext:" + this.f242622u);
        if (this.f242622u == null) {
            return;
        }
        d(new dr4.d(this));
        this.f242621t = true;
    }
}
