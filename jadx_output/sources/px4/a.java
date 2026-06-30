package px4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final px4.a f358955a = new px4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f358956b = new java.util.ArrayList();

    public void a(int i17, int i18) {
        java.util.ArrayList arrayList = f358956b;
        synchronized (arrayList) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ox4.a) ((zg0.d3) it.next())).a(i17, i18);
            }
        }
    }
}
