package i7;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f289397a = new java.util.ArrayList();

    public synchronized java.util.List a(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f289397a).iterator();
        while (it.hasNext()) {
            i7.f fVar = (i7.f) it.next();
            if (fVar.f289394a.isAssignableFrom(cls) && cls2.isAssignableFrom(fVar.f289395b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
