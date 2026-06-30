package com.tencent.mm.wepicker;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0004B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010+\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\"\u0010/\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"¨\u00067"}, d2 = {"Lcom/tencent/mm/wepicker/RemindTimePickerRemake;", "Landroid/view/ViewGroup;", "Ljava/util/Calendar;", "getSelectCalendar", "Llq5/d;", "d", "Llq5/d;", "getListener", "()Llq5/d;", "setListener", "(Llq5/d;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "e", "I", "getShowSize", "()I", "setShowSize", "(I)V", "showSize", "f", "getTextColor", "setTextColor", "textColor", "g", "getTextSideColor", "setTextSideColor", "textSideColor", "", "h", "F", "getTextSize", "()F", "setTextSize", "(F)V", "textSize", "i", "getSideOffset", "setSideOffset", "sideOffset", "m", "getMinScaleRate", "setMinScaleRate", "minScaleRate", "n", "getMinAlpha", "setMinAlpha", "minAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class RemindTimePickerRemake extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public lq5.d listener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int showSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int textColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int textSideColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float textSize;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float sideOffset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float minScaleRate;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float minAlpha;

    /* renamed from: o, reason: collision with root package name */
    public int f214321o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f214322p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f214323q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Calendar f214324r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Calendar f214325s;

    /* renamed from: t, reason: collision with root package name */
    public final int f214326t;

    /* renamed from: u, reason: collision with root package name */
    public final int f214327u;

    /* renamed from: v, reason: collision with root package name */
    public final android.os.Vibrator f214328v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemindTimePickerRemake(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final java.util.List a() {
        e06.k kVar = new e06.k(((java.lang.Number) this.f214323q.get(0)).intValue() == 0 ? this.f214326t : 0, 23);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((kz5.x0) it).b() + getContext().getString(com.tencent.mm.R.string.lxe));
        }
        return arrayList;
    }

    public final java.util.List b() {
        java.util.List list = this.f214323q;
        int i17 = 0;
        if (((java.lang.Number) list.get(0)).intValue() == 0 && ((java.lang.Number) list.get(1)).intValue() == 0) {
            i17 = this.f214327u;
        }
        e06.k kVar = new e06.k(i17, 59);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((kz5.x0) it).b() + getContext().getString(com.tencent.mm.R.string.lxf));
        }
        return arrayList;
    }

    public final int c(int i17, int i18) {
        return i18 == 2 ? (i17 % 400 == 0 || (i17 % 100 != 0 && i17 % 4 == 0)) ? 29 : 28 : kz5.c0.i(4, 6, 9, 11).contains(java.lang.Integer.valueOf(i18)) ? 30 : 31;
    }

    public final java.lang.String d(java.util.Calendar calendar) {
        switch (calendar.get(7)) {
            case 1:
                java.lang.String string = getContext().getString(com.tencent.mm.R.string.oed);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                return string;
            case 2:
                java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.oeb);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                return string2;
            case 3:
                java.lang.String string3 = getContext().getString(com.tencent.mm.R.string.oef);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                return string3;
            case 4:
                java.lang.String string4 = getContext().getString(com.tencent.mm.R.string.oeg);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                return string4;
            case 5:
                java.lang.String string5 = getContext().getString(com.tencent.mm.R.string.oee);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                return string5;
            case 6:
                java.lang.String string6 = getContext().getString(com.tencent.mm.R.string.oea);
                kotlin.jvm.internal.o.f(string6, "getString(...)");
                return string6;
            case 7:
                java.lang.String string7 = getContext().getString(com.tencent.mm.R.string.oec);
                kotlin.jvm.internal.o.f(string7, "getString(...)");
                return string7;
            default:
                return "";
        }
    }

    public final lq5.d getListener() {
        return this.listener;
    }

    public final float getMinAlpha() {
        return this.minAlpha;
    }

    public final float getMinScaleRate() {
        return this.minScaleRate;
    }

    public final java.util.Calendar getSelectCalendar() {
        java.lang.Object clone = this.f214325s.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.Calendar");
        java.util.Calendar calendar = (java.util.Calendar) clone;
        java.util.List list = this.f214323q;
        calendar.add(6, ((java.lang.Number) list.get(0)).intValue());
        if (((java.lang.Number) list.get(0)).intValue() == 0) {
            calendar.set(11, ((java.lang.Number) list.get(1)).intValue() + this.f214326t);
        } else {
            calendar.set(11, ((java.lang.Number) list.get(1)).intValue());
        }
        calendar.set(12, (((java.lang.Number) list.get(0)).intValue() == 0 && ((java.lang.Number) list.get(1)).intValue() == 0) ? (((java.lang.Number) list.get(2)).intValue() * 1) + this.f214327u : ((java.lang.Number) list.get(2)).intValue() * 1);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public final int getShowSize() {
        return this.showSize;
    }

    public final float getSideOffset() {
        return this.sideOffset;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextSideColor() {
        return this.textSideColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        n3.t1 t1Var = new n3.t1(this);
        int i28 = 0;
        int i29 = 0;
        while (t1Var.hasNext()) {
            java.lang.Object next = t1Var.next();
            int i37 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) next;
            if (i28 == 0) {
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479664c2) + dimensionPixelSize;
                view.layout(dimensionPixelSize, 0, dimensionPixelSize2, getMeasuredHeight());
                i29 = dimensionPixelSize2 + getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            } else if (i28 != 1) {
                view.layout(i29, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                int measuredWidth = ((getMeasuredWidth() - i29) / 2) + i29;
                view.layout(i29, 0, measuredWidth, getMeasuredHeight());
                i29 = measuredWidth;
            }
            i28 = i37;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f214321o = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        int i19 = this.showSize;
        setMeasuredDimension(this.f214321o, (size / i19) * i19);
        measureChildren(i17, i18);
    }

    public final void setListener(lq5.d dVar) {
        this.listener = dVar;
    }

    public final void setMinAlpha(float f17) {
        this.minAlpha = f17;
    }

    public final void setMinScaleRate(float f17) {
        this.minScaleRate = f17;
    }

    public final void setShowSize(int i17) {
        this.showSize = i17;
    }

    public final void setSideOffset(float f17) {
        this.sideOffset = f17;
    }

    public final void setTextColor(int i17) {
        this.textColor = i17;
    }

    public final void setTextSideColor(int i17) {
        this.textSideColor = i17;
    }

    public final void setTextSize(float f17) {
        this.textSize = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindTimePickerRemake(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.showSize = 5;
        this.textColor = -16777216;
        this.textSideColor = -16777216;
        this.minScaleRate = 0.7f;
        this.minAlpha = 0.3f;
        this.f214322p = new java.util.ArrayList();
        this.f214323q = kz5.c0.k(0, 0, 0);
        this.f214324r = java.util.Calendar.getInstance();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.f214325s = calendar;
        this.f214328v = (android.os.Vibrator) context.getSystemService("vibrator");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463110q);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i18 = obtainStyledAttributes.getInt(2, 5);
        this.showSize = i18;
        if (i18 % 2 != 0 && i18 >= 3) {
            int color = obtainStyledAttributes.getColor(4, -16777216);
            this.textColor = color;
            this.textSideColor = obtainStyledAttributes.getColor(5, color);
            this.textSize = obtainStyledAttributes.getDimension(6, 18 * getResources().getDisplayMetrics().density);
            this.sideOffset = obtainStyledAttributes.getDimension(3, 0.0f);
            this.minScaleRate = obtainStyledAttributes.getDimension(1, 0.7f);
            this.minAlpha = obtainStyledAttributes.getDimension(0, 0.3f);
            obtainStyledAttributes.recycle();
            calendar.add(13, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
            calendar.get(1);
            calendar.get(2);
            calendar.get(5);
            this.f214326t = calendar.get(11);
            this.f214327u = calendar.get(12);
            for (int i19 = 0; i19 < 3; i19++) {
                com.tencent.mm.wepicker.WePicker wePicker = new com.tencent.mm.wepicker.WePicker(context, null, 0, 6, null);
                wePicker.setTag(java.lang.Integer.valueOf(i19));
                wePicker.setOffset((1 - i19) * this.sideOffset);
                wePicker.setTextSize(this.textSize);
                wePicker.setTextColor(this.textColor);
                wePicker.setTextSideColor(this.textSideColor);
                wePicker.setTextSelectMedium(true);
                wePicker.setShowSize(this.showSize);
                wePicker.setMinAlpha(this.minAlpha);
                wePicker.setMinScaleRate(this.minScaleRate);
                wePicker.i(new lq5.c(i19, this, wePicker));
                this.f214322p.add(wePicker);
                addView(wePicker);
            }
            return;
        }
        throw new java.lang.Throwable("dpvDateSize value must be  odd number and must be bigger than 2");
    }
}
