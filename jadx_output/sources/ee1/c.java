package ee1;

/* loaded from: classes4.dex */
public final class c extends ee1.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f251574a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f251575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.List validFpanidList, java.util.List validIssuerIdList) {
        super(null);
        kotlin.jvm.internal.o.g(validFpanidList, "validFpanidList");
        kotlin.jvm.internal.o.g(validIssuerIdList, "validIssuerIdList");
        this.f251574a = validFpanidList;
        this.f251575b = validIssuerIdList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee1.c)) {
            return false;
        }
        ee1.c cVar = (ee1.c) obj;
        return kotlin.jvm.internal.o.b(this.f251574a, cVar.f251574a) && kotlin.jvm.internal.o.b(this.f251575b, cVar.f251575b);
    }

    public int hashCode() {
        return (this.f251574a.hashCode() * 31) + this.f251575b.hashCode();
    }

    public java.lang.String toString() {
        return "Ok(validFpanidList=" + this.f251574a + ", validIssuerIdList=" + this.f251575b + ')';
    }
}
