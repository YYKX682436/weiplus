package wl4;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl4.q f447094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f447095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wl4.q qVar, long j17) {
        super(0);
        this.f447094d = qVar;
        this.f447095e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b66.n n17 = this.f447094d.n();
        if (n17 != null) {
            urgen.ur_2BA9.UR_C8FE.UR_4076(((b66.q) n17).getCppPointer(), this.f447095e);
        }
        return jz5.f0.f302826a;
    }
}
