package he1;

/* loaded from: classes15.dex */
public final class a extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f280856c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f280857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String issuerID, java.lang.String actionType) {
        super(null);
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        this.f280856c = issuerID;
        this.f280857d = actionType;
    }

    public final java.lang.String c() {
        java.lang.String str = this.f280857d;
        int hashCode = str.hashCode();
        if (hashCode == -1335458389) {
            return !str.equals("delete") ? "issueCardService" : "deletCardService";
        }
        if (hashCode == -806191449) {
            return !str.equals("recharge") ? "issueCardService" : "rechargeService";
        }
        if (hashCode != 100509913) {
            return "issueCardService";
        }
        str.equals("issue");
        return "issueCardService";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.a)) {
            return false;
        }
        he1.a aVar = (he1.a) obj;
        return kotlin.jvm.internal.o.b(this.f280856c, aVar.f280856c) && kotlin.jvm.internal.o.b(this.f280857d, aVar.f280857d);
    }

    public int hashCode() {
        return (this.f280856c.hashCode() * 31) + this.f280857d.hashCode();
    }

    public java.lang.String toString() {
        return "CheckSupport(issuerID=" + this.f280856c + ", actionType=" + this.f280857d + ')';
    }
}
