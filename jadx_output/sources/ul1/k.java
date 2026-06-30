package ul1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f428586d;

    public k(ul1.j toast) {
        kotlin.jvm.internal.o.g(toast, "toast");
        this.f428586d = new java.lang.ref.WeakReference(toast);
    }

    @Override // java.lang.Runnable
    public void run() {
        ul1.j jVar = (ul1.j) this.f428586d.get();
        if (jVar != null) {
            jVar.dismiss();
        }
    }
}
