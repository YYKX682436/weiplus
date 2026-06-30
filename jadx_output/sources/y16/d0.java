package y16;

/* loaded from: classes16.dex */
public final class d0 {
    public d0(kotlin.jvm.internal.i iVar) {
    }

    public final y16.s a(java.lang.String message, java.util.Collection types) {
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(types, "types");
        java.util.Collection collection = types;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((f26.o0) it.next()).V());
        }
        o26.q b17 = n26.a.b(arrayList);
        int size = b17.size();
        y16.s cVar = size != 0 ? size != 1 ? new y16.c(message, (y16.s[]) b17.toArray(new y16.s[0]), null) : (y16.s) b17.get(0) : y16.r.f458973b;
        return b17.f342609d <= 1 ? cVar : new y16.h0(message, cVar, null);
    }
}
