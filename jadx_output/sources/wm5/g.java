package wm5;

/* loaded from: classes10.dex */
public final class g implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f447353a = new java.util.LinkedList();

    @Override // wm5.f
    public void a(long j17) {
        synchronized (this.f447353a) {
            java.util.Iterator it = this.f447353a.iterator();
            while (it.hasNext()) {
                ((wm5.f) it.next()).a(j17);
            }
        }
    }

    @Override // wm5.f
    public void b() {
        synchronized (this.f447353a) {
            java.util.Iterator it = this.f447353a.iterator();
            while (it.hasNext()) {
                ((wm5.f) it.next()).b();
            }
        }
    }
}
