package com.tencent.mm.wepicker;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010<\u001a\u00020\r¢\u0006\u0004\b=\u0010>J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010,\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\"\u00100\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006?"}, d2 = {"Lcom/tencent/mm/wepicker/RemindTimePicker;", "Landroid/view/ViewGroup;", "Ljava/util/Calendar;", "calendar", "Ljz5/f0;", "setSelectTime", "getSelectCalendar", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "", "e", "I", "getShowSize", "()I", "setShowSize", "(I)V", "showSize", "f", "getTextColor", "setTextColor", "textColor", "g", "getTextSideColor", "setTextSideColor", "textSideColor", "", "h", "F", "getTextSize", "()F", "setTextSize", "(F)V", "textSize", "i", "getSideOffset", "setSideOffset", "sideOffset", "m", "getMinScaleRate", "setMinScaleRate", "minScaleRate", "n", "getMinAlpha", "setMinAlpha", "minAlpha", "Llq5/b;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Llq5/b;", "getListener", "()Llq5/b;", "setListener", "(Llq5/b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class RemindTimePicker extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

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
    public int f214302o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f214303p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f214304q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Calendar f214305r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Calendar f214306s;

    /* renamed from: t, reason: collision with root package name */
    public final int f214307t;

    /* renamed from: u, reason: collision with root package name */
    public final int f214308u;

    /* renamed from: v, reason: collision with root package name */
    public final int f214309v;

    /* renamed from: w, reason: collision with root package name */
    public final int f214310w;

    /* renamed from: x, reason: collision with root package name */
    public final int f214311x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Vibrator f214312y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemindTimePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final java.util.List a() {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = this.f214307t;
        int i18 = this.f214308u;
        int d17 = d(i17, i18);
        java.util.Calendar calendar = this.f214305r;
        if (calendar.get(5) == this.f214306s.get(5)) {
            arrayList.add(getContext().getString(com.tencent.mm.R.string.lxj));
        }
        arrayList.add(getContext().getString(com.tencent.mm.R.string.lxk));
        arrayList.add(getContext().getString(com.tencent.mm.R.string.lxd));
        java.util.Iterator it = new e06.k(0, 365).iterator();
        int i19 = this.f214309v;
        while (it.hasNext()) {
            if (((kz5.x0) it).b() >= arrayList.size()) {
                if (i17 == calendar.get(1)) {
                    string = getContext().getString(com.tencent.mm.R.string.lxh, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else {
                    android.content.Context context = getContext();
                    java.lang.String format = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 % 100)}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    string = context.getString(com.tencent.mm.R.string.lxg, format, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
                arrayList.add(string);
            }
            i19++;
            if (i19 > d17) {
                i18++;
                if (i18 > 12) {
                    i17++;
                    i18 = 1;
                }
                d17 = d(i17, i18);
                i19 = 1;
            }
        }
        return arrayList;
    }

    public final java.util.List b() {
        e06.k kVar = new e06.k(((java.lang.Number) this.f214304q.get(0)).intValue() == 0 ? this.f214310w : 0, 23);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((kz5.x0) it).b() + getContext().getString(com.tencent.mm.R.string.lxe));
        }
        return arrayList;
    }

    public final java.util.List c() {
        java.util.List list = this.f214304q;
        int i17 = 0;
        if (((java.lang.Number) list.get(0)).intValue() == 0 && ((java.lang.Number) list.get(1)).intValue() == 0) {
            i17 = this.f214311x;
        }
        e06.k kVar = new e06.k(i17, 59);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((kz5.x0) it).b() + getContext().getString(com.tencent.mm.R.string.lxf));
        }
        return arrayList;
    }

    public final int d(int i17, int i18) {
        return i18 == 2 ? (i17 % 400 == 0 || (i17 % 100 != 0 && i17 % 4 == 0)) ? 29 : 28 : kz5.c0.i(4, 6, 9, 11).contains(java.lang.Integer.valueOf(i18)) ? 30 : 31;
    }

    public final lq5.b getListener() {
        return null;
    }

    public final float getMinAlpha() {
        return this.minAlpha;
    }

    public final float getMinScaleRate() {
        return this.minScaleRate;
    }

    public final java.util.Calendar getSelectCalendar() {
        java.lang.Object clone = this.f214306s.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.Calendar");
        java.util.Calendar calendar = (java.util.Calendar) clone;
        java.util.List list = this.f214304q;
        calendar.add(6, ((java.lang.Number) list.get(0)).intValue());
        if (((java.lang.Number) list.get(0)).intValue() == 0) {
            calendar.set(11, ((java.lang.Number) list.get(1)).intValue() + this.f214310w);
        } else {
            calendar.set(11, ((java.lang.Number) list.get(1)).intValue());
        }
        if (((java.lang.Number) list.get(0)).intValue() == 0 && ((java.lang.Number) list.get(1)).intValue() == 0) {
            calendar.set(12, ((java.lang.Number) list.get(2)).intValue() + this.f214311x);
        } else {
            calendar.set(12, ((java.lang.Number) list.get(2)).intValue());
        }
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

    public final java.lang.String getTAG() {
        return this.TAG;
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
            int measuredWidth = (getMeasuredWidth() / 3) + i29;
            ((android.view.View) next).layout(i29, 0, measuredWidth, getMeasuredHeight());
            i29 = measuredWidth;
            i28 = i37;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f214302o = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        int i19 = this.showSize;
        setMeasuredDimension(this.f214302o, (size / i19) * i19);
        measureChildren(i17, i18);
    }

    public final void setListener(lq5.b bVar) {
    }

    public final void setMinAlpha(float f17) {
        this.minAlpha = f17;
    }

    public final void setMinScaleRate(float f17) {
        this.minScaleRate = f17;
    }

    public final void setSelectTime(java.util.Calendar calendar) {
        kotlin.jvm.internal.o.g(calendar, "calendar");
        long timeInMillis = calendar.getTimeInMillis();
        java.util.Calendar curCalendar = this.f214305r;
        long timeInMillis2 = timeInMillis - curCalendar.getTimeInMillis();
        if (timeInMillis2 <= 360000 || timeInMillis2 >= 31536000000L) {
            com.tencent.mm.ui.yk.f(this.TAG, "set time error", new java.lang.Object[0]);
            return;
        }
        kotlin.jvm.internal.o.f(curCalendar, "curCalendar");
        java.util.Iterator it = e06.p.m(curCalendar.get(1), calendar.get(1)).iterator();
        int i17 = 0;
        while (((e06.j) it).hasNext()) {
            int b17 = ((kz5.x0) it).b();
            i17 += (b17 % 400 == 0 || (b17 % 100 != 0 && b17 % 4 == 0)) ? 366 : 365;
        }
        int i18 = (i17 + calendar.get(6)) - curCalendar.get(6);
        java.util.ArrayList arrayList = this.f214303p;
        ((com.tencent.mm.wepicker.WePicker) arrayList.get(0)).g1(a(), i18);
        java.util.List list = this.f214304q;
        list.set(0, java.lang.Integer.valueOf(i18));
        int i19 = calendar.get(11);
        if (i18 == 0) {
            i19 -= this.f214310w;
        }
        ((com.tencent.mm.wepicker.WePicker) arrayList.get(1)).g1(b(), i19);
        list.set(1, java.lang.Integer.valueOf(i19));
        int i27 = (i18 == 0 && i19 == 0) ? calendar.get(12) - this.f214311x : calendar.get(12);
        ((com.tencent.mm.wepicker.WePicker) arrayList.get(2)).g1(c(), i27);
        list.set(2, java.lang.Integer.valueOf(i27));
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
    public RemindTimePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int i18;
        java.util.List a17;
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.RemindTimePicker";
        this.showSize = 5;
        this.textColor = -16777216;
        this.textSideColor = -16777216;
        this.minScaleRate = 0.7f;
        this.minAlpha = 0.3f;
        this.f214303p = new java.util.ArrayList();
        this.f214304q = kz5.c0.k(0, 0, 0);
        this.f214305r = java.util.Calendar.getInstance();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.f214306s = calendar;
        this.f214312y = (android.os.Vibrator) context.getSystemService("vibrator");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463110q);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i19 = obtainStyledAttributes.getInt(2, 5);
        this.showSize = i19;
        if (i19 % 2 != 0 && i19 >= 3) {
            int color = obtainStyledAttributes.getColor(4, -16777216);
            this.textColor = color;
            this.textSideColor = obtainStyledAttributes.getColor(5, color);
            this.textSize = obtainStyledAttributes.getDimension(6, 18 * getResources().getDisplayMetrics().density);
            this.sideOffset = obtainStyledAttributes.getDimension(3, 0.0f);
            this.minScaleRate = obtainStyledAttributes.getDimension(1, 0.7f);
            this.minAlpha = obtainStyledAttributes.getDimension(0, 0.3f);
            obtainStyledAttributes.recycle();
            calendar.add(13, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
            this.f214307t = calendar.get(1);
            this.f214308u = calendar.get(2) + 1;
            this.f214309v = calendar.get(5);
            this.f214310w = calendar.get(11);
            this.f214311x = calendar.get(12);
            for (int i27 = 0; i27 < 3; i27++) {
                com.tencent.mm.wepicker.WePicker wePicker = new com.tencent.mm.wepicker.WePicker(context, null, 0, 6, null);
                wePicker.setTag(java.lang.Integer.valueOf(i27));
                wePicker.setOffset((1 - i27) * this.sideOffset);
                wePicker.setTextSize(this.textSize);
                wePicker.setTextColor(this.textColor);
                wePicker.setTextSideColor(this.textSideColor);
                wePicker.setShowSize(this.showSize);
                wePicker.setMinAlpha(this.minAlpha);
                wePicker.setMinScaleRate(this.minScaleRate);
                wePicker.i(new lq5.a(i27, this, wePicker));
                this.f214303p.add(wePicker);
                addView(wePicker);
            }
            int i28 = this.f214310w;
            int i29 = i28 + 1;
            i29 = this.f214311x >= 56 ? i29 + 1 : i29;
            if (i29 > 23) {
                i29 -= 24;
                i18 = 1;
            } else {
                i18 = 0;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            java.util.List list = this.f214304q;
            list.set(0, valueOf);
            list.set(1, java.lang.Integer.valueOf(i18 == 0 ? i29 - i28 : i29));
            list.set(2, 0);
            int i37 = 0;
            int i38 = 0;
            while (true) {
                if (!(i37 < getChildCount())) {
                    return;
                }
                int i39 = i37 + 1;
                android.view.View childAt = getChildAt(i37);
                if (childAt == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                int i47 = i38 + 1;
                if (i38 >= 0) {
                    if (childAt instanceof com.tencent.mm.wepicker.WePicker) {
                        com.tencent.mm.wepicker.WePicker wePicker2 = (com.tencent.mm.wepicker.WePicker) childAt;
                        if (i38 == 0) {
                            a17 = a();
                        } else if (i38 == 1) {
                            a17 = b();
                        } else if (i38 != 2) {
                            a17 = kz5.p0.f313996d;
                        } else {
                            a17 = c();
                        }
                        wePicker2.g1(a17, ((java.lang.Number) list.get(i38)).intValue());
                    }
                    i37 = i39;
                    i38 = i47;
                } else {
                    kz5.c0.p();
                    throw null;
                }
            }
        } else {
            throw new java.lang.Throwable("dpvDateSize value must be  odd number and must be bigger than 2");
        }
    }
}
