package nz2;

/* loaded from: classes9.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nz2.x f341579f;

    public w(nz2.x xVar, java.lang.String str, int i17) {
        this.f341579f = xVar;
        this.f341577d = str;
        this.f341578e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nz2.x xVar = this.f341579f;
        xVar.D1(new java.lang.Object[0]);
        d50.q b17 = xVar.b();
        nz2.v vVar = new nz2.v(this);
        ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
        ((ne4.n) b17).b(vVar, true, 1, new oz2.c(this.f341577d, this.f341578e), 0);
    }
}
