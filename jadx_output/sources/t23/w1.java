package t23;

/* loaded from: classes10.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f415286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f415287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t23.x1 f415288g;

    public w1(t23.x1 x1Var, java.lang.String str, int i17, long j17) {
        this.f415288g = x1Var;
        this.f415285d = str;
        this.f415286e = i17;
        this.f415287f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.x1 x1Var = this.f415288g;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaQueryService", "queryMediaItemsInAlbum Begin...");
            x1Var.f415296e.a(this.f415285d, this.f415286e, new t23.v1(this), this.f415287f);
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaQueryService", e17, "", new java.lang.Object[0]);
            t23.x1.a(x1Var, new java.util.LinkedList(), this.f415287f, false);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|queryMediaInAlbums";
    }
}
