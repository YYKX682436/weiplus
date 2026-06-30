package qj5;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f363998a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f363999b;

    public r(java.lang.String username, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f363998a = username;
        this.f363999b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj5.r)) {
            return false;
        }
        qj5.r rVar = (qj5.r) obj;
        return kotlin.jvm.internal.o.b(this.f363998a, rVar.f363998a) && this.f363999b == rVar.f363999b;
    }

    public int hashCode() {
        return (this.f363998a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f363999b);
    }

    public java.lang.String toString() {
        return "ShareTarget(username=" + this.f363998a + ", isChatRoom=" + this.f363999b + ')';
    }
}
