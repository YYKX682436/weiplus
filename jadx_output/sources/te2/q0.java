package te2;

/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f418340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f418341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gm1 f418343g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f418344h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i17, int i18, te2.p1 p1Var, r45.gm1 gm1Var, yz5.l lVar) {
        super(0);
        this.f418340d = i17;
        this.f418341e = i18;
        this.f418342f = p1Var;
        this.f418343g = gm1Var;
        this.f418344h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f418340d == 0 && this.f418341e == 0) {
            dk2.p Z6 = ((mm2.c1) this.f418342f.f418287e.a(mm2.c1.class)).Z6();
            r45.gm1 gm1Var = this.f418343g;
            Z6.m(gm1Var);
            java.util.LinkedList list = gm1Var.getList(1);
            this.f418344h.invoke(java.lang.Integer.valueOf(list != null ? list.size() : 0));
        }
        return jz5.f0.f302826a;
    }
}
