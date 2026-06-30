package sl5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f409298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f409299b;

    /* renamed from: c, reason: collision with root package name */
    public final long f409300c;

    /* renamed from: d, reason: collision with root package name */
    public final int f409301d;

    /* renamed from: e, reason: collision with root package name */
    public final float f409302e;

    public e(int i17, int i18, long j17, int i19, float f17) {
        this.f409298a = i17;
        this.f409299b = i18;
        this.f409300c = j17;
        this.f409301d = i19;
        this.f409302e = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl5.e)) {
            return false;
        }
        sl5.e eVar = (sl5.e) obj;
        return this.f409298a == eVar.f409298a && this.f409299b == eVar.f409299b && this.f409300c == eVar.f409300c && this.f409301d == eVar.f409301d && java.lang.Float.compare(this.f409302e, eVar.f409302e) == 0;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f409298a) * 31) + java.lang.Integer.hashCode(this.f409299b)) * 31) + java.lang.Long.hashCode(this.f409300c)) * 31) + java.lang.Integer.hashCode(this.f409301d)) * 31) + java.lang.Float.hashCode(this.f409302e);
    }

    public java.lang.String toString() {
        return "Candidate(position=" + this.f409298a + ", offset=" + this.f409299b + ", stableId=" + this.f409300c + ", spanIndex=" + this.f409301d + ", yDistToCenter=" + this.f409302e + ')';
    }
}
