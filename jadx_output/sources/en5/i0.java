package en5;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f255434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f255436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255438h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f255439i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(z0.t tVar, java.lang.String str, java.lang.Long l17, java.lang.String str2, int i17, int i18) {
        super(2);
        this.f255434d = tVar;
        this.f255435e = str;
        this.f255436f = l17;
        this.f255437g = str2;
        this.f255438h = i17;
        this.f255439i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        en5.n0.c(this.f255434d, this.f255435e, this.f255436f, this.f255437g, (n0.o) obj, this.f255438h | 1, this.f255439i);
        return jz5.f0.f302826a;
    }
}
