package vw3;

/* loaded from: classes.dex */
public final class b1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final vw3.b1 f440887d = new vw3.b1();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = ((com.tencent.mm.vfs.x1) obj).f213232b;
        java.lang.String name = ((com.tencent.mm.vfs.x1) obj2).f213232b;
        kotlin.jvm.internal.o.f(name, "name");
        return str.compareTo(name);
    }
}
