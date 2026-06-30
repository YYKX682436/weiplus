package tl5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f420330a;

    /* renamed from: b, reason: collision with root package name */
    public final int f420331b;

    /* renamed from: c, reason: collision with root package name */
    public final long f420332c;

    public a(int i17, int i18, long j17) {
        this.f420330a = i17;
        this.f420331b = i18;
        this.f420332c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl5.a)) {
            return false;
        }
        tl5.a aVar = (tl5.a) obj;
        return this.f420330a == aVar.f420330a && this.f420331b == aVar.f420331b && this.f420332c == aVar.f420332c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f420330a) * 31) + java.lang.Integer.hashCode(this.f420331b)) * 31) + java.lang.Long.hashCode(this.f420332c);
    }

    public java.lang.String toString() {
        return "AnchorInfo(adapterPosition=" + this.f420330a + ", offset=" + this.f420331b + ", stableId=" + this.f420332c + ')';
    }
}
