package he1;

/* loaded from: classes15.dex */
public final class b extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f280858c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f280859d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280860e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f280861f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f280862g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f280863h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String refundAccountNumber) {
        super(null);
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(orderNo, "orderNo");
        kotlin.jvm.internal.o.g(sign, "sign");
        kotlin.jvm.internal.o.g(timestamp, "timestamp");
        kotlin.jvm.internal.o.g(refundAccountNumber, "refundAccountNumber");
        this.f280858c = issuerID;
        this.f280859d = orderNo;
        this.f280860e = sign;
        this.f280861f = timestamp;
        this.f280862g = refundAccountNumber;
        this.f280863h = true;
    }

    @Override // he1.h
    public java.lang.String a() {
        return com.tencent.tinker.loader.shareutil.ShareConstants.RES_DEL_TITLE + this.f280858c;
    }

    @Override // he1.h
    public boolean b() {
        return this.f280863h;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.b)) {
            return false;
        }
        he1.b bVar = (he1.b) obj;
        return kotlin.jvm.internal.o.b(this.f280858c, bVar.f280858c) && kotlin.jvm.internal.o.b(this.f280859d, bVar.f280859d) && kotlin.jvm.internal.o.b(this.f280860e, bVar.f280860e) && kotlin.jvm.internal.o.b(this.f280861f, bVar.f280861f) && kotlin.jvm.internal.o.b(this.f280862g, bVar.f280862g);
    }

    public int hashCode() {
        return (((((((this.f280858c.hashCode() * 31) + this.f280859d.hashCode()) * 31) + this.f280860e.hashCode()) * 31) + this.f280861f.hashCode()) * 31) + this.f280862g.hashCode();
    }

    public java.lang.String toString() {
        return "DeleteCard(issuerID=" + this.f280858c + ", orderNo=" + this.f280859d + ", sign=" + this.f280860e + ", timestamp=" + this.f280861f + ", refundAccountNumber=" + this.f280862g + ')';
    }
}
