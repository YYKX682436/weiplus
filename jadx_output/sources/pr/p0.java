package pr;

/* loaded from: classes15.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.q0 f357763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(pr.q0 q0Var) {
        super(0);
        this.f357763d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f357763d.f357772f.iterator();
        while (it.hasNext()) {
            ((pr.e0) it.next()).a(0);
        }
        return jz5.f0.f302826a;
    }
}
