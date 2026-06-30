package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class HorizontalListView extends android.widget.AdapterView<android.widget.ListAdapter> {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f197260v = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListAdapter f197261d;

    /* renamed from: e, reason: collision with root package name */
    public int f197262e;

    /* renamed from: f, reason: collision with root package name */
    public int f197263f;

    /* renamed from: g, reason: collision with root package name */
    public int f197264g;

    /* renamed from: h, reason: collision with root package name */
    public int f197265h;

    /* renamed from: i, reason: collision with root package name */
    public int f197266i;

    /* renamed from: m, reason: collision with root package name */
    public int f197267m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Scroller f197268n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.GestureDetector f197269o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Queue f197270p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f197271q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f197272r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f197273s;

    /* renamed from: t, reason: collision with root package name */
    public final android.database.DataSetObserver f197274t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.GestureDetector.OnGestureListener f197275u;

    public HorizontalListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197262e = -1;
        this.f197263f = 0;
        this.f197266i = Integer.MAX_VALUE;
        this.f197267m = 0;
        this.f197270p = new java.util.LinkedList();
        this.f197273s = false;
        this.f197274t = new db5.t(this);
        this.f197275u = new db5.v(this);
        c();
    }

    public final void a(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i17, layoutParams, true);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    }

    public final void b(int i17) {
        java.util.Queue queue;
        int i18;
        android.view.View childAt = getChildAt(getChildCount() - 1);
        int right = childAt != null ? childAt.getRight() : 0;
        while (true) {
            int i19 = right + i17;
            int width = getWidth();
            queue = this.f197270p;
            if (i19 >= width || this.f197263f >= this.f197261d.getCount()) {
                break;
            }
            android.view.View view = this.f197261d.getView(this.f197263f, (android.view.View) ((java.util.LinkedList) queue).poll(), this);
            a(view, -1);
            right += view.getMeasuredWidth();
            if (this.f197263f == this.f197261d.getCount() - 1) {
                this.f197266i = (this.f197264g + right) - getWidth();
            }
            if (this.f197266i < 0) {
                this.f197266i = 0;
            }
            this.f197263f++;
        }
        android.view.View childAt2 = getChildAt(0);
        int left = childAt2 != null ? childAt2.getLeft() : 0;
        while (left + i17 > 0 && (i18 = this.f197262e) >= 0) {
            android.view.View view2 = this.f197261d.getView(i18, (android.view.View) ((java.util.LinkedList) queue).poll(), this);
            a(view2, 0);
            left -= view2.getMeasuredWidth();
            this.f197262e--;
            this.f197267m -= view2.getMeasuredWidth();
        }
    }

    public final synchronized void c() {
        this.f197262e = -1;
        this.f197263f = 0;
        this.f197267m = 0;
        this.f197264g = 0;
        this.f197265h = 0;
        this.f197266i = Integer.MAX_VALUE;
        this.f197268n = new android.widget.Scroller(getContext());
        this.f197269o = new android.view.GestureDetector(getContext(), this.f197275u);
    }

    public final void d(int i17) {
        java.util.Queue queue;
        android.view.View childAt = getChildAt(0);
        while (true) {
            queue = this.f197270p;
            if (childAt == null || childAt.getRight() + i17 > 0) {
                break;
            }
            this.f197267m += childAt.getMeasuredWidth();
            ((java.util.LinkedList) queue).offer(childAt);
            removeViewInLayout(childAt);
            this.f197262e++;
            childAt = getChildAt(0);
        }
        android.view.View childAt2 = getChildAt(getChildCount() - 1);
        while (childAt2 != null && childAt2.getLeft() + i17 >= getWidth()) {
            ((java.util.LinkedList) queue).offer(childAt2);
            removeViewInLayout(childAt2);
            this.f197263f--;
            childAt2 = getChildAt(getChildCount() - 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        android.view.GestureDetector gestureDetector = this.f197269o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/base/HorizontalListView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/ui/base/HorizontalListView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent | dispatchTouchEvent;
    }

    @Override // android.widget.AdapterView
    public android.view.View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public synchronized void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f197261d == null) {
            return;
        }
        if (this.f197273s) {
            int i28 = this.f197264g;
            c();
            removeAllViewsInLayout();
            this.f197265h = i28;
            this.f197273s = false;
        }
        if (this.f197268n.computeScrollOffset()) {
            this.f197265h = this.f197268n.getCurrX();
        }
        if (this.f197265h <= 0) {
            this.f197265h = 0;
            this.f197268n.forceFinished(true);
        }
        int i29 = this.f197265h;
        int i37 = this.f197266i;
        if (i29 >= i37) {
            this.f197265h = i37;
            this.f197268n.forceFinished(true);
        }
        int i38 = this.f197264g - this.f197265h;
        d(i38);
        b(i38);
        if (getChildCount() > 0) {
            int i39 = this.f197267m + i38;
            this.f197267m = i39;
            int i47 = 0;
            while (i47 < getChildCount()) {
                android.view.View childAt = getChildAt(i47);
                int measuredWidth = childAt.getMeasuredWidth() + i39;
                childAt.layout(i39, 0, measuredWidth, childAt.getMeasuredHeight());
                i47++;
                i39 = measuredWidth;
            }
        }
        this.f197264g = this.f197265h;
        if (!this.f197268n.isFinished()) {
            post(new db5.u(this));
        }
    }

    public void setDispatchTouchListener(db5.w wVar) {
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f197272r = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f197271q = onItemSelectedListener;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i17) {
    }

    @Override // android.widget.AdapterView
    public android.widget.ListAdapter getAdapter() {
        return this.f197261d;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        android.widget.ListAdapter listAdapter2 = this.f197261d;
        android.database.DataSetObserver dataSetObserver = this.f197274t;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f197261d = listAdapter;
        listAdapter.registerDataSetObserver(dataSetObserver);
        synchronized (this) {
            c();
            removeAllViewsInLayout();
            requestLayout();
        }
    }
}
