package mm2;

/* loaded from: classes3.dex */
public final class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.e5 f328765d;

    public b5(mm2.e5 e5Var) {
        this.f328765d = e5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm2.e5 e5Var = this.f328765d;
        synchronized (e5Var) {
            e5Var.f329006m.clear();
        }
    }
}
