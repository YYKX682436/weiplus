package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

/* loaded from: classes15.dex */
public class AdLandingViewPager extends android.view.ViewGroup {
    public static final int[] B1 = {android.R.attr.layout_gravity};
    public static final java.util.Comparator C1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.h();
    public static final android.view.animation.Interpolator D1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.i();
    public static final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.p E1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.p();
    public boolean A;
    public int A1;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f165698J;
    public float K;
    public int L;
    public android.view.VelocityTracker M;
    public int N;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public androidx.core.widget.i U;
    public androidx.core.widget.i V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public int f165699d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f165700e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k f165701f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f165702g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.viewpager.widget.a f165703h;

    /* renamed from: i, reason: collision with root package name */
    public int f165704i;

    /* renamed from: l1, reason: collision with root package name */
    public androidx.viewpager.widget.m f165705l1;

    /* renamed from: m, reason: collision with root package name */
    public int f165706m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Parcelable f165707n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.ClassLoader f165708o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Scroller f165709p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f165710p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.reflect.Method f165711p1;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.n f165712q;

    /* renamed from: r, reason: collision with root package name */
    public int f165713r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f165714s;

    /* renamed from: t, reason: collision with root package name */
    public int f165715t;

    /* renamed from: u, reason: collision with root package name */
    public int f165716u;

    /* renamed from: v, reason: collision with root package name */
    public float f165717v;

    /* renamed from: w, reason: collision with root package name */
    public float f165718w;

    /* renamed from: x, reason: collision with root package name */
    public int f165719x;

    /* renamed from: x0, reason: collision with root package name */
    public int f165720x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f165721x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f165722y;

    /* renamed from: y0, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager.OnPageChangeListener f165723y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.util.ArrayList f165724y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f165725z;

    /* renamed from: z1, reason: collision with root package name */
    public final java.lang.Runnable f165726z1;

    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.SavedState> CREATOR = new j3.r(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.o());

        /* renamed from: d, reason: collision with root package name */
        public int f165733d;

        /* renamed from: e, reason: collision with root package name */
        public android.os.Parcelable f165734e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.ClassLoader f165735f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f165733d = parcel.readInt();
            this.f165734e = parcel.readParcelable(classLoader);
            this.f165735f = classLoader;
        }

        public java.lang.String toString() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState");
            java.lang.String str = "FragmentPager.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " position=" + this.f165733d + "}";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState");
            return str;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState");
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f165733d);
            parcel.writeParcelable(this.f165734e, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState");
        }
    }

    public AdLandingViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165700e = new java.util.ArrayList();
        this.f165701f = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k();
        this.f165702g = new android.graphics.Rect();
        this.f165706m = -1;
        this.f165707n = null;
        this.f165708o = null;
        this.f165717v = -3.4028235E38f;
        this.f165718w = Float.MAX_VALUE;
        this.B = 1;
        this.L = -1;
        this.W = true;
        this.f165726z1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.j(this);
        this.A1 = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViewPager", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        android.content.Context context2 = getContext();
        this.f165709p = new android.widget.Scroller(context2, D1);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context2);
        float f17 = context2.getResources().getDisplayMetrics().density;
        java.lang.reflect.Method method = n3.o1.f334378a;
        this.G = viewConfiguration.getScaledPagingTouchSlop();
        this.N = (int) (400.0f * f17);
        this.P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.U = new androidx.core.widget.i(context2);
        this.V = new androidx.core.widget.i(context2);
        this.Q = (int) (25.0f * f17);
        this.R = (int) (2.0f * f17);
        this.E = (int) (f17 * 16.0f);
        n3.l1.l(this, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.l(this));
        if (n3.u0.c(this) == 0) {
            n3.u0.s(this, 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewPager", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private void D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sortChildDrawingOrder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f165721x1 != 0) {
            java.util.ArrayList arrayList = this.f165724y1;
            if (arrayList == null) {
                this.f165724y1 = new java.util.ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                this.f165724y1.add(getChildAt(i17));
            }
            java.util.Collections.sort(this.f165724y1, E1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sortChildDrawingOrder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public static /* synthetic */ void a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager adLandingViewPager, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        adLandingViewPager.setScrollState(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public static /* synthetic */ androidx.viewpager.widget.a b(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager adLandingViewPager) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        androidx.viewpager.widget.a aVar = adLandingViewPager.f165703h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return aVar;
    }

    public static /* synthetic */ int c(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager adLandingViewPager) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i17 = adLandingViewPager.f165704i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i17;
    }

    private int getClientWidth() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClientWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClientWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return measuredWidth;
    }

    private void h(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("completeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z18 = this.A1 == 2;
        if (z18) {
            setScrollingCacheEnabled(false);
            this.f165709p.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f165709p.getCurrX();
            int currY = this.f165709p.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.A = false;
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f165700e;
            if (i17 >= arrayList.size()) {
                break;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(i17);
            if (kVar.f165779c) {
                kVar.f165779c = false;
                z18 = true;
            }
            i17++;
        }
        if (z18) {
            java.lang.Runnable runnable = this.f165726z1;
            if (z17) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.m(this, runnable);
            } else {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.j) runnable).run();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("completeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private int j(int i17, float f17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("determineTargetPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (java.lang.Math.abs(i19) <= this.Q || java.lang.Math.abs(i18) <= this.N) {
            i17 = (int) (i17 + f17 + (i17 >= this.f165704i ? 0.85f : 0.15f));
        } else if (i18 <= 0) {
            i17++;
        }
        java.util.ArrayList arrayList = this.f165700e;
        if (arrayList.size() > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("firstItemPosForDetermine", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            int i27 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(0)).f165778b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("firstItemPosForDetermine", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lastItemPosForDetermine", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            int i28 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(arrayList.size() - 1)).f165778b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lastItemPosForDetermine", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            i17 = java.lang.Math.max(i27, java.lang.Math.min(i17, i28));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("determineTargetPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i17;
    }

    private void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.C = false;
        this.D = false;
        android.view.VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.M = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private android.graphics.Rect n(android.graphics.Rect rect, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildRectInPagerCoordinates", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (rect == null) {
            rect = new android.graphics.Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildRectInPagerCoordinates", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        android.view.ViewParent parent = view.getParent();
        while ((parent instanceof android.view.ViewGroup) && parent != this) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildRectInPagerCoordinates", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return rect;
    }

    private void s(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSecondaryPointerUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.L) {
            int i17 = actionIndex == 0 ? 1 : 0;
            this.H = motionEvent.getX(i17);
            this.L = motionEvent.getPointerId(i17);
            android.view.VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSecondaryPointerUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private void setScrollState(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.A1 == i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        this.A1 = i17;
        if (this.f165705l1 != null) {
            boolean z17 = i17 != 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableLayers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                int i19 = z17 ? 2 : 0;
                android.view.View childAt = getChildAt(i18);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                childAt.setLayerType(i19, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableLayers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        }
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.f165723y0;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private void setScrollingCacheEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollingCacheEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f165725z != z17) {
            this.f165725z = z17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollingCacheEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private boolean u(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f165700e.size() == 0) {
            this.f165710p0 = false;
            r(0, 0.0f, 0);
            if (this.f165710p0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return false;
            }
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            throw illegalStateException;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k p17 = p();
        int clientWidth = getClientWidth();
        int i18 = this.f165713r;
        int i19 = clientWidth + i18;
        float f17 = clientWidth;
        int i27 = p17.f165778b;
        float f18 = ((i17 / f17) - p17.f165781e) / (p17.f165780d + (i18 / f17));
        this.f165710p0 = false;
        r(i27, f18, (int) (i19 * f18));
        if (this.f165710p0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return true;
        }
        java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        throw illegalStateException2;
    }

    private boolean v(float f17) {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        float f18 = this.H - f17;
        this.H = f17;
        float scrollX = getScrollX() + f18;
        float clientWidth = getClientWidth();
        float f19 = this.f165717v * clientWidth;
        float f27 = this.f165718w * clientWidth;
        java.util.ArrayList arrayList = this.f165700e;
        boolean z19 = false;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(0);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar2 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(arrayList.size() - 1);
        if (kVar.f165778b != 0) {
            f19 = kVar.f165781e * clientWidth;
            z17 = false;
        } else {
            z17 = true;
        }
        if (kVar2.f165778b != this.f165703h.getCount() - 1) {
            f27 = kVar2.f165781e * clientWidth;
            z18 = false;
        } else {
            z18 = true;
        }
        if (scrollX < f19) {
            if (z17) {
                this.U.c(java.lang.Math.abs(f19 - scrollX) / clientWidth);
                z19 = true;
            }
            scrollX = f19;
        } else if (scrollX > f27) {
            if (z18) {
                this.V.c(java.lang.Math.abs(scrollX - f27) / clientWidth);
                z19 = true;
            }
            scrollX = f27;
        }
        int i17 = (int) scrollX;
        this.H += scrollX - i17;
        scrollTo(i17, getScrollY());
        u(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z19;
    }

    private void y(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recomputeScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (i18 <= 0 || this.f165700e.isEmpty()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k q17 = q(this.f165704i);
            int min = (int) ((q17 != null ? java.lang.Math.min(q17.f165781e, this.f165718w) : 0.0f) * ((i17 - getPaddingLeft()) - getPaddingRight()));
            if (min != getScrollX()) {
                h(false);
                scrollTo(min, getScrollY());
            }
        } else {
            int scrollX = (int) ((getScrollX() / (((i18 - getPaddingLeft()) - getPaddingRight()) + i27)) * (((i17 - getPaddingLeft()) - getPaddingRight()) + i19));
            scrollTo(scrollX, getScrollY());
            if (!this.f165709p.isFinished()) {
                this.f165709p.startScroll(scrollX, 0, (int) (q(this.f165704i).f165781e * i17), 0, this.f165709p.getDuration() - this.f165709p.timePassed());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recomputeScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private void z(int i17, boolean z17, int i18, boolean z18) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k q17 = q(i17);
        int clientWidth = q17 != null ? (int) (getClientWidth() * java.lang.Math.max(this.f165717v, java.lang.Math.min(q17.f165781e, this.f165718w))) : 0;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("smoothScrollTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i19 = clientWidth - scrollX;
                int i27 = 0 - scrollY;
                if (i19 == 0 && i27 == 0) {
                    h(false);
                    w();
                    setScrollState(0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth2 = getClientWidth();
                    int i28 = clientWidth2 / 2;
                    float f17 = clientWidth2;
                    float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(i19) * 1.0f) / f17);
                    float f18 = i28;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("distanceInfluenceForSnapDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    float sin = (float) java.lang.Math.sin((float) ((min - 0.5f) * 0.4712389167638204d));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("distanceInfluenceForSnapDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    float f19 = f18 + (sin * f18);
                    int abs = java.lang.Math.abs(i18);
                    this.f165709p.startScroll(scrollX, scrollY, i19, i27, java.lang.Math.min(abs > 0 ? java.lang.Math.round(java.lang.Math.abs(f19 / abs) * 1000.0f) * 4 : (int) (((java.lang.Math.abs(i19) / ((f17 * this.f165703h.getPageWidth(this.f165704i)) + this.f165713r)) + 3.0f) * 100.0f), 600));
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.k(this);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                }
            }
            if (z18 && (onPageChangeListener2 = this.f165723y0) != null) {
                onPageChangeListener2.onPageSelected(i17);
            }
        } else {
            if (z18 && (onPageChangeListener = this.f165723y0) != null) {
                onPageChangeListener.onPageSelected(i17);
            }
            h(false);
            scrollTo(clientWidth, 0);
            u(clientWidth);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void A(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.A = false;
        B(i17, z17, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    void B(int i17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        C(i17, z17, z18, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    void C(int i17, boolean z17, boolean z18, int i18) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        androidx.viewpager.widget.a aVar = this.f165703h;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        java.util.ArrayList arrayList = this.f165700e;
        if (!z18 && this.f165704i == i17 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        if (i17 < 0) {
            i17 = 0;
        } else if (i17 >= this.f165703h.getCount()) {
            i17 = this.f165703h.getCount() - 1;
        }
        int i19 = this.B;
        int i27 = this.f165704i;
        if (i17 > i27 + i19 || i17 < i27 - i19) {
            for (int i28 = 0; i28 < arrayList.size(); i28++) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(i28)).f165779c = true;
            }
        }
        boolean z19 = this.f165704i != i17;
        if (this.W) {
            this.f165704i = i17;
            if (z19 && (onPageChangeListener = this.f165723y0) != null) {
                onPageChangeListener.onPageSelected(i17);
            }
            requestLayout();
        } else {
            x(i17);
            z(i17, z17, i18, z19);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList arrayList, int i17, int i18) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k o17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addFocusables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        iz5.a.d(null, arrayList);
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                android.view.View childAt = getChildAt(i19);
                if (childAt.getVisibility() == 0 && (o17 = o(childAt)) != null && o17.f165778b == this.f165704i) {
                    childAt.addFocusables(arrayList, i17, i18);
                }
            }
        }
        if (descendantFocusability != 262144 || size == arrayList.size()) {
            if (!isFocusable()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFocusables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return;
            } else {
                if ((i18 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFocusables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    return;
                }
                arrayList.add(this);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFocusables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k o17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTouchables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 0 && (o17 = o(childAt)) != null && o17.f165778b == this.f165704i) {
                childAt.addTouchables(arrayList);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTouchables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        iz5.a.d(null, layoutParams);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams layoutParams2 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) layoutParams;
        boolean z17 = layoutParams2.f165727a | false;
        layoutParams2.f165727a = z17;
        if (!this.f165722y) {
            super.addView(view, i17, layoutParams);
        } else {
            if (z17) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Cannot add pager decor view during layout");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                throw illegalStateException;
            }
            layoutParams2.f165730d = true;
            addViewInLayout(view, i17, layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f165703h == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i17 < 0) {
            z17 = scrollX > ((int) (((float) clientWidth) * this.f165717v));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return z17;
        }
        if (i17 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        z17 = scrollX < ((int) (((float) clientWidth) * this.f165718w));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z17;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z17 = (layoutParams instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) && super.checkLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z17;
    }

    @Override // android.view.View
    public void computeScroll() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f165709p.isFinished() || !this.f165709p.computeScrollOffset()) {
            h(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f165709p.getCurrX();
        int currY = this.f165709p.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!u(currX)) {
                this.f165709p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k d(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNewItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k();
        kVar.f165778b = i17;
        kVar.f165777a = this.f165703h.instantiateItem((android.view.ViewGroup) this, i17);
        kVar.f165780d = this.f165703h.getPageWidth(i17);
        java.util.ArrayList arrayList = this.f165700e;
        if (i18 < 0 || i18 >= arrayList.size()) {
            arrayList.add(kVar);
        } else {
            arrayList.add(i18, kVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNewItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "dispatchKeyEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = super.dispatchKeyEvent(r8)
            r3 = 1
            if (r2 != 0) goto L58
            java.lang.String r2 = "executeKeyEvent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            int r4 = r8.getAction()
            r5 = 0
            if (r4 != 0) goto L50
            int r4 = r8.getKeyCode()
            r6 = 21
            if (r4 == r6) goto L49
            r6 = 22
            if (r4 == r6) goto L42
            r6 = 61
            if (r4 == r6) goto L2b
            goto L50
        L2b:
            boolean r4 = r8.hasNoModifiers()
            if (r4 == 0) goto L37
            r8 = 2
            boolean r8 = r7.e(r8)
            goto L51
        L37:
            boolean r8 = r8.hasModifiers(r3)
            if (r8 == 0) goto L50
            boolean r8 = r7.e(r3)
            goto L51
        L42:
            r8 = 66
            boolean r8 = r7.e(r8)
            goto L51
        L49:
            r8 = 17
            boolean r8 = r7.e(r8)
            goto L51
        L50:
            r8 = r5
        L51:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            if (r8 == 0) goto L57
            goto L58
        L57:
            r3 = r5
        L58:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k o17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (accessibilityEvent.getEventType() == 4096) {
            boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return dispatchPopulateAccessibilityEvent;
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 0 && (o17 = o(childAt)) != null && o17.f165778b == this.f165704i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return false;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.draw(canvas);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int overScrollMode = getOverScrollMode();
        boolean z17 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f165703h) != null && aVar.getCount() > 1)) {
            if (!this.U.b()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f165717v * width);
                this.U.f11102a.setSize(height, width);
                z17 = false | this.U.f11102a.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.V.b()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f165718w + 1.0f)) * width2);
                this.V.f11102a.setSize(height2, width2);
                z17 |= this.V.f11102a.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.U.f11102a.finish();
            this.V.f11102a.finish();
        }
        if (z17) {
            n3.u0.k(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawableStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f165714s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawableStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = "arrowScroll"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.view.View r2 = r10.findFocus()
            r3 = 1
            r4 = 0
            if (r2 != r10) goto L10
            goto L36
        L10:
            if (r2 == 0) goto L37
            android.view.ViewParent r5 = r2.getParent()
        L16:
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L23
            if (r5 != r10) goto L1e
            r5 = r3
            goto L24
        L1e:
            android.view.ViewParent r5 = r5.getParent()
            goto L16
        L23:
            r5 = r4
        L24:
            if (r5 != 0) goto L37
            android.view.ViewParent r2 = r2.getParent()
        L2a:
            boolean r5 = r2 instanceof android.view.ViewGroup
            if (r5 == 0) goto L36
            r2.getClass()
            android.view.ViewParent r2 = r2.getParent()
            goto L2a
        L36:
            r2 = 0
        L37:
            android.view.FocusFinder r5 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r5.findNextFocus(r10, r2, r11)
            java.lang.String r6 = "pageLeft"
            r7 = 66
            r8 = 17
            if (r5 == 0) goto L93
            if (r5 == r2) goto L93
            android.graphics.Rect r9 = r10.f165702g
            if (r11 != r8) goto L77
            android.graphics.Rect r7 = r10.n(r9, r5)
            int r7 = r7.left
            android.graphics.Rect r8 = r10.n(r9, r2)
            int r8 = r8.left
            if (r2 == 0) goto L71
            if (r7 < r8) goto L71
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            int r2 = r10.f165704i
            if (r2 <= 0) goto L6d
            int r2 = r2 - r3
            r10.A(r2, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            goto Lb5
        L6d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            goto Lb4
        L71:
            boolean r2 = r5.requestFocus()
        L75:
            r4 = r2
            goto Lb6
        L77:
            if (r11 != r7) goto Lb6
            android.graphics.Rect r3 = r10.n(r9, r5)
            int r3 = r3.left
            android.graphics.Rect r4 = r10.n(r9, r2)
            int r4 = r4.left
            if (r2 == 0) goto L8e
            if (r3 > r4) goto L8e
            boolean r2 = r10.t()
            goto L75
        L8e:
            boolean r2 = r5.requestFocus()
            goto L75
        L93:
            if (r11 == r8) goto La2
            if (r11 != r3) goto L98
            goto La2
        L98:
            if (r11 == r7) goto L9d
            r2 = 2
            if (r11 != r2) goto Lb6
        L9d:
            boolean r4 = r10.t()
            goto Lb6
        La2:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            int r2 = r10.f165704i
            if (r2 <= 0) goto Lb1
            int r2 = r2 - r3
            r10.A(r2, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            goto Lb5
        Lb1:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
        Lb4:
            r3 = r4
        Lb5:
            r4 = r3
        Lb6:
            if (r4 == 0) goto Lbf
            int r11 = android.view.SoundEffectConstants.getContantForFocusDirection(r11)
            r10.playSoundEffect(r11)
        Lbf:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.e(int):boolean");
    }

    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.C) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        this.S = true;
        setScrollState(1);
        this.H = 0.0f;
        this.f165698J = 0.0f;
        android.view.VelocityTracker velocityTracker = this.M;
        if (velocityTracker == null) {
            this.M = android.view.VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.M.addMovement(obtain);
        obtain.recycle();
        this.T = uptimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r15.canScrollHorizontally(-r17) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.View r15, boolean r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            r0 = r15
            java.lang.String r1 = "canScroll"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            boolean r3 = r0 instanceof android.view.ViewGroup
            r4 = 1
            if (r3 == 0) goto L5d
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r5 = r15.getScrollX()
            int r6 = r15.getScrollY()
            int r7 = r3.getChildCount()
            int r7 = r7 - r4
        L1d:
            if (r7 < 0) goto L5d
            android.view.View r9 = r3.getChildAt(r7)
            int r8 = r18 + r5
            int r10 = r9.getLeft()
            if (r8 < r10) goto L5a
            int r10 = r9.getRight()
            if (r8 >= r10) goto L5a
            int r10 = r19 + r6
            int r11 = r9.getTop()
            if (r10 < r11) goto L5a
            int r11 = r9.getBottom()
            if (r10 >= r11) goto L5a
            r11 = 1
            int r12 = r9.getLeft()
            int r12 = r8 - r12
            int r8 = r9.getTop()
            int r13 = r10 - r8
            r8 = r14
            r10 = r11
            r11 = r17
            boolean r8 = r8.g(r9, r10, r11, r12, r13)
            if (r8 == 0) goto L5a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        L5a:
            int r7 = r7 + (-1)
            goto L1d
        L5d:
            if (r16 == 0) goto L6b
            r3 = r17
            int r3 = -r3
            java.util.WeakHashMap r5 = n3.l1.f334362a
            boolean r0 = r15.canScrollHorizontally(r3)
            if (r0 == 0) goto L6b
            goto L6c
        L6b:
            r4 = 0
        L6c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.g(android.view.View, boolean, int, int, int):boolean");
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams layoutParams = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return generateDefaultLayoutParams;
    }

    public androidx.viewpager.widget.a getAdapter() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        androidx.viewpager.widget.a aVar = this.f165703h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return aVar;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildDrawingOrder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f165721x1 == 2) {
            i18 = (i17 - 1) - i18;
        }
        int i19 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) ((android.view.View) this.f165724y1.get(i18)).getLayoutParams()).f165732f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildDrawingOrder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i19;
    }

    public int getCurrentItem() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i17 = this.f165704i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i17;
    }

    public int getOffscreenPageLimit() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOffscreenPageLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i17 = this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOffscreenPageLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i17;
    }

    public int getPageMargin() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageMargin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i17 = this.f165713r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageMargin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dataSetChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int count = this.f165703h.getCount();
        this.f165699d = count;
        java.util.ArrayList arrayList = this.f165700e;
        boolean z17 = arrayList.size() < (this.B * 2) + 1 && arrayList.size() < count;
        int i17 = this.f165704i;
        int i18 = 0;
        boolean z18 = false;
        while (i18 < arrayList.size()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(i18);
            int itemPosition = this.f165703h.getItemPosition(kVar.f165777a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    arrayList.remove(i18);
                    i18--;
                    if (!z18) {
                        this.f165703h.startUpdate((android.view.ViewGroup) this);
                        z18 = true;
                    }
                    this.f165703h.destroyItem((android.view.ViewGroup) this, kVar.f165778b, kVar.f165777a);
                    int i19 = this.f165704i;
                    if (i19 == kVar.f165778b) {
                        i17 = java.lang.Math.max(0, java.lang.Math.min(i19, count - 1));
                    }
                } else {
                    int i27 = kVar.f165778b;
                    if (i27 != itemPosition) {
                        if (i27 == this.f165704i) {
                            i17 = itemPosition;
                        }
                        kVar.f165778b = itemPosition;
                    }
                }
                z17 = true;
            }
            i18++;
        }
        if (z18) {
            this.f165703h.finishUpdate((android.view.ViewGroup) this);
        }
        java.util.Collections.sort(arrayList, C1);
        if (z17) {
            int childCount = getChildCount();
            for (int i28 = 0; i28 < childCount; i28++) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams layoutParams = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) getChildAt(i28).getLayoutParams();
                if (!layoutParams.f165727a) {
                    layoutParams.f165729c = 0.0f;
                }
            }
            B(i17, false, true);
            requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dataSetChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (!this.S) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            throw illegalStateException;
        }
        android.view.VelocityTracker velocityTracker = this.M;
        velocityTracker.computeCurrentVelocity(1000, this.P);
        int xVelocity = (int) velocityTracker.getXVelocity(this.L);
        this.A = true;
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k p17 = p();
        C(j(p17.f165778b, ((scrollX / clientWidth) - p17.f165781e) / p17.f165780d, xVelocity, (int) (this.H - this.f165698J)), true, true, xVelocity);
        k();
        this.S = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void m(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fakeDragBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (!this.S) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fakeDragBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            throw illegalStateException;
        }
        this.H += f17;
        float scrollX = getScrollX() - f17;
        float clientWidth = getClientWidth();
        float f18 = this.f165717v * clientWidth;
        float f19 = this.f165718w * clientWidth;
        java.util.ArrayList arrayList = this.f165700e;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(0);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar2 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(arrayList.size() - 1);
        if (kVar.f165778b != 0) {
            f18 = kVar.f165781e * clientWidth;
        }
        if (kVar2.f165778b != this.f165703h.getCount() - 1) {
            f19 = kVar2.f165781e * clientWidth;
        }
        if (scrollX < f18) {
            scrollX = f18;
        } else if (scrollX > f19) {
            scrollX = f19;
        }
        int i17 = (int) scrollX;
        this.H += scrollX - i17;
        scrollTo(i17, getScrollY());
        u(i17);
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(this.T, android.os.SystemClock.uptimeMillis(), 2, this.H, 0.0f, 0);
        this.M.addMovement(obtain);
        obtain.recycle();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fakeDragBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k o(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("infoForChild", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f165700e;
            if (i17 >= arrayList.size()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("infoForChild", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return null;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(i17);
            if (this.f165703h.isViewFromObject(view, kVar.f165777a)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("infoForChild", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return kVar;
            }
            i17++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.onAttachedToWindow();
        this.W = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        removeCallbacks(this.f165726z1);
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        float f17;
        float f18;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.onDraw(canvas);
        if (this.f165713r > 0 && this.f165714s != null) {
            java.util.ArrayList arrayList = this.f165700e;
            if (arrayList.size() > 0 && this.f165703h != null) {
                int scrollX = getScrollX();
                float width = getWidth();
                float f19 = this.f165713r / width;
                int i19 = 0;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(0);
                float f27 = kVar.f165781e;
                int size = arrayList.size();
                int i27 = kVar.f165778b;
                int i28 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(size - 1)).f165778b;
                while (i27 < i28) {
                    while (true) {
                        i17 = kVar.f165778b;
                        if (i27 <= i17 || i19 >= size) {
                            break;
                        }
                        i19++;
                        kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(i19);
                    }
                    if (i27 == i17) {
                        float f28 = kVar.f165781e;
                        float f29 = kVar.f165780d;
                        f17 = (f28 + f29) * width;
                        f27 = f28 + f29 + f19;
                    } else {
                        float pageWidth = this.f165703h.getPageWidth(i27);
                        f17 = (f27 + pageWidth) * width;
                        f27 += pageWidth + f19;
                    }
                    int i29 = this.f165713r;
                    java.util.ArrayList arrayList2 = arrayList;
                    float f37 = f19;
                    if (i29 + f17 > scrollX) {
                        f18 = width;
                        i18 = i19;
                        this.f165714s.setBounds((int) f17, this.f165715t, (int) (i29 + f17 + 0.5f), this.f165716u);
                        this.f165714s.draw(canvas);
                    } else {
                        f18 = width;
                        i18 = i19;
                    }
                    if (f17 > scrollX + r5) {
                        break;
                    }
                    i27++;
                    arrayList = arrayList2;
                    f19 = f37;
                    width = f18;
                    i19 = i18;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.C = false;
            this.D = false;
            this.L = -1;
            android.view.VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.M = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        if (action != 0) {
            if (this.C) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return true;
            }
            if (this.D) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return false;
            }
        }
        if (action == 0) {
            float x17 = motionEvent.getX();
            this.f165698J = x17;
            this.H = x17;
            float y17 = motionEvent.getY();
            this.K = y17;
            this.I = y17;
            this.L = motionEvent.getPointerId(0);
            this.D = false;
            this.f165709p.computeScrollOffset();
            if (this.A1 != 2 || java.lang.Math.abs(this.f165709p.getFinalX() - this.f165709p.getCurrX()) <= this.R) {
                h(false);
                this.C = false;
            } else {
                this.f165709p.abortAnimation();
                this.A = false;
                w();
                this.C = true;
                setScrollState(1);
            }
        } else if (action == 2) {
            int i17 = this.L;
            if (i17 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i17);
                float x18 = motionEvent.getX(findPointerIndex);
                float f17 = x18 - this.H;
                float abs = java.lang.Math.abs(f17);
                float y18 = motionEvent.getY(findPointerIndex);
                float abs2 = java.lang.Math.abs(y18 - this.K);
                if (f17 != 0.0f) {
                    float f18 = this.H;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGutterDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    boolean z17 = (f18 < ((float) this.F) && f17 > 0.0f) || (f18 > ((float) (getWidth() - this.F)) && f17 < 0.0f);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGutterDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    if (!z17 && g(this, false, (int) f17, (int) x18, (int) y18)) {
                        this.H = x18;
                        this.I = y18;
                        this.D = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                        return false;
                    }
                }
                int i18 = this.G;
                if (abs > i18 && abs * 0.5f > abs2) {
                    this.C = true;
                    setScrollState(1);
                    this.H = f17 > 0.0f ? this.f165698J + this.G : this.f165698J - this.G;
                    this.I = y18;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i18) {
                    this.D = true;
                }
                if (this.C && v(x18)) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.k(this);
                }
            }
        } else if (action == 6) {
            s(motionEvent);
        }
        if (this.M == null) {
            this.M = android.view.VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        boolean z18 = this.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams layoutParams2;
        int i19;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z17 = false;
        setMeasuredDimension(android.view.View.getDefaultSize(0, i17), android.view.View.getDefaultSize(0, i18));
        int measuredWidth = getMeasuredWidth();
        this.F = java.lang.Math.min(measuredWidth / 10, this.E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i28 = 0;
        while (true) {
            boolean z18 = true;
            if (i28 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i28);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f165727a) {
                int i29 = layoutParams2.f165728b;
                int i37 = i29 & 7;
                int i38 = i29 & 112;
                boolean z19 = (i38 == 48 || i38 == 80) ? true : z17;
                if (i37 != 3 && i37 != 5) {
                    z18 = z17;
                }
                int i39 = Integer.MIN_VALUE;
                if (z19) {
                    i19 = Integer.MIN_VALUE;
                    i39 = 1073741824;
                } else {
                    i19 = z18 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i47 = ((android.view.ViewGroup.LayoutParams) layoutParams2).width;
                if (i47 != -2) {
                    if (i47 == -1) {
                        i47 = paddingLeft;
                    }
                    i39 = 1073741824;
                } else {
                    i47 = paddingLeft;
                }
                int i48 = ((android.view.ViewGroup.LayoutParams) layoutParams2).height;
                if (i48 != -2) {
                    if (i48 == -1) {
                        i48 = measuredHeight;
                    }
                    i27 = 1073741824;
                } else {
                    i48 = measuredHeight;
                    i27 = i19;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i47, i39), android.view.View.MeasureSpec.makeMeasureSpec(i48, i27));
                if (z19) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z18) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i28++;
            z17 = false;
        }
        android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f165719x = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f165722y = true;
        w();
        this.f165722y = false;
        int childCount2 = getChildCount();
        for (int i49 = 0; i49 < childCount2; i49++) {
            android.view.View childAt2 = getChildAt(i49);
            if (childAt2.getVisibility() != 8 && (((layoutParams = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f165727a) && layoutParams != null)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f165729c), 1073741824), this.f165719x);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i17, android.graphics.Rect rect) {
        int i18;
        int i19;
        int i27;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k o17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRequestFocusInDescendants", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int childCount = getChildCount();
        if ((i17 & 2) != 0) {
            i19 = childCount;
            i18 = 0;
            i27 = 1;
        } else {
            i18 = childCount - 1;
            i19 = -1;
            i27 = -1;
        }
        while (i18 != i19) {
            android.view.View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 0 && (o17 = o(childAt)) != null && o17.f165778b == this.f165704i && childAt.requestFocus(i17, rect)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestFocusInDescendants", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return true;
            }
            i18 += i27;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestFocusInDescendants", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRestoreInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (!(parcelable instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRestoreInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.SavedState savedState = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        androidx.viewpager.widget.a aVar = this.f165703h;
        java.lang.ClassLoader classLoader = savedState.f165735f;
        if (aVar != null) {
            aVar.restoreState(savedState.f165734e, classLoader);
            B(savedState.f165733d, false, true);
        } else {
            this.f165706m = savedState.f165733d;
            this.f165707n = savedState.f165734e;
            this.f165708o = classLoader;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRestoreInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.SavedState savedState = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.SavedState(super.onSaveInstanceState());
        savedState.f165733d = this.f165704i;
        androidx.viewpager.widget.a aVar = this.f165703h;
        if (aVar != null) {
            savedState.f165734e = aVar.saveState();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 != i19) {
            int i28 = this.f165713r;
            y(i17, i19, i28, i28);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.S) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        androidx.viewpager.widget.a aVar = this.f165703h;
        if (aVar == null || aVar.getCount() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        if (this.M == null) {
            this.M = android.view.VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f165709p.abortAnimation();
            this.A = false;
            w();
            this.C = true;
            setScrollState(1);
            float x17 = motionEvent.getX();
            this.f165698J = x17;
            this.H = x17;
            float y17 = motionEvent.getY();
            this.K = y17;
            this.I = y17;
            this.L = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.C) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.L);
                    float x18 = motionEvent.getX(findPointerIndex);
                    float abs = java.lang.Math.abs(x18 - this.H);
                    float y18 = motionEvent.getY(findPointerIndex);
                    float abs2 = java.lang.Math.abs(y18 - this.I);
                    int i19 = this.G;
                    if (abs > i19 && abs > abs2) {
                        this.C = true;
                        float f17 = this.f165698J;
                        this.H = x18 - f17 > 0.0f ? f17 + i19 : f17 - i19;
                        this.I = y18;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                    }
                }
                if (this.C) {
                    r4 = 0 | (v(motionEvent.getX(motionEvent.findPointerIndex(this.L))) ? 1 : 0);
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.H = motionEvent.getX(actionIndex);
                    this.L = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    s(motionEvent);
                    this.H = motionEvent.getX(motionEvent.findPointerIndex(this.L));
                }
            } else if (this.C) {
                z(this.f165704i, true, 0, false);
                this.L = -1;
                k();
                boolean e17 = this.U.e();
                i18 = this.V.e();
                i17 = e17;
                r4 = i17 | i18;
            }
        } else if (this.C) {
            android.view.VelocityTracker velocityTracker = this.M;
            velocityTracker.computeCurrentVelocity(1000, this.P);
            int xVelocity = (int) velocityTracker.getXVelocity(this.L);
            this.A = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k p17 = p();
            int i27 = p17.f165778b;
            float f18 = ((scrollX / clientWidth) - p17.f165781e) / p17.f165780d;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.L);
            C(j(i27, f18, xVelocity, (int) (motionEvent.getX(findPointerIndex2 >= 0 ? findPointerIndex2 : 0) - this.f165698J)), true, true, xVelocity);
            this.L = -1;
            k();
            boolean e18 = this.U.e();
            i18 = this.V.e();
            i17 = e18;
            r4 = i17 | i18;
        }
        if (r4 != 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("infoForCurrentScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k p() {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "infoForCurrentScrollPosition"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            int r3 = r17.getClientWidth()
            r4 = 0
            if (r3 <= 0) goto L19
            int r5 = r17.getScrollX()
            float r5 = (float) r5
            float r6 = (float) r3
            float r5 = r5 / r6
            goto L1a
        L19:
            r5 = r4
        L1a:
            if (r3 <= 0) goto L22
            int r6 = r0.f165713r
            float r6 = (float) r6
            float r3 = (float) r3
            float r6 = r6 / r3
            goto L23
        L22:
            r6 = r4
        L23:
            r3 = 0
            r7 = -1
            r8 = 1
            r9 = 0
            r11 = r3
            r12 = r8
            r10 = r9
            r9 = r7
            r7 = r4
        L2c:
            java.util.ArrayList r13 = r0.f165700e
            int r14 = r13.size()
            if (r11 >= r14) goto L85
            java.lang.Object r14 = r13.get(r11)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k r14 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) r14
            if (r12 != 0) goto L55
            int r15 = r14.f165778b
            int r9 = r9 + r8
            if (r15 == r9) goto L55
            float r4 = r4 + r7
            float r4 = r4 + r6
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k r7 = r0.f165701f
            r7.f165781e = r4
            r7.f165778b = r9
            androidx.viewpager.widget.a r4 = r0.f165703h
            float r4 = r4.getPageWidth(r9)
            r7.f165780d = r4
            int r11 = r11 + (-1)
            r9 = r7
            goto L56
        L55:
            r9 = r14
        L56:
            float r4 = r9.f165781e
            float r7 = r9.f165780d
            float r7 = r7 + r4
            float r7 = r7 + r6
            if (r12 != 0) goto L67
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 < 0) goto L63
            goto L67
        L63:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r10
        L67:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L81
            int r7 = r13.size()
            int r7 = r7 - r8
            if (r11 != r7) goto L73
            goto L81
        L73:
            int r7 = r9.f165778b
            float r10 = r9.f165780d
            int r11 = r11 + 1
            r12 = r3
            r16 = r9
            r9 = r7
            r7 = r10
            r10 = r16
            goto L2c
        L81:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r9
        L85:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.p():com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k");
    }

    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("infoForPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f165700e;
            if (i18 >= arrayList.size()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("infoForPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return null;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(i18);
            if (kVar.f165778b == i17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("infoForPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return kVar;
            }
            i18++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r16, float r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            java.lang.String r1 = "onPageScrolled"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            int r3 = r0.f165720x0
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L74
            int r3 = r15.getScrollX()
            int r6 = r15.getPaddingLeft()
            int r7 = r15.getPaddingRight()
            int r8 = r15.getWidth()
            int r9 = r15.getChildCount()
            r10 = r4
        L24:
            if (r10 >= r9) goto L74
            android.view.View r11 = r15.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r12 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r12
            boolean r13 = r12.f165727a
            if (r13 != 0) goto L35
            goto L71
        L35:
            int r12 = r12.f165728b
            r12 = r12 & 7
            if (r12 == r5) goto L56
            r13 = 3
            if (r12 == r13) goto L50
            r13 = 5
            if (r12 == r13) goto L43
            r12 = r6
            goto L65
        L43:
            int r12 = r8 - r7
            int r13 = r11.getMeasuredWidth()
            int r12 = r12 - r13
            int r13 = r11.getMeasuredWidth()
            int r7 = r7 + r13
            goto L62
        L50:
            int r12 = r11.getWidth()
            int r12 = r12 + r6
            goto L65
        L56:
            int r12 = r11.getMeasuredWidth()
            int r12 = r8 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r6)
        L62:
            r14 = r12
            r12 = r6
            r6 = r14
        L65:
            int r6 = r6 + r3
            int r13 = r11.getLeft()
            int r6 = r6 - r13
            if (r6 == 0) goto L70
            r11.offsetLeftAndRight(r6)
        L70:
            r6 = r12
        L71:
            int r10 = r10 + 1
            goto L24
        L74:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r3 = r0.f165723y0
            if (r3 == 0) goto L81
            r6 = r16
            r7 = r17
            r8 = r18
            r3.onPageScrolled(r6, r7, r8)
        L81:
            androidx.viewpager.widget.m r3 = r0.f165705l1
            if (r3 == 0) goto Lb4
            int r3 = r15.getScrollX()
            int r6 = r15.getChildCount()
        L8d:
            if (r4 >= r6) goto Lb4
            android.view.View r7 = r15.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r8 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r8
            boolean r8 = r8.f165727a
            if (r8 == 0) goto L9e
            goto Lb1
        L9e:
            int r8 = r7.getLeft()
            int r8 = r8 - r3
            float r8 = (float) r8
            int r9 = r15.getClientWidth()
            float r9 = (float) r9
            float r8 = r8 / r9
            androidx.viewpager.widget.m r9 = r0.f165705l1
            hb4.a r9 = (hb4.a) r9
            r9.a(r7, r8)
        Lb1:
            int r4 = r4 + 1
            goto L8d
        Lb4:
            r0.f165710p0 = r5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.r(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f165722y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        androidx.viewpager.widget.a aVar2 = this.f165703h;
        if (aVar2 != null) {
            aVar2.unregisterDataSetObserver(this.f165712q);
            this.f165703h.startUpdate((android.view.ViewGroup) this);
            int i17 = 0;
            while (true) {
                arrayList = this.f165700e;
                if (i17 >= arrayList.size()) {
                    break;
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k kVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.k) arrayList.get(i17);
                this.f165703h.destroyItem((android.view.ViewGroup) this, kVar.f165778b, kVar.f165777a);
                i17++;
            }
            this.f165703h.finishUpdate((android.view.ViewGroup) this);
            arrayList.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeNonDecorViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            int i18 = 0;
            while (i18 < getChildCount()) {
                if (!((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) getChildAt(i18).getLayoutParams()).f165727a) {
                    removeViewAt(i18);
                    i18--;
                }
                i18++;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeNonDecorViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            this.f165704i = 0;
            scrollTo(0, 0);
        }
        this.f165703h = aVar;
        this.f165699d = 0;
        if (aVar != null) {
            if (this.f165712q == null) {
                this.f165712q = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.n(this, null);
            }
            this.f165703h.registerDataSetObserver(this.f165712q);
            this.A = false;
            boolean z17 = this.W;
            this.W = true;
            this.f165699d = this.f165703h.getCount();
            if (this.f165706m >= 0) {
                this.f165703h.restoreState(this.f165707n, this.f165708o);
                B(this.f165706m, false, true);
                this.f165706m = -1;
                this.f165707n = null;
                this.f165708o = null;
            } else if (z17) {
                requestLayout();
            } else {
                w();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setChildrenDrawingOrderEnabledCompat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f165711p1 == null) {
            try {
                this.f165711p1 = android.view.ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        try {
            java.lang.reflect.Method method = this.f165711p1;
            if (method != null) {
                method.invoke(this, java.lang.Boolean.valueOf(z17));
            }
        } catch (java.lang.Exception unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setChildrenDrawingOrderEnabledCompat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setCurrentItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.A = false;
        B(i17, !this.W, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setOffscreenPageLimit(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOffscreenPageLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (i17 < 1) {
            i17 = 1;
        }
        if (i17 != this.B) {
            this.B = i17;
            w();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOffscreenPageLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setOnAdapterChangeListener(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.m mVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnAdapterChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnAdapterChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnPageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f165723y0 = onPageChangeListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnPageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setPageMargin(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageMargin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i18 = this.f165713r;
        this.f165713r = i17;
        int width = getWidth();
        y(width, width, i17, i18);
        requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageMargin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageMarginDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f165714s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageMarginDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setScroller(android.widget.Scroller scroller) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScroller", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f165709p = scroller;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScroller", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    boolean t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageRight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        androidx.viewpager.widget.a aVar = this.f165703h;
        if (aVar == null || this.f165704i >= aVar.getCount() - 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageRight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        A(this.f165704i + 1, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageRight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return true;
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("verifyDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z17 = super.verifyDrawable(drawable) || drawable == this.f165714s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("verifyDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("populate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        x(this.f165704i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("populate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r13 == r14) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void x(int r20) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.x(int):void");
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f165727a;

        /* renamed from: b, reason: collision with root package name */
        public final int f165728b;

        /* renamed from: c, reason: collision with root package name */
        public float f165729c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f165730d;

        /* renamed from: e, reason: collision with root package name */
        public int f165731e;

        /* renamed from: f, reason: collision with root package name */
        public int f165732f;

        public LayoutParams() {
            super(-1, -1);
            this.f165729c = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f165729c = 0.0f;
            int[] iArr = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.B1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.B1);
            this.f165728b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams layoutParams = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams(getContext(), attributeSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return layoutParams;
    }

    public void setPageMarginDrawable(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageMarginDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        setPageMarginDrawable(getContext().getResources().getDrawable(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageMarginDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }
}
