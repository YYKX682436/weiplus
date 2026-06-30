package dh4;

/* loaded from: classes15.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f232548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f232549g;

    public l0(dh4.t0 t0Var, java.lang.String str, int i17, int i18) {
        this.f232549g = t0Var;
        this.f232546d = str;
        this.f232547e = i17;
        this.f232548f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f232549g.f232586a) {
            java.util.Iterator it = this.f232549g.f232586a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).J1(this.f232546d, this.f232547e, this.f232548f);
            }
        }
    }
}
