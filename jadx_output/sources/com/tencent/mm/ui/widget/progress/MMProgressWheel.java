package com.tencent.mm.ui.widget.progress;

/* loaded from: classes13.dex */
public class MMProgressWheel extends android.view.View {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public int f212358d;

    /* renamed from: e, reason: collision with root package name */
    public int f212359e;

    /* renamed from: f, reason: collision with root package name */
    public int f212360f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f212361g;

    /* renamed from: h, reason: collision with root package name */
    public double f212362h;

    /* renamed from: i, reason: collision with root package name */
    public double f212363i;

    /* renamed from: m, reason: collision with root package name */
    public float f212364m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f212365n;

    /* renamed from: o, reason: collision with root package name */
    public long f212366o;

    /* renamed from: p, reason: collision with root package name */
    public int f212367p;

    /* renamed from: q, reason: collision with root package name */
    public int f212368q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f212369r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Paint f212370s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.RectF f212371t;

    /* renamed from: u, reason: collision with root package name */
    public float f212372u;

    /* renamed from: v, reason: collision with root package name */
    public long f212373v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f212374w;

    /* renamed from: x, reason: collision with root package name */
    public float f212375x;

    /* renamed from: y, reason: collision with root package name */
    public float f212376y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f212377z;

    /* loaded from: classes13.dex */
    public static class WheelSavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState> CREATOR = new com.tencent.mm.ui.widget.progress.c();

        /* renamed from: d, reason: collision with root package name */
        public float f212378d;

        /* renamed from: e, reason: collision with root package name */
        public float f212379e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f212380f;

        /* renamed from: g, reason: collision with root package name */
        public float f212381g;

        /* renamed from: h, reason: collision with root package name */
        public int f212382h;

        /* renamed from: i, reason: collision with root package name */
        public int f212383i;

        /* renamed from: m, reason: collision with root package name */
        public int f212384m;

        /* renamed from: n, reason: collision with root package name */
        public int f212385n;

        /* renamed from: o, reason: collision with root package name */
        public int f212386o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f212387p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f212388q;

        public WheelSavedState(android.os.Parcel parcel, com.tencent.mm.ui.widget.progress.a aVar) {
            super(parcel);
            this.f212378d = parcel.readFloat();
            this.f212379e = parcel.readFloat();
            this.f212380f = parcel.readByte() != 0;
            this.f212381g = parcel.readFloat();
            this.f212382h = parcel.readInt();
            this.f212383i = parcel.readInt();
            this.f212384m = parcel.readInt();
            this.f212385n = parcel.readInt();
            this.f212386o = parcel.readInt();
            this.f212387p = parcel.readByte() != 0;
            this.f212388q = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeFloat(this.f212378d);
            parcel.writeFloat(this.f212379e);
            parcel.writeByte(this.f212380f ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.f212381g);
            parcel.writeInt(this.f212382h);
            parcel.writeInt(this.f212383i);
            parcel.writeInt(this.f212384m);
            parcel.writeInt(this.f212385n);
            parcel.writeInt(this.f212386o);
            parcel.writeByte(this.f212387p ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f212388q ? (byte) 1 : (byte) 0);
        }
    }

    public MMProgressWheel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212358d = 28;
        this.f212359e = 4;
        this.f212360f = 4;
        this.f212361g = false;
        this.f212362h = 0.0d;
        this.f212363i = 460.0d;
        this.f212364m = 0.0f;
        this.f212365n = true;
        this.f212366o = 0L;
        this.f212367p = -1442840576;
        this.f212368q = 16777215;
        this.f212369r = new android.graphics.Paint();
        this.f212370s = new android.graphics.Paint();
        this.f212371t = new android.graphics.RectF();
        this.f212372u = 230.0f;
        this.f212373v = 0L;
        this.f212375x = 0.0f;
        this.f212376y = 0.0f;
        this.f212377z = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463105l);
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f212359e = (int) android.util.TypedValue.applyDimension(1, this.f212359e, displayMetrics);
        this.f212360f = (int) android.util.TypedValue.applyDimension(1, this.f212360f, displayMetrics);
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, this.f212358d, displayMetrics);
        this.f212358d = applyDimension;
        this.f212358d = (int) obtainStyledAttributes.getDimension(3, applyDimension);
        this.f212361g = obtainStyledAttributes.getBoolean(4, false);
        this.f212359e = (int) obtainStyledAttributes.getDimension(2, this.f212359e);
        this.f212360f = (int) obtainStyledAttributes.getDimension(8, this.f212360f);
        this.f212372u = obtainStyledAttributes.getFloat(9, this.f212372u / 360.0f) * 360.0f;
        this.f212363i = obtainStyledAttributes.getInt(1, (int) this.f212363i);
        this.f212367p = obtainStyledAttributes.getColor(0, this.f212367p);
        this.f212368q = obtainStyledAttributes.getColor(7, this.f212368q);
        this.f212374w = obtainStyledAttributes.getBoolean(5, false);
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f212373v = android.os.SystemClock.uptimeMillis();
            this.f212377z = true;
            invalidate();
        }
        obtainStyledAttributes.recycle();
        this.A = android.provider.Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void a() {
        android.graphics.Paint paint = this.f212369r;
        paint.setColor(this.f212367p);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f212359e);
        android.graphics.Paint paint2 = this.f212370s;
        paint2.setColor(this.f212368q);
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f212360f);
    }

    public int getBarColor() {
        return this.f212367p;
    }

    public int getBarWidth() {
        return this.f212359e;
    }

    public int getCircleRadius() {
        return this.f212358d;
    }

    public float getProgress() {
        if (this.f212377z) {
            return -1.0f;
        }
        return this.f212375x / 360.0f;
    }

    public int getRimColor() {
        return this.f212368q;
    }

    public int getRimWidth() {
        return this.f212360f;
    }

    public float getSpinSpeed() {
        return this.f212372u / 360.0f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        super.onDraw(canvas);
        canvas.drawArc(this.f212371t, 360.0f, 360.0f, false, this.f212370s);
        if (this.A) {
            boolean z17 = this.f212377z;
            android.graphics.Paint paint = this.f212369r;
            float f19 = 0.0f;
            boolean z18 = true;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f212373v;
                float f27 = (((float) uptimeMillis) * this.f212372u) / 1000.0f;
                long j17 = this.f212366o;
                if (j17 >= 200) {
                    double d17 = this.f212362h + uptimeMillis;
                    this.f212362h = d17;
                    double d18 = this.f212363i;
                    if (d17 > d18) {
                        this.f212362h = d17 - d18;
                        this.f212366o = 0L;
                        this.f212365n = !this.f212365n;
                    }
                    float cos = (((float) java.lang.Math.cos(((this.f212362h / d18) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    if (this.f212365n) {
                        this.f212364m = cos * 254.0f;
                    } else {
                        float f28 = (1.0f - cos) * 254.0f;
                        this.f212375x += this.f212364m - f28;
                        this.f212364m = f28;
                    }
                } else {
                    this.f212366o = j17 + uptimeMillis;
                }
                float f29 = this.f212375x + f27;
                this.f212375x = f29;
                if (f29 > 360.0f) {
                    this.f212375x = f29 - 360.0f;
                }
                this.f212373v = android.os.SystemClock.uptimeMillis();
                float f37 = this.f212375x - 90.0f;
                float f38 = this.f212364m + 16.0f;
                if (isInEditMode()) {
                    f17 = 135.0f;
                    f18 = 0.0f;
                } else {
                    f17 = f38;
                    f18 = f37;
                }
                canvas.drawArc(this.f212371t, f18, f17, false, paint);
            } else {
                if (this.f212375x != this.f212376y) {
                    this.f212375x = java.lang.Math.min(this.f212375x + ((((float) (android.os.SystemClock.uptimeMillis() - this.f212373v)) / 1000.0f) * this.f212372u), this.f212376y);
                    this.f212373v = android.os.SystemClock.uptimeMillis();
                } else {
                    z18 = false;
                }
                float f39 = this.f212375x;
                if (!this.f212374w) {
                    f19 = ((float) (1.0d - java.lang.Math.pow(1.0f - (f39 / 360.0f), 4.0f))) * 360.0f;
                    f39 = ((float) (1.0d - java.lang.Math.pow(1.0f - (this.f212375x / 360.0f), 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.f212371t, f19 - 90.0f, isInEditMode() ? 360.0f : f39, false, paint);
            }
            if (z18) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int paddingLeft = this.f212358d + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.f212358d + getPaddingTop() + getPaddingBottom();
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = java.lang.Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = java.lang.Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState wheelSavedState = (com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState) parcelable;
        super.onRestoreInstanceState(wheelSavedState.getSuperState());
        this.f212375x = wheelSavedState.f212378d;
        this.f212376y = wheelSavedState.f212379e;
        this.f212377z = wheelSavedState.f212380f;
        this.f212372u = wheelSavedState.f212381g;
        this.f212359e = wheelSavedState.f212382h;
        this.f212367p = wheelSavedState.f212383i;
        this.f212360f = wheelSavedState.f212384m;
        this.f212368q = wheelSavedState.f212385n;
        this.f212358d = wheelSavedState.f212386o;
        this.f212374w = wheelSavedState.f212387p;
        this.f212361g = wheelSavedState.f212388q;
        this.f212373v = android.os.SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState wheelSavedState = new com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.f212378d = this.f212375x;
        wheelSavedState.f212379e = this.f212376y;
        wheelSavedState.f212380f = this.f212377z;
        wheelSavedState.f212381g = this.f212372u;
        wheelSavedState.f212382h = this.f212359e;
        wheelSavedState.f212383i = this.f212367p;
        wheelSavedState.f212384m = this.f212360f;
        wheelSavedState.f212385n = this.f212368q;
        wheelSavedState.f212386o = this.f212358d;
        wheelSavedState.f212387p = this.f212374w;
        wheelSavedState.f212388q = this.f212361g;
        return wheelSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f212361g) {
            int i28 = this.f212359e;
            this.f212371t = new android.graphics.RectF(paddingLeft + i28, paddingTop + i28, (i17 - paddingRight) - i28, (i18 - paddingBottom) - i28);
        } else {
            int i29 = (i17 - paddingLeft) - paddingRight;
            int min = java.lang.Math.min(java.lang.Math.min(i29, (i18 - paddingBottom) - paddingTop), (this.f212358d * 2) - (this.f212359e * 2));
            int i37 = ((i29 - min) / 2) + paddingLeft;
            int i38 = ((((i18 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i39 = this.f212359e;
            this.f212371t = new android.graphics.RectF(i37 + i39, i38 + i39, (i37 + min) - i39, (i38 + min) - i39);
        }
        a();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        if (i17 == 0) {
            this.f212373v = android.os.SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i17) {
        this.f212367p = i17;
        a();
        if (this.f212377z) {
            return;
        }
        invalidate();
    }

    public void setBarWidth(int i17) {
        this.f212359e = i17;
        if (this.f212377z) {
            return;
        }
        invalidate();
    }

    public void setCallback(com.tencent.mm.ui.widget.progress.b bVar) {
    }

    public void setCircleRadius(int i17) {
        this.f212358d = i17;
        if (this.f212377z) {
            return;
        }
        invalidate();
    }

    public void setInstantProgress(float f17) {
        if (this.f212377z) {
            this.f212375x = 0.0f;
            this.f212377z = false;
        }
        if (f17 > 1.0f) {
            f17 -= 1.0f;
        } else if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (java.lang.Math.abs(f17 - this.f212376y) <= 0.0f) {
            return;
        }
        float min = java.lang.Math.min(f17 * 360.0f, 360.0f);
        this.f212376y = min;
        this.f212375x = min;
        this.f212373v = android.os.SystemClock.uptimeMillis();
        invalidate();
    }

    public void setLinearProgress(boolean z17) {
        this.f212374w = z17;
        if (this.f212377z) {
            return;
        }
        invalidate();
    }

    public void setProgress(float f17) {
        if (this.f212377z) {
            this.f212375x = 0.0f;
            this.f212377z = false;
        }
        if (f17 > 1.0f) {
            f17 -= 1.0f;
        } else if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (java.lang.Math.abs(f17 - this.f212376y) <= 0.0f) {
            return;
        }
        if (this.f212375x == this.f212376y) {
            this.f212373v = android.os.SystemClock.uptimeMillis();
        }
        this.f212376y = java.lang.Math.min(f17 * 360.0f, 360.0f);
        invalidate();
    }

    public void setRimColor(int i17) {
        this.f212368q = i17;
        a();
        if (this.f212377z) {
            return;
        }
        invalidate();
    }

    public void setRimWidth(int i17) {
        this.f212360f = i17;
        if (this.f212377z) {
            return;
        }
        invalidate();
    }

    public void setSpinSpeed(float f17) {
        this.f212372u = f17 * 360.0f;
    }
}
