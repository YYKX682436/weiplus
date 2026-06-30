package vz1;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Collection f441654a = new java.util.Vector();

    public void a(java.lang.Object obj, java.lang.Object obj2, vz1.a aVar) {
        if (obj == null || aVar == null) {
            return;
        }
        java.util.Collection collection = f441654a;
        java.util.Iterator it = ((java.util.Vector) collection).iterator();
        if (it != null) {
            while (it.hasNext()) {
                vz1.c cVar = (vz1.c) it.next();
                if (cVar != null && cVar.get() == 0) {
                    it.remove();
                    cVar.f441655a.a(cVar.f441656b);
                }
            }
        }
        java.util.Iterator it6 = ((java.util.Vector) collection).iterator();
        if (it6 != null) {
            while (it6.hasNext()) {
                vz1.c cVar2 = (vz1.c) it6.next();
                if (cVar2 != null && cVar2.get() == obj) {
                    return;
                }
            }
        }
        ((java.util.Vector) collection).add(new vz1.c(obj, obj2, aVar));
    }
}
