package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public class GridHeadersGridView extends android.widget.GridView implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.AdapterView.OnItemLongClickListener {
    public static final /* synthetic */ int L = 0;
    public com.tencent.mm.ui.gridviewheaders.o A;
    public android.widget.AbsListView.OnScrollListener B;
    public int C;
    public android.view.View D;
    public java.lang.Runnable E;
    public final int F;
    public int G;
    public com.tencent.mm.ui.gridviewheaders.h H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f208705J;
    public boolean K;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.gridviewheaders.k f208706d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.gridviewheaders.l f208707e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f208708f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f208709g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f208710h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f208711i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f208712m;

    /* renamed from: n, reason: collision with root package name */
    public int f208713n;

    /* renamed from: o, reason: collision with root package name */
    public long f208714o;

    /* renamed from: p, reason: collision with root package name */
    public final android.database.DataSetObserver f208715p;

    /* renamed from: q, reason: collision with root package name */
    public int f208716q;

    /* renamed from: r, reason: collision with root package name */
    public int f208717r;

    /* renamed from: s, reason: collision with root package name */
    public float f208718s;

    /* renamed from: t, reason: collision with root package name */
    public int f208719t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f208720u;

    /* renamed from: v, reason: collision with root package name */
    public int f208721v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.gridviewheaders.m f208722w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f208723x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.AdapterView.OnItemLongClickListener f208724y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f208725z;

    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.SavedState> CREATOR = new com.tencent.mm.ui.gridviewheaders.p();

        /* renamed from: d, reason: collision with root package name */
        public boolean f208726d;

        public SavedState(android.os.Parcel parcel, com.tencent.mm.ui.gridviewheaders.i iVar) {
            super(parcel);
            this.f208726d = parcel.readByte() != 0;
        }

        public java.lang.String toString() {
            return "StickyGridHeadersGridView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " areHeadersSticky=" + this.f208726d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeByte(this.f208726d ? (byte) 1 : (byte) 0);
        }
    }

    public GridHeadersGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.gridViewStyle);
    }

    private int getHeaderHeight() {
        android.view.View view = this.D;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    public android.view.View d(int i17) {
        if (i17 == -2) {
            return this.D;
        }
        try {
            return (android.view.View) getChildAt(i17).getTag();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        android.view.View view = this.D;
        int i17 = 0;
        boolean z17 = view != null && this.f208709g && view.getVisibility() == 0;
        int headerHeight = getHeaderHeight();
        int i18 = this.f208716q - headerHeight;
        android.graphics.Rect rect = this.f208710h;
        if (z17 && this.K) {
            rect.left = getPaddingLeft();
            rect.right = getWidth() - getPaddingRight();
            rect.top = this.f208716q;
            rect.bottom = getHeight();
            canvas.save();
            canvas.clipRect(rect);
        }
        super.dispatchDraw(canvas);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int firstVisiblePosition = getFirstVisiblePosition();
        int i19 = 0;
        while (firstVisiblePosition <= getLastVisiblePosition()) {
            if (getItemIdAtPosition(firstVisiblePosition) == -1) {
                arrayList.add(java.lang.Integer.valueOf(i19));
            }
            int i27 = this.f208721v;
            firstVisiblePosition += i27;
            i19 += i27;
        }
        int i28 = 0;
        while (i28 < arrayList.size()) {
            com.tencent.mm.ui.gridviewheaders.g gVar = (com.tencent.mm.ui.gridviewheaders.g) getChildAt(((java.lang.Integer) arrayList.get(i28)).intValue());
            try {
                android.view.View view2 = (android.view.View) gVar.getTag();
                boolean z18 = ((long) ((com.tencent.mm.ui.gridviewheaders.e) gVar.getChildAt(i17)).getHeaderId()) == this.f208714o && gVar.getTop() < 0 && this.f208709g;
                if (view2.getVisibility() == 0 && !z18) {
                    view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), (1073741824 - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    view2.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), gVar.getHeight());
                    rect.left = getPaddingLeft();
                    rect.right = getWidth() - getPaddingRight();
                    rect.bottom = gVar.getBottom();
                    rect.top = gVar.getTop();
                    canvas.save();
                    canvas.clipRect(rect);
                    canvas.translate(getPaddingLeft(), gVar.getTop());
                    view2.draw(canvas);
                    canvas.restore();
                }
                i28++;
                i17 = 0;
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        if (z17 && this.K) {
            canvas.restore();
        } else if (!z17) {
            return;
        }
        if (this.D.getWidth() != (getWidth() - getPaddingLeft()) - getPaddingRight()) {
            this.D.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), (1073741824 - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            this.D.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.D.getHeight());
        }
        rect.left = getPaddingLeft();
        rect.right = getWidth() - getPaddingRight();
        rect.bottom = i18 + headerHeight;
        if (this.f208711i) {
            rect.top = getPaddingTop();
        } else {
            rect.top = 0;
        }
        canvas.save();
        canvas.clipRect(rect);
        canvas.translate(getPaddingLeft(), i18);
        canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) ((this.f208716q * 255.0f) / headerHeight), 31);
        this.D.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void f() {
        int i17;
        if (this.D == null) {
            return;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec((getWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824);
        android.view.ViewGroup.LayoutParams layoutParams = this.D.getLayoutParams();
        this.D.measure(makeMeasureSpec, (layoutParams == null || (i17 = layoutParams.height) <= 0) ? android.view.View.MeasureSpec.makeMeasureSpec(0, 0) : android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
        this.D.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.D.getMeasuredHeight());
    }

    public android.view.View getStickiedHeader() {
        return this.D;
    }

    public boolean getStickyHeaderIsTranscluent() {
        return !this.K;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f208723x.onItemClick(adapterView, view, this.H.c(i17).f208734b, j17);
        yj0.a.h(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return this.f208724y.onItemLongClick(adapterView, view, this.H.c(i17).f208734b, j17);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f208725z.onItemSelected(adapterView, view, this.H.c(i17).f208734b, j17);
        yj0.a.h(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27 = this.f208719t;
        if (i27 == -1) {
            if (this.f208713n > 0) {
                int max = java.lang.Math.max((android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight(), 0);
                int i28 = max / this.f208713n;
                i19 = 1;
                if (i28 > 0) {
                    while (i28 != 1) {
                        int i29 = i28 - 1;
                        if ((this.f208713n * i28) + (this.f208717r * i29) <= max) {
                            break;
                        } else {
                            i28 = i29;
                        }
                    }
                    i19 = i28;
                }
            } else {
                i19 = 2;
            }
            this.f208721v = i19;
        } else {
            this.f208721v = i27;
        }
        com.tencent.mm.ui.gridviewheaders.h hVar = this.H;
        if (hVar != null) {
            int i37 = this.f208721v;
            hVar.f208746i = i37;
            android.view.View[] viewArr = new android.view.View[i37];
            hVar.f208747m = viewArr;
            java.util.Arrays.fill(viewArr, (java.lang.Object) null);
        }
        f();
        super.onMeasure(i17, i18);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
        this.f208725z.onNothingSelected(adapterView);
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.SavedState savedState = (com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f208709g = savedState.f208726d;
        requestLayout();
    }

    @Override // android.widget.AbsListView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.SavedState savedState = new com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.SavedState(super.onSaveInstanceState());
        savedState.f208726d = this.f208709g;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    @Override // android.widget.AbsListView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScroll(android.widget.AbsListView r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.B;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i17);
        }
        this.C = i17;
        yj0.a.h(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void setAreHeadersSticky(boolean z17) {
        if (z17 != this.f208709g) {
            this.f208709g = z17;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z17) {
        super.setClipToPadding(z17);
        this.f208711i = z17;
        this.f208712m = true;
    }

    @Override // android.widget.GridView
    public void setColumnWidth(int i17) {
        super.setColumnWidth(i17);
        this.f208713n = i17;
    }

    @Override // android.widget.GridView
    public void setHorizontalSpacing(int i17) {
        super.setHorizontalSpacing(i17);
        this.f208717r = i17;
    }

    @Override // android.widget.GridView
    public void setNumColumns(int i17) {
        com.tencent.mm.ui.gridviewheaders.h hVar;
        super.setNumColumns(i17);
        this.f208720u = true;
        this.f208719t = i17;
        if (i17 == -1 || (hVar = this.H) == null) {
            return;
        }
        hVar.f208746i = i17;
        android.view.View[] viewArr = new android.view.View[i17];
        hVar.f208747m = viewArr;
        java.util.Arrays.fill(viewArr, (java.lang.Object) null);
    }

    public void setOnHeaderClickListener(com.tencent.mm.ui.gridviewheaders.m mVar) {
        this.f208722w = mVar;
    }

    public void setOnHeaderLongClickListener(com.tencent.mm.ui.gridviewheaders.n nVar) {
        if (isLongClickable()) {
            return;
        }
        setLongClickable(true);
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f208723x = onItemClickListener;
        super.setOnItemClickListener(this);
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f208724y = onItemLongClickListener;
        super.setOnItemLongClickListener(this);
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f208725z = onItemSelectedListener;
        super.setOnItemSelectedListener(this);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.B = onScrollListener;
    }

    public void setStickyHeaderIsTranscluent(boolean z17) {
        this.K = !z17;
    }

    @Override // android.widget.GridView
    public void setVerticalSpacing(int i17) {
        super.setVerticalSpacing(i17);
        this.G = i17;
    }

    public GridHeadersGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f208708f = new com.tencent.mm.sdk.platformtools.n3();
        this.f208709g = true;
        this.f208710h = new android.graphics.Rect();
        this.f208714o = -1L;
        this.f208715p = new com.tencent.mm.ui.gridviewheaders.i(this);
        this.f208721v = 1;
        this.C = 0;
        this.K = true;
        super.setOnScrollListener(this);
        setVerticalFadingEdgeEnabled(false);
        if (!this.f208720u) {
            this.f208719t = -1;
        }
        this.F = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        com.tencent.mm.ui.gridviewheaders.b sVar;
        com.tencent.mm.ui.gridviewheaders.b bVar;
        com.tencent.mm.ui.gridviewheaders.h hVar = this.H;
        android.database.DataSetObserver dataSetObserver = this.f208715p;
        if (hVar != null && dataSetObserver != null) {
            hVar.unregisterDataSetObserver(dataSetObserver);
        }
        if (!this.f208712m) {
            this.f208711i = true;
        }
        if (listAdapter instanceof com.tencent.mm.ui.gridviewheaders.b) {
            bVar = (com.tencent.mm.ui.gridviewheaders.b) listAdapter;
        } else {
            if (listAdapter instanceof com.tencent.mm.ui.gridviewheaders.t) {
                sVar = new com.tencent.mm.ui.gridviewheaders.x((com.tencent.mm.ui.gridviewheaders.t) listAdapter);
            } else {
                sVar = new com.tencent.mm.ui.gridviewheaders.s(listAdapter);
            }
            bVar = sVar;
        }
        com.tencent.mm.ui.gridviewheaders.h hVar2 = new com.tencent.mm.ui.gridviewheaders.h(getContext(), this, bVar);
        this.H = hVar2;
        hVar2.registerDataSetObserver(dataSetObserver);
        this.f208716q = 0;
        this.D = null;
        this.f208714o = Long.MIN_VALUE;
        super.setAdapter((android.widget.ListAdapter) this.H);
    }
}
