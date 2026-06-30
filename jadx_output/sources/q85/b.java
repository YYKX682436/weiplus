package q85;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f360791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0.t f360792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f360793g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f360794h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f360795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, float f17, z0.t tVar, yz5.a aVar, int i17, int i18) {
        super(2);
        this.f360790d = str;
        this.f360791e = f17;
        this.f360792f = tVar;
        this.f360793g = aVar;
        this.f360794h = i17;
        this.f360795i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        q85.c.a(this.f360790d, this.f360791e, this.f360792f, this.f360793g, (n0.o) obj, this.f360794h | 1, this.f360795i);
        return jz5.f0.f302826a;
    }
}
