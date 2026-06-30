package nx0;

/* loaded from: classes5.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.b3 f341152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.a3 f341153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f341154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(nx0.b3 b3Var, nx0.a3 a3Var, int i17) {
        super(0);
        this.f341152d = b3Var;
        this.f341153e = a3Var;
        this.f341154f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nx0.b3 b3Var = this.f341152d;
        if (b3Var.f341079e) {
            b3Var.f341080f = true;
            nx0.a3 a3Var = this.f341153e;
            java.util.List list = a3Var.f341066d;
            int i17 = this.f341154f;
            ((nx0.b3) list.get(i17)).f341079e = false;
            a3Var.notifyItemChanged(i17);
        }
        return jz5.f0.f302826a;
    }
}
