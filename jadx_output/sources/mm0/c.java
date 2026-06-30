package mm0;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final mm0.c f328575b = new mm0.c();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f328576a = new java.util.concurrent.ConcurrentHashMap();

    public void a() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f328576a;
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((mm0.b) it.next()).f328574a.clear();
        }
        concurrentHashMap.clear();
    }

    public mm0.g b(nm0.a aVar, java.lang.CharSequence charSequence) {
        mm0.b bVar;
        mm0.g gVar;
        if (aVar == null || (bVar = (mm0.b) this.f328576a.get(java.lang.Integer.valueOf(aVar.hashCode()))) == null) {
            return null;
        }
        synchronized (bVar) {
            java.util.LinkedList linkedList = (java.util.LinkedList) bVar.f328574a.get(charSequence.toString());
            gVar = (linkedList == null || linkedList.size() == 0) ? null : (mm0.g) linkedList.removeFirst();
        }
        return gVar;
    }

    public void c(nm0.a aVar, mm0.g gVar) {
        if (aVar == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f328576a;
        mm0.b bVar = (mm0.b) concurrentHashMap.get(java.lang.Integer.valueOf(aVar.hashCode()));
        if (bVar != null) {
            bVar.a(gVar);
            concurrentHashMap.put(java.lang.Integer.valueOf(aVar.hashCode()), bVar);
        } else {
            mm0.b bVar2 = new mm0.b();
            bVar2.a(gVar);
            concurrentHashMap.put(java.lang.Integer.valueOf(aVar.hashCode()), bVar2);
        }
    }
}
