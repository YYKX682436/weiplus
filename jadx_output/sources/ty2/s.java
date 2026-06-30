package ty2;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ty2.s f423114d = new ty2.s();

    public s() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : it) {
            if (!(((bw5.o5) obj2).f30951f == 16)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
