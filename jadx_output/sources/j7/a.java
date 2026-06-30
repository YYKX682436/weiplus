package j7;

/* loaded from: classes13.dex */
public class a implements j7.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f298002a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public boolean f298003b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f298004c;

    @Override // j7.j
    public void a(j7.k kVar) {
        this.f298002a.remove(kVar);
    }

    @Override // j7.j
    public void b(j7.k kVar) {
        this.f298002a.add(kVar);
        if (this.f298004c) {
            kVar.onDestroy();
        } else if (this.f298003b) {
            kVar.onStart();
        } else {
            kVar.onStop();
        }
    }

    public void c() {
        this.f298004c = true;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f298002a)).iterator();
        while (it.hasNext()) {
            ((j7.k) it.next()).onDestroy();
        }
    }

    public void d() {
        this.f298003b = true;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f298002a)).iterator();
        while (it.hasNext()) {
            ((j7.k) it.next()).onStart();
        }
    }

    public void e() {
        this.f298003b = false;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f298002a)).iterator();
        while (it.hasNext()) {
            ((j7.k) it.next()).onStop();
        }
    }
}
