package u1;

/* loaded from: classes14.dex */
public final class k1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final u1.k1 f423615d = new u1.k1();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        u1.w a17 = (u1.w) obj;
        u1.w b17 = (u1.w) obj2;
        kotlin.jvm.internal.o.g(a17, "a");
        kotlin.jvm.internal.o.g(b17, "b");
        int i17 = kotlin.jvm.internal.o.i(b17.f423690n, a17.f423690n);
        return i17 != 0 ? i17 : kotlin.jvm.internal.o.i(a17.hashCode(), b17.hashCode());
    }
}
