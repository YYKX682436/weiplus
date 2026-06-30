package m36;

/* loaded from: classes16.dex */
public abstract class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f323383d;

    public b(java.lang.String str, java.lang.Object... objArr) {
        this.f323383d = m36.e.j(str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String name = java.lang.Thread.currentThread().getName();
        java.lang.Thread.currentThread().setName(this.f323383d);
        try {
            a();
        } finally {
            java.lang.Thread.currentThread().setName(name);
        }
    }
}
