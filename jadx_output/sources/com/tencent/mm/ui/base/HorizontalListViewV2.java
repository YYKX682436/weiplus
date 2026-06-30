package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class HorizontalListViewV2 extends android.widget.AdapterView<android.widget.ListAdapter> {
    public static final /* synthetic */ int H = 0;
    public final androidx.core.widget.i A;
    public int B;
    public boolean C;
    public boolean D;
    public android.view.View.OnClickListener E;
    public final android.database.DataSetObserver F;
    public final java.lang.Runnable G;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.Scroller f197276d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.GestureDetector f197277e;

    /* renamed from: f, reason: collision with root package name */
    public int f197278f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListAdapter f197279g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f197280h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f197281i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f197282m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f197283n;

    /* renamed from: o, reason: collision with root package name */
    public int f197284o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f197285p;

    /* renamed from: q, reason: collision with root package name */
    public int f197286q;

    /* renamed from: r, reason: collision with root package name */
    public int f197287r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f197288s;

    /* renamed from: t, reason: collision with root package name */
    public int f197289t;

    /* renamed from: u, reason: collision with root package name */
    public int f197290u;

    /* renamed from: v, reason: collision with root package name */
    public int f197291v;

    /* renamed from: w, reason: collision with root package name */
    public int f197292w;

    /* renamed from: x, reason: collision with root package name */
    public db5.c0 f197293x;

    /* renamed from: y, reason: collision with root package name */
    public db5.b0 f197294y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.core.widget.i f197295z;

    public HorizontalListViewV2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.widget.Scroller scroller = new android.widget.Scroller(getContext());
        this.f197276d = scroller;
        db5.a0 a0Var = new db5.a0(this, null);
        this.f197280h = new java.util.ArrayList();
        this.f197281i = false;
        this.f197282m = new android.graphics.Rect();
        this.f197283n = null;
        this.f197284o = 0;
        this.f197285p = null;
        this.f197288s = null;
        this.f197289t = Integer.MAX_VALUE;
        this.f197293x = null;
        this.f197294y = db5.b0.SCROLL_STATE_IDLE;
        this.C = false;
        this.D = false;
        this.F = new db5.y(this);
        this.G = new db5.z(this);
        this.f197295z = new androidx.core.widget.i(context);
        this.A = new androidx.core.widget.i(context);
        this.f197277e = new android.view.GestureDetector(context, a0Var);
        setOnTouchListener(new db5.x(this));
        f();
        setWillNotDraw(false);
        scroller.setFriction(0.009f);
    }

    public static void b(com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2, int i17) {
        androidx.core.widget.i iVar;
        androidx.core.widget.i iVar2 = horizontalListViewV2.f197295z;
        if (iVar2 == null || (iVar = horizontalListViewV2.A) == null) {
            return;
        }
        int i18 = horizontalListViewV2.f197286q + i17;
        android.widget.Scroller scroller = horizontalListViewV2.f197276d;
        if (scroller == null || scroller.isFinished()) {
            if (i18 < 0) {
                iVar2.c(java.lang.Math.abs(i17) / horizontalListViewV2.getRenderWidth());
                if (iVar.b()) {
                    return;
                }
                iVar.e();
                return;
            }
            if (i18 > horizontalListViewV2.f197289t) {
                iVar.c(java.lang.Math.abs(i17) / horizontalListViewV2.getRenderWidth());
                if (iVar2.b()) {
                    return;
                }
                iVar2.e();
            }
        }
    }

    private android.view.View getLeftmostChild() {
        return getChildAt(0);
    }

    private int getRenderHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getRenderWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private android.view.View getRightmostChild() {
        return getChildAt(getChildCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentScrollState(db5.b0 b0Var) {
        db5.c0 c0Var;
        if (this.f197294y != b0Var && (c0Var = this.f197293x) != null) {
            ub3.q qVar = (ub3.q) c0Var;
            if (b0Var == db5.b0.SCROLL_STATE_IDLE) {
                com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = qVar.f426131a;
                if (((java.util.ArrayList) luckyMoneyF2FQRCodeUI.f145083t).size() >= 5 && ((java.util.ArrayList) luckyMoneyF2FQRCodeUI.f145083t).size() < luckyMoneyF2FQRCodeUI.K && luckyMoneyF2FQRCodeUI.f145082s.getLastVisiblePosition() == ((java.util.ArrayList) luckyMoneyF2FQRCodeUI.f145083t).size() - 1 && !com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyF2FQRCodeUI.F)) {
                    luckyMoneyF2FQRCodeUI.doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.v5(luckyMoneyF2FQRCodeUI.F, 5, ((java.util.ArrayList) luckyMoneyF2FQRCodeUI.f145083t).size(), null, "v1.0"));
                }
            } else {
                qVar.getClass();
            }
        }
        this.f197294y = b0Var;
    }

    public final void c(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        }
        addViewInLayout(view, i17, layoutParams, true);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new android.view.ViewGroup.LayoutParams(-2, -1);
        }
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.B, getPaddingTop() + getPaddingBottom(), layoutParams2.height);
        int i18 = layoutParams2.width;
        view.measure(i18 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    public final int d(int i17, int i18) {
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            android.graphics.Rect rect = this.f197282m;
            childAt.getHitRect(rect);
            if (rect.contains(i17, i18)) {
                return i19;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z17) {
    }

    public final android.view.View e(int i17) {
        int itemViewType = this.f197279g.getItemViewType(i17);
        java.util.List list = this.f197280h;
        if (itemViewType < ((java.util.ArrayList) list).size()) {
            return (android.view.View) ((java.util.Queue) ((java.util.ArrayList) list).get(itemViewType)).poll();
        }
        return null;
    }

    public final void f() {
        this.f197290u = -1;
        this.f197291v = -1;
        this.f197278f = 0;
        this.f197286q = 0;
        this.f197287r = 0;
        this.f197289t = Integer.MAX_VALUE;
        setCurrentScrollState(db5.b0.SCROLL_STATE_IDLE);
    }

    public boolean g(android.view.MotionEvent motionEvent) {
        int d17;
        android.widget.Scroller scroller = this.f197276d;
        this.C = !scroller.isFinished();
        scroller.forceFinished(true);
        setCurrentScrollState(db5.b0.SCROLL_STATE_IDLE);
        k();
        if (!this.C && (d17 = d((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            android.view.View childAt = getChildAt(d17);
            this.f197283n = childAt;
            if (childAt != null) {
                childAt.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public int getFirstVisiblePosition() {
        return this.f197290u;
    }

    @Override // android.widget.AdapterView
    public int getLastVisiblePosition() {
        return this.f197291v;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i17 = this.f197286q;
        if (i17 == 0) {
            return 0.0f;
        }
        if (i17 < horizontalFadingEdgeLength) {
            return i17 / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i17 = this.f197286q;
        int i18 = this.f197289t;
        if (i17 == i18) {
            return 0.0f;
        }
        if (i18 - i17 < horizontalFadingEdgeLength) {
            return (i18 - i17) / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.widget.AdapterView
    public android.view.View getSelectedView() {
        int i17 = this.f197292w;
        int i18 = this.f197290u;
        if (i17 < i18 || i17 > this.f197291v) {
            return null;
        }
        return getChildAt(i17 - i18);
    }

    public boolean h(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        this.f197276d.fling(this.f197287r, 0, (int) (-f17), 0, 0, this.f197289t, 0, 0);
        setCurrentScrollState(db5.b0.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    public final void i(java.lang.Boolean bool) {
        if (this.D != bool.booleanValue()) {
            for (android.view.View view = this; view.getParent() instanceof android.view.View; view = (android.view.View) view.getParent()) {
                if ((view.getParent() instanceof android.widget.ListView) || (view.getParent() instanceof android.widget.ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.D = bool.booleanValue();
                    return;
                }
            }
        }
    }

    public void j(int i17) {
        android.widget.Scroller scroller = this.f197276d;
        int i18 = this.f197287r;
        scroller.startScroll(i18, 0, i17 - i18, 0);
        setCurrentScrollState(db5.b0.SCROLL_STATE_FLING);
        requestLayout();
    }

    public final void k() {
        android.view.View view = this.f197283n;
        if (view != null) {
            view.setPressed(false);
            refreshDrawableState();
            this.f197283n = null;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        super.onDraw(canvas);
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        android.graphics.Rect rect = this.f197282m;
        rect.top = paddingTop;
        rect.bottom = paddingTop + getRenderHeight();
        for (0; i17 < childCount; i17 + 1) {
            if (i17 == childCount - 1) {
                i17 = this.f197291v == this.f197279g.getCount() - 1 ? i17 + 1 : 0;
            }
            android.view.View childAt = getChildAt(i17);
            rect.left = childAt.getRight();
            rect.right = childAt.getRight() + this.f197284o;
            if (rect.left < getPaddingLeft()) {
                rect.left = getPaddingLeft();
            }
            if (rect.right > getWidth() - getPaddingRight()) {
                rect.right = getWidth() - getPaddingRight();
            }
            android.graphics.drawable.Drawable drawable = this.f197285p;
            if (drawable != null) {
                drawable.setBounds(rect);
                this.f197285p.draw(canvas);
            }
            if (i17 == 0 && childAt.getLeft() > getPaddingLeft()) {
                rect.left = getPaddingLeft();
                rect.right = childAt.getLeft();
                android.graphics.drawable.Drawable drawable2 = this.f197285p;
                if (drawable2 != null) {
                    drawable2.setBounds(rect);
                    this.f197285p.draw(canvas);
                }
            }
        }
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.util.List list;
        android.view.View rightmostChild;
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f197279g == null) {
            return;
        }
        invalidate();
        boolean z18 = false;
        if (this.f197281i) {
            int i29 = this.f197286q;
            f();
            removeAllViewsInLayout();
            this.f197287r = i29;
            this.f197281i = false;
        }
        java.lang.Integer num = this.f197288s;
        if (num != null) {
            this.f197287r = num.intValue();
            this.f197288s = null;
        }
        android.widget.Scroller scroller = this.f197276d;
        if (scroller.computeScrollOffset()) {
            this.f197287r = scroller.getCurrX();
        }
        int i37 = this.f197287r;
        db5.b0 b0Var = db5.b0.SCROLL_STATE_IDLE;
        if (i37 < 0) {
            this.f197287r = 0;
            androidx.core.widget.i iVar = this.f197295z;
            if (iVar.b()) {
                iVar.f11102a.onAbsorb((int) scroller.getCurrVelocity());
            }
            scroller.forceFinished(true);
            setCurrentScrollState(b0Var);
        } else {
            int i38 = this.f197289t;
            if (i37 > i38) {
                this.f197287r = i38;
                androidx.core.widget.i iVar2 = this.A;
                if (iVar2.b()) {
                    iVar2.f11102a.onAbsorb((int) scroller.getCurrVelocity());
                }
                scroller.forceFinished(true);
                setCurrentScrollState(b0Var);
            }
        }
        int i39 = this.f197286q - this.f197287r;
        android.view.View leftmostChild = getLeftmostChild();
        while (true) {
            list = this.f197280h;
            if (leftmostChild == null || leftmostChild.getRight() + i39 > 0) {
                break;
            }
            this.f197278f += this.f197290u == this.f197279g.getCount() - 1 ? leftmostChild.getMeasuredWidth() : this.f197284o + leftmostChild.getMeasuredWidth();
            int itemViewType = this.f197279g.getItemViewType(this.f197290u);
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (itemViewType < arrayList.size()) {
                ((java.util.Queue) arrayList.get(itemViewType)).offer(leftmostChild);
            }
            removeViewInLayout(leftmostChild);
            this.f197290u++;
            leftmostChild = getLeftmostChild();
        }
        android.view.View rightmostChild2 = getRightmostChild();
        while (rightmostChild2 != null && rightmostChild2.getLeft() + i39 >= getWidth()) {
            int itemViewType2 = this.f197279g.getItemViewType(this.f197291v);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            if (itemViewType2 < arrayList2.size()) {
                ((java.util.Queue) arrayList2.get(itemViewType2)).offer(rightmostChild2);
            }
            removeViewInLayout(rightmostChild2);
            this.f197291v--;
            rightmostChild2 = getRightmostChild();
        }
        android.view.View rightmostChild3 = getRightmostChild();
        int right = rightmostChild3 != null ? rightmostChild3.getRight() : 0;
        while (right + i39 + this.f197284o < getWidth() && this.f197291v + 1 < this.f197279g.getCount()) {
            int i47 = this.f197291v + 1;
            this.f197291v = i47;
            if (this.f197290u < 0) {
                this.f197290u = i47;
            }
            android.view.View view = this.f197279g.getView(i47, e(i47), this);
            c(view, -1);
            right += (this.f197291v == 0 ? 0 : this.f197284o) + view.getMeasuredWidth();
        }
        android.view.View leftmostChild2 = getLeftmostChild();
        int left = leftmostChild2 != null ? leftmostChild2.getLeft() : 0;
        while ((left + i39) - this.f197284o > 0 && (i28 = this.f197290u) >= 1) {
            int i48 = i28 - 1;
            this.f197290u = i48;
            android.view.View view2 = this.f197279g.getView(i48, e(i48), this);
            c(view2, 0);
            left -= this.f197290u == 0 ? view2.getMeasuredWidth() : this.f197284o + view2.getMeasuredWidth();
            this.f197278f -= left + i39 == 0 ? view2.getMeasuredWidth() : view2.getMeasuredWidth() + this.f197284o;
        }
        int childCount = getChildCount();
        if (childCount > 0) {
            int i49 = this.f197278f + i39;
            this.f197278f = i49;
            for (int i57 = 0; i57 < childCount; i57++) {
                android.view.View childAt = getChildAt(i57);
                int paddingLeft = getPaddingLeft() + i49;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                i49 += childAt.getMeasuredWidth() + this.f197284o;
            }
        }
        this.f197286q = this.f197287r;
        if ((this.f197291v == this.f197279g.getCount() - 1) && (rightmostChild = getRightmostChild()) != null) {
            int i58 = this.f197289t;
            int right2 = (this.f197286q + (rightmostChild.getRight() - getPaddingLeft())) - getRenderWidth();
            this.f197289t = right2;
            if (right2 < 0) {
                this.f197289t = 0;
            }
            if (this.f197289t != i58) {
                z18 = true;
            }
        }
        if (z18) {
            onLayout(z17, i17, i18, i19, i27);
            return;
        }
        if (scroller.isFinished()) {
            if (this.f197294y == db5.b0.SCROLL_STATE_FLING) {
                setCurrentScrollState(b0Var);
            }
        } else {
            java.lang.Runnable runnable = this.G;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(this, runnable);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.B = i18;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            this.f197288s = java.lang.Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f197286q);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        androidx.core.widget.i iVar = this.A;
        androidx.core.widget.i iVar2 = this.f197295z;
        if (action == 1) {
            android.widget.Scroller scroller = this.f197276d;
            if (scroller == null || scroller.isFinished()) {
                setCurrentScrollState(db5.b0.SCROLL_STATE_IDLE);
            }
            i(java.lang.Boolean.FALSE);
            if (iVar2 != null) {
                iVar2.e();
            }
            if (iVar != null) {
                iVar.e();
            }
        } else if (motionEvent.getAction() == 3) {
            k();
            if (iVar2 != null) {
                iVar2.e();
            }
            if (iVar != null) {
                iVar.e();
            }
            i(java.lang.Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDivider(android.graphics.drawable.Drawable drawable) {
        this.f197285p = drawable;
        if (drawable != null) {
            setDividerWidth(drawable.getIntrinsicWidth());
        } else {
            setDividerWidth(0);
        }
    }

    public void setDividerWidth(int i17) {
        this.f197284o = i17;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.AdapterView, android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.E = onClickListener;
    }

    public void setOnScrollStateChangedListener(db5.c0 c0Var) {
        this.f197293x = c0Var;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i17) {
        this.f197292w = i17;
    }

    @Override // android.widget.AdapterView
    public android.widget.ListAdapter getAdapter() {
        return this.f197279g;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        android.widget.ListAdapter listAdapter2 = this.f197279g;
        android.database.DataSetObserver dataSetObserver = this.F;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        if (listAdapter != null) {
            this.f197279g = listAdapter;
            listAdapter.registerDataSetObserver(dataSetObserver);
        }
        android.widget.ListAdapter listAdapter3 = this.f197279g;
        if (listAdapter3 != null) {
            int viewTypeCount = listAdapter3.getViewTypeCount();
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f197280h;
            arrayList.clear();
            for (int i17 = 0; i17 < viewTypeCount; i17++) {
                arrayList.add(new java.util.LinkedList());
            }
        }
        f();
        removeAllViewsInLayout();
        requestLayout();
    }
}
