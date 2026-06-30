package s2;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.f0 f402238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f402239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s2.g0 f402240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f402241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f402242h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f402243i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s2.f0 f0Var, yz5.a aVar, s2.g0 g0Var, yz5.p pVar, int i17, int i18) {
        super(2);
        this.f402238d = f0Var;
        this.f402239e = aVar;
        this.f402240f = g0Var;
        this.f402241g = pVar;
        this.f402242h = i17;
        this.f402243i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        s2.v.a(this.f402238d, this.f402239e, this.f402240f, this.f402241g, (n0.o) obj, this.f402242h | 1, this.f402243i);
        return jz5.f0.f302826a;
    }
}
