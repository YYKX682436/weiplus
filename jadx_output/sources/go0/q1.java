package go0;

/* loaded from: classes14.dex */
public final class q1 implements com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener, go0.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f273820d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273821e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f273822f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.HandlerThread f273823g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f273824h;

    /* renamed from: i, reason: collision with root package name */
    public rs0.h f273825i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f273826m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f273827n;

    /* renamed from: o, reason: collision with root package name */
    public go0.s1 f273828o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f273829p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f273830q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f273831r;

    public q1(java.lang.String userId, int i17) {
        kotlin.jvm.internal.o.g(userId, "userId");
        this.f273820d = userId;
        this.f273821e = i17;
        this.f273822f = "LiveVisitorRenderSurface_" + userId + '_' + hashCode();
        int i18 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("MicroMsg.LiveCoreVisitor_render", 10);
        this.f273823g = a17;
        this.f273829p = true;
        boolean n17 = fn0.g.f264195a.n();
        this.f273831r = n17;
        a17.start();
        this.f273824h = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper(), new go0.h1(this));
        if (!n17) {
            c(new go0.j1(this));
        }
        c(new go0.i1(this));
    }

    @Override // go0.i0
    public void a(java.lang.Object obj, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f273822f, "setOutputSurface:" + obj);
        c(new go0.m1(obj, this));
    }

    public final void c(final yz5.a aVar) {
        if (this.f273823g.isAlive()) {
            if (aVar != null) {
                this.f273824h.post(new java.lang.Runnable(aVar) { // from class: go0.l1

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.a f273798d;

                    {
                        kotlin.jvm.internal.o.g(aVar, "function");
                        this.f273798d = aVar;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f273798d.invoke();
                    }
                });
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f273822f, "eglThread is not alive, callback: " + aVar);
    }

    public final void d(int i17, int i18) {
        c(new go0.o1(this, i17, i18));
    }

    public final void e(int i17) {
        c(new go0.p1(this, i17));
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener
    public void onRenderVideoFrame(java.lang.String str, int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (kotlin.jvm.internal.o.b(str, this.f273820d) && i17 == this.f273821e) {
            this.f273824h.obtainMessage(1024, tRTCVideoFrame).sendToTarget();
        }
    }
}
