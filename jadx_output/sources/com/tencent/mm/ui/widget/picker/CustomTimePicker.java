package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class CustomTimePicker extends android.widget.TimePicker {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.NumberPicker f212215d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.NumberPicker f212216e;

    /* renamed from: f, reason: collision with root package name */
    public final int f212217f;

    /* renamed from: g, reason: collision with root package name */
    public final int f212218g;

    /* renamed from: h, reason: collision with root package name */
    public final int f212219h;

    /* renamed from: i, reason: collision with root package name */
    public final int f212220i;

    public CustomTimePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve), attributeSet);
        this.f212217f = -1;
        this.f212218g = -1;
        this.f212219h = -1;
        this.f212220i = -1;
        a();
    }

    public final void a() {
        setIs24HourView(java.lang.Boolean.TRUE);
        this.f212215d = b("mHourSpinner");
        this.f212216e = b("mMinuteSpinner");
        com.tencent.mm.ui.widget.picker.q0.d(this.f212215d);
        com.tencent.mm.ui.widget.picker.q0.d(this.f212216e);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.drawable.auc);
        com.tencent.mm.ui.widget.picker.q0.c(this.f212215d, drawable);
        com.tencent.mm.ui.widget.picker.q0.c(this.f212216e, drawable);
        android.widget.NumberPicker numberPicker = this.f212215d;
        if (numberPicker != null) {
            numberPicker.setOnValueChangedListener(new com.tencent.mm.ui.widget.picker.e(this));
        }
        android.widget.NumberPicker numberPicker2 = this.f212216e;
        if (numberPicker2 != null) {
            numberPicker2.setOnValueChangedListener(new com.tencent.mm.ui.widget.picker.f(this));
        }
        com.tencent.mm.ui.widget.picker.q0.e(this.f212215d);
        com.tencent.mm.ui.widget.picker.q0.e(this.f212216e);
    }

    public final android.widget.NumberPicker b(java.lang.String str) {
        try {
            java.lang.Object a17 = new com.tencent.mm.ui.ak(this, "mDelegate", null).a();
            if (a17 != null) {
                return (android.widget.NumberPicker) new com.tencent.mm.ui.ak(a17, str, null).a();
            }
            return null;
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.mm.ui.yk.d("CustomTimePicker", e17, "super_getNumberPickerApi21 IllegalAccessException", new java.lang.Object[0]);
            return null;
        } catch (java.lang.NoSuchFieldException e18) {
            com.tencent.mm.ui.yk.d("CustomTimePicker", e18, "super_getNumberPickerApi21 NoSuchFieldException", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.ui.widget.picker.q0.a(this.f212215d);
        com.tencent.mm.ui.widget.picker.q0.a(this.f212216e);
    }

    public CustomTimePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212217f = -1;
        this.f212218g = -1;
        this.f212219h = -1;
        this.f212220i = -1;
        a();
    }
}
