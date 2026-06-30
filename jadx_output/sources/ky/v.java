package ky;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f313440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f313441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f313443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z0.t tVar, boolean z17, int i17, int i18) {
        super(2);
        this.f313440d = tVar;
        this.f313441e = z17;
        this.f313442f = i17;
        this.f313443g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f313442f | 1;
        ky.w.a(this.f313440d, this.f313441e, (n0.o) obj, i17, this.f313443g);
        return jz5.f0.f302826a;
    }
}
