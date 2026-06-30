package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.qt2 f125467a;

    /* renamed from: b, reason: collision with root package name */
    public final so2.j5 f125468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125469c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125470d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.report.a3 f125471e;

    public y2(r45.qt2 qt2Var, so2.j5 j5Var, int i17, int i18, com.tencent.mm.plugin.finder.report.a3 type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f125467a = qt2Var;
        this.f125468b = j5Var;
        this.f125469c = i17;
        this.f125470d = i18;
        this.f125471e = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.report.y2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.report.y2 y2Var = (com.tencent.mm.plugin.finder.report.y2) obj;
        return kotlin.jvm.internal.o.b(this.f125467a, y2Var.f125467a) && kotlin.jvm.internal.o.b(this.f125468b, y2Var.f125468b) && this.f125469c == y2Var.f125469c && this.f125470d == y2Var.f125470d && this.f125471e == y2Var.f125471e;
    }

    public int hashCode() {
        r45.qt2 qt2Var = this.f125467a;
        int hashCode = (qt2Var == null ? 0 : qt2Var.hashCode()) * 31;
        so2.j5 j5Var = this.f125468b;
        return ((((((hashCode + (j5Var != null ? j5Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f125469c)) * 31) + java.lang.Integer.hashCode(this.f125470d)) * 31) + this.f125471e.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_context_id=");
        r45.qt2 qt2Var = this.f125467a;
        sb6.append(qt2Var != null ? qt2Var.getString(1) : null);
        sb6.append(",feed=");
        sb6.append(com.tencent.mm.plugin.finder.report.c3.f124978a.b(this.f125468b));
        sb6.append(",playPercent=");
        sb6.append(this.f125469c);
        sb6.append(",count=");
        sb6.append(this.f125470d);
        sb6.append(",type=");
        sb6.append(this.f125471e);
        return sb6.toString();
    }
}
