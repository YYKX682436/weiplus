package com.tencent.mm.ui.widget;

/* loaded from: classes13.dex */
public class MMPinProgressBtn extends android.widget.CompoundButton {

    /* renamed from: d, reason: collision with root package name */
    public int f211327d;

    /* renamed from: e, reason: collision with root package name */
    public int f211328e;

    /* renamed from: f, reason: collision with root package name */
    public int f211329f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f211330g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f211331h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f211332i;

    /* renamed from: m, reason: collision with root package name */
    public int f211333m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f211334n;

    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.widget.MMPinProgressBtn.SavedState> CREATOR = new com.tencent.mm.ui.widget.a();

        /* renamed from: d, reason: collision with root package name */
        public int f211335d;

        /* renamed from: e, reason: collision with root package name */
        public int f211336e;

        public SavedState(android.os.Parcel parcel, al5.x1 x1Var) {
            super(parcel);
            this.f211335d = parcel.readInt();
            this.f211336e = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f211335d);
            parcel.writeInt(this.f211336e);
        }
    }

    public MMPinProgressBtn(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211332i = new android.graphics.RectF();
        this.f211334n = new al5.x1(this);
        b(context, attributeSet, 0);
    }

    public void a() {
        java.lang.Runnable runnable = this.f211334n;
        removeCallbacks(runnable);
        post(runnable);
    }

    public final void b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f211327d = 100;
        this.f211328e = 0;
        android.content.res.Resources resources = getResources();
        int color = resources.getColor(com.tencent.mm.R.color.f479474a15);
        int color2 = resources.getColor(com.tencent.mm.R.color.f479475a16);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArray = null;
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, wm0.a.f447201s, i17, 0);
                this.f211327d = typedArray.getInteger(2, this.f211327d);
                this.f211328e = typedArray.getInteger(4, this.f211328e);
                color = typedArray.getColor(0, color);
                color2 = typedArray.getColor(5, color2);
                this.f211329f = typedArray.getInteger(6, 0);
                this.f211333m = typedArray.getDimensionPixelSize(1, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.a7m));
                typedArray.recycle();
            } catch (java.lang.Throwable th6) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th6;
            }
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f211330g = paint;
        paint.setColor(color);
        this.f211330g.setStyle(android.graphics.Paint.Style.STROKE);
        this.f211330g.setStrokeWidth(4.0f);
        this.f211330g.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f211331h = paint2;
        paint2.setColor(color2);
        this.f211331h.setAntiAlias(true);
        setClickable(false);
    }

    public int getMax() {
        return this.f211327d;
    }

    public int getProgress() {
        return this.f211328e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i17 = this.f211333m;
        android.graphics.RectF rectF = this.f211332i;
        rectF.set(2.0f, 2.0f, i17 - 2.0f, i17 - 2.0f);
        rectF.offset((getWidth() - this.f211333m) / 2, (getHeight() - this.f211333m) / 2);
        canvas.drawArc(this.f211332i, 0.0f, 360.0f, true, this.f211330g);
        int i18 = this.f211329f;
        if (i18 == 0) {
            int i19 = this.f211333m;
            rectF.set(8.0f, 8.0f, i19 - 8.0f, i19 - 8.0f);
            rectF.offset((getWidth() - this.f211333m) / 2, (getHeight() - this.f211333m) / 2);
            canvas.drawArc(this.f211332i, -90.0f, ((this.f211328e * 1.0f) / this.f211327d) * 360.0f, true, this.f211331h);
            return;
        }
        if (i18 != 1) {
            return;
        }
        int i27 = this.f211333m;
        rectF.set(2.0f, 2.0f, i27 - 2.0f, i27 - 2.0f);
        rectF.offset((getWidth() - this.f211333m) / 2, (getHeight() - this.f211333m) / 2);
        canvas.drawArc(this.f211332i, 270.0f, (((this.f211328e * 1.0f) / this.f211327d) * 360.0f) - 360.0f, true, this.f211331h);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.resolveSize(this.f211333m, i17), android.view.View.resolveSize(this.f211333m, i18));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.tencent.mm.ui.widget.MMPinProgressBtn.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.tencent.mm.ui.widget.MMPinProgressBtn.SavedState savedState = (com.tencent.mm.ui.widget.MMPinProgressBtn.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f211327d = savedState.f211336e;
        this.f211328e = savedState.f211335d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (!isSaveEnabled()) {
            return onSaveInstanceState;
        }
        com.tencent.mm.ui.widget.MMPinProgressBtn.SavedState savedState = new com.tencent.mm.ui.widget.MMPinProgressBtn.SavedState(onSaveInstanceState);
        savedState.f211336e = this.f211327d;
        savedState.f211335d = this.f211328e;
        return savedState;
    }

    public void setCircleColor(int i17) {
        this.f211330g.setColor(getResources().getColor(i17));
    }

    public void setInnerPixSize(int i17) {
        this.f211333m = i17;
    }

    public void setMax(int i17) {
        this.f211327d = java.lang.Math.max(0, i17);
        invalidate();
    }

    public void setProgress(int i17) {
        this.f211328e = java.lang.Math.max(0, i17);
        this.f211328e = java.lang.Math.min(i17, this.f211327d);
        invalidate();
    }

    public void setProgressColor(int i17) {
        this.f211331h.setColor(getResources().getColor(i17));
    }

    public void setStyle(int i17) {
        if (i17 == 1 || i17 == 0) {
            this.f211329f = i17;
        }
    }

    public MMPinProgressBtn(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211332i = new android.graphics.RectF();
        this.f211334n = new al5.x1(this);
        b(context, attributeSet, i17);
    }
}
