package tv0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(tv0.j0 j0Var) {
        super(0);
        this.f422179d = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tv0.j0 j0Var = this.f422179d;
        j0Var.w7().requestLayout();
        j0Var.w7().post(new tv0.z(j0Var));
        return jz5.f0.f302826a;
    }
}
