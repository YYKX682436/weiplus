package dr4;

/* loaded from: classes14.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final dr4.c1 f242616d = new dr4.c1();

    public c1() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String tag = (java.lang.String) obj;
        java.lang.Runnable task = (java.lang.Runnable) obj2;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(task, "task");
        pq4.c l17 = gq4.v.Bi().l(tag);
        if (l17 == null) {
            return null;
        }
        l17.b(task);
        return jz5.f0.f302826a;
    }
}
