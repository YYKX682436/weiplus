package mm2;

/* loaded from: classes3.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.g4 f329088d = new mm2.g4();

    public g4() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        km2.q user = (km2.q) obj2;
        kotlin.jvm.internal.o.g(user, "user");
        boolean z17 = false;
        if (!user.f309177h && !pm0.v.z((int) user.f309186q, intValue)) {
            int i17 = user.f309181l;
            if (!(i17 == 3 || i17 == 4)) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
