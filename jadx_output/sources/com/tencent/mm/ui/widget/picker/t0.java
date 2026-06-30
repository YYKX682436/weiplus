package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public abstract class t0 implements com.tencent.mm.ui.widget.picker.u0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.YADatePicker f212332a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f212333b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Locale f212334c;

    public t0(com.tencent.mm.ui.widget.picker.YADatePicker yADatePicker, android.content.Context context) {
        this.f212332a = yADatePicker;
        this.f212333b = context;
        a(java.util.Locale.getDefault());
    }

    public abstract void a(java.util.Locale locale);
}
