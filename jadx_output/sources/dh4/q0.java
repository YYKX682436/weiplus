package dh4;

/* loaded from: classes15.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f232571f;

    public q0(dh4.t0 t0Var, java.lang.String str, java.lang.String str2) {
        this.f232571f = t0Var;
        this.f232569d = str;
        this.f232570e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f232571f.f232586a) {
            java.util.Iterator it = this.f232571f.f232586a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).P2(this.f232569d, this.f232570e);
            }
        }
    }
}
