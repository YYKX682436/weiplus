package ns2;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f339389a = new java.util.LinkedHashMap();

    public final void a(java.lang.Object obj, java.util.Set handlers) {
        kotlin.jvm.internal.o.g(handlers, "handlers");
        java.util.Iterator it = handlers.iterator();
        while (it.hasNext()) {
            ns2.l handler = (ns2.l) it.next();
            kotlin.jvm.internal.o.g(handler, "handler");
            com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleConfig", "groupName:" + obj + " handler:" + handler);
            java.util.Map map = this.f339389a;
            if (map.containsKey(obj)) {
                java.util.Set set = (java.util.Set) ((java.util.LinkedHashMap) map).get(obj);
                if (set != null) {
                    set.add(handler);
                }
            } else {
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(handler);
                map.put(obj, hashSet);
            }
        }
    }
}
