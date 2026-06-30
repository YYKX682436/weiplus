package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public class y0 implements android.view.View.OnTouchListener {
    public static final int A;

    /* renamed from: z, reason: collision with root package name */
    public static final int f191300z;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.z0 f191301d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f191302e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f191303f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f191304g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191305h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f191306i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f191307m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.a f191308n;

    /* renamed from: o, reason: collision with root package name */
    public int f191309o;

    /* renamed from: p, reason: collision with root package name */
    public int f191310p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View.OnLongClickListener f191311q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f191312r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f191313s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View.OnClickListener f191314t;

    /* renamed from: u, reason: collision with root package name */
    public float f191315u;

    /* renamed from: v, reason: collision with root package name */
    public float f191316v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f191317w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.span.x0 f191318x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.span.w0 f191319y;

    static {
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        f191300z = tapTimeout;
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        A = longPressTimeout;
        if (longPressTimeout > tapTimeout * 2) {
            A = longPressTimeout - tapTimeout;
        }
    }

    public y0() {
        this.f191301d = null;
        this.f191302e = false;
        this.f191303f = null;
        this.f191305h = false;
        this.f191307m = null;
        this.f191312r = false;
        this.f191313s = true;
        this.f191315u = -1.0f;
        this.f191316v = -1.0f;
        this.f191317w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f191318x = new com.tencent.mm.pluginsdk.ui.span.x0(this, null);
        this.f191319y = new com.tencent.mm.pluginsdk.ui.span.w0(this);
    }

    public final void a(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            b();
        }
    }

    public void b() {
        com.tencent.mm.pluginsdk.ui.span.z0 z0Var = this.f191301d;
        if (z0Var != null) {
            z0Var.setIsPressed(false);
            this.f191301d.setContext(null);
            this.f191303f.invalidate();
            this.f191303f = null;
            this.f191301d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bf  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.span.y0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public y0(android.content.Context context) {
        this.f191301d = null;
        this.f191302e = false;
        this.f191303f = null;
        this.f191305h = false;
        this.f191307m = null;
        this.f191312r = false;
        this.f191313s = true;
        this.f191315u = -1.0f;
        this.f191316v = -1.0f;
        this.f191317w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f191318x = new com.tencent.mm.pluginsdk.ui.span.x0(this, null);
        this.f191319y = new com.tencent.mm.pluginsdk.ui.span.w0(this);
        this.f191307m = context;
    }
}
