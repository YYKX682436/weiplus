package ej1;

/* loaded from: classes7.dex */
public final class e implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final ej1.e f253277d = new ej1.e();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        ej1.d dVar = (ej1.d) obj;
        ej1.d dVar2 = (ej1.d) obj2;
        if (kotlin.jvm.internal.o.b(dVar, dVar2)) {
            return 0;
        }
        return dVar.hashCode() - dVar2.hashCode();
    }
}
