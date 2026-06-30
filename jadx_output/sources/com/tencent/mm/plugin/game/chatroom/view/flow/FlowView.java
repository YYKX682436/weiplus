package com.tencent.mm.plugin.game.chatroom.view.flow;

/* loaded from: classes13.dex */
public class FlowView extends android.view.ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f139111r = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f139112d;

    /* renamed from: e, reason: collision with root package name */
    public int f139113e;

    /* renamed from: f, reason: collision with root package name */
    public float f139114f;

    /* renamed from: g, reason: collision with root package name */
    public int f139115g;

    /* renamed from: h, reason: collision with root package name */
    public float f139116h;

    /* renamed from: i, reason: collision with root package name */
    public float f139117i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f139118m;

    /* renamed from: n, reason: collision with root package name */
    public int f139119n;

    /* renamed from: o, reason: collision with root package name */
    public f43.a f139120o;

    /* renamed from: p, reason: collision with root package name */
    public f43.e f139121p;

    /* renamed from: q, reason: collision with root package name */
    public int f139122q;

    public FlowView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f139122q = -1;
        b(context, attributeSet);
    }

    public final android.view.View a(int i17) {
        android.view.View a17 = this.f139120o.a(i17, null, this);
        a17.setOnClickListener(new f43.c(this, i17));
        a17.setOnLongClickListener(new f43.d(this, i17));
        return a17;
    }

    public final void b(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes;
        this.f139114f = -1.0f;
        this.f139115g = -1;
        this.f139122q = 0;
        this.f139116h = 10.0f;
        this.f139117i = 10.0f;
        this.f139112d = 1;
        this.f139113e = 5;
        this.f139118m = new java.util.ArrayList();
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s33.m0.f402528a)) == null) {
            return;
        }
        this.f139112d = obtainStyledAttributes.getInt(4, this.f139112d);
        this.f139113e = obtainStyledAttributes.getInt(5, this.f139113e);
        this.f139114f = obtainStyledAttributes.getDimension(0, this.f139114f);
        this.f139116h = obtainStyledAttributes.getDimension(1, this.f139116h);
        this.f139117i = obtainStyledAttributes.getDimension(3, this.f139117i);
        this.f139115g = obtainStyledAttributes.getInt(2, this.f139115g);
        obtainStyledAttributes.recycle();
    }

    public int getCurrentLinesNum() {
        return this.f139122q;
    }

    public float getFlowHeight() {
        return this.f139114f;
    }

    public int getFlowMaxRow() {
        return this.f139115g;
    }

    public int getHorizontalAlign() {
        return this.f139112d;
    }

    public float getHorizontalSpace() {
        return this.f139116h;
    }

    public int getVerticalAlign() {
        return this.f139113e;
    }

    public float getVerticalSpace() {
        return this.f139117i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        f43.a aVar = this.f139120o;
        if (aVar != null) {
            f43.e eVar = this.f139121p;
            if (eVar != null) {
                aVar.f259536a.unregisterObserver(eVar);
            }
            this.f139120o = null;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.flow.FlowView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        float f29;
        float f37;
        float f38;
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode = android.view.View.MeasureSpec.getMode(i18);
        if (this.f139120o == null || getChildCount() == 0) {
            if (mode != 1073741824) {
                size2 = getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(size, size2);
            return;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f139118m.clear();
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        float f39 = 0.0f;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), 0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i37 = i19 + measuredWidth;
            if (i37 <= paddingLeft) {
                i27++;
                if (i28 < measuredHeight) {
                    i28 = measuredHeight;
                }
                float f47 = i37;
                float f48 = this.f139116h;
                if (f47 <= paddingLeft - f48) {
                    int i38 = (int) (f47 + f48);
                    if (i29 == childCount - 1) {
                        float f49 = this.f139114f;
                        if (f49 == -1.0f) {
                            float f57 = i28;
                            this.f139118m.add(new float[]{i27, i29, f57});
                            f37 = f39 + f57;
                            f38 = this.f139117i;
                        } else {
                            this.f139118m.add(new float[]{i27, i29, f49});
                            f37 = f39 + this.f139114f;
                            f38 = this.f139117i;
                        }
                        f39 = f37 + f38;
                    }
                    i19 = i38;
                } else {
                    float f58 = this.f139114f;
                    if (f58 == -1.0f) {
                        float f59 = i28;
                        this.f139118m.add(new float[]{i27, i29, f59});
                        f28 = f39 + f59;
                        f29 = this.f139117i;
                    } else {
                        this.f139118m.add(new float[]{i27, i29, f58});
                        f28 = f39 + this.f139114f;
                        f29 = this.f139117i;
                    }
                    f39 = f28 + f29;
                    i19 = 0;
                    i27 = 0;
                    i28 = 0;
                }
            } else {
                float f66 = this.f139114f;
                if (f66 == -1.0f) {
                    float f67 = i28;
                    this.f139118m.add(new float[]{i27, i29 - 1, f67});
                    f17 = f39 + f67;
                    f18 = this.f139117i;
                } else {
                    this.f139118m.add(new float[]{i27, i29 - 1, f66});
                    f17 = f39 + this.f139114f;
                    f18 = this.f139117i;
                }
                f39 = f17 + f18;
                int i39 = (int) (measuredWidth + this.f139116h);
                if (i29 == childCount - 1) {
                    float f68 = this.f139114f;
                    if (f68 == -1.0f) {
                        i27 = 1;
                        float f69 = measuredHeight;
                        this.f139118m.add(new float[]{1, i29, f69});
                        f19 = f39 + f69;
                        f27 = this.f139117i;
                    } else {
                        i27 = 1;
                        this.f139118m.add(new float[]{1, i29, f68});
                        f19 = f39 + this.f139114f;
                        f27 = this.f139117i;
                    }
                    f39 = f19 + f27;
                } else {
                    i27 = 1;
                }
                i19 = i39;
                i28 = measuredHeight;
            }
        }
        int i47 = this.f139115g;
        if (i47 != -1 && i47 >= 0 && this.f139118m.size() > this.f139115g) {
            float f76 = 0.0f;
            for (int i48 = 0; i48 < this.f139115g; i48++) {
                f76 += ((float[]) this.f139118m.get(i48))[2] + this.f139117i;
            }
            f39 = f76;
        }
        int paddingTop = (int) ((f39 - this.f139117i) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    public void setAdapter(f43.a aVar) {
        f43.e eVar;
        f43.a aVar2 = this.f139120o;
        if (aVar2 != null && (eVar = this.f139121p) != null) {
            aVar2.f259536a.unregisterObserver(eVar);
        }
        removeAllViews();
        this.f139120o = aVar;
        if (aVar == null) {
            return;
        }
        f43.e eVar2 = new f43.e(this, null);
        this.f139121p = eVar2;
        this.f139120o.f259536a.registerObserver(eVar2);
        java.util.List list = ((f43.h) this.f139120o).f259544d;
        int size = list != null ? list.size() : 0;
        this.f139119n = size;
        if (size <= 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            java.util.List list2 = ((f43.h) this.f139120o).f259544d;
            if (i17 >= (list2 != null ? list2.size() : 0)) {
                return;
            }
            addView(a(i17));
            i17++;
        }
    }

    public void setFlowHeight(float f17) {
        this.f139114f = f17;
    }

    public void setHorizontalAlign(int i17) {
        this.f139112d = i17;
    }

    public void setHorizontalSpace(float f17) {
        this.f139116h = f17;
    }

    public void setMaxRow(int i17) {
        this.f139115g = i17;
    }

    public void setOnItemClickListener(f43.f fVar) {
    }

    public void setOnItemLongClickListener(f43.g gVar) {
    }

    public void setVerticalAlign(int i17) {
        this.f139113e = i17;
    }

    public void setVerticalSpace(float f17) {
        this.f139117i = f17;
    }

    public FlowView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f139122q = -1;
        b(context, attributeSet);
    }
}
