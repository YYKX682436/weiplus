package rt1;

/* loaded from: classes7.dex */
public final class r1 implements android.text.style.WrapTogetherSpan {

    /* renamed from: e, reason: collision with root package name */
    public static final rt1.q1 f399481e = new rt1.q1(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f399482d;

    public r1(long j17) {
        this.f399482d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt1.r1) && this.f399482d == ((rt1.r1) obj).f399482d;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f399482d);
    }

    public java.lang.String toString() {
        return "TimestampSpan(timestamp=" + this.f399482d + ')';
    }
}
