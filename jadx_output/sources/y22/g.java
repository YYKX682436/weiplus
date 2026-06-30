package y22;

/* loaded from: classes10.dex */
public final class g implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final d32.n f459084d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f459085e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f459086f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f459087g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f459088h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f459089i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f459090m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f459091n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f459092o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f459093p;

    public g(d32.n renderer) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        this.f459084d = renderer;
        this.f459085e = "MicroMsg.EmojiCaptureRenderSurface";
        this.f459093p = new java.util.ArrayList();
        a();
        renderer.f330961q = new y22.a(this);
    }

    public final void a() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("EmojiCaptureRenderSurface_renderThread", -2);
        a17.start();
        this.f459090m = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f459093p;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b((yz5.a) it.next());
        }
        this.f459089i = a17;
    }

    public final void b(final yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f459090m;
        if (n3Var == null) {
            this.f459093p.add(r17);
        } else if (n3Var != null) {
            n3Var.post(new java.lang.Runnable(r17) { // from class: y22.f

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f459083d;

                {
                    kotlin.jvm.internal.o.g(r17, "function");
                    this.f459083d = r17;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f459083d.invoke();
                }
            });
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i(this.f459085e, "onSurfaceTextureAvailable: ");
        if (this.f459090m == null) {
            a();
        }
        b(new y22.b(this, surfaceTexture, i17, i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i(this.f459085e, "onSurfaceTextureDestroyed: ");
        b(new y22.c(this));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i(this.f459085e, "onSurfaceTextureSizeChanged: ");
        b(new y22.d(this, i17, i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
