package g31;

/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final k31.a f268129a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f268131c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f268130b = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f268132d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f268133e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f268134f = new g31.x(this);

    public y(k31.a aVar) {
        this.f268129a = aVar;
    }

    public static final void a(g31.y yVar) {
        if (yVar.f268131c) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (g31.r rVar : ((java.util.LinkedHashMap) yVar.f268130b).values()) {
            if (rVar.f268110c == g31.s.f268112d) {
                arrayList.add(rVar);
                if (arrayList.size() >= 10) {
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        yVar.f268131c = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g31.r) it.next()).f268108a);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            g31.r rVar2 = (g31.r) it6.next();
            rVar2.getClass();
            rVar2.f268110c = g31.s.f268113e;
            rVar2.f268109b = java.lang.System.currentTimeMillis();
        }
        new l31.n(yVar.f268129a, arrayList2, new g31.w(yVar, arrayList2)).run();
    }
}
