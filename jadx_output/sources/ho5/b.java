package ho5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f282900a;

    /* renamed from: b, reason: collision with root package name */
    public final long f282901b;

    public b(java.lang.String group, long j17) {
        kotlin.jvm.internal.o.g(group, "group");
        this.f282900a = group;
        this.f282901b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho5.b)) {
            return false;
        }
        ho5.b bVar = (ho5.b) obj;
        return kotlin.jvm.internal.o.b(this.f282900a, bVar.f282900a) && this.f282901b == bVar.f282901b;
    }

    public int hashCode() {
        return (this.f282900a.hashCode() * 31) + java.lang.Long.hashCode(this.f282901b);
    }

    public java.lang.String toString() {
        return "MultiTalkMsgCache(group=" + this.f282900a + ", msgId=" + this.f282901b + ')';
    }
}
