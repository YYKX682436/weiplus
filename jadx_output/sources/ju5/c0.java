package ju5;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.k0 f302079d;

    public c0(ju5.k0 k0Var) {
        this.f302079d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        du5.d dVar = this.f302079d.f302112i;
        if (dVar != null) {
            dVar.b();
        }
    }
}
