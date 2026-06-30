package u71;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final u71.w f425113d = new u71.w();

    public w() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String msg = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(msg, "msg");
        jx3.f.INSTANCE.kvStat(31778, intValue + ',' + intValue2 + ',' + msg);
        return jz5.f0.f302826a;
    }
}
