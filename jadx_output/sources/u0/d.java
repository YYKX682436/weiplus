package u0;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0.i f423402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f423406h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u0.i iVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i17) {
        super(2);
        this.f423402d = iVar;
        this.f423403e = obj;
        this.f423404f = obj2;
        this.f423405g = obj3;
        this.f423406h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o nc6 = (n0.o) obj;
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(nc6, "nc");
        this.f423402d.g(this.f423403e, this.f423404f, this.f423405g, nc6, this.f423406h | 1);
        return jz5.f0.f302826a;
    }
}
