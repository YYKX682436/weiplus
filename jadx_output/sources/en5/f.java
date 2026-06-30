package en5;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1.c f255392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f255393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f255394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f255397i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h1.c cVar, float f17, float f18, java.lang.String str, int i17, int i18) {
        super(2);
        this.f255392d = cVar;
        this.f255393e = f17;
        this.f255394f = f18;
        this.f255395g = str;
        this.f255396h = i17;
        this.f255397i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        en5.g.b(this.f255392d, this.f255393e, this.f255394f, this.f255395g, (n0.o) obj, this.f255396h | 1, this.f255397i);
        return jz5.f0.f302826a;
    }
}
