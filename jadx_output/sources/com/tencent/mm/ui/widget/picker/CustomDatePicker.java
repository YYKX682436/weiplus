package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class CustomDatePicker extends com.tencent.mm.ui.widget.picker.YADatePicker {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f212183p = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.NumberPicker f212184f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.NumberPicker f212185g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.NumberPicker f212186h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Date f212187i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Date f212188m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Calendar f212189n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String[] f212190o;

    public CustomDatePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        this.f212190o = new java.lang.String[12];
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f212190o;
            if (i17 >= strArr.length) {
                break;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            int i18 = i17 + 1;
            sb6.append(i18);
            strArr[i17] = sb6.toString();
            i17 = i18;
        }
        this.f212189n = java.util.Calendar.getInstance(java.util.Locale.US);
        setCalendarViewShown(false);
        setSpinnersShown(true);
        this.f212184f = ((com.tencent.mm.ui.widget.picker.x0) getUIDelegate()).f212344f;
        this.f212185g = ((com.tencent.mm.ui.widget.picker.x0) getUIDelegate()).f212343e;
        this.f212186h = ((com.tencent.mm.ui.widget.picker.x0) getUIDelegate()).f212342d;
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.drawable.auc);
        com.tencent.mm.ui.widget.picker.q0.c(this.f212184f, drawable);
        com.tencent.mm.ui.widget.picker.q0.c(this.f212185g, drawable);
        com.tencent.mm.ui.widget.picker.q0.c(this.f212186h, drawable);
        com.tencent.mm.ui.widget.picker.q0.d(this.f212184f);
        com.tencent.mm.ui.widget.picker.q0.d(this.f212185g);
        com.tencent.mm.ui.widget.picker.q0.d(this.f212186h);
        com.tencent.mm.ui.widget.picker.q0.f(this.f212184f, getResources().getColor(com.tencent.mm.R.color.a0c));
        com.tencent.mm.ui.widget.picker.q0.f(this.f212185g, getResources().getColor(com.tencent.mm.R.color.a0c));
        com.tencent.mm.ui.widget.picker.q0.f(this.f212186h, getResources().getColor(com.tencent.mm.R.color.a0c));
        com.tencent.mm.ui.widget.picker.a aVar = new com.tencent.mm.ui.widget.picker.a(this);
        android.widget.NumberPicker numberPicker = this.f212184f;
        if (numberPicker != null) {
            numberPicker.setOnValueChangedListener(aVar);
            this.f212184f.setMinValue(1900);
        }
        android.widget.NumberPicker numberPicker2 = this.f212185g;
        if (numberPicker2 != null) {
            numberPicker2.setOnValueChangedListener(aVar);
        }
        android.widget.NumberPicker numberPicker3 = this.f212186h;
        if (numberPicker3 != null) {
            numberPicker3.setOnValueChangedListener(aVar);
        }
        b();
        com.tencent.mm.ui.widget.picker.q0.e(this.f212184f);
        com.tencent.mm.ui.widget.picker.q0.e(this.f212185g);
        com.tencent.mm.ui.widget.picker.q0.e(this.f212186h);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            android.widget.NumberPicker r0 = r5.f212184f
            if (r0 == 0) goto Lde
            android.widget.NumberPicker r0 = r5.f212185g
            if (r0 == 0) goto Lde
            android.widget.NumberPicker r1 = r5.f212186h
            if (r1 != 0) goto Le
            goto Lde
        Le:
            r1 = 0
            r0.setDisplayedValues(r1)
            android.widget.NumberPicker r0 = r5.f212184f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f212184f
            int r1 = r1.getMaxValue()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L4c
            java.util.Date r0 = r5.f212188m
            if (r0 == 0) goto L4c
            android.widget.NumberPicker r1 = r5.f212185g
            int r0 = r0.getMonth()
            r1.setMaxValue(r0)
            android.widget.NumberPicker r0 = r5.f212185g
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f212185g
            int r1 = r1.getMaxValue()
            if (r0 != r1) goto L53
            java.util.Date r0 = r5.f212188m
            if (r0 == 0) goto L53
            android.widget.NumberPicker r1 = r5.f212186h
            int r0 = r0.getDate()
            r1.setMaxValue(r0)
            r0 = r3
            goto L54
        L4c:
            android.widget.NumberPicker r0 = r5.f212185g
            r1 = 11
            r0.setMaxValue(r1)
        L53:
            r0 = r2
        L54:
            if (r0 != 0) goto L73
            android.widget.NumberPicker r0 = r5.f212184f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f212185g
            int r1 = r1.getValue()
            java.util.Calendar r4 = r5.f212189n
            r4.set(r0, r1, r3)
            java.util.Calendar r0 = r5.f212189n
            r1 = 5
            int r0 = r0.getActualMaximum(r1)
            android.widget.NumberPicker r1 = r5.f212186h
            r1.setMaxValue(r0)
        L73:
            android.widget.NumberPicker r0 = r5.f212184f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f212184f
            int r1 = r1.getMinValue()
            if (r0 != r1) goto Lab
            java.util.Date r0 = r5.f212187i
            if (r0 == 0) goto Lab
            android.widget.NumberPicker r1 = r5.f212185g
            int r0 = r0.getMonth()
            r1.setMinValue(r0)
            android.widget.NumberPicker r0 = r5.f212185g
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f212185g
            int r1 = r1.getMinValue()
            if (r0 != r1) goto Lb0
            java.util.Date r0 = r5.f212187i
            if (r0 == 0) goto Lb0
            android.widget.NumberPicker r1 = r5.f212186h
            int r0 = r0.getDate()
            r1.setMinValue(r0)
            r2 = r3
            goto Lb0
        Lab:
            android.widget.NumberPicker r0 = r5.f212185g
            r0.setMinValue(r2)
        Lb0:
            if (r2 != 0) goto Lb7
            android.widget.NumberPicker r0 = r5.f212186h
            r0.setMinValue(r3)
        Lb7:
            android.widget.NumberPicker r0 = r5.f212185g
            java.lang.String[] r1 = r5.f212190o
            int r2 = r0.getMinValue()
            android.widget.NumberPicker r4 = r5.f212185g
            int r4 = r4.getMaxValue()
            int r4 = r4 + r3
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.setDisplayedValues(r1)
            android.widget.NumberPicker r0 = r5.f212184f
            r0.setWrapSelectorWheel(r3)
            android.widget.NumberPicker r0 = r5.f212185g
            r0.setWrapSelectorWheel(r3)
            android.widget.NumberPicker r0 = r5.f212186h
            r0.setWrapSelectorWheel(r3)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.picker.CustomDatePicker.b():void");
    }

    @Override // com.tencent.mm.ui.widget.picker.YADatePicker
    public int getDayOfMonth() {
        android.widget.NumberPicker numberPicker = this.f212186h;
        return numberPicker != null ? numberPicker.getValue() : super.getDayOfMonth();
    }

    @Override // com.tencent.mm.ui.widget.picker.YADatePicker
    public int getMonth() {
        android.widget.NumberPicker numberPicker = this.f212185g;
        return java.lang.Math.max(java.lang.Math.min((numberPicker != null ? numberPicker.getValue() : super.getMonth()) + 1, 12), 0);
    }

    @Override // com.tencent.mm.ui.widget.picker.YADatePicker
    public int getYear() {
        android.widget.NumberPicker numberPicker = this.f212184f;
        return numberPicker != null ? numberPicker.getValue() : super.getYear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.ui.widget.picker.q0.a(this.f212184f);
        com.tencent.mm.ui.widget.picker.q0.a(this.f212185g);
        com.tencent.mm.ui.widget.picker.q0.a(this.f212186h);
    }

    @Override // com.tencent.mm.ui.widget.picker.YADatePicker
    public void setMaxDate(long j17) {
        super.setMaxDate(j17);
        java.util.Date date = new java.util.Date(j17);
        this.f212188m = date;
        android.widget.NumberPicker numberPicker = this.f212184f;
        if (numberPicker != null) {
            numberPicker.setMaxValue(date.getYear() + 1900);
        }
        b();
    }

    @Override // com.tencent.mm.ui.widget.picker.YADatePicker
    public void setMinDate(long j17) {
        super.setMinDate(j17);
        java.util.Date date = new java.util.Date(j17);
        this.f212187i = date;
        android.widget.NumberPicker numberPicker = this.f212184f;
        if (numberPicker != null) {
            numberPicker.setMinValue(date.getYear() + 1900);
        }
    }

    public CustomDatePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
