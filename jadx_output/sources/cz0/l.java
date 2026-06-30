package cz0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f224954a = new java.util.LinkedList();

    public final int a() {
        java.lang.Object obj;
        java.util.Iterator it = this.f224954a.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                int i17 = ((cz0.k) next).f224949b;
                do {
                    java.lang.Object next2 = it.next();
                    int i18 = ((cz0.k) next2).f224949b;
                    if (i17 < i18) {
                        next = next2;
                        i17 = i18;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        cz0.k kVar = (cz0.k) obj;
        if (kVar != null) {
            return kVar.f224949b;
        }
        return 0;
    }

    public final boolean b() {
        int a17 = a();
        cz0.y yVar = cz0.y.f224969a;
        return a17 == cz0.y.f224970b;
    }
}
