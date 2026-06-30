package dh4;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f232576e;

    public r0(dh4.t0 t0Var, java.lang.String str) {
        this.f232576e = t0Var;
        this.f232575d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f232576e.f232586a) {
            java.util.Iterator it = this.f232576e.f232586a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).T0(this.f232575d);
            }
        }
    }
}
