package tt2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f422011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f422013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f422014g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f422015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(tt2.e1 e1Var, int i17, r45.y23 y23Var, int i18, java.lang.Object obj) {
        super(0);
        this.f422011d = e1Var;
        this.f422012e = i17;
        this.f422013f = y23Var;
        this.f422014g = i18;
        this.f422015h = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tt2.e1 e1Var = this.f422011d;
        e1Var.f421885p.set(this.f422012e, new cm2.m0(this.f422013f));
        e1Var.notifyItemChanged(this.f422014g, this.f422015h);
        return jz5.f0.f302826a;
    }
}
