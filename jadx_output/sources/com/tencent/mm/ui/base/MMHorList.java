package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class MMHorList extends android.widget.AdapterView<android.widget.ListAdapter> {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public boolean B;
    public final android.database.DataSetObserver C;
    public final android.view.GestureDetector.OnGestureListener D;

    /* renamed from: d, reason: collision with root package name */
    public db5.m3 f197428d;

    /* renamed from: e, reason: collision with root package name */
    public int f197429e;

    /* renamed from: f, reason: collision with root package name */
    public int f197430f;

    /* renamed from: g, reason: collision with root package name */
    public int f197431g;

    /* renamed from: h, reason: collision with root package name */
    public int f197432h;

    /* renamed from: i, reason: collision with root package name */
    public int f197433i;

    /* renamed from: m, reason: collision with root package name */
    public int f197434m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Queue f197435n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f197436o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f197437p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Scroller f197438q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.GestureDetector f197439r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f197440s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f197441t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ListAdapter f197442u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f197443v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f197444w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f197445x;

    /* renamed from: y, reason: collision with root package name */
    public int f197446y;

    /* renamed from: z, reason: collision with root package name */
    public int f197447z;

    public MMHorList(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197434m = com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        this.f197435n = new java.util.LinkedList();
        this.f197436o = false;
        this.f197437p = false;
        this.f197443v = new db5.j3(this);
        this.f197444w = false;
        this.f197445x = false;
        this.f197446y = 0;
        this.f197447z = 0;
        this.A = false;
        this.B = false;
        this.C = new db5.k3(this);
        this.D = new db5.l3(this);
        b();
    }

    private int getChildViewTotalWidth() {
        return this.f197442u.getCount() * this.f197446y;
    }

    public final void a(android.view.View view, int i17) {
        this.f197437p = true;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i17, layoutParams, true);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    }

    public final void b() {
        this.f197438q = new android.widget.Scroller(getContext());
        this.f197429e = -1;
        this.f197430f = 0;
        this.f197431g = 0;
        this.f197432h = 0;
        this.f197433i = 0;
        this.f197436o = false;
        this.f197434m = com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        this.f197439r = new android.view.GestureDetector(getContext(), this.D);
    }

    public void c(int i17) {
        this.f197438q.forceFinished(true);
        android.widget.Scroller scroller = this.f197438q;
        int i18 = this.f197432h;
        scroller.startScroll(i18, 0, i17 - i18, 0);
        this.B = true;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f197439r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/base/MMHorList", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/ui/base/MMHorList", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 0) {
            this.A = true;
            db5.m3 m3Var = this.f197428d;
            if (m3Var != null) {
                ((fh4.d) m3Var).f262671a.f172454h.d();
            }
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            if (this.f197445x) {
                if (getChildViewTotalWidth() > getWidth()) {
                    int i17 = this.f197432h;
                    if (i17 < 0) {
                        this.f197438q.forceFinished(true);
                        android.widget.Scroller scroller = this.f197438q;
                        int i18 = this.f197432h;
                        scroller.startScroll(i18, 0, 0 - i18, 0);
                        requestLayout();
                    } else if (i17 > this.f197434m) {
                        this.f197438q.forceFinished(true);
                        android.widget.Scroller scroller2 = this.f197438q;
                        int i19 = this.f197432h;
                        scroller2.startScroll(i19, 0, this.f197434m - i19, 0);
                        requestLayout();
                    }
                } else if (this.f197432h != this.f197447z * (-1)) {
                    this.f197438q.forceFinished(true);
                    android.widget.Scroller scroller3 = this.f197438q;
                    int i27 = this.f197432h;
                    scroller3.startScroll(i27, 0, 0 - i27, 0);
                    requestLayout();
                }
            }
            this.A = false;
            db5.m3 m3Var2 = this.f197428d;
            if (m3Var2 != null) {
                ((fh4.d) m3Var2).f262671a.f172454h.c(2000L, 2000L);
            }
        }
        return onTouchEvent;
    }

    public int getCurrentPosition() {
        return this.f197432h;
    }

    public boolean getIsTouching() {
        return this.A;
    }

    @Override // android.widget.AdapterView
    public android.view.View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.util.Queue queue;
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f197442u == null) {
            return;
        }
        this.f197437p = true;
        if (this.f197436o) {
            int i29 = this.f197432h;
            b();
            removeAllViewsInLayout();
            this.f197433i = i29;
            if (this.f197444w) {
                int max = java.lang.Math.max(0, (getWidth() - getChildViewTotalWidth()) / 2);
                this.f197447z = max;
                this.f197431g = max;
            }
            this.f197436o = false;
        }
        if (this.f197438q.computeScrollOffset()) {
            this.f197433i = this.f197438q.getCurrX();
        }
        if (!this.f197445x) {
            if (this.f197433i < 0) {
                this.f197433i = 0;
                this.f197438q.forceFinished(true);
            }
            int i37 = this.f197433i;
            int i38 = this.f197434m;
            if (i37 > i38) {
                this.f197433i = i38;
                this.f197438q.forceFinished(true);
            }
        } else if (getChildViewTotalWidth() > getWidth()) {
            if (this.f197433i < getWidth() * (-1)) {
                this.f197433i = (getWidth() * (-1)) + 1;
                this.f197438q.forceFinished(true);
            }
            if (this.f197433i > this.f197434m + getWidth()) {
                this.f197433i = (this.f197434m + getWidth()) - 1;
                this.f197438q.forceFinished(true);
            }
        } else {
            if (this.f197433i < (getWidth() * (-1)) + this.f197447z) {
                this.f197433i = (getWidth() * (-1)) + this.f197447z + 1;
                this.f197438q.forceFinished(true);
            }
            if (this.f197433i > getWidth() - this.f197447z) {
                this.f197433i = (getWidth() - this.f197447z) - 1;
                this.f197438q.forceFinished(true);
            }
        }
        int i39 = this.f197432h - this.f197433i;
        android.view.View childAt = getChildAt(0);
        while (true) {
            queue = this.f197435n;
            if (childAt == null || childAt.getRight() + i39 > 0) {
                break;
            }
            this.f197431g += childAt.getMeasuredWidth();
            ((java.util.LinkedList) queue).offer(childAt);
            removeViewInLayout(childAt);
            this.f197429e++;
            childAt = getChildAt(0);
            this.f197437p = true;
        }
        android.view.View childAt2 = getChildAt(getChildCount() - 1);
        while (childAt2 != null && childAt2.getLeft() + i39 >= getWidth()) {
            ((java.util.LinkedList) queue).offer(childAt2);
            removeViewInLayout(childAt2);
            this.f197430f--;
            childAt2 = getChildAt(getChildCount() - 1);
            this.f197437p = true;
        }
        android.view.View childAt3 = getChildAt(getChildCount() - 1);
        int right = childAt3 != null ? childAt3.getRight() : 0;
        while (right + i39 < getWidth() && this.f197430f < this.f197442u.getCount()) {
            android.view.View view = this.f197442u.getView(this.f197430f, (android.view.View) ((java.util.LinkedList) queue).poll(), this);
            a(view, -1);
            right += view.getMeasuredWidth();
            if (this.f197430f == this.f197442u.getCount() - 1) {
                this.f197434m = (this.f197432h + right) - getWidth();
            }
            this.f197430f++;
        }
        android.view.View childAt4 = getChildAt(0);
        int left = childAt4 != null ? childAt4.getLeft() : 0;
        while (left + i39 > 0 && (i28 = this.f197429e) >= 0) {
            android.view.View view2 = this.f197442u.getView(i28, (android.view.View) ((java.util.LinkedList) queue).poll(), this);
            a(view2, 0);
            left -= view2.getMeasuredWidth();
            this.f197429e--;
            this.f197431g -= view2.getMeasuredWidth();
        }
        if (getChildCount() > 0 && this.f197437p) {
            int i47 = this.f197431g + i39;
            this.f197431g = i47;
            int i48 = 0;
            while (i48 < getChildCount()) {
                android.view.View childAt5 = getChildAt(i48);
                int measuredWidth = childAt5.getMeasuredWidth() + i47;
                childAt5.layout(i47, 0, measuredWidth, childAt5.getMeasuredHeight());
                i48++;
                i47 = measuredWidth;
            }
        }
        this.f197432h = this.f197433i;
        if (!this.f197438q.isFinished()) {
            post(this.f197443v);
            return;
        }
        db5.m3 m3Var = this.f197428d;
        if (m3Var == null || !this.B) {
            return;
        }
        fh4.d dVar = (fh4.d) m3Var;
        dVar.f262671a.f172453g.post(new fh4.c(dVar));
        this.B = false;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View childAt;
        android.widget.ListAdapter listAdapter = this.f197442u;
        if (listAdapter == null || listAdapter.getCount() <= 0 || (childAt = getChildAt(0)) == null) {
            super.onMeasure(i17, i18);
        } else {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public void setCenterInParent(boolean z17) {
        this.f197444w = z17;
    }

    public void setHorListLitener(db5.m3 m3Var) {
        this.f197428d = m3Var;
    }

    public void setItemWidth(int i17) {
        this.f197446y = i17;
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f197441t = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f197440s = onItemSelectedListener;
    }

    public void setOverScrollEnabled(boolean z17) {
        this.f197445x = z17;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i17) {
    }

    @Override // android.widget.AdapterView
    public android.widget.ListAdapter getAdapter() {
        return this.f197442u;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        if (this.f197442u == null) {
            listAdapter.registerDataSetObserver(this.C);
        }
        this.f197442u = listAdapter;
        b();
        removeAllViewsInLayout();
        requestLayout();
    }

    public MMHorList(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197434m = com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        this.f197435n = new java.util.LinkedList();
        this.f197436o = false;
        this.f197437p = false;
        this.f197443v = new db5.j3(this);
        this.f197444w = false;
        this.f197445x = false;
        this.f197446y = 0;
        this.f197447z = 0;
        this.A = false;
        this.B = false;
        this.C = new db5.k3(this);
        this.D = new db5.l3(this);
        b();
    }
}
