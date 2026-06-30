package fh1;

/* loaded from: classes.dex */
public final class w0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final fh1.w0 f262616d = new fh1.w0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        yz5.a aVar = (yz5.a) obj;
        yz5.a aVar2 = (yz5.a) obj2;
        if (kotlin.jvm.internal.o.b(aVar, aVar2)) {
            return 0;
        }
        return aVar.hashCode() - aVar2.hashCode();
    }
}
