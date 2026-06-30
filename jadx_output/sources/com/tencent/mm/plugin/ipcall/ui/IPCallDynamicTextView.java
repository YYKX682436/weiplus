package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes13.dex */
public class IPCallDynamicTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public double f142610d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142611e;

    /* renamed from: f, reason: collision with root package name */
    public double f142612f;

    /* renamed from: g, reason: collision with root package name */
    public double f142613g;

    /* renamed from: h, reason: collision with root package name */
    public final int f142614h;

    /* renamed from: i, reason: collision with root package name */
    public final int f142615i;

    /* renamed from: m, reason: collision with root package name */
    public final java.text.DecimalFormat f142616m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f142617n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f142618o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f142619p;

    public IPCallDynamicTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f142614h = 4000;
        this.f142615i = 50;
        this.f142616m = new java.text.DecimalFormat("0.00");
        this.f142617n = "";
        this.f142618o = "";
        this.f142619p = new com.tencent.mm.plugin.ipcall.ui.t1(this);
        getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.ipcall.ui.u1(this));
    }

    public static void a(com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView iPCallDynamicTextView, double d17) {
        if (d17 == iPCallDynamicTextView.f142613g) {
            iPCallDynamicTextView.setText(iPCallDynamicTextView.f142611e);
            return;
        }
        iPCallDynamicTextView.setText(iPCallDynamicTextView.f142617n + iPCallDynamicTextView.f142616m.format(d17) + iPCallDynamicTextView.f142618o);
    }

    public void b(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            setText(str2);
            return;
        }
        java.lang.String str3 = "";
        for (int i17 = 0; i17 < str.length() && !java.lang.Character.isDigit(str.charAt(i17)); i17++) {
            try {
                str3 = str3 + str.charAt(i17);
            } catch (java.lang.NumberFormatException unused) {
                setText(str2);
                return;
            }
        }
        java.lang.String str4 = "";
        for (int length = str.length() - 1; length > 0 && !java.lang.Character.isDigit(str.charAt(length)); length--) {
            str4 = str4 + str.charAt(length);
        }
        this.f142612f = java.lang.Double.parseDouble(str.substring(str3.length(), str.length() - str4.length()));
        this.f142617n = "";
        for (int i18 = 0; i18 < str2.length() && !java.lang.Character.isDigit(str2.charAt(i18)); i18++) {
            this.f142617n += str2.charAt(i18);
        }
        this.f142618o = "";
        for (int length2 = str2.length() - 1; length2 > 0 && !java.lang.Character.isDigit(str2.charAt(length2)); length2--) {
            this.f142618o += str2.charAt(length2);
        }
        try {
            double parseDouble = java.lang.Double.parseDouble(str2.substring(this.f142617n.length(), str2.length() - this.f142618o.length()));
            this.f142613g = parseDouble;
            this.f142611e = str2;
            double d17 = (parseDouble - this.f142612f) / (this.f142614h / this.f142615i);
            this.f142610d = d17;
            if (d17 == 0.0d) {
                setText(str2);
                return;
            }
            this.f142610d = new java.math.BigDecimal(this.f142610d).setScale(2, 4).doubleValue();
            if (isShown()) {
                this.f142619p.sendEmptyMessage(1);
            }
        } catch (java.lang.NumberFormatException unused2) {
            setText(str2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        getMeasuredHeight();
    }

    public void setLocHeight(int i17) {
    }

    public IPCallDynamicTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f142614h = 4000;
        this.f142615i = 50;
        this.f142616m = new java.text.DecimalFormat("0.00");
        this.f142617n = "";
        this.f142618o = "";
        this.f142619p = new com.tencent.mm.plugin.ipcall.ui.t1(this);
        getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.ipcall.ui.u1(this));
    }
}
