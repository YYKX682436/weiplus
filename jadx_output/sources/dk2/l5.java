package dk2;

/* loaded from: classes3.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f233716a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f233717b;

    /* renamed from: c, reason: collision with root package name */
    public final long f233718c;

    public l5(long j17, java.util.List comments, long j18) {
        kotlin.jvm.internal.o.g(comments, "comments");
        this.f233716a = j17;
        this.f233717b = comments;
        this.f233718c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.l5)) {
            return false;
        }
        dk2.l5 l5Var = (dk2.l5) obj;
        return this.f233716a == l5Var.f233716a && kotlin.jvm.internal.o.b(this.f233717b, l5Var.f233717b) && this.f233718c == l5Var.f233718c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f233716a) * 31) + this.f233717b.hashCode()) * 31) + java.lang.Long.hashCode(this.f233718c);
    }

    public java.lang.String toString() {
        return "CommentData(liveId=" + this.f233716a + ", comments=" + this.f233717b + ", insertTime=" + this.f233718c + ')';
    }
}
