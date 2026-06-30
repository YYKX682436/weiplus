package tz0;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f423176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tz0.l f423177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tz0.k f423178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f423179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f423180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z0.t tVar, tz0.l lVar, tz0.k kVar, int i17, int i18) {
        super(2);
        this.f423176d = tVar;
        this.f423177e = lVar;
        this.f423178f = kVar;
        this.f423179g = i17;
        this.f423180h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        tz0.e.a(this.f423176d, this.f423177e, this.f423178f, (n0.o) obj, this.f423179g | 1, this.f423180h);
        return jz5.f0.f302826a;
    }
}
