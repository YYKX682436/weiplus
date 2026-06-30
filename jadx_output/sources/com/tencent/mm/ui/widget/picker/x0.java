package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class x0 extends com.tencent.mm.ui.widget.picker.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.NumberPicker f212342d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.NumberPicker f212343e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.NumberPicker f212344f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f212345g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.EditText f212346h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.EditText f212347i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.EditText f212348j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.CalendarView f212349k;

    /* renamed from: l, reason: collision with root package name */
    public final java.text.DateFormat f212350l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String[] f212351m;

    /* renamed from: n, reason: collision with root package name */
    public int f212352n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.Calendar f212353o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Calendar f212354p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.Calendar f212355q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Calendar f212356r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f212357s;

    public x0(com.tencent.mm.ui.widget.picker.YADatePicker yADatePicker, android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(yADatePicker, context);
        android.widget.LinearLayout linearLayout;
        this.f212350l = new java.text.SimpleDateFormat("MM/dd/yyyy");
        this.f212357s = true;
        this.f212332a = yADatePicker;
        this.f212333b = context;
        a(java.util.Locale.getDefault());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463099f, i17, i18);
        boolean z17 = obtainStyledAttributes.getBoolean(16, true);
        boolean z18 = obtainStyledAttributes.getBoolean(1, true);
        int i19 = obtainStyledAttributes.getInt(17, 1900);
        int i27 = obtainStyledAttributes.getInt(5, 2100);
        java.lang.String string = obtainStyledAttributes.getString(15);
        java.lang.String string2 = obtainStyledAttributes.getString(14);
        int resourceId = obtainStyledAttributes.getResourceId(13, com.tencent.mm.R.layout.a3j);
        obtainStyledAttributes.recycle();
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(resourceId, (android.view.ViewGroup) this.f212332a, true);
        com.tencent.mm.ui.widget.picker.v0 v0Var = new com.tencent.mm.ui.widget.picker.v0(this);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) this.f212332a.findViewById(com.tencent.mm.R.id.kvu);
        this.f212345g = linearLayout2;
        android.widget.CalendarView calendarView = (android.widget.CalendarView) this.f212332a.findViewById(com.tencent.mm.R.id.f483534b50);
        this.f212349k = calendarView;
        calendarView.setOnDateChangeListener(new com.tencent.mm.ui.widget.picker.w0(this));
        android.widget.NumberPicker numberPicker = (android.widget.NumberPicker) this.f212332a.findViewById(com.tencent.mm.R.id.cqu);
        this.f212342d = numberPicker;
        numberPicker.setFormatter(new com.tencent.mm.ui.widget.picker.r0());
        numberPicker.setOnLongPressUpdateInterval(100L);
        numberPicker.setOnValueChangedListener(v0Var);
        this.f212346h = com.tencent.mm.ui.widget.picker.q0.b(numberPicker);
        android.widget.NumberPicker numberPicker2 = (android.widget.NumberPicker) this.f212332a.findViewById(com.tencent.mm.R.id.jqd);
        this.f212343e = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(this.f212352n - 1);
        numberPicker2.setDisplayedValues(this.f212351m);
        numberPicker2.setOnLongPressUpdateInterval(200L);
        numberPicker2.setOnValueChangedListener(v0Var);
        this.f212347i = com.tencent.mm.ui.widget.picker.q0.b(numberPicker2);
        android.widget.NumberPicker numberPicker3 = (android.widget.NumberPicker) this.f212332a.findViewById(com.tencent.mm.R.id.pta);
        this.f212344f = numberPicker3;
        numberPicker3.setOnLongPressUpdateInterval(100L);
        numberPicker3.setOnValueChangedListener(v0Var);
        this.f212348j = com.tencent.mm.ui.widget.picker.q0.b(numberPicker3);
        if (z17 || z18) {
            linearLayout = linearLayout2;
            linearLayout.setVisibility(z17 ? 0 : 8);
            calendarView.setVisibility(z18 ? 0 : 8);
        } else {
            linearLayout = linearLayout2;
            linearLayout.setVisibility(0);
        }
        this.f212353o.clear();
        if (android.text.TextUtils.isEmpty(string)) {
            this.f212353o.set(i19, 0, 1);
        } else if (!c(string, this.f212353o)) {
            this.f212353o.set(i19, 0, 1);
        }
        g(this.f212353o.getTimeInMillis());
        this.f212353o.clear();
        if (android.text.TextUtils.isEmpty(string2)) {
            this.f212353o.set(i27, 11, 31);
        } else if (!c(string2, this.f212353o)) {
            this.f212353o.set(i27, 11, 31);
        }
        f(this.f212353o.getTimeInMillis());
        this.f212356r.setTimeInMillis(java.lang.System.currentTimeMillis());
        d(this.f212356r.get(1), this.f212356r.get(2), this.f212356r.get(5));
        i();
        h();
        linearLayout.removeAllViews();
        char[] dateFormatOrder = this.f212332a.getLayoutDirection() == 0 ? new char[]{'y', 'M', 'd'} : android.text.format.DateFormat.getDateFormatOrder(this.f212332a.getContext());
        int length = dateFormatOrder.length;
        for (int i28 = 0; i28 < length; i28++) {
            char c17 = dateFormatOrder[i28];
            if (c17 == 'M') {
                android.widget.NumberPicker numberPicker4 = this.f212343e;
                linearLayout.addView(numberPicker4);
                e(numberPicker4, length, i28);
            } else if (c17 == 'd') {
                android.widget.NumberPicker numberPicker5 = this.f212342d;
                linearLayout.addView(numberPicker5);
                e(numberPicker5, length, i28);
            } else {
                if (c17 != 'y') {
                    throw new java.lang.IllegalArgumentException(java.util.Arrays.toString(dateFormatOrder));
                }
                android.widget.NumberPicker numberPicker6 = this.f212344f;
                linearLayout.addView(numberPicker6);
                e(numberPicker6, length, i28);
            }
        }
        if (this.f212332a.getImportantForAccessibility() == 0) {
            this.f212332a.setImportantForAccessibility(1);
        }
    }

    @Override // com.tencent.mm.ui.widget.picker.t0
    public void a(java.util.Locale locale) {
        if (!locale.equals(this.f212334c)) {
            this.f212334c = locale;
        }
        this.f212353o = b(this.f212353o, locale);
        this.f212354p = b(this.f212354p, locale);
        this.f212355q = b(this.f212355q, locale);
        this.f212356r = b(this.f212356r, locale);
        this.f212352n = this.f212353o.getActualMaximum(2) + 1;
        java.lang.String[] shortMonths = new java.text.DateFormatSymbols().getShortMonths();
        this.f212351m = shortMonths;
        int i17 = 0;
        if (java.lang.Character.isDigit(shortMonths[0].charAt(0))) {
            this.f212351m = new java.lang.String[this.f212352n];
            while (i17 < this.f212352n) {
                int i18 = i17 + 1;
                this.f212351m[i17] = java.lang.String.format("%d", java.lang.Integer.valueOf(i18));
                i17 = i18;
            }
        }
    }

    public final java.util.Calendar b(java.util.Calendar calendar, java.util.Locale locale) {
        if (calendar == null) {
            return java.util.Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public final boolean c(java.lang.String str, java.util.Calendar calendar) {
        try {
            calendar.setTime(this.f212350l.parse(str));
            return true;
        } catch (java.text.ParseException unused) {
            int i17 = com.tencent.mm.ui.widget.picker.YADatePicker.f212238e;
            com.tencent.mm.ui.yk.f("YADatePicker", "Date: " + str + " not in format: MM/dd/yyyy", new java.lang.Object[0]);
            return false;
        }
    }

    public final void d(int i17, int i18, int i19) {
        this.f212356r.set(i17, i18, i19);
        if (this.f212356r.before(this.f212354p)) {
            this.f212356r.setTimeInMillis(this.f212354p.getTimeInMillis());
        } else if (this.f212356r.after(this.f212355q)) {
            this.f212356r.setTimeInMillis(this.f212355q.getTimeInMillis());
        }
    }

    public final void e(android.widget.NumberPicker numberPicker, int i17, int i18) {
        int i19 = i18 < i17 + (-1) ? 5 : 6;
        android.widget.EditText b17 = com.tencent.mm.ui.widget.picker.q0.b(numberPicker);
        if (b17 != null) {
            b17.setImeOptions(i19);
        }
    }

    public void f(long j17) {
        this.f212353o.setTimeInMillis(j17);
        if (this.f212353o.get(1) != this.f212355q.get(1) || this.f212353o.get(6) == this.f212355q.get(6)) {
            this.f212355q.setTimeInMillis(j17);
            this.f212349k.setMaxDate(j17);
            if (this.f212356r.after(this.f212355q)) {
                this.f212356r.setTimeInMillis(this.f212355q.getTimeInMillis());
                h();
            }
            i();
        }
    }

    public void g(long j17) {
        this.f212353o.setTimeInMillis(j17);
        if (this.f212353o.get(1) != this.f212354p.get(1) || this.f212353o.get(6) == this.f212354p.get(6)) {
            this.f212354p.setTimeInMillis(j17);
            this.f212349k.setMinDate(j17);
            if (this.f212356r.before(this.f212354p)) {
                this.f212356r.setTimeInMillis(this.f212354p.getTimeInMillis());
                h();
            }
            i();
        }
    }

    public final void h() {
        this.f212349k.setDate(this.f212356r.getTimeInMillis(), false, false);
    }

    public final void i() {
        boolean equals = this.f212356r.equals(this.f212354p);
        android.widget.NumberPicker numberPicker = this.f212342d;
        android.widget.NumberPicker numberPicker2 = this.f212343e;
        if (equals) {
            numberPicker.setMinValue(this.f212356r.get(5));
            numberPicker.setMaxValue(this.f212356r.getActualMaximum(5));
            numberPicker.setWrapSelectorWheel(false);
            numberPicker2.setDisplayedValues(null);
            numberPicker2.setMinValue(this.f212356r.get(2));
            numberPicker2.setMaxValue(this.f212356r.getActualMaximum(2));
            numberPicker2.setWrapSelectorWheel(false);
        } else if (this.f212356r.equals(this.f212355q)) {
            numberPicker.setMinValue(this.f212356r.getActualMinimum(5));
            numberPicker.setMaxValue(this.f212356r.get(5));
            numberPicker.setWrapSelectorWheel(false);
            numberPicker2.setDisplayedValues(null);
            numberPicker2.setMinValue(this.f212356r.getActualMinimum(2));
            numberPicker2.setMaxValue(this.f212356r.get(2));
            numberPicker2.setWrapSelectorWheel(false);
        } else {
            numberPicker.setMinValue(1);
            numberPicker.setMaxValue(this.f212356r.getActualMaximum(5));
            numberPicker.setWrapSelectorWheel(true);
            numberPicker2.setDisplayedValues(null);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(11);
            numberPicker2.setWrapSelectorWheel(true);
        }
        numberPicker2.setDisplayedValues((java.lang.String[]) java.util.Arrays.copyOfRange(this.f212351m, numberPicker2.getMinValue(), numberPicker2.getMaxValue() + 1));
        int i17 = this.f212354p.get(1);
        android.widget.NumberPicker numberPicker3 = this.f212344f;
        numberPicker3.setMinValue(i17);
        numberPicker3.setMaxValue(this.f212355q.get(1));
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setValue(this.f212356r.get(1));
        numberPicker2.setValue(this.f212356r.get(2));
        numberPicker.setValue(this.f212356r.get(5));
        if (java.lang.Character.isDigit(this.f212351m[0].charAt(0))) {
            this.f212347i.setRawInputType(2);
        }
    }
}
