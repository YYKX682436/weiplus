package r16;

/* loaded from: classes14.dex */
public abstract class b0 {
    public static final java.util.Collection a(java.util.Collection collection, yz5.l descriptorByHandle) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(collection);
        o26.u a17 = o26.u.f342614f.a();
        while (!linkedList.isEmpty()) {
            java.lang.Object X = kz5.n0.X(linkedList);
            o26.u a18 = o26.u.f342614f.a();
            java.util.Collection g17 = r16.x.g(X, linkedList, descriptorByHandle, new r16.a0(a18));
            if (((java.util.ArrayList) g17).size() == 1 && a18.isEmpty()) {
                java.lang.Object y07 = kz5.n0.y0(g17);
                kotlin.jvm.internal.o.f(y07, "single(...)");
                a17.add(y07);
            } else {
                java.lang.Object s17 = r16.x.s(g17, descriptorByHandle);
                kotlin.jvm.internal.o.f(s17, "selectMostSpecificMember(...)");
                o06.b bVar = (o06.b) descriptorByHandle.invoke(s17);
                for (java.lang.Object obj : g17) {
                    kotlin.jvm.internal.o.d(obj);
                    if (!r16.x.k(bVar, (o06.b) descriptorByHandle.invoke(obj))) {
                        a18.add(obj);
                    }
                }
                if (!a18.isEmpty()) {
                    a17.addAll(a18);
                }
                a17.add(s17);
            }
        }
        return a17;
    }
}
