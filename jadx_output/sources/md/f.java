package md;

/* loaded from: classes14.dex */
public final class f extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f325679d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f325680e;

    /* renamed from: f, reason: collision with root package name */
    public int f325681f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f325682g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f325683h;

    /* renamed from: i, reason: collision with root package name */
    public md.l f325684i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.WeakHashMap f325685m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f325686n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f325687o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Set f325688p;

    public f(android.content.Context context, android.view.View view) {
        super(context);
        this.f325681f = -1;
        this.f325682g = false;
        this.f325683h = new int[2];
        this.f325685m = new java.util.WeakHashMap();
        this.f325686n = new md.b(this);
        this.f325687o = new md.c(this);
        this.f325688p = new java.util.HashSet();
        super.setId(com.tencent.mm.R.id.cre);
        this.f325680e = view;
    }

    public static md.f b(android.view.View view) {
        return (md.f) view.getRootView().findViewById(com.tencent.mm.R.id.cre);
    }

    public static md.h c(android.view.View view) {
        md.f b17 = b(view);
        if (b17 == null) {
            return null;
        }
        if (b17.getOnLayoutListener() == null || !(b17.getOnLayoutListener() instanceof md.h)) {
            b17.setOnLayoutListener(new md.h());
        }
        b17.getViewTreeObserver().addOnGlobalLayoutListener(new md.a(b17, new java.lang.ref.WeakReference(b17)));
        return (md.h) b17.getOnLayoutListener();
    }

    public void a(android.view.View view, boolean z17) {
        android.view.View view2 = this.f325679d;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f325679d = null;
        }
        if (this != view.getParent()) {
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            this.f325679d = view;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            super.addView(view, layoutParams);
            md.e eVar = new md.e(null);
            eVar.f325677a = z17;
            this.f325685m.put(view, eVar);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (view == this.f325680e || view == this.f325679d) {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        md.e eVar = (md.e) this.f325685m.get(this.f325679d);
        if (eVar != null && eVar.f325677a && (view = this.f325679d) != null && view.isShown() && motionEvent.getAction() == 0) {
            float rawY = motionEvent.getRawY();
            android.view.View view2 = this.f325679d;
            int[] iArr = this.f325683h;
            view2.getLocationOnScreen(iArr);
            float f17 = iArr[1];
            float height = this.f325679d.getHeight() + f17;
            if (rawY < f17 || rawY > height) {
                android.view.View view3 = this.f325679d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public android.view.View getCurrentBottomPanel() {
        return this.f325679d;
    }

    public md.l getOnLayoutListener() {
        return this.f325684i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f325682g = true;
        super.onLayout(z17, i17, i18, i19, i27);
        this.f325682g = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f325681f;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.f325685m.remove(view);
    }

    public void setForceHeight(int i17) {
        boolean z17 = i17 != this.f325681f;
        this.f325681f = i17;
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.c(this) && !this.f325682g) {
                requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    public void setOnLayoutListener(md.l lVar) {
        this.f325684i = lVar;
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (view == this.f325680e || view == this.f325679d) {
            super.addView(view, i17);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, int i18) {
        if (view == this.f325680e || view == this.f325679d) {
            super.addView(view, i17, i18);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == this.f325680e || view == this.f325679d) {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == this.f325680e || view == this.f325679d) {
            super.addView(view, i17, layoutParams);
        }
    }
}
