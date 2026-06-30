package zy2;

/* loaded from: classes10.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    public final long f477444a;

    /* renamed from: b, reason: collision with root package name */
    public int f477445b;

    /* renamed from: c, reason: collision with root package name */
    public int f477446c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f477447d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f477448e;

    public kb(long j17) {
        this.f477444a = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy2.kb) && this.f477444a == ((zy2.kb) obj).f477444a;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f477444a);
    }

    public java.lang.String toString() {
        return "TriggerInfo(localId=" + this.f477444a + ')';
    }
}
