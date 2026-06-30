package sl5;

/* loaded from: classes10.dex */
public final class c implements androidx.recyclerview.widget.v2, android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f409288d;

    /* renamed from: e, reason: collision with root package name */
    public final sl5.b f409289e;

    /* renamed from: f, reason: collision with root package name */
    public final sl5.a f409290f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ScaleGestureDetector f409291g;

    /* renamed from: h, reason: collision with root package name */
    public int f409292h;

    /* renamed from: i, reason: collision with root package name */
    public int f409293i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f409294m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f409295n;

    /* renamed from: o, reason: collision with root package name */
    public float f409296o;

    /* renamed from: p, reason: collision with root package name */
    public int f409297p;

    public c(androidx.recyclerview.widget.RecyclerView recyclerView, sl5.b callback, sl5.a config) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(config, "config");
        this.f409288d = recyclerView;
        this.f409289e = callback;
        this.f409290f = config;
        this.f409291g = new android.view.ScaleGestureDetector(recyclerView.getContext(), this);
        this.f409296o = 1.0f;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/pinchzoom/PinchZoomGestureListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(event, "event");
        d(event);
        yj0.a.h(this, "com/tencent/mm/ui/widget/pinchzoom/PinchZoomGestureListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(event, "event");
        d(event);
        return this.f409294m;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }

    public final void d(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        int actionMasked = motionEvent.getActionMasked();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f409288d;
        if (actionMasked == 0) {
            this.f409294m = false;
            this.f409295n = false;
            this.f409293i = 0;
            this.f409296o = 1.0f;
            this.f409297p = 0;
            android.view.ViewParent parent2 = recyclerView.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        } else if (actionMasked == 5) {
            this.f409294m = true;
            android.view.ViewParent parent3 = recyclerView.getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(true);
            }
        } else if (actionMasked == 6 && motionEvent.getPointerCount() <= 2 && this.f409295n && (parent = recyclerView.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        if (motionEvent.getPointerCount() >= 2) {
            this.f409291g.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScale(android.view.ScaleGestureDetector r38) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sl5.c.onScale(android.view.ScaleGestureDetector):boolean");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        this.f409294m = true;
        this.f409293i = 0;
        this.f409295n = false;
        this.f409296o = 1.0f;
        this.f409297p = 0;
        android.view.ViewParent parent = this.f409288d.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        if (this.f409295n || this.f409293i == 0) {
            return;
        }
        float scaleFactor = detector.getScaleFactor();
        sl5.g gVar = ((sl5.f) this.f409289e).f409303a;
        int i17 = gVar.f409309f;
        if (i17 == 0) {
            return;
        }
        float f17 = gVar.f409308e * scaleFactor;
        gVar.f409308e = f17;
        float a17 = h3.a.a(i17 > 0 ? f17 - 1.0f : 1.0f - f17, 0.0f, 1.0f);
        boolean z17 = a17 >= gVar.f409305b.f409284b;
        com.tencent.mars.xlog.Log.i("PinchZoomManager", "onScaleEnd: progress=" + a17 + ", apply=" + z17);
        tl5.s sVar = gVar.f409306c;
        int ordinal = sVar.f420387c.ordinal();
        if (ordinal == 1) {
            sVar.f420397m = new tl5.k(z17, a17);
            sVar.f420396l = a17;
            com.tencent.mars.xlog.Log.i("PinchZoomEngine", "endTransition: deferred (PREPARING), apply=" + z17);
            if (!sVar.f420395k) {
                sVar.d();
            }
        } else if (ordinal != 2) {
            com.tencent.mars.xlog.Log.w("PinchZoomEngine", "endTransition: unexpected state=" + sVar.f420387c);
        } else {
            sVar.c(z17, a17);
        }
        gVar.f409308e = 1.0f;
        gVar.f409309f = 0;
    }
}
