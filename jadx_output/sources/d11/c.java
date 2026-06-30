package d11;

/* loaded from: classes10.dex */
public final class c implements j3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d11.d f225655a;

    public c(d11.d dVar) {
        this.f225655a = dVar;
    }

    @Override // j3.g
    public final void onCancel() {
        d11.d dVar = this.f225655a;
        synchronized (dVar.f225658c) {
            java.util.Iterator it = dVar.f225658c.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }
}
