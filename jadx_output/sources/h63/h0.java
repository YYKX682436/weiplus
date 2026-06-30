package h63;

/* loaded from: classes7.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f279241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f279244g;

    public h0(com.tencent.mm.plugin.appbrand.o6 o6Var, android.content.Context context, java.lang.String str, int i17) {
        this.f279241d = o6Var;
        this.f279242e = context;
        this.f279243f = str;
        this.f279244g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f279241d;
        ((com.tencent.mm.plugin.appbrand.jsruntime.f0) o6Var.C0().getF147808e().h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)).post(new h63.g0(o6Var, this.f279242e, this.f279243f, this.f279244g));
    }
}
