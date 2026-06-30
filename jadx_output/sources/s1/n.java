package s1;

/* loaded from: classes14.dex */
public final class n implements s1.p {
    @Override // s1.p
    public long a(long j17, long j18) {
        if (d1.k.d(j17) <= d1.k.d(j18) && d1.k.b(j17) <= d1.k.b(j18)) {
            return s1.y1.a(1.0f, 1.0f);
        }
        float min = java.lang.Math.min(d1.k.d(j18) / d1.k.d(j17), d1.k.b(j18) / d1.k.b(j17));
        return s1.y1.a(min, min);
    }
}
