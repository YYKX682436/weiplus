package mm2;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.u0 f329384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.o92 f329385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(mm2.u0 u0Var, r45.o92 o92Var) {
        super(0);
        this.f329384d = u0Var;
        this.f329385e = o92Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.o92 o92Var = this.f329385e;
        mm2.u0 u0Var = this.f329384d;
        u0Var.f329448n = o92Var;
        int i17 = u0Var.f329447m + 1;
        u0Var.f329447m = i17;
        if (i17 >= Integer.MAX_VALUE) {
            u0Var.f329447m = 0;
        }
        u0Var.f329446i.postValue(java.lang.Integer.valueOf(u0Var.f329447m));
        return jz5.f0.f302826a;
    }
}
