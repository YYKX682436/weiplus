package r13;

/* loaded from: classes12.dex */
public class c implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final r13.c f368603d = new r13.c();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        p13.y yVar = (p13.y) obj;
        p13.y yVar2 = (p13.y) obj2;
        int i17 = yVar.f351185c - yVar2.f351185c;
        if (i17 != 0) {
            return i17;
        }
        int i18 = yVar.f351192j - yVar2.f351192j;
        return i18 != 0 ? i18 : yVar.f351193k.compareTo(yVar2.f351193k);
    }
}
