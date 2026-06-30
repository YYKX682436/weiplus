package kw5;

/* loaded from: classes8.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final synchronized kw5.b a(java.lang.String bizName, java.lang.String instanceKey) {
        kw5.b bVar;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(instanceKey, "instanceKey");
        java.lang.String concat = bizName.concat(instanceKey);
        java.util.Map map = kw5.b.f313215c;
        bVar = (kw5.b) ((java.util.LinkedHashMap) map).get(concat);
        if (bVar == null) {
            bVar = new kw5.b(bizName, instanceKey, null);
            map.put(concat, bVar);
        }
        return bVar;
    }
}
