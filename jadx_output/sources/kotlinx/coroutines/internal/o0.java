package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.o0 f310512d = new kotlinx.coroutines.internal.o0();

    public o0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        oz5.i iVar = (oz5.i) obj2;
        if (!(iVar instanceof kotlinx.coroutines.u3)) {
            return obj;
        }
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? iVar : java.lang.Integer.valueOf(intValue + 1);
    }
}
