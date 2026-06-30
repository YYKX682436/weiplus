package u0;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0.i f423407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f423411h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f423412i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u0.i iVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i17) {
        super(2);
        this.f423407d = iVar;
        this.f423408e = obj;
        this.f423409f = obj2;
        this.f423410g = obj3;
        this.f423411h = obj4;
        this.f423412i = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o nc6 = (n0.o) obj;
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(nc6, "nc");
        this.f423407d.f(this.f423408e, this.f423409f, this.f423410g, this.f423411h, nc6, this.f423412i | 1);
        return jz5.f0.f302826a;
    }
}
