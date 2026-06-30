package p10;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final p10.a f350927d = new p10.a();

    public a() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        l0.e5.c("bizName", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, oVar, 6, 0, 65534);
        return jz5.f0.f302826a;
    }
}
