package vk0;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f437752a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f437753b = new java.util.LinkedList();

    public e(vk0.b bVar) {
    }

    public boolean a(vk0.a aVar) {
        if (b(aVar)) {
            return false;
        }
        synchronized (this.f437752a) {
            ((java.util.LinkedList) this.f437752a).add(new vk0.d(aVar));
            synchronized (this) {
                java.util.Iterator it = this.f437753b.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.f.a(it.next());
                    throw null;
                }
            }
        }
        return true;
    }

    public boolean b(vk0.a aVar) {
        vk0.a aVar2;
        if (aVar == null) {
            return false;
        }
        synchronized (this.f437752a) {
            for (vk0.d dVar : this.f437752a) {
                if (dVar != null && (aVar2 = (vk0.a) dVar.get()) != null && aVar.equals(aVar2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean c(vk0.a aVar) {
        boolean remove;
        if (aVar == null) {
            return false;
        }
        synchronized (this.f437752a) {
            remove = ((java.util.LinkedList) this.f437752a).remove(new vk0.d(aVar));
            synchronized (this) {
                java.util.Iterator it = this.f437753b.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.f.a(it.next());
                    throw null;
                }
            }
        }
        return remove;
    }
}
