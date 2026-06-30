package dh4;

/* loaded from: classes15.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f232556e;

    public n0(dh4.t0 t0Var, int i17) {
        this.f232556e = t0Var;
        this.f232555d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f232556e.f232586a) {
            java.util.Iterator it = this.f232556e.f232586a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).N4(this.f232555d);
            }
        }
    }
}
