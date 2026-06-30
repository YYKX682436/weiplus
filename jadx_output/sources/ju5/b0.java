package ju5;

/* loaded from: classes15.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.k0 f302065d;

    public b0(ju5.k0 k0Var) {
        this.f302065d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        du5.d dVar = this.f302065d.f302112i;
        if (dVar != null) {
            dVar.b();
        }
    }
}
