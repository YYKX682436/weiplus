package ns4;

/* loaded from: classes8.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ka7 f339578a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f339579b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f339580c;

    public k4(r45.ka7 halfPageData, yz5.l clickConfirmCallback, yz5.l clickCancelCallback) {
        kotlin.jvm.internal.o.g(halfPageData, "halfPageData");
        kotlin.jvm.internal.o.g(clickConfirmCallback, "clickConfirmCallback");
        kotlin.jvm.internal.o.g(clickCancelCallback, "clickCancelCallback");
        this.f339578a = halfPageData;
        this.f339579b = clickConfirmCallback;
        this.f339580c = clickCancelCallback;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns4.k4)) {
            return false;
        }
        ns4.k4 k4Var = (ns4.k4) obj;
        return kotlin.jvm.internal.o.b(this.f339578a, k4Var.f339578a) && kotlin.jvm.internal.o.b(this.f339579b, k4Var.f339579b) && kotlin.jvm.internal.o.b(this.f339580c, k4Var.f339580c);
    }

    public int hashCode() {
        return (((this.f339578a.hashCode() * 31) + this.f339579b.hashCode()) * 31) + this.f339580c.hashCode();
    }

    public java.lang.String toString() {
        return "WeCoinSubscriptionAgreementViewParameter(halfPageData=" + this.f339578a + ", clickConfirmCallback=" + this.f339579b + ", clickCancelCallback=" + this.f339580c + ')';
    }
}
