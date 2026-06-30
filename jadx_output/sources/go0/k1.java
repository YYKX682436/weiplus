package go0;

/* loaded from: classes14.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f273794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(go0.q1 q1Var) {
        super(0);
        this.f273794d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.q1 q1Var = this.f273794d;
        go0.s1 s1Var = q1Var.f273828o;
        if (s1Var != null) {
            s1Var.a();
        }
        rs0.h hVar = q1Var.f273825i;
        if (hVar != null) {
            rs0.i.f399296a.u(hVar);
        }
        if (q1Var.f273831r) {
            q1Var.f273825i = null;
            q1Var.f273830q = false;
        }
        q1Var.f273824h.removeCallbacksAndMessages(null);
        q1Var.f273823g.quitSafely();
        return jz5.f0.f302826a;
    }
}
