package y1;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final y1.h0 f458717d = new y1.h0();

    public h0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list = (java.util.List) obj;
        java.util.List childValue = (java.util.List) obj2;
        kotlin.jvm.internal.o.g(childValue, "childValue");
        if (list == null) {
            return childValue;
        }
        java.util.List V0 = kz5.n0.V0(list);
        ((java.util.ArrayList) V0).addAll(childValue);
        return V0;
    }
}
