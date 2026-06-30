package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f191655a;

    /* renamed from: b, reason: collision with root package name */
    public final int f191656b;

    /* renamed from: c, reason: collision with root package name */
    public final int f191657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f191658d;

    /* renamed from: e, reason: collision with root package name */
    public final int f191659e;

    /* renamed from: f, reason: collision with root package name */
    public final int f191660f;

    /* renamed from: g, reason: collision with root package name */
    public final int f191661g;

    /* renamed from: h, reason: collision with root package name */
    public final int f191662h;

    public g7(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f191655a = i17;
        this.f191656b = i18;
        this.f191657c = i19;
        this.f191658d = i27;
        this.f191659e = i28;
        this.f191660f = i29;
        this.f191661g = i37;
        this.f191662h = i38;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.ui.tools.g7)) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.tools.g7 g7Var = (com.tencent.mm.pluginsdk.ui.tools.g7) obj;
        return this.f191655a == g7Var.f191655a && this.f191656b == g7Var.f191656b && this.f191657c == g7Var.f191657c && this.f191658d == g7Var.f191658d && this.f191659e == g7Var.f191659e && this.f191660f == g7Var.f191660f && this.f191661g == g7Var.f191661g && this.f191662h == g7Var.f191662h;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Integer.hashCode(this.f191655a) * 31) + java.lang.Integer.hashCode(this.f191656b)) * 31) + java.lang.Integer.hashCode(this.f191657c)) * 31) + java.lang.Integer.hashCode(this.f191658d)) * 31) + java.lang.Integer.hashCode(this.f191659e)) * 31) + java.lang.Integer.hashCode(this.f191660f)) * 31) + java.lang.Integer.hashCode(this.f191661g)) * 31) + java.lang.Integer.hashCode(this.f191662h);
    }

    public java.lang.String toString() {
        return "SeekbarStyle(playBtnColor=" + this.f191655a + ", seekbarThumbColor=" + this.f191656b + ", seekbarProgressColor=" + this.f191657c + ", seekbarProgressSecondaryColor=" + this.f191658d + ", speedRatioTextColor=" + this.f191659e + ", currentTimeTextColor=" + this.f191660f + ", separatorColor=" + this.f191661g + ", totalTimeTextColor=" + this.f191662h + ')';
    }
}
