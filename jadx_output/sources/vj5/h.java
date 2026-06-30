package vj5;

/* loaded from: classes7.dex */
public class h extends android.widget.FrameLayout implements vj5.k {

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f437700v = vj5.n.f437718k;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f437701d;

    /* renamed from: e, reason: collision with root package name */
    public vj5.n f437702e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f437703f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f437704g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f437705h;

    /* renamed from: i, reason: collision with root package name */
    public int f437706i;

    /* renamed from: m, reason: collision with root package name */
    public int f437707m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f437708n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f437709o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f437710p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f437711q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f437712r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f437713s;

    /* renamed from: t, reason: collision with root package name */
    public int f437714t;

    /* renamed from: u, reason: collision with root package name */
    public vj5.g f437715u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context instanceof android.content.MutableContextWrapper ? new vj5.f((android.content.MutableContextWrapper) context) : context);
        int i17 = vj5.f.f437694c;
        this.f437701d = new vj5.b(this);
        this.f437706i = 0;
        this.f437707m = 0;
        this.f437708n = false;
        this.f437709o = false;
        this.f437710p = false;
        this.f437711q = false;
        this.f437712r = false;
        this.f437713s = new int[2];
        this.f437714t = 0;
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.RuntimeException("Should be called on main-thread");
        }
        v();
        if (getContext() instanceof vj5.f) {
            ((vj5.f) getContext()).f437696b = new vj5.c(this);
        }
    }

    public void B(int i17, boolean z17, boolean z18) {
        android.app.Activity activity;
        int i18;
        vj5.g gVar = this.f437715u;
        if (gVar != null && i17 == gVar.f437697a && z17 == gVar.f437698b && z18 == gVar.f437699c) {
            return;
        }
        try {
            int i19 = this.f437706i;
            int i27 = this.f437707m;
            this.f437706i = i17;
            if (f437700v && (activity = this.f437703f) != null) {
                android.view.Window window = activity.getWindow();
                vj5.o.e(window);
                if (!z18) {
                    u75.d.g();
                } else if (!com.tencent.mm.ui.v9.c(window, z17)) {
                    this.f437706i = z17 ? ((((int) ((((i17 >> 24) & 255) * 0.78f) + (255 * 0.22000003f))) & 255) << 24) | ((((int) ((((i17 >> 16) & 255) * 0.78f) + (0 * 0.22000003f))) & 255) << 16) | ((((int) ((((i17 >> 8) & 255) * 0.78f) + (0 * 0.22000003f))) & 255) << 8) | ((255 & ((int) (((i17 & 255) * 0.78f) + (0 * 0.22000003f)))) << 0) : i17;
                    this.f437707m = z17 ? android.graphics.Color.argb(51, 0, 0, 0) : 0;
                    i18 = this.f437706i;
                    if (i18 != 0 && this.f437707m == 0) {
                        super.setWillNotDraw(true);
                        u();
                    } else if (i19 == i18 || i27 != this.f437707m) {
                        super.setWillNotDraw(false);
                        u();
                    }
                }
                this.f437706i = i17;
                this.f437707m = 0;
                i18 = this.f437706i;
                if (i18 != 0) {
                }
                if (i19 == i18) {
                }
                super.setWillNotDraw(false);
                u();
            }
        } finally {
            this.f437715u = new vj5.g(i17, z17, z18);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.f437705h > 0 && f437700v && !this.f437708n && !willNotDraw()) {
            android.graphics.Paint paint = this.f437704g;
            if (paint == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DrawStatusBarFrameLayout", "drawStatusBarBackground NULL paint");
            } else {
                paint.setColor(this.f437706i);
                canvas.drawRect(0.0f, 0.0f, getWidth(), this.f437705h, this.f437704g);
            }
        }
        super.dispatchDraw(canvas);
        if (this.f437705h <= 0 || !f437700v || !this.f437708n || willNotDraw()) {
            return;
        }
        android.graphics.Paint paint2 = this.f437704g;
        if (paint2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DrawStatusBarFrameLayout", "drawStatusBarForeground NULL paint");
        } else {
            paint2.setColor(this.f437707m);
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.f437705h, this.f437704g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSystemUiVisibilityChanged(int i17) {
        super.dispatchSystemUiVisibilityChanged(i17);
        vj5.n nVar = this.f437702e;
        if (nVar == null) {
            return;
        }
        n6(nVar.f437726e);
    }

    public int getDrawnStatusBarHeight() {
        return java.lang.Math.max(0, this.f437705h);
    }

    public void n6(int i17) {
        q(i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vj5.n nVar = this.f437702e;
        if (nVar == null) {
            return;
        }
        n6(nVar.f437726e);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f437702e == null || this.f437709o) {
            return;
        }
        int[] iArr = this.f437713s;
        getLocationInWindow(iArr);
        if (this.f437714t != iArr[1]) {
            this.f437702e.e();
        }
        this.f437714t = iArr[1];
    }

    public void q(int i17) {
        getLocationInWindow(this.f437713s);
        this.f437714t = this.f437713s[1];
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            int i18 = this.f437713s[0];
            int i19 = this.f437713s[1];
        }
        this.f437705h = java.lang.Math.max(0, i17 - java.lang.Math.max(t(this.f437713s[1]), 0));
        if (this.f437709o) {
            this.f437711q = true;
            return;
        }
        try {
            setPadding(0, this.f437708n ? 0 : this.f437705h, 0, 0);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DrawStatusBarFrameLayout", "applyStatusBarHeight setPadding e=%s", e17.getMessage());
        }
        if (isLayoutRequested()) {
            u();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f437709o) {
            this.f437712r = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(boolean z17) {
        this.f437708n = z17;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            q(this.f437705h);
        }
    }

    public final void setLayoutFrozen(boolean z17) {
        if (!(android.os.Looper.getMainLooper() == android.os.Looper.myLooper())) {
            post(new vj5.d(this, z17));
            return;
        }
        boolean z18 = z17 != this.f437709o;
        this.f437709o = z17;
        if (!z18 || z17) {
            return;
        }
        if (this.f437710p) {
            v();
            this.f437710p = false;
        }
        if (this.f437712r || this.f437711q) {
            q(this.f437705h);
            this.f437712r = false;
            this.f437711q = false;
        }
    }

    public void setStatusBarColor(int i17) {
        if (f437700v) {
            android.app.Activity activity = this.f437703f;
            x(i17, activity == null ? false : vj5.o.h(activity.getWindow()));
        }
    }

    @Override // android.view.View
    public final void setWillNotDraw(boolean z17) {
    }

    public int t(int i17) {
        if (i17 == 0) {
            return 0;
        }
        android.view.View view = this;
        while (view != null) {
            i17 -= java.lang.Math.round(view.getTranslationY());
            view = view.getParent() instanceof android.view.View ? (android.view.View) view.getParent() : null;
        }
        return i17;
    }

    public void u() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public void v() {
        this.f437715u = null;
        if (!f437700v) {
            this.f437703f = null;
            this.f437704g = null;
            return;
        }
        setPadding(0, 0, 0, 0);
        this.f437705h = 0;
        vj5.n nVar = this.f437702e;
        if (nVar != null) {
            nVar.f(this);
        }
        android.app.Activity a17 = q75.a.a(getContext());
        this.f437703f = a17;
        if (a17 == null) {
            this.f437704g = null;
            super.setWillNotDraw(true);
            return;
        }
        vj5.n b17 = vj5.n.b(a17);
        this.f437702e = b17;
        b17.d(this);
        android.graphics.Paint paint = new android.graphics.Paint(0);
        this.f437704g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        super.setWillNotDraw(false);
    }

    @Override // android.view.View
    public final boolean willNotDraw() {
        return super.willNotDraw();
    }

    public void x(int i17, boolean z17) {
        B(i17, z17, true);
    }
}
