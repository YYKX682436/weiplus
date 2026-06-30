package com.tencent.mm.view.ratio;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0012\u0010\n\u001a\u00020\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/view/ratio/RatioLayout;", "Landroid/view/ViewGroup;", "Lcom/tencent/mm/view/ratio/a;", "getLayoutManager", "layoutManager", "Ljz5/f0;", "setLayoutManager", "Lhn5/c;", "getAdapter", "adapter", "setAdapter", "Lhn5/a;", "itemDecoration", "setItemDecoration", "", "errorPixel", "setErrorPixel", "exactlyHeight", "setExactlyHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hn5/b", "LayoutParams", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class RatioLayout extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.ratio.a f213697d;

    /* renamed from: e, reason: collision with root package name */
    public hn5.c f213698e;

    /* renamed from: f, reason: collision with root package name */
    public int f213699f;

    /* renamed from: g, reason: collision with root package name */
    public hn5.a f213700g;

    /* renamed from: h, reason: collision with root package name */
    public int f213701h;

    /* renamed from: i, reason: collision with root package name */
    public int f213702i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f213703m;

    /* renamed from: n, reason: collision with root package name */
    public int f213704n;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/view/ratio/RatioLayout$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/content/Context;", "c", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public hn5.b f213705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(android.content.Context c17, android.util.AttributeSet attrs) {
            super(c17, attrs);
            kotlin.jvm.internal.o.g(c17, "c");
            kotlin.jvm.internal.o.g(attrs, "attrs");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(android.view.ViewGroup.LayoutParams source) {
            super(source.width, source.height);
            kotlin.jvm.internal.o.g(source, "source");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatioLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213703m = new java.util.HashMap();
        this.f213704n = -1;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.tencent.mm.view.ratio.RatioLayout.LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        hn5.a aVar = this.f213700g;
        if (aVar != null) {
            dj2.k kVar = (dj2.k) aVar;
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            for (dj2.i iVar : kVar.f232906b) {
                android.graphics.PointF pointF = iVar.f232902a;
                float f17 = width;
                float f18 = pointF.x * f17;
                float f19 = height;
                float f27 = pointF.y * f19;
                android.graphics.PointF pointF2 = iVar.f232903b;
                canvas.drawLine(f18, f27, pointF2.x * f17, pointF2.y * f19, (android.graphics.Paint) ((jz5.n) kVar.f232905a).getValue());
            }
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.tencent.mm.view.ratio.RatioLayout.LayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p17) {
        kotlin.jvm.internal.o.g(p17, "p");
        return new com.tencent.mm.view.ratio.RatioLayout.LayoutParams(p17);
    }

    public final hn5.c getAdapter() {
        hn5.c cVar = this.f213698e;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    public final com.tencent.mm.view.ratio.a getLayoutManager() {
        com.tencent.mm.view.ratio.a aVar = this.f213697d;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("layoutManager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        jz5.f0 f0Var;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        getPaddingLeft();
        getPaddingRight();
        getPaddingTop();
        getPaddingBottom();
        int childCount2 = getChildCount();
        for (int i28 = 0; i28 < childCount2; i28++) {
            android.view.View childAt = getChildAt(i28);
            if (childAt.getVisibility() != 8) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.view.ratio.RatioLayout.LayoutParams");
                hn5.b bVar = ((com.tencent.mm.view.ratio.RatioLayout.LayoutParams) layoutParams).f213705a;
                if (bVar != null) {
                    int b17 = a06.d.b(bVar.f282609a * measuredWidth);
                    int b18 = a06.d.b(bVar.f282610b * measuredHeight);
                    int paddingLeft = getPaddingLeft() + b17;
                    int paddingTop = getPaddingTop() + b18;
                    childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                    childAt.getMeasuredWidth();
                    childAt.getMeasuredHeight();
                    childAt.getMeasuredWidth();
                    childAt.getMeasuredHeight();
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    jz5.l lVar = childCount == 1 ? new jz5.l(0, 0) : new jz5.l(java.lang.Integer.valueOf(measuredWidth / childCount), java.lang.Integer.valueOf(measuredHeight / childCount));
                    int intValue = ((java.lang.Number) lVar.f302833d).intValue();
                    int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
                    int paddingLeft2 = getPaddingLeft() + intValue;
                    int paddingTop2 = getPaddingTop() + intValue2;
                    childAt.layout(paddingLeft2, paddingTop2, childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + paddingTop2);
                    childAt.getMeasuredWidth();
                    childAt.getMeasuredHeight();
                    childAt.getMeasuredWidth();
                    childAt.getMeasuredHeight();
                }
            }
        }
        this.f213701h = 0;
        this.f213702i = 0;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        jz5.f0 f0Var;
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = this;
        super.onMeasure(i17, i18);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i27 = ratioLayout.f213704n;
        int i28 = 0;
        boolean z17 = true;
        if (!(i27 >= 0 && i27 < measuredHeight) && measuredHeight > 0) {
            if (ratioLayout.f213701h == measuredHeight && ratioLayout.f213702i == measuredWidth) {
                java.util.HashMap hashMap = ratioLayout.f213703m;
                if (hashMap.size() == getChildCount()) {
                    int childCount2 = getChildCount();
                    int i29 = 0;
                    while (true) {
                        if (i29 >= childCount2) {
                            z17 = false;
                            break;
                        }
                        android.view.ViewGroup.LayoutParams layoutParams = ratioLayout.getChildAt(i29).getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.view.ratio.RatioLayout.LayoutParams");
                        hn5.b bVar = ((com.tencent.mm.view.ratio.RatioLayout.LayoutParams) layoutParams).f213705a;
                        hn5.b bVar2 = (hn5.b) hashMap.get(java.lang.Integer.valueOf(i29));
                        hashMap.put(java.lang.Integer.valueOf(i29), bVar);
                        if ((bVar == null && bVar2 != null) || (bVar != null && bVar2 == null)) {
                            break;
                        }
                        if (bVar2 != null && bVar != null) {
                            if (!(bVar2.f282609a == bVar.f282609a)) {
                                break;
                            }
                            if (!(bVar2.f282610b == bVar.f282610b)) {
                                break;
                            }
                            if (!(bVar2.f282611c == bVar.f282611c)) {
                                break;
                            }
                            if (!(bVar2.f282612d == bVar.f282612d)) {
                                break;
                            }
                        }
                        i29++;
                    }
                } else {
                    int childCount3 = getChildCount();
                    for (int i37 = 0; i37 < childCount3; i37++) {
                        android.view.ViewGroup.LayoutParams layoutParams2 = ratioLayout.getChildAt(i37).getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type com.tencent.mm.view.ratio.RatioLayout.LayoutParams");
                        hashMap.put(java.lang.Integer.valueOf(i37), ((com.tencent.mm.view.ratio.RatioLayout.LayoutParams) layoutParams2).f213705a);
                    }
                }
                if (!z17) {
                    return;
                }
            }
            ratioLayout.f213701h = measuredHeight;
            ratioLayout.f213702i = measuredWidth;
            int childCount4 = getChildCount();
            while (i28 < childCount4) {
                android.view.View childAt = ratioLayout.getChildAt(i28);
                if (childAt.getVisibility() != 8) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type com.tencent.mm.view.ratio.RatioLayout.LayoutParams");
                    hn5.b bVar3 = ((com.tencent.mm.view.ratio.RatioLayout.LayoutParams) layoutParams3).f213705a;
                    if (bVar3 != null) {
                        float f17 = measuredWidth;
                        int b17 = a06.d.b(bVar3.f282609a * f17);
                        float f18 = measuredHeight;
                        int b18 = a06.d.b(bVar3.f282610b * f18);
                        int b19 = a06.d.b(bVar3.f282611c * f17);
                        int b27 = a06.d.b(bVar3.f282612d * f18);
                        int i38 = ratioLayout.f213699f;
                        if (i38 > 0) {
                            int i39 = b17 + b19;
                            i19 = childCount4;
                            if (i39 >= measuredWidth - i38 && i39 < measuredWidth) {
                                b19 = measuredWidth - b17;
                            }
                            int i47 = b18 + b27;
                            if (i47 >= measuredHeight - i38 && i47 < measuredHeight) {
                                b27 = measuredHeight - b18;
                            }
                        } else {
                            i19 = childCount4;
                        }
                        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(b19, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(b27, 1073741824));
                        a06.d.b(bVar3.f282611c * f17);
                        a06.d.b(bVar3.f282612d * f18);
                        f0Var = jz5.f0.f302826a;
                    } else {
                        i19 = childCount4;
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(measuredWidth / childCount);
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(measuredHeight / childCount);
                        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(valueOf.intValue(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(valueOf2.intValue(), 1073741824));
                        valueOf.intValue();
                        valueOf2.intValue();
                    }
                } else {
                    i19 = childCount4;
                }
                i28++;
                ratioLayout = this;
                childCount4 = i19;
            }
        }
    }

    public final void setAdapter(hn5.c adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f213698e = adapter;
        adapter.f282613a = this;
    }

    public final void setErrorPixel(int i17) {
        this.f213699f = i17;
    }

    public final void setExactlyHeight(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiAreaLayout", "setExactlyHeight: " + i17);
        this.f213704n = i17;
    }

    public final void setItemDecoration(hn5.a itemDecoration) {
        kotlin.jvm.internal.o.g(itemDecoration, "itemDecoration");
        this.f213700g = itemDecoration;
    }

    public final void setLayoutManager(com.tencent.mm.view.ratio.a layoutManager) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        this.f213697d = layoutManager;
        layoutManager.f213706a = this;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) {
        kotlin.jvm.internal.o.g(attrs, "attrs");
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, wm0.a.D);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float f17 = obtainStyledAttributes.getFloat(2, 0.0f);
        float f18 = obtainStyledAttributes.getFloat(3, 0.0f);
        float f19 = obtainStyledAttributes.getFloat(1, 0.0f);
        float f27 = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.view.ratio.RatioLayout.LayoutParams layoutParams = new com.tencent.mm.view.ratio.RatioLayout.LayoutParams(context, attrs);
        layoutParams.f213705a = new hn5.b(f17, f18, f19, f27);
        return layoutParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatioLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f213703m = new java.util.HashMap();
        this.f213704n = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatioLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f213703m = new java.util.HashMap();
        this.f213704n = -1;
    }
}
