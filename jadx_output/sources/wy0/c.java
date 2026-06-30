package wy0;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f450604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f450605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f450606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f450607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f450608h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(float f17, long j17, yz5.p pVar, int i17, int i18) {
        super(2);
        this.f450604d = f17;
        this.f450605e = j17;
        this.f450606f = pVar;
        this.f450607g = i17;
        this.f450608h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        wy0.d.a(this.f450604d, this.f450605e, this.f450606f, (n0.o) obj, this.f450607g | 1, this.f450608h);
        return jz5.f0.f302826a;
    }
}
