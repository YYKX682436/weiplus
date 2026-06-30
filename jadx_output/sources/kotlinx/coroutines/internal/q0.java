package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.q0 f310519d = new kotlinx.coroutines.internal.q0();

    public q0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.internal.u0 u0Var = (kotlinx.coroutines.internal.u0) obj;
        oz5.i iVar = (oz5.i) obj2;
        if (iVar instanceof kotlinx.coroutines.u3) {
            kotlinx.coroutines.u3 u3Var = (kotlinx.coroutines.u3) iVar;
            java.lang.Object F = ((kotlinx.coroutines.v0) u3Var).F(u0Var.f310529a);
            int i17 = u0Var.f310532d;
            u0Var.f310530b[i17] = F;
            u0Var.f310532d = i17 + 1;
            u0Var.f310531c[i17] = u3Var;
        }
        return u0Var;
    }
}
