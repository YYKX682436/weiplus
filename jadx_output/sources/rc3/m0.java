package rc3;

/* loaded from: classes7.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f394029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f394030i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float[] f394031m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float[] f394032n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(rc3.w0 w0Var, int i17, int i18, int i19, long j17, int[] iArr, float[] fArr, float[] fArr2) {
        super(0);
        this.f394025d = w0Var;
        this.f394026e = i17;
        this.f394027f = i18;
        this.f394028g = i19;
        this.f394029h = j17;
        this.f394030i = iArr;
        this.f394031m = fArr;
        this.f394032n = fArr2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394025d;
        java.lang.String str = w0Var.f394105z;
        int i17 = this.f394026e;
        int i18 = this.f394027f;
        qc3.f fVar = w0Var.A;
        if (fVar != null) {
            fVar.M1(i17, i18, this.f394028g, this.f394029h, this.f394030i, this.f394031m, this.f394032n);
        }
        return jz5.f0.f302826a;
    }
}
