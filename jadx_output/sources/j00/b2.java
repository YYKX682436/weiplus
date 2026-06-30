package j00;

/* loaded from: classes9.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f296718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f296719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f296720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296721g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296722h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f296723i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c00.j3 j3Var, boolean z17, bw5.x7 x7Var, int i17, java.lang.String str, long j17) {
        super(0);
        this.f296718d = j3Var;
        this.f296719e = z17;
        this.f296720f = x7Var;
        this.f296721g = i17;
        this.f296722h = str;
        this.f296723i = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j00.d dVar = j00.d.f296739a;
        c00.j3 j3Var = this.f296718d;
        int i17 = j3Var.f36993b.f36969c;
        boolean z17 = this.f296719e;
        bw5.x7 tmpInfo = this.f296720f;
        kotlin.jvm.internal.o.f(tmpInfo, "$tmpInfo");
        dVar.a(i17, 2, z17, tmpInfo, dVar.b(j3Var, this.f296719e, this.f296721g, this.f296722h), this.f296723i);
        return jz5.f0.f302826a;
    }
}
