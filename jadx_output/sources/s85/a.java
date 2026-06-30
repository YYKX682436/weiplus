package s85;

/* loaded from: classes4.dex */
public class a implements s85.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f404902d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f404903e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f404905g = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashSet f404904f = new java.util.HashSet();

    public a(java.lang.String str, java.lang.Object obj) {
        this.f404902d = str;
        this.f404903e = obj;
    }

    public final void b(s85.b bVar) {
        boolean add;
        synchronized (this.f404905g) {
            add = this.f404904f.add(bVar);
        }
        if (add) {
            c(bVar);
        }
    }

    public void c(s85.b bVar) {
    }

    public void d(s85.b bVar) {
    }

    public final void e(s85.b bVar) {
        boolean remove;
        synchronized (this.f404905g) {
            remove = this.f404904f.remove(bVar);
        }
        if (remove) {
            d(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(java.lang.Object obj) {
        java.lang.Object obj2 = this.f404903e;
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return;
        }
        this.f404903e = obj;
        synchronized (this.f404905g) {
            java.util.Iterator it = this.f404904f.iterator();
            while (it.hasNext()) {
                ((s85.b) it.next()).a(this, obj);
            }
        }
    }

    public java.lang.String toString() {
        return "Status: " + this.f404902d;
    }
}
