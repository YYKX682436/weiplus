package m91;

/* loaded from: classes7.dex */
public final class h implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final m91.h f324954d = new m91.h();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        m91.g gVar = (m91.g) obj;
        m91.g gVar2 = (m91.g) obj2;
        if (kotlin.jvm.internal.o.b(gVar, gVar2)) {
            return 0;
        }
        return gVar.hashCode() - gVar2.hashCode();
    }
}
