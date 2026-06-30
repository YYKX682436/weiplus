package im5;

/* loaded from: classes7.dex */
public class c implements im5.b, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f292712d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f292713e = true;

    @Override // im5.a
    public synchronized void dead() {
        if (this.f292713e) {
            java.util.Iterator it = ((java.util.ArrayList) this.f292712d).iterator();
            while (it.hasNext()) {
                im5.a aVar = (im5.a) ((java.lang.ref.WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.dead();
                }
            }
            ((java.util.ArrayList) this.f292712d).clear();
            this.f292713e = false;
        }
    }

    @Override // im5.b
    public synchronized void keep(im5.a aVar) {
        if (!this.f292713e) {
            iz5.a.d(null, aVar);
            aVar.dead();
        } else {
            ((java.util.ArrayList) this.f292712d).add(new java.lang.ref.WeakReference(aVar));
        }
    }
}
