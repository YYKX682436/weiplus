package et0;

/* loaded from: classes14.dex */
public class k implements et0.q {

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f256543d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f256544e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f256545f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f256546g;

    /* renamed from: h, reason: collision with root package name */
    public ms0.c f256547h;

    /* renamed from: i, reason: collision with root package name */
    public ft0.d f256548i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f256549m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f256550n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f256551o = new java.util.ArrayList();

    public k() {
        a();
    }

    public final void a() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("CameraPreviewTextureView_renderThread", -2);
        a17.start();
        this.f256546g = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f256551o;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l((yz5.a) it.next());
        }
        this.f256545f = a17;
    }

    @Override // et0.q
    public android.opengl.EGLContext getEGLContext() {
        rs0.h hVar = this.f256543d;
        if (hVar != null) {
            return hVar.f399294c;
        }
        return null;
    }

    @Override // et0.q
    public di3.o getFrameDataCallback() {
        ft0.d dVar = this.f256548i;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // et0.q
    public is0.c getPreviewTexture() {
        ms0.c cVar = this.f256547h;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    @Override // et0.q
    public void j() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLTextureRender", "tryStopCameraPreview", new java.lang.Object[0]);
        this.f256550n = null;
    }

    @Override // et0.r
    public void l(final yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f256546g;
        if (n3Var == null) {
            this.f256551o.add(r17);
        } else if (n3Var != null) {
            n3Var.post(new java.lang.Runnable(r17) { // from class: et0.j

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f256542d;

                {
                    kotlin.jvm.internal.o.g(r17, "function");
                    this.f256542d = r17;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f256542d.invoke();
                }
            });
        }
    }

    @Override // et0.q
    public void m(ms0.c renderer, boolean z17) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureRender", "setRenderer:" + renderer.hashCode() + "  cpuCrop:" + z17);
        ft0.d dVar = this.f256548i;
        if (dVar != null) {
            ft0.d.h(dVar, false, false, 3, null);
        }
        ft0.d fVar = z17 ? new ft0.f(this) : new ft0.h(this);
        this.f256548i = fVar;
        fVar.i(renderer);
        this.f256547h = renderer;
    }

    @Override // et0.q
    public void release() {
        l(new et0.h(this));
    }

    @Override // et0.r
    public void requestRender() {
        l(new et0.i(this));
    }

    @Override // et0.q
    public void setOnDrawListener(yz5.l lVar) {
        ft0.d dVar = this.f256548i;
        if (dVar != null) {
            dVar.f266464e = lVar;
        }
    }

    @Override // et0.q
    public void u(yz5.l lVar) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLTextureRender", "tryCameraPreview canPreview:" + this.f256549m, new java.lang.Object[0]);
        if (!this.f256549m) {
            this.f256550n = lVar;
        } else if (lVar != null) {
            ft0.d dVar = this.f256548i;
            lVar.invoke(dVar != null ? dVar.b() : null);
        }
    }

    @Override // et0.q
    public void w(ts0.c cameraConfig) {
        kotlin.jvm.internal.o.g(cameraConfig, "cameraConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureRender", "updateCameraConfig: " + cameraConfig);
        ft0.d dVar = this.f256548i;
        if (dVar != null) {
            dVar.j(cameraConfig);
        }
    }

    @Override // et0.q
    public void y() {
        ms0.c cVar;
        ft0.d dVar = this.f256548i;
        if (dVar == null || (cVar = dVar.f266462c) == null) {
            return;
        }
        cVar.f330955k = true;
    }
}
