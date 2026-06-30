package u06;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final u06.u f423530d = new u06.u();

    public u() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String simpleName = ((java.lang.Class) obj).getSimpleName();
        if (!n16.g.l(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return n16.g.k(simpleName);
        }
        return null;
    }
}
