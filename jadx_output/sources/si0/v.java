package si0;

/* loaded from: classes13.dex */
public final class v implements si0.o0 {
    public final android.animation.ValueAnimator.AnimatorUpdateListener A;
    public final android.animation.Animator.AnimatorListener B;
    public si0.b C;
    public long D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f408178a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry f408179b;

    /* renamed from: c, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f408180c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f408181d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.LruCache f408182e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagPlayer f408183f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagFile f408184g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagSurface f408185h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.pigeon.flutter_pag.FlutterPAGInfo f408186i;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.view.TextureRegistry.SurfaceProducer f408187j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.pigeon.flutter_pag.PAGViewListenerApi f408188k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f408189l;

    /* renamed from: m, reason: collision with root package name */
    public double f408190m;

    /* renamed from: n, reason: collision with root package name */
    public long f408191n;

    /* renamed from: o, reason: collision with root package name */
    public final android.animation.ValueAnimator f408192o;

    /* renamed from: p, reason: collision with root package name */
    public long f408193p;

    /* renamed from: q, reason: collision with root package name */
    public int f408194q;

    /* renamed from: r, reason: collision with root package name */
    public int f408195r;

    /* renamed from: s, reason: collision with root package name */
    public double f408196s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f408197t;

    /* renamed from: u, reason: collision with root package name */
    public final oz5.l f408198u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f408199v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f408200w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f408201x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f408202y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f408203z;

    /* JADX WARN: Multi-variable type inference failed */
    public v(android.content.Context context, io.flutter.view.TextureRegistry textureRegistry, io.flutter.plugin.common.BinaryMessenger binaryMessenger, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(textureRegistry, "textureRegistry");
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        this.f408178a = context;
        this.f408179b = textureRegistry;
        this.f408180c = binaryMessenger;
        this.f408181d = "MicroMsg.FlutterPAGViewController@" + j17;
        this.f408182e = new android.util.LruCache(128);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        kotlin.jvm.internal.o.f(ofFloat, "ofFloat(...)");
        this.f408192o = ofFloat;
        this.f408196s = 1.0d;
        this.f408197t = kotlinx.coroutines.z0.b();
        this.f408198u = ((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c.J(1));
        this.f408201x = new java.util.LinkedList();
        this.f408202y = new java.util.LinkedList();
        this.f408203z = new java.util.LinkedList();
        si0.h hVar = new si0.h(this, j17);
        this.A = hVar;
        si0.m mVar = new si0.m(this, j17);
        this.B = mVar;
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(hVar);
        ofFloat.addListener(mVar);
        this.f408188k = new com.tencent.pigeon.flutter_pag.PAGViewListenerApi(binaryMessenger, null, 2, 0 == true ? 1 : 0);
    }

    @Override // si0.o0
    public void a(com.tencent.pigeon.flutter_pag.FlutterPAGInfo pagInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(pagInfo, "pagInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f408186i = pagInfo;
        this.f408196s = pagInfo.getPlaySpeed();
        this.f408187j = this.f408179b.createSurfaceProducer();
        this.f408199v = kotlinx.coroutines.l.d(this.f408197t, this.f408198u, null, new si0.t(this, pagInfo, callback, null), 2, null);
    }

    @Override // si0.o0
    public java.lang.Object b(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        io.flutter.Log.i(this.f408181d, this + " flush start");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        synchronized (this.f408201x) {
            h0Var.f310123d = new java.util.LinkedList(this.f408201x);
            this.f408201x.clear();
        }
        synchronized (this.f408202y) {
            h0Var2.f310123d = new java.util.LinkedList(this.f408202y);
            this.f408202y.clear();
        }
        synchronized (this.f408203z) {
            h0Var3.f310123d = new java.util.LinkedList(this.f408203z);
            this.f408203z.clear();
        }
        kotlinx.coroutines.l.d(this.f408197t, this.f408198u, null, new si0.o(this, h0Var, h0Var2, h0Var3, lVar, null), 2, null);
        return java.lang.Boolean.TRUE;
    }

    @Override // si0.o0
    public boolean c(int i17, com.tencent.pigeon.flutter_pag.FlutterPAGText text) {
        kotlin.jvm.internal.o.g(text, "text");
        io.flutter.Log.i(this.f408181d, this + ", replaceText");
        synchronized (this.f408203z) {
            this.f408203z.add(new jz5.l(java.lang.Integer.valueOf(i17), text));
        }
        return true;
    }

    @Override // si0.o0
    public boolean d(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        synchronized (this.f408201x) {
            this.f408201x.add(new jz5.l(name, java.lang.Integer.valueOf(i17)));
        }
        return true;
    }

    @Override // si0.o0
    public boolean e(int i17, java.lang.String filepath) {
        kotlin.jvm.internal.o.g(filepath, "filepath");
        io.flutter.Log.i(this.f408181d, this + ", replaceImage");
        synchronized (this.f408202y) {
            this.f408202y.add(new jz5.l(java.lang.Integer.valueOf(i17), filepath));
        }
        return true;
    }

    @Override // si0.o0
    public void release() {
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f408187j;
        if (surfaceProducer != null) {
            surfaceProducer.release();
        }
        this.f408187j = null;
        this.f408192o.cancel();
        kotlinx.coroutines.l.d(this.f408197t, this.f408198u, null, new si0.p(this, null), 2, null);
        io.flutter.Log.i(this.f408181d, "release");
    }

    @Override // si0.o0
    public void seek(long j17) {
        kotlinx.coroutines.l.d(this.f408197t, this.f408198u, null, new si0.r(this, j17, null), 2, null);
    }

    @Override // si0.o0
    public void startPlay() {
        io.flutter.Log.d(this.f408181d, "startPlay: ");
        long j17 = this.f408191n;
        android.animation.ValueAnimator valueAnimator = this.f408192o;
        valueAnimator.setCurrentPlayTime(j17);
        this.f408189l = false;
        valueAnimator.start();
        if (this.D != 0) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new si0.u(this), this.D);
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
        io.flutter.Log.d(this.f408181d, "stop: ");
        android.animation.ValueAnimator valueAnimator = this.f408192o;
        this.f408191n = valueAnimator.getCurrentPlayTime();
        this.f408189l = true;
        valueAnimator.cancel();
        si0.b bVar = this.C;
        if (bVar != null) {
            bVar.f408037a.pause();
        }
    }
}
