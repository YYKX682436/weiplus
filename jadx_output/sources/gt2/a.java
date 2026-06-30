package gt2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f275373a;

    /* renamed from: b, reason: collision with root package name */
    public final long f275374b;

    /* renamed from: c, reason: collision with root package name */
    public long f275375c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f275376d;

    public a(int i17, long j17, long j18, r45.qt2 contextObj, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        j17 = (i18 & 2) != 0 ? 0L : j17;
        j18 = (i18 & 4) != 0 ? 0L : j18;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f275373a = i17;
        this.f275374b = j17;
        this.f275375c = j18;
        this.f275376d = contextObj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt2.a)) {
            return false;
        }
        gt2.a aVar = (gt2.a) obj;
        return this.f275373a == aVar.f275373a && this.f275374b == aVar.f275374b && this.f275375c == aVar.f275375c && kotlin.jvm.internal.o.b(this.f275376d, aVar.f275376d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f275373a) * 31) + java.lang.Long.hashCode(this.f275374b)) * 31) + java.lang.Long.hashCode(this.f275375c)) * 31) + this.f275376d.hashCode();
    }

    public java.lang.String toString() {
        return "FinderProcessOut(processId=" + this.f275373a + ", inTime=" + this.f275374b + ", outTime=" + this.f275375c + ", contextObj=" + this.f275376d + ')';
    }
}
