package ya2;

/* loaded from: classes10.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f460584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(zy2.i5 i5Var) {
        super(1);
        this.f460584d = i5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2 = (r45.hc4) obj;
        zy2.i5 i5Var = this.f460584d;
        if (i5Var != null) {
            if (obj2 == null) {
                obj2 = new cl0.g();
            }
            i5Var.a(obj2);
        }
        return jz5.f0.f302826a;
    }
}
