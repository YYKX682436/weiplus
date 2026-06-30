package j0;

/* loaded from: classes14.dex */
public final class s4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.s4 f296566d = new j0.s4();

    public s4() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 listSaver = (w0.c0) obj;
        j0.u4 it = (j0.u4) obj2;
        kotlin.jvm.internal.o.g(listSaver, "$this$listSaver");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Float.valueOf(it.a());
        objArr[1] = java.lang.Boolean.valueOf(((b0.y1) ((n0.q4) it.f296587e).getValue()) == b0.y1.Vertical);
        return kz5.c0.i(objArr);
    }
}
