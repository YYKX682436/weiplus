package com.tencent.mm.ui.indicator;

/* loaded from: classes15.dex */
public class TitlePageIndicator extends android.view.View implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager.OnPageChangeListener f208946d;

    /* renamed from: e, reason: collision with root package name */
    public int f208947e;

    /* renamed from: f, reason: collision with root package name */
    public float f208948f;

    /* renamed from: g, reason: collision with root package name */
    public int f208949g;

    /* renamed from: h, reason: collision with root package name */
    public int f208950h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f208951i;

    /* renamed from: m, reason: collision with root package name */
    public int f208952m;
    private com.tencent.mm.ui.base.CustomViewPager mViewPager;

    /* renamed from: n, reason: collision with root package name */
    public int f208953n;

    /* renamed from: o, reason: collision with root package name */
    public int f208954o;

    /* renamed from: p, reason: collision with root package name */
    public int f208955p;

    /* renamed from: q, reason: collision with root package name */
    public float f208956q;

    /* renamed from: r, reason: collision with root package name */
    public float f208957r;

    /* renamed from: s, reason: collision with root package name */
    public float f208958s;

    /* renamed from: t, reason: collision with root package name */
    public int f208959t;

    /* renamed from: u, reason: collision with root package name */
    public float f208960u;

    /* renamed from: v, reason: collision with root package name */
    public int f208961v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f208962w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.indicator.a f208963x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.indicator.a f208964y;

    /* loaded from: classes15.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.indicator.TitlePageIndicator.SavedState> CREATOR = new com.tencent.mm.ui.indicator.c();

        /* renamed from: d, reason: collision with root package name */
        public int f208965d;

        public SavedState(android.os.Parcel parcel, com.tencent.mm.ui.indicator.b bVar) {
            super(parcel);
            this.f208965d = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f208965d);
        }
    }

    public TitlePageIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f208947e = -1;
        this.f208951i = new android.graphics.Paint();
        new android.graphics.Rect();
        this.f208960u = -1.0f;
        this.f208961v = -1;
        b();
    }

    private int getCount() {
        return this.mViewPager.getAdapter().getCount() + 1;
    }

    public final android.graphics.Rect a(int i17, android.graphics.Paint paint) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        java.lang.CharSequence pageTitle = this.mViewPager.getAdapter().getPageTitle(i17);
        if (pageTitle == null) {
            pageTitle = "";
        }
        paint.getTextBounds(pageTitle.toString(), 0, pageTitle.length(), rect2);
        rect.left = 0;
        rect.top = (getHeight() - rect2.height()) / 2;
        rect.right = rect.left + rect2.width();
        rect.bottom = rect.top + rect2.height();
        return rect;
    }

    public final void b() {
        if (isInEditMode()) {
            return;
        }
        this.f208957r = i65.a.b(getContext(), 16);
        this.f208956q = i65.a.b(getContext(), 16);
        this.f208958s = i65.a.b(getContext(), 16);
        this.f208952m = i65.a.d(getContext(), com.tencent.mm.R.color.f478492d);
        this.f208953n = i65.a.d(getContext(), com.tencent.mm.R.color.aaw);
        this.f208954o = i65.a.b(getContext(), 17);
        this.f208955p = i65.a.b(getContext(), 22);
        this.f208963x = new com.tencent.mm.ui.indicator.a(this.f208952m, this.f208953n, 100);
        this.f208964y = new com.tencent.mm.ui.indicator.a(this.f208953n, this.f208952m, 100);
        android.graphics.Paint paint = this.f208951i;
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        java.lang.reflect.Method method = n3.o1.f334378a;
        this.f208959t = viewConfiguration.getScaledPagingTouchSlop();
    }

    public float getClipPadding() {
        return this.f208958s;
    }

    public int getSelectedColor() {
        return this.f208953n;
    }

    public int getTextColor() {
        return this.f208952m;
    }

    public float getTextSize() {
        return this.f208951i.getTextSize();
    }

    public float getTitlePadding() {
        return this.f208956q;
    }

    public float getTopPadding() {
        return this.f208957r;
    }

    public android.graphics.Typeface getTypeface() {
        return this.f208951i.getTypeface();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int count;
        int i17;
        int i18;
        android.graphics.Rect a17;
        com.tencent.mm.ui.base.CustomViewPager customViewPager;
        super.onDraw(canvas);
        if (this.mViewPager == null || (count = getCount()) == 0) {
            return;
        }
        if (this.f208947e == -1 && (customViewPager = this.mViewPager) != null) {
            this.f208947e = customViewPager.getCurrentItem();
        }
        int left = getLeft();
        int width = getWidth() + left;
        int i19 = this.f208947e;
        float f17 = this.f208948f;
        if (f17 > 0.5d) {
            i19++;
            f17 = 1.0f - f17;
        }
        android.graphics.Paint paint = this.f208951i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int count2 = getCount();
        int width2 = getWidth();
        getHeight();
        int i27 = width2 / 2;
        int i28 = 0;
        while (i28 < count2) {
            if (i19 == i28) {
                paint.setTextSize(this.f208955p - ((r10 - this.f208954o) * f17));
                a17 = a(i28, paint);
            } else {
                int i29 = this.f208955p;
                paint.setTextSize(this.f208954o + ((i29 - r11) * f17));
                a17 = a(i28, paint);
            }
            int i37 = a17.right - a17.left;
            float f18 = i37;
            int clipPadding = (((int) (i27 - (f18 / 2.0f))) - (((int) (this.f208949g - (this.f208948f * (f18 + getClipPadding())))) / 2)) + (((int) ((i28 - this.f208947e) * ((width2 - i37) - getClipPadding()))) / 2);
            a17.left = clipPadding;
            a17.right = clipPadding + i37;
            arrayList.add(a17);
            i28++;
            count2 = count2;
            i27 = i27;
        }
        int size = arrayList.size();
        if (this.f208947e >= size) {
            setCurrentItem(size - 1);
            return;
        }
        int i38 = 0;
        while (i38 < count) {
            android.graphics.Rect rect = (android.graphics.Rect) arrayList.get(i38);
            int i39 = rect.left;
            if ((i39 <= left || i39 >= width) && ((i17 = rect.right) <= left || i17 >= width)) {
                i18 = i38;
            } else {
                boolean z17 = i38 == i19;
                java.lang.CharSequence pageTitle = this.mViewPager.getAdapter().getPageTitle(i38);
                if (pageTitle == null) {
                    pageTitle = "";
                }
                if (z17) {
                    paint.setTextSize(this.f208955p - ((r7 - this.f208954o) * f17));
                    paint.setColor(this.f208964y.a((int) (100.0f * f17)));
                } else {
                    int i47 = this.f208955p;
                    paint.setTextSize(this.f208954o + ((i47 - r10) * f17));
                    paint.setColor(this.f208963x.a((int) (100.0f * f17)));
                }
                i18 = i38;
                canvas.drawText(pageTitle, 0, pageTitle.length(), rect.left, rect.bottom, paint);
            }
            i38 = i18 + 1;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        this.f208950h = i17;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.f208946d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i17);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TitlePageIndicator", "onPageScrolled %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i18));
        this.f208947e = i17;
        this.f208948f = f17;
        this.f208949g = i18;
        invalidate();
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.f208946d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i17, f17, i18);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        if (this.f208950h == 0) {
            this.f208947e = i17;
            invalidate();
        }
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.f208946d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i17);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.tencent.mm.ui.indicator.TitlePageIndicator.SavedState savedState = (com.tencent.mm.ui.indicator.TitlePageIndicator.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f208947e = savedState.f208965d;
        requestLayout();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.tencent.mm.ui.indicator.TitlePageIndicator.SavedState savedState = new com.tencent.mm.ui.indicator.TitlePageIndicator.SavedState(super.onSaveInstanceState());
        savedState.f208965d = this.f208947e;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int i17;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.mViewPager == null || getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x17 = motionEvent.getX(motionEvent.findPointerIndex(this.f208961v));
                    float f17 = x17 - this.f208960u;
                    if (!this.f208962w && java.lang.Math.abs(f17) > this.f208959t) {
                        this.f208962w = true;
                    }
                    if (this.f208962w) {
                        this.f208960u = x17;
                        if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                            this.mViewPager.fakeDragBy(f17);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f208960u = motionEvent.getX(actionIndex);
                        this.f208961v = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex2) == this.f208961v) {
                            this.f208961v = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                        }
                        this.f208960u = motionEvent.getX(motionEvent.findPointerIndex(this.f208961v));
                    }
                }
            }
            if (!this.f208962w) {
                int count = getCount();
                float width = getWidth();
                float f18 = width / 2.0f;
                float f19 = width / 6.0f;
                float f27 = f18 - f19;
                float f28 = f18 + f19;
                float x18 = motionEvent.getX();
                if (x18 < f27) {
                    int i18 = this.f208947e;
                    if (i18 > 0) {
                        if (action != 3) {
                            this.mViewPager.setCurrentItem(i18 - 1);
                        }
                        return true;
                    }
                } else if (x18 > f28 && (i17 = this.f208947e) < count - 1) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(i17 + 1);
                    }
                    return true;
                }
            }
            this.f208962w = false;
            this.f208961v = -1;
            if (this.mViewPager.isFakeDragging()) {
                this.mViewPager.endFakeDrag();
            }
        } else {
            this.f208961v = motionEvent.getPointerId(0);
            this.f208960u = motionEvent.getX();
        }
        return true;
    }

    public void setCurrentItem(int i17) {
        com.tencent.mm.ui.base.CustomViewPager customViewPager = this.mViewPager;
        if (customViewPager == null) {
            throw new java.lang.IllegalStateException("ViewPager has not been bound.");
        }
        customViewPager.setCurrentItem(i17);
        this.f208947e = i17;
        invalidate();
    }

    public void setOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f208946d = onPageChangeListener;
    }

    public void setSelectedBold(boolean z17) {
        invalidate();
    }

    public void setSelectedColor(int i17) {
        this.f208953n = i17;
        invalidate();
    }

    public void setTextColor(int i17) {
        this.f208951i.setColor(i17);
        this.f208952m = i17;
        invalidate();
    }

    public void setTextSize(float f17) {
        this.f208951i.setTextSize(f17);
        invalidate();
    }

    public void setTitlePadding(float f17) {
        this.f208956q = f17;
        invalidate();
    }

    public void setTopPadding(float f17) {
        this.f208957r = f17;
        invalidate();
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        this.f208951i.setTypeface(typeface);
        invalidate();
    }

    public void setViewPager(com.tencent.mm.ui.base.CustomViewPager customViewPager) {
        com.tencent.mm.ui.base.CustomViewPager customViewPager2 = this.mViewPager;
        if (customViewPager2 == customViewPager) {
            return;
        }
        if (customViewPager2 != null) {
            customViewPager2.setOnPageChangeListener(null);
        }
        if (customViewPager.getAdapter() == null) {
            throw new java.lang.IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.mViewPager = customViewPager;
        customViewPager.setOnPageChangeListener(this);
        invalidate();
    }

    public TitlePageIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f208947e = -1;
        this.f208951i = new android.graphics.Paint();
        new android.graphics.Rect();
        this.f208960u = -1.0f;
        this.f208961v = -1;
        b();
    }
}
