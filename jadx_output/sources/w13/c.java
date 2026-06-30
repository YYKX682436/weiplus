package w13;

/* loaded from: classes.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.Map a(java.util.Map contactLabelMap) {
        kotlin.jvm.internal.o.g(contactLabelMap, "contactLabelMap");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : contactLabelMap.entrySet()) {
            java.util.Iterator it = ((java.lang.Iterable) entry.getValue()).iterator();
            while (it.hasNext()) {
                java.lang.Long valueOf = java.lang.Long.valueOf(((java.lang.Number) it.next()).longValue());
                java.lang.Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new java.util.ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((java.util.List) obj).add(entry.getKey());
            }
        }
        return linkedHashMap;
    }
}
