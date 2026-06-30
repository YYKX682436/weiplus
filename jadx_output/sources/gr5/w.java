package gr5;

/* loaded from: classes15.dex */
public final class w implements gr5.n {
    public w(float f17) {
    }

    @Override // gr5.n
    public long a(long j17, long j18) {
        return zq5.s.a(1.0f, 1.0f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.w)) {
            return false;
        }
        ((gr5.w) obj).getClass();
        return java.lang.Float.compare(1.0f, 1.0f) == 0;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(1.0f);
    }

    public java.lang.String toString() {
        return "FixedScale(value=1.0)";
    }
}
