package si0;

/* loaded from: classes13.dex */
public final class l0 implements si0.o0 {
    public final android.animation.ValueAnimator.AnimatorUpdateListener A;
    public final android.animation.Animator.AnimatorListener B;
    public si0.b C;
    public long D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f408098a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry f408099b;

    /* renamed from: c, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f408100c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f408101d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.LruCache f408102e;

    /* renamed from: f, reason: collision with root package name */
    public org.libpag.PAGPlayer f408103f;

    /* renamed from: g, reason: collision with root package name */
    public org.libpag.PAGFile f408104g;

    /* renamed from: h, reason: collision with root package name */
    public org.libpag.PAGSurface f408105h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.pigeon.flutter_pag.FlutterPAGInfo f408106i;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.view.TextureRegistry.SurfaceProducer f408107j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.pigeon.flutter_pag.PAGViewListenerApi f408108k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f408109l;

    /* renamed from: m, reason: collision with root package name */
    public double f408110m;

    /* renamed from: n, reason: collision with root package name */
    public long f408111n;

    /* renamed from: o, reason: collision with root package name */
    public final android.animation.ValueAnimator f408112o;

    /* renamed from: p, reason: collision with root package name */
    public long f408113p;

    /* renamed from: q, reason: collision with root package name */
    public int f408114q;

    /* renamed from: r, reason: collision with root package name */
    public int f408115r;

    /* renamed from: s, reason: collision with root package name */
    public double f408116s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f408117t;

    /* renamed from: u, reason: collision with root package name */
    public final oz5.l f408118u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f408119v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f408120w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f408121x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f408122y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f408123z;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(android.content.Context context, io.flutter.view.TextureRegistry textureRegistry, io.flutter.plugin.common.BinaryMessenger binaryMessenger, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(textureRegistry, "textureRegistry");
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        this.f408098a = context;
        this.f408099b = textureRegistry;
        this.f408100c = binaryMessenger;
        this.f408101d = "MicroMsg.FlutterPAGViewControllerOrigin@" + j17;
        this.f408102e = new android.util.LruCache(128);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        kotlin.jvm.internal.o.f(ofFloat, "ofFloat(...)");
        this.f408112o = ofFloat;
        this.f408116s = 1.0d;
        this.f408117t = kotlinx.coroutines.z0.b();
        this.f408118u = ((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c.J(1));
        this.f408121x = new java.util.LinkedList();
        this.f408122y = new java.util.LinkedList();
        this.f408123z = new java.util.LinkedList();
        si0.x xVar = new si0.x(this, j17);
        this.A = xVar;
        si0.c0 c0Var = new si0.c0(this, j17);
        this.B = c0Var;
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(xVar);
        ofFloat.addListener(c0Var);
        this.f408108k = new com.tencent.pigeon.flutter_pag.PAGViewListenerApi(binaryMessenger, null, 2, 0 == true ? 1 : 0);
    }

    @Override // si0.o0
    public void a(com.tencent.pigeon.flutter_pag.FlutterPAGInfo pagInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(pagInfo, "pagInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f408106i = pagInfo;
        this.f408116s = pagInfo.getPlaySpeed();
        this.f408107j = this.f408099b.createSurfaceProducer();
        this.f408119v = kotlinx.coroutines.l.d(this.f408117t, this.f408118u, null, new si0.j0(this, pagInfo, callback, null), 2, null);
    }

    @Override // si0.o0
    public java.lang.Object b(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        io.flutter.Log.i(this.f408101d, this + " flush start");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        synchronized (this.f408121x) {
            h0Var.f310123d = new java.util.LinkedList(this.f408121x);
            this.f408121x.clear();
        }
        synchronized (this.f408122y) {
            h0Var2.f310123d = new java.util.LinkedList(this.f408122y);
            this.f408122y.clear();
        }
        synchronized (this.f408123z) {
            h0Var3.f310123d = new java.util.LinkedList(this.f408123z);
            this.f408123z.clear();
        }
        kotlinx.coroutines.l.d(this.f408117t, this.f408118u, null, new si0.e0(this, h0Var, h0Var2, h0Var3, lVar, null), 2, null);
        return java.lang.Boolean.TRUE;
    }

    @Override // si0.o0
    public boolean c(int i17, com.tencent.pigeon.flutter_pag.FlutterPAGText text) {
        kotlin.jvm.internal.o.g(text, "text");
        io.flutter.Log.i(this.f408101d, this + ", replaceText");
        synchronized (this.f408123z) {
            this.f408123z.add(new jz5.l(java.lang.Integer.valueOf(i17), text));
        }
        return true;
    }

    @Override // si0.o0
    public boolean d(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        synchronized (this.f408121x) {
            this.f408121x.add(new jz5.l(name, java.lang.Integer.valueOf(i17)));
        }
        return true;
    }

    @Override // si0.o0
    public boolean e(int i17, java.lang.String filepath) {
        kotlin.jvm.internal.o.g(filepath, "filepath");
        io.flutter.Log.i(this.f408101d, this + ", replaceImage");
        synchronized (this.f408122y) {
            this.f408122y.add(new jz5.l(java.lang.Integer.valueOf(i17), filepath));
        }
        return true;
    }

    @Override // si0.o0
    public void release() {
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f408107j;
        if (surfaceProducer != null) {
            surfaceProducer.release();
        }
        this.f408107j = null;
        this.f408112o.cancel();
        kotlinx.coroutines.l.d(this.f408117t, this.f408118u, null, new si0.f0(this, null), 2, null);
        io.flutter.Log.i(this.f408101d, "release");
    }

    @Override // si0.o0
    public void seek(long j17) {
        kotlinx.coroutines.l.d(this.f408117t, this.f408118u, null, new si0.h0(this, j17, null), 2, null);
    }

    @Override // si0.o0
    public void startPlay() {
        io.flutter.Log.d(this.f408101d, "startPlay: ");
        long j17 = this.f408111n;
        android.animation.ValueAnimator valueAnimator = this.f408112o;
        valueAnimator.setCurrentPlayTime(j17);
        this.f408109l = false;
        valueAnimator.start();
        if (this.D != 0) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new si0.k0(this), this.D);
            this.D = 0L;
        } else {
            si0.b bVar = this.C;
            if (bVar != null) {
                bVar.f408037a.start();
            }
        }
    }

    @Override // si0.o0
    public void stop() {
        io.flutter.Log.d(this.f408101d, "stop: ");
        android.animation.ValueAnimator valueAnimator = this.f408112o;
        this.f408111n = valueAnimator.getCurrentPlayTime();
        this.f408109l = true;
        valueAnimator.cancel();
        si0.b bVar = this.C;
        if (bVar != null) {
            bVar.f408037a.pause();
        }
    }
}
