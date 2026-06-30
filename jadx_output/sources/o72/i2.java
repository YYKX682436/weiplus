package o72;

/* loaded from: classes12.dex */
public class i2 {

    /* renamed from: h, reason: collision with root package name */
    public static o72.i2 f343352h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f343353a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f343354b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public long f343355c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f343356d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f343357e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f343358f = new o72.f2(this);

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f343359g = new o72.g2(this, android.os.Looper.getMainLooper());

    public static synchronized o72.i2 b() {
        o72.i2 i2Var;
        synchronized (o72.i2.class) {
            if (f343352h == null) {
                f343352h = new o72.i2();
            }
            i2Var = f343352h;
        }
        return i2Var;
    }

    public void a(o72.h2 h2Var) {
        synchronized (this.f343357e) {
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERFINO_FAV_HAS_DB_DATATOTALLENGTH_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
                if (h2Var != null) {
                    ((com.tencent.mm.plugin.fav.ui.e1) h2Var).a();
                }
                return;
            }
            if (h2Var != null) {
                this.f343354b.add(h2Var);
            }
            if (this.f343353a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavCleanFirstLoader", "isLoading is true, ignore");
                return;
            }
            this.f343353a = true;
            this.f343355c = java.lang.System.currentTimeMillis();
            s75.d.b(this.f343358f, "FavCleanFirstLoader_CalFavDataLength");
        }
    }
}
