package so2;

/* loaded from: classes2.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public int f410345a;

    /* renamed from: b, reason: collision with root package name */
    public int f410346b;

    /* renamed from: c, reason: collision with root package name */
    public r45.px2 f410347c;

    public f5(int i17, int i18, r45.px2 px2Var, int i19, kotlin.jvm.internal.i iVar) {
        px2Var = (i19 & 4) != 0 ? null : px2Var;
        this.f410345a = i17;
        this.f410346b = i18;
        this.f410347c = px2Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.f5)) {
            return false;
        }
        so2.f5 f5Var = (so2.f5) obj;
        return this.f410345a == f5Var.f410345a && this.f410346b == f5Var.f410346b && kotlin.jvm.internal.o.b(this.f410347c, f5Var.f410347c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f410345a) * 31) + java.lang.Integer.hashCode(this.f410346b)) * 31;
        r45.px2 px2Var = this.f410347c;
        return hashCode + (px2Var == null ? 0 : px2Var.hashCode());
    }

    public java.lang.String toString() {
        return "FriendTabLikeTipsState(state=" + this.f410345a + ", position=" + this.f410346b + ", tipsShowInfo=" + this.f410347c + ')';
    }
}
