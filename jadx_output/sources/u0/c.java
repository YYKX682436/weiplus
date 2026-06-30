package u0;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0.i f423398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f423401g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u0.i iVar, java.lang.Object obj, java.lang.Object obj2, int i17) {
        super(2);
        this.f423398d = iVar;
        this.f423399e = obj;
        this.f423400f = obj2;
        this.f423401g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o nc6 = (n0.o) obj;
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(nc6, "nc");
        int i17 = this.f423401g | 1;
        this.f423398d.h(this.f423399e, this.f423400f, nc6, i17);
        return jz5.f0.f302826a;
    }
}
