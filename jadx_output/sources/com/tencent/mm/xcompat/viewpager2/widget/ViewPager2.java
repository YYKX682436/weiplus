package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public final class ViewPager2 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f214732d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f214733e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.xcompat.viewpager2.widget.c f214734f;

    /* renamed from: g, reason: collision with root package name */
    public int f214735g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f214736h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.w0 f214737i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.e0 f214738m;

    /* renamed from: n, reason: collision with root package name */
    public int f214739n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Parcelable f214740o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214741p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.m0 f214742q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.xcompat.viewpager2.widget.g f214743r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.xcompat.viewpager2.widget.c f214744s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.xcompat.viewpager2.widget.d f214745t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.xcompat.viewpager2.widget.e f214746u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.b1 f214747v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f214748w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f214749x;

    /* renamed from: y, reason: collision with root package name */
    public int f214750y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.xcompat.viewpager2.widget.l f214751z;

    /* loaded from: classes15.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState> CREATOR = new com.tencent.mm.xcompat.viewpager2.widget.w();

        /* renamed from: d, reason: collision with root package name */
        public int f214752d;

        /* renamed from: e, reason: collision with root package name */
        public int f214753e;

        /* renamed from: f, reason: collision with root package name */
        public android.os.Parcelable f214754f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f214752d = parcel.readInt();
            this.f214753e = parcel.readInt();
            this.f214754f = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f214752d);
            parcel.writeInt(this.f214753e);
            parcel.writeParcelable(this.f214754f, i17);
        }
    }

    public ViewPager2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f214732d = new android.graphics.Rect();
        this.f214733e = new android.graphics.Rect();
        this.f214734f = new com.tencent.mm.xcompat.viewpager2.widget.c(3);
        this.f214736h = false;
        this.f214737i = new com.tencent.mm.xcompat.viewpager2.widget.h(this);
        this.f214739n = -1;
        this.f214747v = null;
        this.f214748w = false;
        this.f214749x = true;
        this.f214750y = -1;
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.f214751z = new com.tencent.mm.xcompat.viewpager2.widget.s(this);
        com.tencent.mm.xcompat.viewpager2.widget.v vVar = new com.tencent.mm.xcompat.viewpager2.widget.v(this, context);
        this.f214741p = vVar;
        vVar.setId(android.view.View.generateViewId());
        this.f214741p.setDescendantFocusability(131072);
        com.tencent.mm.xcompat.viewpager2.widget.n nVar = new com.tencent.mm.xcompat.viewpager2.widget.n(this, context);
        this.f214738m = nVar;
        this.f214741p.setLayoutManager(nVar);
        this.f214741p.setScrollingTouchSlop(1);
        int[] iArr = sq5.a.f411387b;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            n3.f1.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f214741p.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214741p;
            com.tencent.mm.xcompat.viewpager2.widget.k kVar = new com.tencent.mm.xcompat.viewpager2.widget.k(this);
            if (recyclerView.H == null) {
                recyclerView.H = new java.util.ArrayList();
            }
            ((java.util.ArrayList) recyclerView.H).add(kVar);
            com.tencent.mm.xcompat.viewpager2.widget.g gVar = new com.tencent.mm.xcompat.viewpager2.widget.g(this);
            this.f214743r = gVar;
            this.f214745t = new com.tencent.mm.xcompat.viewpager2.widget.d(this, gVar, this.f214741p);
            com.tencent.mm.xcompat.viewpager2.widget.u uVar = new com.tencent.mm.xcompat.viewpager2.widget.u(this);
            this.f214742q = uVar;
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2 = this.f214741p;
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView3 = uVar.f214491a;
            if (recyclerView3 != recyclerView2) {
                com.tencent.mm.xcompat.recyclerview.widget.k1 k1Var = uVar.f214492b;
                if (recyclerView3 != null) {
                    java.util.List list = recyclerView3.H1;
                    if (list != null) {
                        ((java.util.ArrayList) list).remove(k1Var);
                    }
                    uVar.f214491a.setOnFlingListener(null);
                }
                uVar.f214491a = recyclerView2;
                if (recyclerView2 != null) {
                    if (recyclerView2.getOnFlingListener() != null) {
                        throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
                    }
                    uVar.f214491a.h(k1Var);
                    uVar.f214491a.setOnFlingListener(uVar);
                    new android.widget.Scroller(uVar.f214491a.getContext(), new android.view.animation.DecelerateInterpolator());
                    uVar.c();
                }
            }
            this.f214741p.h(this.f214743r);
            com.tencent.mm.xcompat.viewpager2.widget.c cVar = new com.tencent.mm.xcompat.viewpager2.widget.c(3);
            this.f214744s = cVar;
            this.f214743r.f214761a = cVar;
            com.tencent.mm.xcompat.viewpager2.widget.i iVar = new com.tencent.mm.xcompat.viewpager2.widget.i(this);
            com.tencent.mm.xcompat.viewpager2.widget.j jVar = new com.tencent.mm.xcompat.viewpager2.widget.j(this);
            ((java.util.ArrayList) cVar.f214756a).add(iVar);
            ((java.util.ArrayList) this.f214744s.f214756a).add(jVar);
            this.f214751z.a(this.f214744s, this.f214741p);
            ((java.util.ArrayList) this.f214744s.f214756a).add(this.f214734f);
            com.tencent.mm.xcompat.viewpager2.widget.e eVar = new com.tencent.mm.xcompat.viewpager2.widget.e(this.f214738m);
            this.f214746u = eVar;
            ((java.util.ArrayList) this.f214744s.f214756a).add(eVar);
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView4 = this.f214741p;
            attachViewToParent(recyclerView4, 0, recyclerView4.getLayoutParams());
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    public final void b() {
        com.tencent.mm.xcompat.recyclerview.widget.u0 adapter;
        if (this.f214739n == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f214740o != null) {
            this.f214740o = null;
        }
        int max = java.lang.Math.max(0, java.lang.Math.min(this.f214739n, adapter.a() - 1));
        this.f214735g = max;
        this.f214739n = -1;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214741p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "restorePendingState", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.b0(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "restorePendingState", "()V", "Undefined", "scrollToPosition", "(I)V");
        ((com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z).c();
    }

    public void c(int i17, boolean z17) {
        if (this.f214745t.f214757a.f214773m) {
            throw new java.lang.IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        d(i17, z17);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return this.f214741p.canScrollHorizontally(i17);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i17) {
        return this.f214741p.canScrollVertically(i17);
    }

    public void d(int i17, boolean z17) {
        com.tencent.mm.xcompat.viewpager2.widget.o oVar;
        com.tencent.mm.xcompat.recyclerview.widget.u0 adapter = getAdapter();
        if (adapter == null) {
            if (this.f214739n != -1) {
                this.f214739n = java.lang.Math.max(i17, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int min = java.lang.Math.min(java.lang.Math.max(i17, 0), adapter.a() - 1);
        int i18 = this.f214735g;
        if (min == i18) {
            if (this.f214743r.f214766f == 0) {
                return;
            }
        }
        if (min == i18 && z17) {
            return;
        }
        double d17 = i18;
        this.f214735g = min;
        ((com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z).c();
        com.tencent.mm.xcompat.viewpager2.widget.g gVar = this.f214743r;
        if (!(gVar.f214766f == 0)) {
            gVar.e();
            com.tencent.mm.xcompat.viewpager2.widget.f fVar = gVar.f214767g;
            d17 = fVar.f214758a + fVar.f214759b;
        }
        com.tencent.mm.xcompat.viewpager2.widget.g gVar2 = this.f214743r;
        gVar2.getClass();
        gVar2.f214765e = z17 ? 2 : 3;
        gVar2.f214773m = false;
        boolean z18 = gVar2.f214769i != min;
        gVar2.f214769i = min;
        gVar2.c(2);
        if (z18 && (oVar = gVar2.f214761a) != null) {
            oVar.c(min);
        }
        if (!z17) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214741p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(min));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.b0(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
            return;
        }
        double d18 = min;
        if (java.lang.Math.abs(d18 - d17) <= 3.0d) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2 = this.f214741p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(min));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView2, arrayList2.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView2.e0(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView3 = this.f214741p;
        int i19 = d18 > d17 ? min - 3 : min + 3;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(recyclerView3, arrayList3.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView3.b0(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(recyclerView3, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView4 = this.f214741p;
        recyclerView4.post(new com.tencent.mm.xcompat.viewpager2.widget.x(min, recyclerView4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        android.os.Parcelable parcelable = (android.os.Parcelable) sparseArray.get(getId());
        if (parcelable instanceof com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState) {
            int i17 = ((com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState) parcelable).f214752d;
            sparseArray.put(this.f214741p.getId(), (android.os.Parcelable) sparseArray.get(i17));
            sparseArray.remove(i17);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public void e() {
        com.tencent.mm.xcompat.recyclerview.widget.m0 m0Var = this.f214742q;
        if (m0Var == null) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        android.view.View b17 = m0Var.b(this.f214738m);
        if (b17 == null) {
            return;
        }
        int o17 = this.f214738m.o(b17);
        if (o17 != this.f214735g && getScrollState() == 0) {
            this.f214744s.c(o17);
        }
        this.f214736h = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        com.tencent.mm.xcompat.viewpager2.widget.l lVar = this.f214751z;
        lVar.getClass();
        if (!(lVar instanceof com.tencent.mm.xcompat.viewpager2.widget.s)) {
            return super.getAccessibilityClassName();
        }
        this.f214751z.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public com.tencent.mm.xcompat.recyclerview.widget.u0 getAdapter() {
        return this.f214741p.getAdapter();
    }

    public int getCurrentItem() {
        return this.f214735g;
    }

    public int getItemDecorationCount() {
        return this.f214741p.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f214750y;
    }

    public int getOrientation() {
        return this.f214738m.f214493n == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214741p;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f214743r.f214766f;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        int i17;
        int i18;
        int a17;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = ((com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z).f214783d;
        if (viewPager2.getAdapter() == null) {
            i17 = 0;
            i18 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i17 = viewPager2.getAdapter().a();
            i18 = 1;
        } else {
            i18 = viewPager2.getAdapter().a();
            i17 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i17, i18, false, 0));
        com.tencent.mm.xcompat.recyclerview.widget.u0 adapter = viewPager2.getAdapter();
        if (adapter == null || (a17 = adapter.a()) == 0 || !viewPager2.f214749x) {
            return;
        }
        if (viewPager2.f214735g > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f214735g < a17 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int measuredWidth = this.f214741p.getMeasuredWidth();
        int measuredHeight = this.f214741p.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        android.graphics.Rect rect = this.f214732d;
        rect.left = paddingLeft;
        rect.right = (i19 - i17) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i27 - i18) - getPaddingBottom();
        android.graphics.Rect rect2 = this.f214733e;
        android.view.Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f214741p.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f214736h) {
            e();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        measureChild(this.f214741p, i17, i18);
        int measuredWidth = this.f214741p.getMeasuredWidth();
        int measuredHeight = this.f214741p.getMeasuredHeight();
        int measuredState = this.f214741p.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(paddingLeft, getSuggestedMinimumWidth()), i17, measuredState), android.view.View.resolveSizeAndState(java.lang.Math.max(paddingTop, getSuggestedMinimumHeight()), i18, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState savedState = (com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f214739n = savedState.f214753e;
        this.f214740o = savedState.f214754f;
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState savedState = new com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState(super.onSaveInstanceState());
        savedState.f214752d = this.f214741p.getId();
        int i17 = this.f214739n;
        if (i17 == -1) {
            i17 = this.f214735g;
        }
        savedState.f214753e = i17;
        android.os.Parcelable parcelable = this.f214740o;
        if (parcelable != null) {
            savedState.f214754f = parcelable;
        } else {
            this.f214741p.getAdapter();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        throw new java.lang.IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
        ((com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z).getClass();
        if (!(i17 == 8192 || i17 == 4096)) {
            return super.performAccessibilityAction(i17, bundle);
        }
        com.tencent.mm.xcompat.viewpager2.widget.s sVar = (com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z;
        sVar.getClass();
        if (!(i17 == 8192 || i17 == 4096)) {
            throw new java.lang.IllegalStateException();
        }
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = sVar.f214783d;
        int currentItem = i17 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f214749x) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var) {
        com.tencent.mm.xcompat.recyclerview.widget.u0 adapter = this.f214741p.getAdapter();
        com.tencent.mm.xcompat.viewpager2.widget.s sVar = (com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z;
        if (adapter != null) {
            adapter.f214644a.unregisterObserver(sVar.f214782c);
        } else {
            sVar.getClass();
        }
        com.tencent.mm.xcompat.recyclerview.widget.w0 w0Var = this.f214737i;
        if (adapter != null) {
            adapter.f214644a.unregisterObserver(w0Var);
        }
        this.f214741p.setAdapter(u0Var);
        this.f214735g = 0;
        b();
        com.tencent.mm.xcompat.viewpager2.widget.s sVar2 = (com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z;
        sVar2.c();
        if (u0Var != null) {
            u0Var.f214644a.registerObserver(sVar2.f214782c);
        }
        if (u0Var != null) {
            u0Var.f214644a.registerObserver(w0Var);
        }
    }

    public void setCurrentItem(int i17) {
        c(i17, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i17) {
        super.setLayoutDirection(i17);
        ((com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z).c();
    }

    public void setOffscreenPageLimit(int i17) {
        if (i17 < 1 && i17 != -1) {
            throw new java.lang.IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f214750y = i17;
        this.f214741p.requestLayout();
    }

    public void setOrientation(int i17) {
        this.f214738m.Y(i17);
        ((com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z).c();
    }

    public void setPageTransformer(com.tencent.mm.xcompat.viewpager2.widget.t tVar) {
        if (tVar != null) {
            if (!this.f214748w) {
                this.f214747v = this.f214741p.getItemAnimator();
                this.f214748w = true;
            }
            this.f214741p.setItemAnimator(null);
        } else if (this.f214748w) {
            this.f214741p.setItemAnimator(this.f214747v);
            this.f214747v = null;
            this.f214748w = false;
        }
        this.f214746u.getClass();
        if (tVar == null) {
            return;
        }
        this.f214746u.getClass();
        this.f214746u.getClass();
    }

    public void setUserInputEnabled(boolean z17) {
        this.f214749x = z17;
        ((com.tencent.mm.xcompat.viewpager2.widget.s) this.f214751z).c();
    }

    public ViewPager2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f214732d = new android.graphics.Rect();
        this.f214733e = new android.graphics.Rect();
        this.f214734f = new com.tencent.mm.xcompat.viewpager2.widget.c(3);
        this.f214736h = false;
        this.f214737i = new com.tencent.mm.xcompat.viewpager2.widget.h(this);
        this.f214739n = -1;
        this.f214747v = null;
        this.f214748w = false;
        this.f214749x = true;
        this.f214750y = -1;
        a(context, attributeSet);
    }
}
