package i4;

/* loaded from: classes13.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final i4.g f288355e = new i4.d();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f288356a;

    /* renamed from: d, reason: collision with root package name */
    public final i4.i f288359d;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseBooleanArray f288358c = new android.util.SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f288357b = new x.b();

    public j(java.util.List list, java.util.List list2) {
        this.f288356a = list;
        int size = list.size();
        int i17 = Integer.MIN_VALUE;
        i4.i iVar = null;
        for (int i18 = 0; i18 < size; i18++) {
            i4.i iVar2 = (i4.i) list.get(i18);
            int i19 = iVar2.f288350e;
            if (i19 > i17) {
                iVar = iVar2;
                i17 = i19;
            }
        }
        this.f288359d = iVar;
    }
}
