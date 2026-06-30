package mz5;

/* loaded from: classes14.dex */
public final class c implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final mz5.c f333359d = new mz5.c();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable a17 = (java.lang.Comparable) obj;
        java.lang.Comparable b17 = (java.lang.Comparable) obj2;
        kotlin.jvm.internal.o.g(a17, "a");
        kotlin.jvm.internal.o.g(b17, "b");
        return a17.compareTo(b17);
    }

    @Override // java.util.Comparator
    public final java.util.Comparator reversed() {
        return mz5.d.f333360d;
    }
}
