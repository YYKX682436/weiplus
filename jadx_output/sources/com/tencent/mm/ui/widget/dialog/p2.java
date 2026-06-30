package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes12.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.w2 f211945a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f211946b;

    /* renamed from: c, reason: collision with root package name */
    public int f211947c;

    public p2(java.lang.CharSequence charSequence, int i17) {
        this.f211946b = charSequence == null ? c(i17) : charSequence;
        this.f211947c = i17;
    }

    public abstract int a();

    public java.lang.CharSequence b(int i17) {
        return null;
    }

    public abstract java.lang.CharSequence c(int i17);

    public boolean d(int i17) {
        this.f211947c = i17;
        this.f211946b = c(i17);
        com.tencent.mm.ui.widget.dialog.w2 w2Var = this.f211945a;
        if (w2Var == null) {
            return true;
        }
        w2Var.a(this);
        return true;
    }
}
