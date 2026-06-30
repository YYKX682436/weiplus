package re2;

/* loaded from: classes3.dex */
public final class y extends re2.z {

    /* renamed from: a, reason: collision with root package name */
    public final long f394503a;

    /* renamed from: b, reason: collision with root package name */
    public final long f394504b;

    public y(long j17, long j18) {
        super(null);
        this.f394503a = j17;
        this.f394504b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re2.y)) {
            return false;
        }
        re2.y yVar = (re2.y) obj;
        return this.f394503a == yVar.f394503a && this.f394504b == yVar.f394504b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f394503a) * 31) + java.lang.Long.hashCode(this.f394504b);
    }

    public java.lang.String toString() {
        return "AnchorLiveStarted(objectId=" + this.f394503a + ", liveId=" + this.f394504b + ')';
    }
}
