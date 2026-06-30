package ts5;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f421741a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f421742b;

    public p(ts5.a collectWhat, java.lang.String key, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 2) != 0) {
            key = java.util.UUID.randomUUID().toString() + java.util.Calendar.getInstance().getTime();
        }
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        kotlin.jvm.internal.o.g(key, "key");
        this.f421741a = collectWhat;
        this.f421742b = key;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts5.p)) {
            return false;
        }
        ts5.p pVar = (ts5.p) obj;
        return this.f421741a == pVar.f421741a && kotlin.jvm.internal.o.b(this.f421742b, pVar.f421742b);
    }

    public int hashCode() {
        return (this.f421741a.hashCode() * 31) + this.f421742b.hashCode();
    }

    public java.lang.String toString() {
        return "UniqueTag(collectWhat=" + this.f421741a + ", key=" + this.f421742b + ')';
    }
}
