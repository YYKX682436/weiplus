package pr;

/* loaded from: classes15.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.k0 f357705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(pr.k0 k0Var) {
        super(0);
        this.f357705d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f357705d.f357738k.iterator();
        while (it.hasNext()) {
            ((pr.e0) it.next()).a(0);
        }
        return jz5.f0.f302826a;
    }
}
