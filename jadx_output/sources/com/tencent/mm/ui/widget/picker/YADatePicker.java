package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class YADatePicker extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f212238e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.picker.u0 f212239d;

    public YADatePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478217dv);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        accessibilityEvent.getText().add(android.text.format.DateUtils.formatDateTime(x0Var.f212333b, x0Var.f212356r.getTimeInMillis(), 20));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return com.tencent.mm.ui.widget.picker.YADatePicker.class.getName();
    }

    public android.widget.CalendarView getCalendarView() {
        return ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212349k;
    }

    public boolean getCalendarViewShown() {
        return ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212349k.getVisibility() == 0;
    }

    public int getDayOfMonth() {
        return ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212356r.get(5);
    }

    public int getFirstDayOfWeek() {
        return ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212349k.getFirstDayOfWeek();
    }

    public long getMaxDate() {
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        x0Var.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(x0Var.f212349k.getMaxDate());
        return calendar.getTimeInMillis();
    }

    public long getMinDate() {
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        x0Var.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(x0Var.f212349k.getMinDate());
        return calendar.getTimeInMillis();
    }

    public int getMonth() {
        return ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212356r.get(2);
    }

    public boolean getSpinnersShown() {
        return ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212345g.isShown();
    }

    public com.tencent.mm.ui.widget.picker.u0 getUIDelegate() {
        return this.f212239d;
    }

    public int getYear() {
        return ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212356r.get(1);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212357s;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        x0Var.getClass();
        x0Var.a(configuration.locale);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        accessibilityEvent.getText().add(android.text.format.DateUtils.formatDateTime(x0Var.f212333b, x0Var.f212356r.getTimeInMillis(), 20));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.View.BaseSavedState baseSavedState = (android.view.View.BaseSavedState) parcelable;
        super.onRestoreInstanceState(baseSavedState.getSuperState());
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        x0Var.getClass();
        com.tencent.mm.ui.widget.picker.YADatePicker.SavedState savedState = (com.tencent.mm.ui.widget.picker.YADatePicker.SavedState) baseSavedState;
        x0Var.d(savedState.f212240d, savedState.f212241e, savedState.f212242f);
        x0Var.i();
        x0Var.h();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        x0Var.getClass();
        return new com.tencent.mm.ui.widget.picker.YADatePicker.SavedState(onSaveInstanceState, x0Var.f212356r.get(1), x0Var.f212356r.get(2), x0Var.f212356r.get(5), null);
    }

    public void setCalendarViewShown(boolean z17) {
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        x0Var.getClass();
        x0Var.f212349k.setVisibility(z17 ? 0 : 8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        com.tencent.mm.ui.widget.picker.u0 u0Var = this.f212239d;
        if (((com.tencent.mm.ui.widget.picker.x0) u0Var).f212357s == z17) {
            return;
        }
        super.setEnabled(z17);
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) u0Var;
        x0Var.f212342d.setEnabled(z17);
        x0Var.f212343e.setEnabled(z17);
        x0Var.f212344f.setEnabled(z17);
        x0Var.f212349k.setEnabled(z17);
        x0Var.f212357s = z17;
    }

    public void setFirstDayOfWeek(int i17) {
        if (i17 < 1 || i17 > 7) {
            throw new java.lang.IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
        }
        ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f212349k.setFirstDayOfWeek(i17);
    }

    public void setMaxDate(long j17) {
        ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).f(j17);
    }

    public void setMinDate(long j17) {
        ((com.tencent.mm.ui.widget.picker.x0) this.f212239d).g(j17);
    }

    public void setSpinnersShown(boolean z17) {
        com.tencent.mm.ui.widget.picker.x0 x0Var = (com.tencent.mm.ui.widget.picker.x0) this.f212239d;
        x0Var.getClass();
        x0Var.f212345g.setVisibility(z17 ? 0 : 8);
    }

    public void setValidationCallback(com.tencent.mm.ui.widget.picker.z0 z0Var) {
        this.f212239d.getClass();
    }

    public YADatePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212239d = new com.tencent.mm.ui.widget.picker.x0(this, context, attributeSet, i17, 0);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463099f, i17, 0);
        int i18 = obtainStyledAttributes.getInt(6, 0);
        obtainStyledAttributes.recycle();
        if (i18 != 0) {
            setFirstDayOfWeek(i18);
        }
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.widget.picker.YADatePicker.SavedState> CREATOR = new com.tencent.mm.ui.widget.picker.y0();

        /* renamed from: d, reason: collision with root package name */
        public final int f212240d;

        /* renamed from: e, reason: collision with root package name */
        public final int f212241e;

        /* renamed from: f, reason: collision with root package name */
        public final int f212242f;

        public SavedState(android.os.Parcelable parcelable, int i17, int i18, int i19, com.tencent.mm.ui.widget.picker.s0 s0Var) {
            super(parcelable);
            this.f212240d = i17;
            this.f212241e = i18;
            this.f212242f = i19;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f212240d);
            parcel.writeInt(this.f212241e);
            parcel.writeInt(this.f212242f);
        }

        public SavedState(android.os.Parcel parcel, com.tencent.mm.ui.widget.picker.s0 s0Var) {
            super(parcel);
            this.f212240d = parcel.readInt();
            this.f212241e = parcel.readInt();
            this.f212242f = parcel.readInt();
        }
    }
}
