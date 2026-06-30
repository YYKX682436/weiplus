package ni;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f337175a;

    /* renamed from: b, reason: collision with root package name */
    public final ni.c f337176b;

    public d(ni.e eVar, int i17, ni.c cVar) {
        this.f337175a = i17;
        this.f337176b = cVar;
    }

    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ni.c cVar = this.f337176b;
        if (cVar == null) {
            return arrayList;
        }
        oi.i iVar = cVar.f337174a;
        iVar.getClass();
        oi.h hVar = oi.h.f345567e;
        synchronized (hVar.f345568a) {
            ((java.util.LinkedList) hVar.f345568a).remove(iVar);
        }
        return cVar.f337174a.f345572a;
    }

    public void b() {
        ni.c cVar = this.f337176b;
        if (cVar != null) {
            oi.i iVar = cVar.f337174a;
            synchronized (iVar.f345572a) {
                ((java.util.LinkedList) iVar.f345572a).clear();
            }
            oi.i iVar2 = cVar.f337174a;
            iVar2.getClass();
            oi.h hVar = oi.h.f345567e;
            synchronized (hVar.f345568a) {
                if (!((java.util.LinkedList) hVar.f345568a).contains(iVar2)) {
                    ((java.util.LinkedList) hVar.f345568a).add(iVar2);
                }
            }
        }
    }

    public java.lang.String toString() {
        return "ActivityLeakMonitor{mActivityHashCode=" + this.f337175a + ", mMonitor=" + this.f337176b + '}';
    }
}
