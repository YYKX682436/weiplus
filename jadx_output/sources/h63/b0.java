package h63;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f279209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f279211g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f279212h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h63.l1 f279213i;

    public b0(java.lang.String str, int i17, android.content.Context context, h63.v0 v0Var, int i18, h63.l1 l1Var) {
        this.f279208d = str;
        this.f279209e = i17;
        this.f279210f = context;
        this.f279211g = v0Var;
        this.f279212h = i18;
        this.f279213i = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "zbql:exitGameLive from js or menu");
        if (((p60.u) i95.n0.c(p60.u.class)).Bi(this.f279208d, this.f279209e).booleanValue()) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f279210f, 1, false);
            android.content.Context context = this.f279210f;
            h63.v0 v0Var = this.f279211g;
            java.lang.String str = this.f279208d;
            int i17 = this.f279212h;
            h63.l1 l1Var = this.f279213i;
            k0Var.X1 = true;
            k0Var.f211872n = new h63.y(context);
            k0Var.f211881s = new h63.z(v0Var, str, context, i17, l1Var);
            k0Var.C = new h63.a0(l1Var);
            k0Var.v();
        }
    }
}
