package l95;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f317411a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f317412b = new java.util.ArrayDeque();

    public synchronized java.lang.Object a(android.os.Looper looper) {
        return ((java.util.ArrayDeque) this.f317412b).size() != 0 ? ((java.util.ArrayDeque) this.f317412b).poll() : null;
    }

    public synchronized void b(android.os.Looper looper) {
        if (this.f317411a.containsKey(looper)) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f317411a.remove(looper);
            if (((java.util.ArrayDeque) this.f317412b).size() < 40) {
                ((java.util.ArrayDeque) this.f317412b).addAll(linkedList);
            }
        }
    }

    public synchronized void c(android.os.Looper looper, java.lang.Object obj) {
        java.util.LinkedList linkedList;
        if (this.f317411a.containsKey(looper)) {
            linkedList = (java.util.LinkedList) this.f317411a.get(looper);
        } else {
            linkedList = new java.util.LinkedList();
            this.f317411a.put(looper, linkedList);
        }
        if (linkedList.size() < 20) {
            linkedList.add(obj);
        }
    }
}
