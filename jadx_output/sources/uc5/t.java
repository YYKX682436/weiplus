package uc5;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.t f426547d = new uc5.t();

    public t() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = "(type & 65535) = " + intValue;
        if (intValue == 0) {
            return str;
        }
        return "((type >= " + intValue + " OR type <= " + (-intValue) + ") AND " + str + ')';
    }
}
