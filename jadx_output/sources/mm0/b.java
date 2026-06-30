package mm0;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f328574a = new java.util.concurrent.ConcurrentHashMap();

    public synchronized void a(mm0.g gVar) {
        if (gVar != null) {
            java.lang.CharSequence charSequence = gVar.f328604d;
            if (charSequence != null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) this.f328574a.get(charSequence.toString());
                if (linkedList == null) {
                    linkedList = new java.util.LinkedList();
                }
                linkedList.add(gVar);
                this.f328574a.put(gVar.f328604d.toString(), linkedList);
            }
        }
    }
}
