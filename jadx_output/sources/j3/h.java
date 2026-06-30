package j3;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f297333a;

    /* renamed from: b, reason: collision with root package name */
    public j3.g f297334b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f297335c;

    public void a() {
        synchronized (this) {
            if (this.f297333a) {
                return;
            }
            this.f297333a = true;
            this.f297335c = true;
            j3.g gVar = this.f297334b;
            if (gVar != null) {
                try {
                    gVar.onCancel();
                } catch (java.lang.Throwable th6) {
                    synchronized (this) {
                        this.f297335c = false;
                        notifyAll();
                        throw th6;
                    }
                }
            }
            synchronized (this) {
                this.f297335c = false;
                notifyAll();
            }
        }
    }

    public void b(j3.g gVar) {
        synchronized (this) {
            while (this.f297335c) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            if (this.f297334b == gVar) {
                return;
            }
            this.f297334b = gVar;
            if (this.f297333a && gVar != null) {
                gVar.onCancel();
            }
        }
    }
}
