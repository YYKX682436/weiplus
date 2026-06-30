package pr;

/* loaded from: classes15.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.a1 f357794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(pr.a1 a1Var) {
        super(0);
        this.f357794d = a1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        while (true) {
            pr.a1 a1Var = this.f357794d;
            if (a1Var.f357689a.size() <= 0) {
                break;
            }
            java.util.HashMap hashMap = a1Var.f357690b;
            if (hashMap.size() >= 3) {
                break;
            }
            pr.u0 u0Var = (pr.u0) a1Var.f357689a.removeFirst();
            java.lang.String md52 = u0Var.f357792a.getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            hashMap.put(md52, u0Var);
            zq.h.f474972a.c(u0Var.f357792a, a1Var.f357692d);
        }
        return jz5.f0.f302826a;
    }
}
