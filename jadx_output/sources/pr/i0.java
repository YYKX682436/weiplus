package pr;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.k0 f357717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr.e0 f357718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pr.k0 k0Var, pr.e0 e0Var) {
        super(0);
        this.f357717d = k0Var;
        this.f357718e = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pr.k0 k0Var = this.f357717d;
        java.util.LinkedList linkedList = k0Var.f357738k;
        pr.e0 e0Var = this.f357718e;
        if (!linkedList.contains(e0Var)) {
            k0Var.f357738k.add(e0Var);
        }
        return jz5.f0.f302826a;
    }
}
