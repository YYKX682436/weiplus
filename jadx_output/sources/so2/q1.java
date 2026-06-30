package so2;

/* loaded from: classes2.dex */
public final class q1 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.q5 f410545d;

    public q1(bw5.q5 productCard) {
        kotlin.jvm.internal.o.g(productCard, "productCard");
        this.f410545d = productCard;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.q1 ? (so2.q1) obj : null) == null || ((so2.q1) obj).f410545d.f31941d != this.f410545d.f31941d) ? -1 : 0;
    }

    public boolean equals(java.lang.Object obj) {
        so2.q1 q1Var = obj instanceof so2.q1 ? (so2.q1) obj : null;
        return q1Var != null && this.f410545d.f31941d == q1Var.f410545d.f31941d;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410545d.f31941d;
    }

    @Override // in5.c
    public int h() {
        return so2.q1.class.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderFeedProductListItem:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[product_id=");
        bw5.q5 q5Var = this.f410545d;
        sb7.append(q5Var.f31941d);
        sb7.append(", product_name=");
        sb7.append(q5Var.getTitle());
        sb7.append(", selling_price=");
        sb7.append(q5Var.f31946i);
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }
}
