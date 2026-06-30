package wl4;

/* loaded from: classes11.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl4.u f447101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wl4.u uVar) {
        super(0);
        this.f447101d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b66.n n17 = this.f447101d.n();
        if (n17 instanceof jm4.g3) {
            urgen.ur_0025.UR_C8FE.UR_4C4D(((jm4.h3) ((jm4.g3) n17)).getCppPointer());
        } else if (n17 != null) {
            urgen.ur_2BA9.UR_C8FE.UR_D25D(((b66.q) n17).getCppPointer());
        }
        return jz5.f0.f302826a;
    }
}
