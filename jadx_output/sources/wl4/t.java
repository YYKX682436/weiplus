package wl4;

/* loaded from: classes11.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl4.u f447102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wl4.u uVar) {
        super(0);
        this.f447102d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b66.n n17 = this.f447102d.n();
        jm4.g3 g3Var = n17 instanceof jm4.g3 ? (jm4.g3) n17 : null;
        if (g3Var != null) {
            urgen.ur_0025.UR_C8FE.UR_6B45(((jm4.h3) g3Var).getCppPointer());
        }
        return jz5.f0.f302826a;
    }
}
