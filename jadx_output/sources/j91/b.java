package j91;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f298347a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f298348b;

    public b(java.lang.String talker, java.lang.String userName) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f298347a = talker;
        this.f298348b = userName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j91.b)) {
            return false;
        }
        j91.b bVar = (j91.b) obj;
        return kotlin.jvm.internal.o.b(this.f298347a, bVar.f298347a) && kotlin.jvm.internal.o.b(this.f298348b, bVar.f298348b);
    }

    public int hashCode() {
        return (this.f298347a.hashCode() * 31) + this.f298348b.hashCode();
    }

    public java.lang.String toString() {
        return this.f298347a + ',' + this.f298348b;
    }
}
