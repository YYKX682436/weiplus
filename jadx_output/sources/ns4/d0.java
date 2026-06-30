package ns4;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.l f339494a;

    /* renamed from: b, reason: collision with root package name */
    public final long f339495b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.js3 f339496c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f339497d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f339498e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f339499f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f339500g;

    public d0(pr4.l consumeParameter, long j17, r45.js3 priceListResp, yz5.l clickBalanceButtonCallback, yz5.l clickCloseButtonCallback, yz5.l clickConsumeButton, yz5.l clickConsumeTips) {
        kotlin.jvm.internal.o.g(consumeParameter, "consumeParameter");
        kotlin.jvm.internal.o.g(priceListResp, "priceListResp");
        kotlin.jvm.internal.o.g(clickBalanceButtonCallback, "clickBalanceButtonCallback");
        kotlin.jvm.internal.o.g(clickCloseButtonCallback, "clickCloseButtonCallback");
        kotlin.jvm.internal.o.g(clickConsumeButton, "clickConsumeButton");
        kotlin.jvm.internal.o.g(clickConsumeTips, "clickConsumeTips");
        this.f339494a = consumeParameter;
        this.f339495b = j17;
        this.f339496c = priceListResp;
        this.f339497d = clickBalanceButtonCallback;
        this.f339498e = clickCloseButtonCallback;
        this.f339499f = clickConsumeButton;
        this.f339500g = clickConsumeTips;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns4.d0)) {
            return false;
        }
        ns4.d0 d0Var = (ns4.d0) obj;
        return kotlin.jvm.internal.o.b(this.f339494a, d0Var.f339494a) && this.f339495b == d0Var.f339495b && kotlin.jvm.internal.o.b(this.f339496c, d0Var.f339496c) && kotlin.jvm.internal.o.b(this.f339497d, d0Var.f339497d) && kotlin.jvm.internal.o.b(this.f339498e, d0Var.f339498e) && kotlin.jvm.internal.o.b(this.f339499f, d0Var.f339499f) && kotlin.jvm.internal.o.b(this.f339500g, d0Var.f339500g);
    }

    public int hashCode() {
        return (((((((((((this.f339494a.hashCode() * 31) + java.lang.Long.hashCode(this.f339495b)) * 31) + this.f339496c.hashCode()) * 31) + this.f339497d.hashCode()) * 31) + this.f339498e.hashCode()) * 31) + this.f339499f.hashCode()) * 31) + this.f339500g.hashCode();
    }

    public java.lang.String toString() {
        return "WeCoinConsumePanelParameter(consumeParameter=" + this.f339494a + ", wecoinBalance=" + this.f339495b + ", priceListResp=" + this.f339496c + ", clickBalanceButtonCallback=" + this.f339497d + ", clickCloseButtonCallback=" + this.f339498e + ", clickConsumeButton=" + this.f339499f + ", clickConsumeTips=" + this.f339500g + ')';
    }
}
