package nv2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f340577a;

    /* renamed from: b, reason: collision with root package name */
    public final nv2.x f340578b;

    /* renamed from: c, reason: collision with root package name */
    public final nv2.x f340579c;

    /* renamed from: d, reason: collision with root package name */
    public final nv2.x f340580d;

    public s(java.lang.String username, nv2.x followRecorder, nv2.x noSeeAuthorRecorder, nv2.x noSeeFriendRecorder) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(followRecorder, "followRecorder");
        kotlin.jvm.internal.o.g(noSeeAuthorRecorder, "noSeeAuthorRecorder");
        kotlin.jvm.internal.o.g(noSeeFriendRecorder, "noSeeFriendRecorder");
        this.f340577a = username;
        this.f340578b = followRecorder;
        this.f340579c = noSeeAuthorRecorder;
        this.f340580d = noSeeFriendRecorder;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv2.s)) {
            return false;
        }
        nv2.s sVar = (nv2.s) obj;
        return kotlin.jvm.internal.o.b(this.f340577a, sVar.f340577a) && kotlin.jvm.internal.o.b(this.f340578b, sVar.f340578b) && kotlin.jvm.internal.o.b(this.f340579c, sVar.f340579c) && kotlin.jvm.internal.o.b(this.f340580d, sVar.f340580d);
    }

    public int hashCode() {
        return (((((this.f340577a.hashCode() * 31) + this.f340578b.hashCode()) * 31) + this.f340579c.hashCode()) * 31) + this.f340580d.hashCode();
    }

    public java.lang.String toString() {
        return "RecorderStore(username=" + this.f340577a + ", followRecorder=" + this.f340578b + ", noSeeAuthorRecorder=" + this.f340579c + ", noSeeFriendRecorder=" + this.f340580d + ')';
    }
}
