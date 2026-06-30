package qt0;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qt0.b f366491a = new qt0.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f366492b = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f366493c = "MicroMsg.DBIndexRegistry";

    public final boolean a(java.lang.String str) {
        java.util.Set set = f366492b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(((qt0.e) next).f366499d, str)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                qt0.e eVar = (qt0.e) it6.next();
                if (!((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) eVar.f366501f).getValue()).getBoolean(eVar.f366502g, false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void b(qt0.e task) {
        kotlin.jvm.internal.o.g(task, "task");
        ((java.util.concurrent.CopyOnWriteArraySet) f366492b).add(task);
    }

    public final boolean c(yz5.a aVar) {
        int i17 = java.util.Calendar.getInstance().get(11);
        boolean z17 = 1 <= i17 && i17 <= 7;
        java.lang.String str = f366493c;
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).h(new qt0.a(aVar), str);
        }
        return z17;
    }
}
