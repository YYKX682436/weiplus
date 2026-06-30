package he1;

/* loaded from: classes15.dex */
public final class g extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f280874c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f280875d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280876e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f280877f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f280878g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f280879h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String operation) {
        super(null);
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(orderNo, "orderNo");
        kotlin.jvm.internal.o.g(sign, "sign");
        kotlin.jvm.internal.o.g(timestamp, "timestamp");
        kotlin.jvm.internal.o.g(operation, "operation");
        this.f280874c = issuerID;
        this.f280875d = orderNo;
        this.f280876e = sign;
        this.f280877f = timestamp;
        this.f280878g = operation;
        this.f280879h = true;
    }

    @Override // he1.h
    public java.lang.String a() {
        return "recharge:" + this.f280874c;
    }

    @Override // he1.h
    public boolean b() {
        return this.f280879h;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.g)) {
            return false;
        }
        he1.g gVar = (he1.g) obj;
        return kotlin.jvm.internal.o.b(this.f280874c, gVar.f280874c) && kotlin.jvm.internal.o.b(this.f280875d, gVar.f280875d) && kotlin.jvm.internal.o.b(this.f280876e, gVar.f280876e) && kotlin.jvm.internal.o.b(this.f280877f, gVar.f280877f) && kotlin.jvm.internal.o.b(this.f280878g, gVar.f280878g);
    }

    public int hashCode() {
        return (((((((this.f280874c.hashCode() * 31) + this.f280875d.hashCode()) * 31) + this.f280876e.hashCode()) * 31) + this.f280877f.hashCode()) * 31) + this.f280878g.hashCode();
    }

    public java.lang.String toString() {
        return "Recharge(issuerID=" + this.f280874c + ", orderNo=" + this.f280875d + ", sign=" + this.f280876e + ", timestamp=" + this.f280877f + ", operation=" + this.f280878g + ')';
    }
}
