package com.tencent.mm.plugin.sns.ui.previewimageview;

/* loaded from: classes13.dex */
public class DynamicGridView extends com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f170255y0 = 0;
    public int A;
    public boolean B;
    public final java.util.List C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public android.widget.AbsListView.OnScrollListener H;
    public ud4.k0 I;

    /* renamed from: J, reason: collision with root package name */
    public ud4.j0 f170256J;
    public android.widget.AdapterView.OnItemClickListener K;
    public final android.widget.AdapterView.OnItemClickListener L;
    public boolean M;
    public java.util.Stack N;
    public ud4.f0 P;
    public android.view.View Q;
    public boolean R;
    public final ud4.i0 S;
    public int T;
    public float U;
    public float V;
    public float W;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.BitmapDrawable f170257d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f170258e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f170259f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f170260g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f170261h;

    /* renamed from: i, reason: collision with root package name */
    public float f170262i;

    /* renamed from: m, reason: collision with root package name */
    public int f170263m;

    /* renamed from: n, reason: collision with root package name */
    public int f170264n;

    /* renamed from: o, reason: collision with root package name */
    public float f170265o;

    /* renamed from: p, reason: collision with root package name */
    public float f170266p;

    /* renamed from: p0, reason: collision with root package name */
    public float f170267p0;

    /* renamed from: q, reason: collision with root package name */
    public int f170268q;

    /* renamed from: r, reason: collision with root package name */
    public int f170269r;

    /* renamed from: s, reason: collision with root package name */
    public int f170270s;

    /* renamed from: t, reason: collision with root package name */
    public int f170271t;

    /* renamed from: u, reason: collision with root package name */
    public int f170272u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f170273v;

    /* renamed from: w, reason: collision with root package name */
    public long f170274w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f170275x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f170276x0;

    /* renamed from: y, reason: collision with root package name */
    public int f170277y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f170278z;

    public DynamicGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170262i = 1.0f;
        this.f170263m = 0;
        this.f170264n = 0;
        this.f170265o = 0.0f;
        this.f170266p = 0.0f;
        this.f170268q = -1;
        this.f170269r = -1;
        this.f170270s = -1;
        this.f170271t = -1;
        this.f170273v = new java.util.ArrayList();
        this.f170274w = -1L;
        this.f170275x = false;
        this.f170277y = -1;
        this.A = 0;
        this.B = false;
        this.C = new java.util.LinkedList();
        this.F = true;
        this.G = true;
        this.L = new ud4.w(this);
        this.R = false;
        this.S = new ud4.i0(this, null);
        this.T = -1;
        this.W = 0.0f;
        this.f170267p0 = 0.0f;
        this.f170276x0 = new ud4.v(this);
        r(context);
    }

    public static /* synthetic */ long b(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        long j17 = dynamicGridView.f170274w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return j17;
    }

    public static void c(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean z17 = i18 > i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (z17) {
            int min = java.lang.Math.min(i17, i18);
            while (min < java.lang.Math.max(i17, i18)) {
                android.view.View o17 = dynamicGridView.o(dynamicGridView.m(min));
                int i19 = min + 1;
                if (i19 % dynamicGridView.getColumnCount() == 0) {
                    linkedList.add(dynamicGridView.l(o17, (-o17.getWidth()) * (dynamicGridView.getColumnCount() - 1), 0.0f, o17.getHeight(), 0.0f));
                } else {
                    linkedList.add(dynamicGridView.l(o17, o17.getWidth(), 0.0f, 0.0f, 0.0f));
                }
                min = i19;
            }
        } else {
            for (int max = java.lang.Math.max(i17, i18); max > java.lang.Math.min(i17, i18); max--) {
                android.view.View o18 = dynamicGridView.o(dynamicGridView.m(max));
                if ((dynamicGridView.getColumnCount() + max) % dynamicGridView.getColumnCount() == 0) {
                    linkedList.add(dynamicGridView.l(o18, o18.getWidth() * (dynamicGridView.getColumnCount() - 1), 0.0f, -o18.getHeight(), 0.0f));
                } else {
                    linkedList.add(dynamicGridView.l(o18, -o18.getWidth(), 0.0f, 0.0f, 0.0f));
                }
            }
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(linkedList);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.addListener(new ud4.e0(dynamicGridView));
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public static /* synthetic */ android.widget.AbsListView.OnScrollListener d(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.widget.AbsListView.OnScrollListener onScrollListener = dynamicGridView.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onScrollListener;
    }

    public static /* synthetic */ boolean f(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.D = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return z17;
    }

    public static void g(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateEnableState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.setEnabled((dynamicGridView.D || dynamicGridView.E) ? false : true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEnableState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    private ud4.i getAdapterInterface() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapterInterface", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ud4.i iVar = (ud4.i) getAdapter();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapterInterface", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return iVar;
    }

    private int getColumnCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ud4.b bVar = (ud4.b) getAdapterInterface();
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return bVar.f426683h;
    }

    public static /* synthetic */ android.view.View h(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.view.View view = dynamicGridView.Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return view;
    }

    public static boolean t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPreLollipop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPreLollipop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.A():void");
    }

    public final void B(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNeighborViewsForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        java.util.List list = this.f170273v;
        ((java.util.ArrayList) list).clear();
        int n17 = n(j17);
        for (int firstVisiblePosition = getFirstVisiblePosition(); firstVisiblePosition <= getLastVisiblePosition(); firstVisiblePosition++) {
            if (n17 != firstVisiblePosition && ((ud4.h) getAdapterInterface()).f(firstVisiblePosition)) {
                ((java.util.ArrayList) list).add(java.lang.Long.valueOf(m(firstVisiblePosition)));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNeighborViewsForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.dispatchDraw(canvas);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f170257d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f170262i * 255.0f));
            this.f170257d.draw(canvas);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void i(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.animation.ObjectAnimator k17 = k(view);
        k17.setFloatValues(-2.0f, 2.0f);
        k17.start();
        ((java.util.LinkedList) this.C).add(k17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void j(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateWobbleInverse", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.animation.ObjectAnimator k17 = k(view);
        k17.setFloatValues(2.0f, -2.0f);
        k17.start();
        ((java.util.LinkedList) this.C).add(k17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateWobbleInverse", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final android.animation.ObjectAnimator k(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createBaseWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        t();
        view.setLayerType(1, null);
        android.animation.ObjectAnimator objectAnimator = new android.animation.ObjectAnimator();
        objectAnimator.setDuration(180L);
        objectAnimator.setRepeatMode(2);
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setPropertyName("rotation");
        objectAnimator.setTarget(view);
        objectAnimator.addListener(new ud4.x(this, view));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createBaseWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return objectAnimator;
    }

    public final android.animation.AnimatorSet l(android.view.View view, float f17, float f18, float f19, float f27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createTranslationAnimations", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", f17, f18);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationY", f19, f27);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createTranslationAnimations", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return animatorSet;
    }

    public final long m(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        long itemId = getAdapter().getItemId(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return itemId;
    }

    public int n(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.view.View o17 = o(j17);
        if (o17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return -1;
        }
        int positionForView = getPositionForView(o17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return positionForView;
    }

    public android.view.View o(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int firstVisiblePosition = getFirstVisiblePosition();
        android.widget.ListAdapter adapter = getAdapter();
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (adapter.getItemId(firstVisiblePosition + i17) == j17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                return childAt;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return null;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mars.xlog.Log.i("DynamicGridView", "onInterceptTouchEvent " + motionEvent.getAction() + " " + onInterceptTouchEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onInterceptTouchEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        ud4.f0 f0Var;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (this.R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return onTouchEvent;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f170277y);
        com.tencent.mars.xlog.Log.i("DynamicGridView", "onTouchEvent " + motionEvent.getAction());
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            int childCount = getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                    childCount = -1;
                    break;
                }
                if (ud4.u.a(getChildAt(childCount), x17, y17)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                    break;
                }
                childCount--;
            }
            this.T = childCount;
            com.tencent.mars.xlog.Log.i("DynamicGridView", "onTouchEvent " + motionEvent.getAction() + ",downPos " + this.T);
            if (!this.D && this.T >= 0) {
                ud4.i0 i0Var = this.S;
                i0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                i0Var.removeMessages(1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                i0Var.sendEmptyMessageDelayed(1, 300L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
            }
            this.f170270s = -1;
            this.f170271t = -1;
            this.f170268q = (int) motionEvent.getX();
            this.f170269r = (int) motionEvent.getY();
            this.W = motionEvent.getRawX();
            this.f170267p0 = motionEvent.getRawY();
            this.f170277y = motionEvent.getPointerId(0);
            if (this.B && isEnabled()) {
                layoutChildren();
                w(pointToPosition(this.f170268q, this.f170269r));
            } else if (!isEnabled()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                return false;
            }
        } else if (action == 1) {
            A();
            if (this.M && (f0Var = this.P) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTransitions", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$DynamicGridModification");
                java.util.List list = f0Var.f426697a;
                java.util.Collections.reverse(list);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTransitions", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$DynamicGridModification");
                if (!list.isEmpty()) {
                    this.N.push(this.P);
                    this.P = new ud4.f0();
                }
            }
        } else if (action == 2) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            if (this.f170275x && this.f170277y != -1 && findPointerIndex != -1) {
                if (this.f170271t != -1 || this.f170270s != -1) {
                    if (this.W > 0.0f && this.f170267p0 > 0.0f) {
                        this.f170265o = motionEvent.getRawX() - this.W;
                        this.f170266p = motionEvent.getRawY() - this.f170267p0;
                    }
                    this.f170270s = (int) motionEvent.getY(findPointerIndex);
                    int x18 = (int) motionEvent.getX(findPointerIndex);
                    this.f170271t = x18;
                    int i17 = this.f170270s - this.f170269r;
                    int i18 = x18 - this.f170268q;
                    android.graphics.Rect rect = this.f170258e;
                    android.graphics.Rect rect2 = this.f170260g;
                    rect.offsetTo(rect2.left + i18 + this.f170264n, rect2.top + i17 + this.f170263m);
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f170257d;
                    if (bitmapDrawable != null) {
                        bitmapDrawable.setBounds(this.f170258e);
                    }
                    invalidate();
                    p();
                    this.f170278z = false;
                    q();
                    if (this.f170256J != null) {
                        android.graphics.Rect rect3 = new android.graphics.Rect(this.f170261h);
                        rect3.offset((int) this.f170265o, (int) this.f170266p);
                        motionEvent.getRawY();
                        ud4.l lVar = (ud4.l) this.f170256J;
                        lVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragging", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
                        boolean a17 = lVar.a(rect3);
                        ud4.t tVar = lVar.f426720c;
                        if (a17) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            tVar.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("highlightDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            android.view.View view = tVar.f426738g;
                            android.graphics.drawable.Drawable background = view.getBackground();
                            android.content.Context context = tVar.f426732a;
                            if (background != null) {
                                view.getBackground().setColorFilter(b3.l.getColor(context, com.tencent.mm.R.color.ahd), android.graphics.PorterDuff.Mode.SRC_ATOP);
                            }
                            android.graphics.drawable.Drawable drawable = b3.l.getDrawable(context, com.tencent.mm.R.raw.trash_off_filled);
                            if (drawable != null) {
                                drawable.mutate();
                                drawable.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN);
                            }
                            tVar.f426739h.setImageDrawable(drawable);
                            tVar.f426740i.setText(com.tencent.mm.R.string.jcg);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("highlightDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            boolean z18 = tVar.f426745n;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            if (!z18) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                                tVar.f426745n = true;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                                ca4.z0.I0(new long[]{0, 10});
                            }
                            z17 = false;
                        } else {
                            ud4.t.a(tVar);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            z17 = false;
                            tVar.f426745n = false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragging", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
                    } else {
                        z17 = false;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    return z17;
                }
                this.f170270s = (int) motionEvent.getY(findPointerIndex);
                int x19 = (int) motionEvent.getX(findPointerIndex);
                this.f170271t = x19;
                this.f170268q = x19;
                this.f170269r = this.f170270s;
            }
        } else if (action == 3) {
            z();
            A();
        } else if (action == 6 && motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8) == this.f170277y) {
            A();
        }
        boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onTouchEvent2;
    }

    public final void p() {
        int i17;
        java.util.Iterator it;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleCellSwitch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int i18 = this.f170270s - this.f170269r;
        int i19 = this.f170271t - this.f170268q;
        int centerY = this.f170259f.centerY() + this.f170263m + i18;
        int centerX = this.f170259f.centerX() + this.f170264n + i19;
        android.view.View o17 = o(this.f170274w);
        this.Q = o17;
        if (o17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCellSwitch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return;
        }
        java.lang.String str2 = "getColumnAndRowForView";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getColumnAndRowForView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int positionForView = getPositionForView(o17);
        int columnCount = getColumnCount();
        android.graphics.Point point = new android.graphics.Point(positionForView % columnCount, positionForView / columnCount);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getColumnAndRowForView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        java.util.Iterator it6 = ((java.util.ArrayList) this.f170273v).iterator();
        float f17 = 0.0f;
        android.view.View view = null;
        float f18 = 0.0f;
        while (it6.hasNext()) {
            android.view.View o18 = o(((java.lang.Long) it6.next()).longValue());
            if (o18 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                int positionForView2 = getPositionForView(o18);
                int columnCount2 = getColumnCount();
                it = it6;
                android.graphics.Point point2 = new android.graphics.Point(positionForView2 % columnCount2, positionForView2 / columnCount2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("aboveRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                str = str2;
                boolean z17 = point2.y < point.y && point2.x > point.x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("aboveRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (!z17 || centerY >= o18.getBottom() || centerX <= o18.getLeft()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("aboveLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    boolean z18 = point2.y < point.y && point2.x < point.x;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("aboveLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    if (!z18 || centerY >= o18.getBottom() || centerX >= o18.getRight()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("belowRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        boolean z19 = point2.y > point.y && point2.x > point.x;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("belowRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        if (!z19 || centerY <= o18.getTop() || centerX <= o18.getLeft()) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("belowLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            boolean z27 = point2.y > point.y && point2.x < point.x;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("belowLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            if (!z27 || centerY <= o18.getTop() || centerX >= o18.getRight()) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("above", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                boolean z28 = point2.y < point.y && point2.x == point.x;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("above", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                if (!z28 || centerY >= o18.getBottom() - this.f170272u) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("below", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                    boolean z29 = point2.y > point.y && point2.x == point.x;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("below", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                    if (!z29 || centerY <= o18.getTop() + this.f170272u) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("right", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                        boolean z37 = point2.y == point.y && point2.x > point.x;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("right", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                        if (!z37 || centerX <= o18.getLeft() + this.f170272u) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("left", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                            boolean z38 = point2.y == point.y && point2.x < point.x;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("left", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                            if (!z38 || centerX >= o18.getRight() - this.f170272u) {
                                                i17 = centerY;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs = java.lang.Math.abs((o18.getRight() - o18.getLeft()) / 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                android.view.View view2 = this.Q;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs2 = java.lang.Math.abs((view2.getRight() - view2.getLeft()) / 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs3 = java.lang.Math.abs(abs - abs2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs4 = java.lang.Math.abs((o18.getBottom() - o18.getTop()) / 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                i17 = centerY;
                android.view.View view3 = this.Q;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs5 = java.lang.Math.abs((view3.getBottom() - view3.getTop()) / 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs6 = java.lang.Math.abs(abs4 - abs5);
                if (abs3 >= f17 && abs6 >= f18) {
                    f18 = abs6;
                    f17 = abs3;
                    view = o18;
                }
            } else {
                i17 = centerY;
                it = it6;
                str = str2;
            }
            it6 = it;
            str2 = str;
            centerY = i17;
        }
        if (view != null) {
            int positionForView3 = getPositionForView(this.Q);
            int positionForView4 = getPositionForView(view);
            com.tencent.mars.xlog.Log.i("DynamicGridView", "switch " + positionForView3 + "," + positionForView4);
            ud4.i adapterInterface = getAdapterInterface();
            if (positionForView4 != -1) {
                ud4.h hVar = (ud4.h) adapterInterface;
                if (hVar.f(positionForView3) && hVar.f(positionForView4)) {
                    u(positionForView3, positionForView4);
                    if (this.M) {
                        this.P.a(positionForView3, positionForView4);
                    }
                    this.f170269r = this.f170270s;
                    this.f170268q = this.f170271t;
                    s();
                    t();
                    t();
                    ud4.h0 h0Var = new ud4.h0(this, i19, i18);
                    B(this.f170274w);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateSwitchCell", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
                    getViewTreeObserver().addOnPreDrawListener(new ud4.g0(h0Var, positionForView3, positionForView4));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateSwitchCell", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
                }
            }
            B(this.f170274w);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCellSwitch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCellSwitch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.graphics.Rect rect = this.f170258e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int height = getHeight();
        int computeVerticalScrollExtent = computeVerticalScrollExtent();
        int computeVerticalScrollRange = computeVerticalScrollRange();
        int i17 = rect.top;
        int height2 = rect.height();
        boolean z17 = true;
        if (i17 <= 0 && computeVerticalScrollOffset > 0) {
            smoothScrollBy(-this.A, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        } else if (i17 + height2 < height || computeVerticalScrollOffset + computeVerticalScrollExtent >= computeVerticalScrollRange) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            z17 = false;
        } else {
            smoothScrollBy(this.A, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        }
        this.f170278z = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void r(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.setOnScrollListener(this.f170276x0);
        this.A = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        this.f170272u = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480300tx);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final boolean s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPostHoneycomb", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPostHoneycomb", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return true;
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.ListAdapter listAdapter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        setAdapter2(listAdapter);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setEditModeEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEditModeEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.G = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEditModeEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setHoverAlpha(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHoverAlpha", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f170262i = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHoverAlpha", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setNeedBanTouch(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedBanTouch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.R = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedBanTouch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnDragListener(ud4.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnDragListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f170256J = j0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnDragListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnDropListener(ud4.k0 k0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnDropListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.I = k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnDropListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnEditModeChangeListener(ud4.l0 l0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnEditModeChangeListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnEditModeChangeListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.K = onItemClickListener;
        super.setOnItemClickListener(this.L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnScrollListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.H = onScrollListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnScrollListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnSelectedItemBitmapCreationListener(ud4.m0 m0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnSelectedItemBitmapCreationListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnSelectedItemBitmapCreationListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setUndoSupportEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUndoSupportEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (this.M != z17) {
            if (z17) {
                this.N = new java.util.Stack();
            } else {
                this.N = null;
            }
        }
        this.M = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUndoSupportEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setWobbleInEditMode(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWobbleInEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.F = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWobbleInEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void u(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reorderElements", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ud4.j0 j0Var = this.f170256J;
        if (j0Var != null) {
            ((ud4.l) j0Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragPositionsChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragPositionsChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        }
        ud4.h hVar = (ud4.h) getAdapterInterface();
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        if (i18 < hVar.getCount()) {
            java.util.ArrayList arrayList = hVar.f426682g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            arrayList.add(i18, arrayList.remove(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            hVar.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        ud4.d dVar = hVar.f426710r;
        if (dVar != null) {
            dVar.a(hVar.k(i17), hVar.k(i18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reorderElements", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void v(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mars.xlog.Log.i("DynamicGridView", "reseting");
        ((java.util.ArrayList) this.f170273v).clear();
        this.f170274w = -1L;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f170257d = null;
        s();
        if (this.F) {
            if (this.B) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restartWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                y(false);
                x();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restartWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            } else {
                y(true);
            }
        }
        for (int i17 = 0; i17 < getLastVisiblePosition() - getFirstVisiblePosition(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final boolean w(int i17) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ud4.h hVar = (ud4.h) getAdapterInterface();
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (i17 < hVar.j()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            z17 = false;
        } else if (hVar.f426707o) {
            z17 = i17 != hVar.getCount() - 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            z17 = true;
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return false;
        }
        this.f170263m = 0;
        this.f170264n = 0;
        this.f170265o = 0.0f;
        this.f170266p = 0.0f;
        android.view.View childAt = getChildAt(i17 - getFirstVisiblePosition());
        if (childAt == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return false;
        }
        this.f170274w = getAdapter().getItemId(i17);
        com.tencent.mars.xlog.Log.i("DynamicGridView", "startDragAtPosition: view pos=%d, mMobileItemId=%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f170274w));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAndAddHoverView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int width = childAt.getWidth();
        int height = childAt.getHeight();
        int top = childAt.getTop();
        int left = childAt.getLeft();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitmapFromView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int width2 = childAt.getWidth();
        int height2 = childAt.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height2));
        arrayList.add(java.lang.Integer.valueOf(width2));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "getBitmapFromView", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "getBitmapFromView", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        childAt.draw(new android.graphics.Canvas(createBitmap));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmapFromView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(getResources(), createBitmap);
        this.f170259f = new android.graphics.Rect(left, top, left + width, top + height);
        android.graphics.Rect rect = this.f170259f;
        int i18 = (int) (width * 0.05f);
        int i19 = (int) (height * 0.05f);
        this.f170258e = new android.graphics.Rect(rect.left - i18, rect.top - i19, rect.right + i18, rect.bottom + i19);
        this.f170260g = new android.graphics.Rect(this.f170258e);
        bitmapDrawable.setBounds(this.f170259f);
        android.graphics.Rect r17 = pm0.v.r(childAt);
        this.f170261h = r17;
        com.tencent.mars.xlog.Log.i("DynamicGridView", "getAndAddHoverView: mDraggingViewOriginBounds:%s", r17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAndAddHoverView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f170257d = bitmapDrawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateBounds", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.animation.ObjectAnimator ofObject = android.animation.ObjectAnimator.ofObject(this.f170257d, "bounds", new ud4.y(this), this.f170258e);
        ofObject.addUpdateListener(new ud4.z(this));
        ofObject.addListener(new ud4.a0(this));
        ofObject.setDuration(10L);
        ofObject.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateBounds", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        s();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "startDragAtPosition", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "startDragAtPosition", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        B(this.f170274w);
        ud4.j0 j0Var = this.f170256J;
        if (j0Var != null) {
            ud4.l lVar = (ud4.l) j0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragStarted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
            com.tencent.mars.xlog.Log.i("DynamicGrid", "drag started at position " + i17);
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = lVar.f426718a;
            float elevation = dynamicGridView.getElevation();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            ud4.t tVar = lVar.f426720c;
            tVar.f426737f = elevation;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            dynamicGridView.setElevation(100.0f);
            dynamicGridView.setHoverAlpha(0.9f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateShowDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            android.view.View view = tVar.f426738g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "animateShowDelArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "animateShowDelArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(tVar.f426738g, "translationY", r8.getHeight(), 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateShowDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            android.view.View view2 = lVar.f426719b;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$1", "onDragStarted", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$1", "onDragStarted", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            tVar.f426745n = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragStarted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return true;
    }

    public final void x() {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startWobbleAnimation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null && (bool = java.lang.Boolean.TRUE) != childAt.getTag(com.tencent.mm.R.id.cxa)) {
                if (i17 % 2 == 0) {
                    i(childAt);
                } else {
                    j(childAt);
                }
                childAt.setTag(com.tencent.mm.R.id.cxa, bool);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startWobbleAnimation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void y(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        java.util.List list = this.C;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator) it.next()).cancel();
        }
        list.clear();
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                if (z17) {
                    childAt.setRotation(0.0f);
                }
                childAt.setTag(com.tencent.mm.R.id.cxa, java.lang.Boolean.FALSE);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.view.View o17 = o(this.f170274w);
        if (o17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return;
        }
        if (this.f170275x) {
            v(o17);
        }
        this.f170275x = false;
        this.f170278z = false;
        this.f170277y = -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(android.widget.ListAdapter listAdapter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.setAdapter(listAdapter);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public DynamicGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170262i = 1.0f;
        this.f170263m = 0;
        this.f170264n = 0;
        this.f170265o = 0.0f;
        this.f170266p = 0.0f;
        this.f170268q = -1;
        this.f170269r = -1;
        this.f170270s = -1;
        this.f170271t = -1;
        this.f170273v = new java.util.ArrayList();
        this.f170274w = -1L;
        this.f170275x = false;
        this.f170277y = -1;
        this.A = 0;
        this.B = false;
        this.C = new java.util.LinkedList();
        this.F = true;
        this.G = true;
        this.L = new ud4.w(this);
        this.R = false;
        this.S = new ud4.i0(this, null);
        this.T = -1;
        this.W = 0.0f;
        this.f170267p0 = 0.0f;
        this.f170276x0 = new ud4.v(this);
        r(context);
    }
}
