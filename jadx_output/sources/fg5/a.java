package fg5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f262495a;

    /* renamed from: b, reason: collision with root package name */
    public final long f262496b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f262497c;

    public a(long j17, long j18, java.lang.String detailString) {
        kotlin.jvm.internal.o.g(detailString, "detailString");
        this.f262495a = j17;
        this.f262496b = j18;
        this.f262497c = detailString;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg5.a)) {
            return false;
        }
        fg5.a aVar = (fg5.a) obj;
        return this.f262495a == aVar.f262495a && this.f262496b == aVar.f262496b && kotlin.jvm.internal.o.b(this.f262497c, aVar.f262497c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f262495a) * 31) + java.lang.Long.hashCode(this.f262496b)) * 31) + this.f262497c.hashCode();
    }

    public java.lang.String toString() {
        return "UnreadStat(unreadMsgCount=" + this.f262495a + ", unreadSessCount=" + this.f262496b + ", detailString=" + this.f262497c + ')';
    }
}
