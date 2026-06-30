package g31;

/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f268108a;

    /* renamed from: b, reason: collision with root package name */
    public long f268109b;

    /* renamed from: c, reason: collision with root package name */
    public g31.s f268110c;

    /* renamed from: d, reason: collision with root package name */
    public int f268111d;

    public r(java.lang.String username, long j17, g31.s status, int i17, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 2) != 0 ? 0L : j17;
        status = (i18 & 4) != 0 ? g31.s.f268112d : status;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(status, "status");
        this.f268108a = username;
        this.f268109b = j17;
        this.f268110c = status;
        this.f268111d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31.r)) {
            return false;
        }
        g31.r rVar = (g31.r) obj;
        return kotlin.jvm.internal.o.b(this.f268108a, rVar.f268108a) && this.f268109b == rVar.f268109b && this.f268110c == rVar.f268110c && this.f268111d == rVar.f268111d;
    }

    public int hashCode() {
        return (((((this.f268108a.hashCode() * 31) + java.lang.Long.hashCode(this.f268109b)) * 31) + this.f268110c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f268111d);
    }

    public java.lang.String toString() {
        return "FetchItem(username=" + this.f268108a + ", updateTime=" + this.f268109b + ", status=" + this.f268110c + ", failedCount=" + this.f268111d + ')';
    }
}
