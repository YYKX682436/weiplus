package pr;

/* loaded from: classes15.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.q0 f357748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr.e0 f357749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(pr.q0 q0Var, pr.e0 e0Var) {
        super(0);
        this.f357748d = q0Var;
        this.f357749e = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pr.q0 q0Var = this.f357748d;
        java.util.LinkedList linkedList = q0Var.f357772f;
        pr.e0 e0Var = this.f357749e;
        if (!linkedList.contains(e0Var)) {
            q0Var.f357772f.add(e0Var);
        }
        return jz5.f0.f302826a;
    }
}
