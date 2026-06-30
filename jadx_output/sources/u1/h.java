package u1;

/* loaded from: classes14.dex */
public final class h implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        u1.w l17 = (u1.w) obj;
        u1.w l27 = (u1.w) obj2;
        kotlin.jvm.internal.o.g(l17, "l1");
        kotlin.jvm.internal.o.g(l27, "l2");
        int i17 = kotlin.jvm.internal.o.i(l17.f423690n, l27.f423690n);
        return i17 != 0 ? i17 : kotlin.jvm.internal.o.i(l17.hashCode(), l27.hashCode());
    }
}
