package u0;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0.i f423395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f423397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u0.i iVar, java.lang.Object obj, int i17) {
        super(2);
        this.f423395d = iVar;
        this.f423396e = obj;
        this.f423397f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o nc6 = (n0.o) obj;
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(nc6, "nc");
        this.f423395d.i(this.f423396e, nc6, this.f423397f | 1);
        return jz5.f0.f302826a;
    }
}
