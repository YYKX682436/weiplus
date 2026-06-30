package wj2;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.SwipeBackLayout f446696a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f446697b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f446698c;

    /* renamed from: d, reason: collision with root package name */
    public int f446699d = 10;

    /* renamed from: e, reason: collision with root package name */
    public float f446700e;

    /* renamed from: f, reason: collision with root package name */
    public float f446701f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f446702g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f446703h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f446704i;

    public final boolean a(android.view.MotionEvent motionEvent) {
        android.view.ViewGroup viewGroup;
        if (!this.f446698c) {
            return false;
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f446702g = false;
            this.f446703h = false;
            this.f446704i = false;
            this.f446700e = motionEvent.getX();
            this.f446701f = motionEvent.getY();
        } else {
            boolean z17 = true;
            if (valueOf != null && valueOf.intValue() == 2) {
                float x17 = motionEvent.getX();
                float y17 = motionEvent.getY();
                float abs = java.lang.Math.abs(x17 - this.f446700e);
                float abs2 = java.lang.Math.abs(y17 - this.f446701f);
                if (abs > this.f446699d && abs > abs2) {
                    if (!this.f446703h) {
                        motionEvent.setAction(3);
                        this.f446702g = false;
                        android.view.ViewGroup viewGroup2 = this.f446697b;
                        if (viewGroup2 != null) {
                            viewGroup2.dispatchTouchEvent(motionEvent);
                        }
                        com.tencent.mars.xlog.Log.i("SwipeToCloseProcessor", "dispatchTouchEvent cancelEvent to originView");
                        this.f446703h = true;
                    }
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                    if (obtain != null) {
                        obtain.setLocation(obtain.getRawX(), obtain.getRawY());
                    }
                    if (!this.f446704i) {
                        obtain.setAction(0);
                        com.tencent.mars.xlog.Log.i("SwipeToCloseProcessor", "dispatchTouchEvent downEvent to swipeView");
                        this.f446704i = true;
                    }
                    com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.f446696a;
                    boolean b17 = swipeBackLayout != null ? swipeBackLayout.b(obtain) : false;
                    this.f446702g = b17;
                    if (b17 && (viewGroup = this.f446697b) != null) {
                        viewGroup.requestDisallowInterceptTouchEvent(true);
                    }
                    return true;
                }
            } else {
                if ((valueOf == null || valueOf.intValue() != 3) && (valueOf == null || valueOf.intValue() != 1)) {
                    z17 = false;
                }
                if (z17) {
                    if (this.f446702g) {
                        android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(motionEvent);
                        if (obtain2 != null) {
                            obtain2.setLocation(obtain2.getRawX(), obtain2.getRawY());
                        }
                        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = this.f446696a;
                        if (swipeBackLayout2 != null) {
                            swipeBackLayout2.b(obtain2);
                        }
                    }
                    this.f446702g = false;
                    this.f446703h = false;
                    this.f446704i = false;
                }
            }
        }
        return false;
    }

    public final void b(android.view.ViewGroup originalView) {
        android.view.Window window;
        android.view.View decorView;
        kotlin.jvm.internal.o.g(originalView, "originalView");
        android.content.Context context = originalView.getContext();
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            swipeBackLayout = (com.tencent.mm.ui.widget.SwipeBackLayout) decorView.findViewById(com.tencent.mm.R.id.nsv);
        }
        this.f446696a = swipeBackLayout;
        this.f446697b = originalView;
        this.f446699d = android.view.ViewConfiguration.get(originalView.getContext()).getScaledTouchSlop();
        ae2.in inVar = ae2.in.f3688a;
        this.f446698c = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).getValue()).r()).intValue() == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate swipe=");
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = this.f446696a;
        sb6.append(swipeBackLayout2 != null ? swipeBackLayout2.hashCode() : 0);
        sb6.append(" swipeSlop=");
        sb6.append(this.f446699d);
        sb6.append(" swipeToCloseEnable=");
        sb6.append(this.f446698c);
        com.tencent.mars.xlog.Log.i("SwipeToCloseProcessor", sb6.toString());
    }
}
