package z81;

/* loaded from: classes13.dex */
public class f implements z81.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f470696a;

    public f(h91.b bVar) {
        this.f470696a = new java.lang.ref.WeakReference(bVar);
    }

    @Override // z81.a
    public void invalidate() {
        h91.b bVar = (h91.b) this.f470696a.get();
        if (bVar == null) {
            return;
        }
        bVar.a();
    }
}
