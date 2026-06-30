package dh4;

/* loaded from: classes15.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f232568g;

    public p0(dh4.t0 t0Var, int i17, int i18, java.lang.String str) {
        this.f232568g = t0Var;
        this.f232565d = i17;
        this.f232566e = i18;
        this.f232567f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f232568g.f232586a) {
            java.util.Iterator it = this.f232568g.f232586a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).J0(this.f232565d, this.f232566e, this.f232567f);
            }
        }
    }
}
