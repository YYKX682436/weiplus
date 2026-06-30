package v2;

/* loaded from: classes15.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f432728a = new java.util.HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    public int f432729b = 0;

    public void a(v2.q qVar) {
        this.f432728a.add(qVar);
    }

    public void b() {
        this.f432729b = 1;
        java.util.Iterator it = this.f432728a.iterator();
        while (it.hasNext()) {
            ((v2.q) it.next()).e();
        }
    }

    public void c() {
        this.f432729b = 0;
        java.util.Iterator it = this.f432728a.iterator();
        while (it.hasNext()) {
            ((v2.q) it.next()).c();
        }
    }

    public boolean d() {
        return this.f432729b == 1;
    }

    public void e() {
    }
}
