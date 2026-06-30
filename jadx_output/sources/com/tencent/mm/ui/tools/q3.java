package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f210648a;

    /* renamed from: b, reason: collision with root package name */
    public final float f210649b;

    /* renamed from: c, reason: collision with root package name */
    public final float f210650c;

    /* renamed from: d, reason: collision with root package name */
    public final float f210651d;

    /* renamed from: e, reason: collision with root package name */
    public final float f210652e;

    /* renamed from: f, reason: collision with root package name */
    public final float f210653f;

    /* renamed from: g, reason: collision with root package name */
    public final float f210654g;

    public q3(float f17, float f18, float f19, float f27, float f28, float f29, float f37) {
        this.f210648a = f17;
        this.f210649b = f18;
        this.f210650c = f19;
        this.f210651d = f27;
        this.f210652e = f28;
        this.f210653f = f29;
        this.f210654g = f37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.tools.q3)) {
            return false;
        }
        com.tencent.mm.ui.tools.q3 q3Var = (com.tencent.mm.ui.tools.q3) obj;
        return java.lang.Float.compare(this.f210648a, q3Var.f210648a) == 0 && java.lang.Float.compare(this.f210649b, q3Var.f210649b) == 0 && java.lang.Float.compare(this.f210650c, q3Var.f210650c) == 0 && java.lang.Float.compare(this.f210651d, q3Var.f210651d) == 0 && java.lang.Float.compare(this.f210652e, q3Var.f210652e) == 0 && java.lang.Float.compare(this.f210653f, q3Var.f210653f) == 0 && java.lang.Float.compare(this.f210654g, q3Var.f210654g) == 0;
    }

    public int hashCode() {
        return (((((((((((java.lang.Float.hashCode(this.f210648a) * 31) + java.lang.Float.hashCode(this.f210649b)) * 31) + java.lang.Float.hashCode(this.f210650c)) * 31) + java.lang.Float.hashCode(this.f210651d)) * 31) + java.lang.Float.hashCode(this.f210652e)) * 31) + java.lang.Float.hashCode(this.f210653f)) * 31) + java.lang.Float.hashCode(this.f210654g);
    }

    public java.lang.String toString() {
        return "ThumbParams(left=" + this.f210648a + ", top=" + this.f210649b + ", width=" + this.f210650c + ", height=" + this.f210651d + ", radius=" + this.f210652e + ", imgWidth=" + this.f210653f + ", imgHeight=" + this.f210654g + ')';
    }
}
