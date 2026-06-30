package fy0;

/* loaded from: classes5.dex */
public final class n {
    public final int A;
    public final int B;
    public float C;
    public float D;
    public int E;
    public android.view.VelocityTracker F;

    /* renamed from: a, reason: collision with root package name */
    public final fy0.m f267193a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f267194b;

    /* renamed from: c, reason: collision with root package name */
    public fy0.l f267195c;

    /* renamed from: d, reason: collision with root package name */
    public final int f267196d;

    /* renamed from: e, reason: collision with root package name */
    public final int f267197e;

    /* renamed from: f, reason: collision with root package name */
    public final int f267198f;

    /* renamed from: g, reason: collision with root package name */
    public fy0.k f267199g;

    /* renamed from: h, reason: collision with root package name */
    public final int f267200h;

    /* renamed from: i, reason: collision with root package name */
    public final int f267201i;

    /* renamed from: j, reason: collision with root package name */
    public final int f267202j;

    /* renamed from: k, reason: collision with root package name */
    public final int f267203k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.Handler f267204l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f267205m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f267206n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.MotionEvent f267207o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.MotionEvent f267208p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.MotionEvent f267209q;

    /* renamed from: r, reason: collision with root package name */
    public float f267210r;

    /* renamed from: s, reason: collision with root package name */
    public float f267211s;

    /* renamed from: t, reason: collision with root package name */
    public float f267212t;

    /* renamed from: u, reason: collision with root package name */
    public float f267213u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f267214v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f267215w;

    /* renamed from: x, reason: collision with root package name */
    public float f267216x;

    /* renamed from: y, reason: collision with root package name */
    public float f267217y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f267218z;

    static {
        android.view.ViewConfiguration.getTapTimeout();
        android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    public n(android.content.Context context, fy0.m mScaleListener, java.util.List mGestureListener, android.os.Handler handler) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mScaleListener, "mScaleListener");
        kotlin.jvm.internal.o.g(mGestureListener, "mGestureListener");
        this.f267193a = mScaleListener;
        this.f267194b = mGestureListener;
        this.f267195c = fy0.l.f267189d;
        android.view.ViewConfiguration.getLongPressTimeout();
        this.f267200h = android.view.ViewConfiguration.getTapTimeout();
        android.view.ViewConfiguration.getDoubleTapTimeout();
        this.f267201i = 1;
        this.f267202j = 2;
        this.f267203k = 3;
        this.f267214v = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.A = 2;
        this.B = 2;
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledDoubleTapSlop();
        this.f267197e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f267198f = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f267196d = scaledTouchSlop * scaledTouchSlop;
        if (context.getApplicationInfo().targetSdkVersion > 22) {
            this.f267215w = true;
        }
        this.f267204l = handler != null ? new fy0.j(this, handler) : new fy0.j(this);
    }

    public final void a() {
        android.os.Handler handler = this.f267204l;
        if (handler != null) {
            handler.removeMessages(this.f267201i);
        }
        if (handler != null) {
            handler.removeMessages(this.f267202j);
        }
        if (handler != null) {
            handler.removeMessages(this.f267203k);
        }
        android.view.VelocityTracker velocityTracker = this.F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.F = null;
        this.f267206n = false;
        if (this.f267205m) {
            this.f267205m = false;
        }
        this.f267195c = fy0.l.f267189d;
    }

    public final void b() {
        android.os.Handler handler = this.f267204l;
        if (handler != null) {
            handler.removeMessages(this.f267201i);
        }
        if (handler != null) {
            handler.removeMessages(this.f267202j);
        }
        if (handler != null) {
            handler.removeMessages(this.f267203k);
        }
        this.f267206n = false;
        if (this.f267205m) {
            this.f267205m = false;
        }
    }

    public final boolean c() {
        return this.E != 0;
    }
}
