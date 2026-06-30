package com.tencent.mm.ui.widget.picker;

/* loaded from: classes7.dex */
public final class r0 implements android.widget.NumberPicker.Formatter {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f212326a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f212327b;

    /* renamed from: c, reason: collision with root package name */
    public char f212328c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Formatter f212329d;

    public r0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        this.f212326a = sb6;
        this.f212327b = new java.lang.Object[1];
        this.f212329d = new java.util.Formatter(sb6, java.util.Locale.getDefault());
        this.f212328c = '0';
    }

    @Override // android.widget.NumberPicker.Formatter
    public java.lang.String format(int i17) {
        java.util.Locale locale = java.util.Locale.getDefault();
        char c17 = this.f212328c;
        java.lang.StringBuilder sb6 = this.f212326a;
        if (c17 != '0') {
            this.f212329d = new java.util.Formatter(sb6, locale);
            this.f212328c = '0';
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object[] objArr = this.f212327b;
        objArr[0] = valueOf;
        sb6.delete(0, sb6.length());
        this.f212329d.format("%02d", objArr);
        return this.f212329d.toString();
    }
}
