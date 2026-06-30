package com.tencent.mm.ui.widget;

/* loaded from: classes9.dex */
public class MMSpinnerDatePicker extends android.widget.DatePicker implements android.widget.DatePicker.OnDateChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.NumberPicker f211341d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.NumberPicker f211342e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.NumberPicker f211343f;

    /* renamed from: g, reason: collision with root package name */
    public int f211344g;

    public MMSpinnerDatePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211344g = 0;
        a();
    }

    public final void a() {
        setCalendarViewShown(false);
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        int identifier = system.getIdentifier("year", dm.i4.COL_ID, com.eclipsesource.mmv8.Platform.ANDROID);
        int identifier2 = system.getIdentifier("month", dm.i4.COL_ID, com.eclipsesource.mmv8.Platform.ANDROID);
        int identifier3 = system.getIdentifier("day", dm.i4.COL_ID, com.eclipsesource.mmv8.Platform.ANDROID);
        this.f211341d = (android.widget.NumberPicker) findViewById(identifier);
        this.f211342e = (android.widget.NumberPicker) findViewById(identifier2);
        this.f211343f = (android.widget.NumberPicker) findViewById(identifier3);
        android.view.View childAt = getChildAt(0);
        android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.width = -1;
        childAt.setLayoutParams(layoutParams);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f211341d.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.bottomMargin = 0;
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        layoutParams2.weight = 1.0f;
        this.f211341d.setLayoutParams(layoutParams2);
        this.f211342e.setLayoutParams(layoutParams2);
        this.f211343f.setLayoutParams(layoutParams2);
        setDescendantFocusability(393216);
        setPickerMode(2);
    }

    public final void b(android.widget.NumberPicker numberPicker, int i17) {
        if (numberPicker == null) {
            return;
        }
        android.widget.EditText editText = (android.widget.EditText) numberPicker.findViewById(android.content.res.Resources.getSystem().getIdentifier("numberpicker_input", dm.i4.COL_ID, com.eclipsesource.mmv8.Platform.ANDROID));
        editText.setTextSize(0, getResources().getDimension(i17));
        int textSize = (int) editText.getTextSize();
        try {
            java.lang.reflect.Field declaredField = android.widget.NumberPicker.class.getDeclaredField("mTextSize");
            declaredField.setAccessible(true);
            declaredField.set(numberPicker, java.lang.Integer.valueOf(textSize));
            java.lang.reflect.Field declaredField2 = android.widget.NumberPicker.class.getDeclaredField("mSelectorWheelPaint");
            declaredField2.setAccessible(true);
            android.graphics.Paint paint = (android.graphics.Paint) declaredField2.get(numberPicker);
            paint.setTextSize(textSize);
            declaredField2.set(numberPicker, paint);
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", e17, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", e18, "", new java.lang.Object[0]);
        }
    }

    public int getPickerMode() {
        return this.f211344g;
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public void onDateChanged(android.widget.DatePicker datePicker, int i17, int i18, int i19) {
    }

    public void setOnDateChangeListener(al5.a2 a2Var) {
    }

    public void setPickerMode(int i17) {
        this.f211344g = i17;
        if (i17 == 0) {
            this.f211341d.setVisibility(0);
            this.f211342e.setVisibility(0);
            this.f211343f.setVisibility(0);
        } else if (i17 == 1) {
            this.f211341d.setVisibility(0);
            this.f211342e.setVisibility(0);
            this.f211343f.setVisibility(8);
        } else {
            this.f211341d.setVisibility(0);
            this.f211342e.setVisibility(8);
            this.f211343f.setVisibility(8);
        }
    }

    public void setTextSize(int i17) {
        b(this.f211341d, i17);
        b(this.f211342e, i17);
        b(this.f211343f, i17);
    }

    public MMSpinnerDatePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211344g = 0;
        a();
    }
}
