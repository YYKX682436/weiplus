package gc0;

/* loaded from: classes5.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f270189a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.b90 f270190b;

    public i3(boolean z17, r45.b90 b90Var) {
        this.f270189a = z17;
        this.f270190b = b90Var;
    }

    public final boolean a() {
        r45.b90 b90Var;
        if (this.f270189a || (b90Var = this.f270190b) == null || b90Var.getInteger(2) == 1 || b90Var.getInteger(2) == 2) {
            return false;
        }
        boolean z17 = b90Var.getInteger(1) >= j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkProfileExposeLimit());
        if (z17) {
            b90Var.set(2, 2);
        }
        return !z17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shownResult[");
        sb6.append(this.f270189a);
        sb6.append(' ');
        r45.b90 b90Var = this.f270190b;
        sb6.append(b90Var != null ? java.lang.Integer.valueOf(b90Var.getInteger(1)) : null);
        sb6.append(' ');
        sb6.append(b90Var != null ? java.lang.Integer.valueOf(b90Var.getInteger(2)) : null);
        sb6.append(']');
        return sb6.toString();
    }
}
