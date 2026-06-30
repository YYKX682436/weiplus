package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f125132a;

    /* renamed from: b, reason: collision with root package name */
    public final long f125133b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125134c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125135d;

    /* renamed from: e, reason: collision with root package name */
    public int f125136e;

    /* renamed from: f, reason: collision with root package name */
    public int f125137f;

    /* renamed from: g, reason: collision with root package name */
    public int f125138g;

    public m4(int i17, long j17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f125132a = i17;
        this.f125133b = j17;
        this.f125134c = i18;
        this.f125135d = i19;
        this.f125136e = i27;
        this.f125137f = i29;
        this.f125138g = i37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.report.m4)) {
            return false;
        }
        com.tencent.mm.plugin.finder.report.m4 m4Var = (com.tencent.mm.plugin.finder.report.m4) obj;
        return this.f125132a == m4Var.f125132a && this.f125133b == m4Var.f125133b && this.f125134c == m4Var.f125134c && this.f125135d == m4Var.f125135d && this.f125136e == m4Var.f125136e && this.f125137f == m4Var.f125137f && this.f125138g == m4Var.f125138g;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Integer.hashCode(this.f125132a) * 31) + java.lang.Long.hashCode(this.f125133b)) * 31) + java.lang.Integer.hashCode(this.f125134c)) * 31) + java.lang.Integer.hashCode(this.f125135d)) * 31) + java.lang.Integer.hashCode(this.f125136e)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(this.f125137f)) * 31) + java.lang.Integer.hashCode(this.f125138g);
    }

    public java.lang.String toString() {
        return "ImageViewInfo(index=" + this.f125132a + ", startExposeMs=" + this.f125133b + ", comeWay=" + this.f125134c + ", viewIdx=" + this.f125135d + ", stayTimeMs=" + this.f125136e + ", isZoomIn=0, isPause=" + this.f125137f + ", isSpeedUp=" + this.f125138g + ')';
    }
}
