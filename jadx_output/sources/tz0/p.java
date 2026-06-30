package tz0;

/* loaded from: classes14.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f423207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f423208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f423209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f423210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f423211h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f423212i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(float f17, z0.t tVar, long j17, long j18, int i17, int i18) {
        super(2);
        this.f423207d = f17;
        this.f423208e = tVar;
        this.f423209f = j17;
        this.f423210g = j18;
        this.f423211h = i17;
        this.f423212i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        tz0.q.a(this.f423207d, this.f423208e, this.f423209f, this.f423210g, (n0.o) obj, this.f423211h | 1, this.f423212i);
        return jz5.f0.f302826a;
    }
}
