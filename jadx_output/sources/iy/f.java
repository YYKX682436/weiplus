package iy;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jy.m f295682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jy.k f295683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f295684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f295685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jy.m mVar, jy.k kVar, int i17, int i18) {
        super(2);
        this.f295682d = mVar;
        this.f295683e = kVar;
        this.f295684f = i17;
        this.f295685g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f295684f | 1;
        iy.n.a(this.f295682d, this.f295683e, (n0.o) obj, i17, this.f295685g);
        return jz5.f0.f302826a;
    }
}
