package l2;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f315121a;

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof l2.h) {
            return this.f315121a == ((l2.h) obj).f315121a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f315121a);
    }

    public java.lang.String toString() {
        int i17 = this.f315121a;
        if (i17 == 1) {
            return "Ltr";
        }
        if (i17 == 2) {
            return "Rtl";
        }
        if (i17 == 3) {
            return "Content";
        }
        if (i17 == 4) {
            return "ContentOrLtr";
        }
        return i17 == 5 ? "ContentOrRtl" : "Invalid";
    }
}
