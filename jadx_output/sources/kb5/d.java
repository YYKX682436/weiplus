package kb5;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final kb5.d f306248d = new kb5.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            java.util.HashSet hashSet = state.f446320p;
            hashSet.add("weixin");
            hashSet.addAll(c01.e2.i());
            hashSet.addAll(c01.e2.h());
        }
        return jz5.f0.f302826a;
    }
}
