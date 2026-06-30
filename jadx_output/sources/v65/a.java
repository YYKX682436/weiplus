package v65;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f433540a;

    /* renamed from: b, reason: collision with root package name */
    public final long f433541b;

    /* renamed from: c, reason: collision with root package name */
    public final long f433542c;

    public a(long j17, long j18, long j19) {
        this.f433540a = j17;
        this.f433541b = j18;
        this.f433542c = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v65.a)) {
            return false;
        }
        v65.a aVar = (v65.a) obj;
        return this.f433540a == aVar.f433540a && this.f433541b == aVar.f433541b && this.f433542c == aVar.f433542c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f433540a) * 31) + java.lang.Long.hashCode(this.f433541b)) * 31) + java.lang.Long.hashCode(this.f433542c);
    }

    public java.lang.String toString() {
        return "CheckCondition(startTime=" + this.f433540a + ", endTime=" + this.f433541b + ", interval=" + this.f433542c + ')';
    }
}
