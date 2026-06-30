package wh;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final wh.g0 f445783d = new wh.g0();

    public g0() {
        super(2);
    }

    public final java.lang.String a(int i17, float f17) {
        java.lang.String str = java.lang.String.valueOf(a06.d.b(f17)) + "%";
        if (str.length() > i17 - 2) {
            return r26.i0.s("█", i17);
        }
        int length = (i17 - str.length()) / 2;
        return r26.i0.s("█", length) + str + r26.i0.s("█", (i17 - length) - str.length());
    }

    @Override // yz5.p
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return a(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).floatValue());
    }
}
