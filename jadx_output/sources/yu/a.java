package yu;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f465753a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f465754b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f465755c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f465756d;

    public a(boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f465753a = z17;
        this.f465754b = z18;
        this.f465755c = z19;
        this.f465756d = z27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu.a)) {
            return false;
        }
        yu.a aVar = (yu.a) obj;
        return this.f465753a == aVar.f465753a && this.f465754b == aVar.f465754b && this.f465755c == aVar.f465755c && this.f465756d == aVar.f465756d;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f465753a) * 31) + java.lang.Boolean.hashCode(this.f465754b)) * 31) + java.lang.Boolean.hashCode(this.f465755c)) * 31) + java.lang.Boolean.hashCode(this.f465756d);
    }

    public java.lang.String toString() {
        return "FileIconConfig(isDarkMode=" + this.f465753a + ", showSimpleIcon=" + this.f465754b + ", isUnfinished=" + this.f465755c + ", isExpired=" + this.f465756d + ')';
    }
}
