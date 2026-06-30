package dh4;

/* loaded from: classes15.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f232581d;

    public s0(dh4.t0 t0Var) {
        this.f232581d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f232581d.f232586a) {
            java.util.Iterator it = this.f232581d.f232586a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).P3();
            }
        }
    }
}
