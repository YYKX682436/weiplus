package n36;

/* loaded from: classes16.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n36.k f334816d;

    public e(n36.k kVar) {
        this.f334816d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f334816d) {
            n36.k kVar = this.f334816d;
            if ((!kVar.f334848t) || kVar.f334849u) {
                return;
            }
            try {
                kVar.x();
            } catch (java.io.IOException unused) {
                this.f334816d.f334850v = true;
            }
            try {
                if (this.f334816d.j()) {
                    this.f334816d.v();
                    this.f334816d.f334846r = 0;
                }
            } catch (java.io.IOException unused2) {
                n36.k kVar2 = this.f334816d;
                kVar2.f334851w = true;
                kVar2.f334844p = x36.v.a(new x36.h());
            }
        }
    }
}
