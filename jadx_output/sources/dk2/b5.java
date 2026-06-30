package dk2;

/* loaded from: classes14.dex */
public final class b5 extends dk2.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.tt4 f233237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(r45.tt4 authInfo) {
        super(null);
        kotlin.jvm.internal.o.g(authInfo, "authInfo");
        this.f233237a = authInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk2.b5) && kotlin.jvm.internal.o.b(this.f233237a, ((dk2.b5) obj).f233237a);
    }

    public int hashCode() {
        return this.f233237a.hashCode();
    }

    public java.lang.String toString() {
        return "Success(authInfo=" + this.f233237a + ')';
    }
}
