package un;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final un.t f429326d = new un.t();

    public t() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (((wi5.e) state.a(wi5.e.class)) != null) {
            state.f446314g |= 64;
        }
        if (((wi5.b) state.a(wi5.b.class)) != null) {
            state.f446314g &= -65;
            state.f446319o.clear();
        }
        return jz5.f0.f302826a;
    }
}
