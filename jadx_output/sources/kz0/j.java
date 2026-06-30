package kz0;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f313747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f313748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f313749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f313750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f313751h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f313752i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f313753m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f313754n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s1.o1 o1Var, float f17, boolean z17, s1.o1 o1Var2, s1.o1 o1Var3, s1.o1 o1Var4, int i17, long j17) {
        super(1);
        this.f313747d = o1Var;
        this.f313748e = f17;
        this.f313749f = z17;
        this.f313750g = o1Var2;
        this.f313751h = o1Var3;
        this.f313752i = o1Var4;
        this.f313753m = i17;
        this.f313754n = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.o1 o1Var;
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        s1.o1 o1Var2 = this.f313747d;
        if (o1Var2 != null) {
            s1.n1.b(layout, o1Var2, 0, (int) this.f313748e, 0.0f, 4, null);
        }
        if (this.f313749f && (o1Var = this.f313750g) != null) {
            s1.n1.b(layout, o1Var, 0, p2.c.g(this.f313754n) - o1Var.f402051e, 0.0f, 4, null);
        }
        s1.o1 o1Var3 = this.f313751h;
        if (o1Var3 != null) {
            s1.n1.b(layout, o1Var3, 0, 0, 0.0f, 4, null);
        }
        s1.o1 o1Var4 = this.f313752i;
        if (o1Var4 != null) {
            s1.n1.b(layout, o1Var4, 0, this.f313753m, 0.0f, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
