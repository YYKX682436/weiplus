package dl;

/* loaded from: classes10.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f235150d;

    public x(dl.y yVar) {
        this.f235150d = new java.lang.ref.WeakReference(yVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        xk0.f g17;
        dl.y yVar = (dl.y) this.f235150d.get();
        if (yVar == null || yVar.d() == null || (g17 = ((um.g) yVar.d()).g()) == null || !g17.s()) {
            return;
        }
        g17.w(false);
        yVar.E(false);
        yVar.r();
    }
}
