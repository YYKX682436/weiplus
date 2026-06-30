package p00;

/* loaded from: classes11.dex */
public final class b implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final p00.b f350350d = new p00.b();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        p00.d dVar = (p00.d) obj;
        p00.d dVar2 = (p00.d) obj2;
        int i17 = kotlin.jvm.internal.o.i(dVar.f350357a.f408326a, dVar2.f350357a.f408326a);
        return i17 != 0 ? i17 : dVar.f350357a.f408327b.compareTo(dVar2.f350357a.f408327b);
    }
}
