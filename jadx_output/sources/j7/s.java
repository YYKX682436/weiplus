package j7;

/* loaded from: classes13.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f298024a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f298025b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f298026c;

    public boolean a(m7.b bVar) {
        boolean z17 = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.f298024a.remove(bVar);
        if (!((java.util.ArrayList) this.f298025b).remove(bVar) && !remove) {
            z17 = false;
        }
        if (z17) {
            ((m7.h) bVar).c();
        }
        return z17;
    }

    public void b() {
        boolean z17;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f298024a)).iterator();
        while (it.hasNext()) {
            m7.h hVar = (m7.h) ((m7.b) it.next());
            if (!hVar.e()) {
                synchronized (hVar.f324437b) {
                    z17 = hVar.f324454s == m7.g.CLEARED;
                }
                if (!z17) {
                    hVar.c();
                    if (this.f298026c) {
                        ((java.util.ArrayList) this.f298025b).add(hVar);
                    } else {
                        hVar.a();
                    }
                }
            }
        }
    }

    public void c() {
        this.f298026c = false;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f298024a)).iterator();
        while (it.hasNext()) {
            m7.h hVar = (m7.h) ((m7.b) it.next());
            if (!hVar.e() && !hVar.g()) {
                hVar.a();
            }
        }
        ((java.util.ArrayList) this.f298025b).clear();
    }

    public java.lang.String toString() {
        return super.toString() + "{numRequests=" + this.f298024a.size() + ", isPaused=" + this.f298026c + "}";
    }
}
