package s2;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s2.b0 b0Var) {
        super(1);
        this.f402234d = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.z childCoordinates = (s1.z) obj;
        kotlin.jvm.internal.o.g(childCoordinates, "childCoordinates");
        s1.z i07 = ((u1.c1) childCoordinates).i0();
        kotlin.jvm.internal.o.d(i07);
        this.f402234d.m(i07);
        return jz5.f0.f302826a;
    }
}
