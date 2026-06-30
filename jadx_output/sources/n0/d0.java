package n0;

/* loaded from: classes14.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f333478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f333479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.j4 f333480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(n0.y0 y0Var, java.util.List list, n0.j4 j4Var, n0.u2 u2Var) {
        super(0);
        this.f333478d = y0Var;
        this.f333479e = list;
        this.f333480f = j4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list = this.f333479e;
        n0.j4 j4Var = this.f333480f;
        n0.y0 y0Var = this.f333478d;
        java.util.List list2 = y0Var.f333765f;
        try {
            y0Var.f333765f = list;
            n0.j4 j4Var2 = y0Var.E;
            int[] iArr = y0Var.f333774o;
            y0Var.f333774o = null;
            try {
                y0Var.E = j4Var;
                throw null;
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            y0Var.f333765f = list2;
            throw th6;
        }
    }
}
