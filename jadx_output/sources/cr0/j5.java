package cr0;

/* loaded from: classes12.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final cr0.j5 f221661d = new cr0.j5();

    public j5() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Number number = (java.lang.Number) it.f302841d;
        sb6.append(number.intValue());
        sb6.append(':');
        wh.t1 e17 = wh.u1.e(android.os.Process.myPid(), number.intValue());
        sb6.append(e17 != null ? e17.f445873a : null);
        return sb6.toString();
    }
}
