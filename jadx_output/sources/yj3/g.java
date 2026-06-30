package yj3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f462675a;

    /* renamed from: b, reason: collision with root package name */
    public int f462676b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f462677c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f462678d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.HandlerThread f462679e;

    /* renamed from: f, reason: collision with root package name */
    public os0.c f462680f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f462681g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.q f462682h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f462683i;

    /* renamed from: j, reason: collision with root package name */
    public rs0.h f462684j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f462685k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f462686l;

    public g(int i17, int i18, yz5.l init) {
        kotlin.jvm.internal.o.g(init, "init");
        this.f462675a = i17;
        this.f462676b = i18;
        this.f462677c = init;
        java.lang.String str = "MicroMsg.ScreenProjectCanvasRendererMgr" + hashCode();
        int i19 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(str, 10);
        this.f462679e = a17;
        this.f462686l = jz5.h.b(yj3.b.f462670d);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectCanvasRendererMgr", "device height is " + this.f462675a + " and " + this.f462676b);
        a17.start();
        this.f462678d = new android.os.Handler(a17.getLooper());
        a(new yj3.a(this));
    }

    public final void a(final yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!this.f462679e.isAlive()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectCanvasRendererMgr", "queue in error");
        } else {
            this.f462678d.post(new java.lang.Runnable(callback) { // from class: yj3.d

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f462672d;

                {
                    kotlin.jvm.internal.o.g(callback, "function");
                    this.f462672d = callback;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f462672d.invoke();
                }
            });
        }
    }

    public final void b(int i17, int i18) {
        os0.c cVar = this.f462680f;
        if (cVar != null) {
            cVar.w(i17, i18);
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f462681g;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i17, i18);
        }
        if (i17 < i18) {
            os0.c cVar2 = this.f462680f;
            if (cVar2 != null) {
                cVar2.f348005n = 270;
            }
            if (cVar2 != null) {
                cVar2.f348006o = false;
            }
            if (cVar2 != null) {
                cVar2.f348007p = false;
            }
            if (cVar2 != null) {
                cVar2.u(i18, i17);
            }
            os0.c cVar3 = this.f462680f;
            if (cVar3 != null) {
                cVar3.t(i18, i17);
            }
        } else {
            os0.c cVar4 = this.f462680f;
            if (cVar4 != null) {
                cVar4.f348005n = 0;
            }
            if (cVar4 != null) {
                cVar4.f348007p = true;
            }
            if (cVar4 != null) {
                cVar4.f348006o = true;
            }
            if (cVar4 != null) {
                cVar4.u(i17, i18);
            }
            os0.c cVar5 = this.f462680f;
            if (cVar5 != null) {
                cVar5.t(i17, i18);
            }
        }
        this.f462675a = i17;
        this.f462676b = i18;
        os0.c cVar6 = this.f462680f;
        if (cVar6 != null) {
            cVar6.f348013v = true;
        }
    }
}
