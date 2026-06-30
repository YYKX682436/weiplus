package j0;

/* loaded from: classes14.dex */
public final class j2 {

    /* renamed from: e, reason: collision with root package name */
    public static final j0.j2 f296377e = new j0.j2(0, false, 0, 0, 15, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f296378a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f296379b;

    /* renamed from: c, reason: collision with root package name */
    public final int f296380c;

    /* renamed from: d, reason: collision with root package name */
    public final int f296381d;

    public j2(int i17, boolean z17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        z17 = (i27 & 2) != 0 ? true : z17;
        i18 = (i27 & 4) != 0 ? 1 : i18;
        i19 = (i27 & 8) != 0 ? 1 : i19;
        this.f296378a = i17;
        this.f296379b = z17;
        this.f296380c = i18;
        this.f296381d = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0.j2)) {
            return false;
        }
        j0.j2 j2Var = (j0.j2) obj;
        if (!(this.f296378a == j2Var.f296378a) || this.f296379b != j2Var.f296379b) {
            return false;
        }
        if (this.f296380c == j2Var.f296380c) {
            return this.f296381d == j2Var.f296381d;
        }
        return false;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f296378a) * 31) + java.lang.Boolean.hashCode(this.f296379b)) * 31) + java.lang.Integer.hashCode(this.f296380c)) * 31) + java.lang.Integer.hashCode(this.f296381d);
    }

    public java.lang.String toString() {
        return "KeyboardOptions(capitalization=" + ((java.lang.Object) g2.r.a(this.f296378a)) + ", autoCorrect=" + this.f296379b + ", keyboardType=" + ((java.lang.Object) g2.s.a(this.f296380c)) + ", imeAction=" + ((java.lang.Object) g2.k.a(this.f296381d)) + ')';
    }
}
