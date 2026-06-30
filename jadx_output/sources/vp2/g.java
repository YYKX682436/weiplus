package vp2;

/* loaded from: classes2.dex */
public final class g implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ue1 f438921d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.le1 f438922e;

    public g(r45.ue1 productGroup, r45.le1 aggregationCard) {
        kotlin.jvm.internal.o.g(productGroup, "productGroup");
        kotlin.jvm.internal.o.g(aggregationCard, "aggregationCard");
        this.f438921d = productGroup;
        this.f438922e = aggregationCard;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
