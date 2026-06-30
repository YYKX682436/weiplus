package p2;

/* loaded from: classes14.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f351403a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static java.lang.String b(long j17) {
        return a(j17, 0L) ? "Unspecified" : a(j17, 4294967296L) ? "Sp" : a(j17, 8589934592L) ? "Em" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.v) {
            return this.f351403a == ((p2.v) obj).f351403a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f351403a);
    }

    public java.lang.String toString() {
        return b(this.f351403a);
    }
}
