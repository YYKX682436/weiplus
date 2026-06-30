package nx0;

/* loaded from: classes5.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.r1 f341063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.q1 f341064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f341065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(nx0.r1 r1Var, nx0.q1 q1Var, int i17) {
        super(0);
        this.f341063d = r1Var;
        this.f341064e = q1Var;
        this.f341065f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nx0.r1 r1Var = this.f341063d;
        if (r1Var.f341214e) {
            r1Var.f341215f = true;
            nx0.q1 q1Var = this.f341064e;
            java.util.List list = q1Var.f341202d;
            int i17 = this.f341065f;
            ((nx0.r1) list.get(i17)).f341214e = false;
            q1Var.notifyItemChanged(i17);
        }
        return jz5.f0.f302826a;
    }
}
