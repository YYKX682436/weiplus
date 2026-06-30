package r13;

/* loaded from: classes12.dex */
public class d implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final r13.d f368604d = new r13.d();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        int i18;
        p13.y yVar = (p13.y) obj;
        p13.y yVar2 = (p13.y) obj2;
        long j17 = yVar.f351188f;
        long j18 = yVar2.f351188f;
        if (j17 > j18) {
            return -1;
        }
        if (j17 >= j18 && (i17 = yVar.f351185c) >= (i18 = yVar2.f351185c)) {
            return i17 > i18 ? -1 : 0;
        }
        return 1;
    }
}
