package he1;

/* loaded from: classes15.dex */
public final class f extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f280866c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f280867d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280868e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f280869f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f280870g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f280871h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f280872i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f280873j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String operation, java.lang.String entrustId, java.lang.String paymentMode) {
        super(null);
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(orderNo, "orderNo");
        kotlin.jvm.internal.o.g(sign, "sign");
        kotlin.jvm.internal.o.g(timestamp, "timestamp");
        kotlin.jvm.internal.o.g(operation, "operation");
        kotlin.jvm.internal.o.g(entrustId, "entrustId");
        kotlin.jvm.internal.o.g(paymentMode, "paymentMode");
        this.f280866c = issuerID;
        this.f280867d = orderNo;
        this.f280868e = sign;
        this.f280869f = timestamp;
        this.f280870g = operation;
        this.f280871h = entrustId;
        this.f280872i = paymentMode;
        this.f280873j = true;
    }

    @Override // he1.h
    public java.lang.String a() {
        return "issue:" + this.f280866c;
    }

    @Override // he1.h
    public boolean b() {
        return this.f280873j;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.f)) {
            return false;
        }
        he1.f fVar = (he1.f) obj;
        return kotlin.jvm.internal.o.b(this.f280866c, fVar.f280866c) && kotlin.jvm.internal.o.b(this.f280867d, fVar.f280867d) && kotlin.jvm.internal.o.b(this.f280868e, fVar.f280868e) && kotlin.jvm.internal.o.b(this.f280869f, fVar.f280869f) && kotlin.jvm.internal.o.b(this.f280870g, fVar.f280870g) && kotlin.jvm.internal.o.b(this.f280871h, fVar.f280871h) && kotlin.jvm.internal.o.b(this.f280872i, fVar.f280872i);
    }

    public int hashCode() {
        return (((((((((((this.f280866c.hashCode() * 31) + this.f280867d.hashCode()) * 31) + this.f280868e.hashCode()) * 31) + this.f280869f.hashCode()) * 31) + this.f280870g.hashCode()) * 31) + this.f280871h.hashCode()) * 31) + this.f280872i.hashCode();
    }

    public java.lang.String toString() {
        return "IssueCard(issuerID=" + this.f280866c + ", orderNo=" + this.f280867d + ", sign=" + this.f280868e + ", timestamp=" + this.f280869f + ", operation=" + this.f280870g + ", entrustId=" + this.f280871h + ", paymentMode=" + this.f280872i + ')';
    }
}
