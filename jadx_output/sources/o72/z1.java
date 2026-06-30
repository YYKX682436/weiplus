package o72;

/* loaded from: classes8.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.n3 f343530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f343531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f343533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f343534h;

    public z1(dm.n3 n3Var, boolean z17, java.lang.String str, int i17, java.lang.Runnable runnable) {
        this.f343530d = n3Var;
        this.f343531e = z17;
        this.f343532f = str;
        this.f343533g = i17;
        this.f343534h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        dm.n3 n3Var = this.f343530d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(n3Var.field_id);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(n3Var.field_localId);
        boolean z17 = this.f343531e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavApiLogic", "delete favItem id %d, localId %d, needBatchDel %B, do on worker thread", valueOf, valueOf2, java.lang.Boolean.valueOf(z17));
        o72.x1.m(n3Var, z17, this.f343532f, this.f343533g);
        com.tencent.mm.sdk.platformtools.u3.h(this.f343534h);
        o72.x1.o(n3Var);
    }
}
