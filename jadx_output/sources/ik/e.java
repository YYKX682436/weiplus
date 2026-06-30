package ik;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ik.e f291820d = new ik.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list = ik.d.f291819a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((kz5.h) list).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((wj.t0) next).f446520f) {
                arrayList.add(next);
            }
        }
        return kz5.n0.S0(arrayList);
    }
}
