package xa5;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f452838d;

    public a(android.app.Activity activity) {
        this.f452838d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = wa5.d.f444315a.a(this.f452838d).f444313e.iterator();
        while (it.hasNext()) {
            ya5.a aVar = (ya5.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.k(true);
            }
        }
    }
}
