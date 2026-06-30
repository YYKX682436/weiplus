package wy0;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f450618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f450619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f450620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f450621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f450622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List list, z0.t tVar, int i17, int i18, int i19) {
        super(2);
        this.f450618d = list;
        this.f450619e = tVar;
        this.f450620f = i17;
        this.f450621g = i18;
        this.f450622h = i19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        wy0.m.a(this.f450618d, this.f450619e, this.f450620f, (n0.o) obj, this.f450621g | 1, this.f450622h);
        return jz5.f0.f302826a;
    }
}
