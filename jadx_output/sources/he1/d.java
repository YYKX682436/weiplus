package he1;

/* loaded from: classes15.dex */
public final class d extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f280864c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f280865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String issuerID, java.util.List fields) {
        super(null);
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(fields, "fields");
        this.f280864c = issuerID;
        this.f280865d = fields;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.d)) {
            return false;
        }
        he1.d dVar = (he1.d) obj;
        return kotlin.jvm.internal.o.b(this.f280864c, dVar.f280864c) && kotlin.jvm.internal.o.b(this.f280865d, dVar.f280865d);
    }

    public int hashCode() {
        return (this.f280864c.hashCode() * 31) + this.f280865d.hashCode();
    }

    public java.lang.String toString() {
        return "GetCardInfo(issuerID=" + this.f280864c + ", fields=" + this.f280865d + ')';
    }
}
