package lb0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f317664a;

    /* renamed from: b, reason: collision with root package name */
    public final long f317665b;

    /* renamed from: c, reason: collision with root package name */
    public final long f317666c;

    public a(boolean z17, long j17, long j18) {
        this.f317664a = z17;
        this.f317665b = j17;
        this.f317666c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb0.a)) {
            return false;
        }
        lb0.a aVar = (lb0.a) obj;
        return this.f317664a == aVar.f317664a && this.f317665b == aVar.f317665b && this.f317666c == aVar.f317666c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f317664a) * 31) + java.lang.Long.hashCode(this.f317665b)) * 31) + java.lang.Long.hashCode(this.f317666c);
    }

    public java.lang.String toString() {
        return "AdEntranceConfig(enable=" + this.f317664a + ", keepTime=" + this.f317665b + ", addTime=" + this.f317666c + ')';
    }
}
