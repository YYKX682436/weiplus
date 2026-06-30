package oy;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349828a;

    /* renamed from: b, reason: collision with root package name */
    public final long f349829b;

    public l(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f349828a = talker;
        this.f349829b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy.l)) {
            return false;
        }
        oy.l lVar = (oy.l) obj;
        return kotlin.jvm.internal.o.b(this.f349828a, lVar.f349828a) && this.f349829b == lVar.f349829b;
    }

    public int hashCode() {
        return (this.f349828a.hashCode() * 31) + java.lang.Long.hashCode(this.f349829b);
    }

    public java.lang.String toString() {
        return "PlayingInfo(talker=" + this.f349828a + ", msgId=" + this.f349829b + ')';
    }
}
