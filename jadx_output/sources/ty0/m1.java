package ty0;

/* loaded from: classes14.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f422908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f422909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f422910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f422911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f422912h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f422913i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f422914m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f422915n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i17, boolean z17, float f17, float f18, long j17, float f19, float f27, n0.v2 v2Var) {
        super(1);
        this.f422908d = i17;
        this.f422909e = z17;
        this.f422910f = f17;
        this.f422911g = f18;
        this.f422912h = j17;
        this.f422913i = f19;
        this.f422914m = f27;
        this.f422915n = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i drawBehind = (g1.i) obj;
        kotlin.jvm.internal.o.g(drawBehind, "$this$drawBehind");
        int intValue = ((java.lang.Number) this.f422915n.getValue()).intValue();
        c06.g gVar = new c06.g(intValue, intValue >> 31);
        for (int i17 = 0; i17 < this.f422908d; i17++) {
            float b17 = (this.f422909e ? gVar.b() * 0.9f : 0.0f) + this.f422910f;
            float f17 = this.f422911g;
            float f18 = b17 * f17;
            long j17 = this.f422912h;
            float f19 = this.f422913i;
            g1.h.h(drawBehind, j17, d1.f.a(i17 * f19, f17 - f18), d1.l.a(f19 - this.f422914m, f18 * 2), 0.0f, null, null, 0, 120, null);
        }
        return jz5.f0.f302826a;
    }
}
