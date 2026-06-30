package dw3;

/* loaded from: classes10.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f244253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f244255g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f244256h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f244257i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dw3.l0 f244258m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f244259n;

    public p0(yz5.l lVar, boolean z17, java.lang.String str, java.util.List list, int i17, java.util.List list2, dw3.l0 l0Var, android.app.Activity activity) {
        this.f244252d = lVar;
        this.f244253e = z17;
        this.f244254f = str;
        this.f244255g = list;
        this.f244256h = i17;
        this.f244257i = list2;
        this.f244258m = l0Var;
        this.f244259n = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yz5.l lVar = this.f244252d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        boolean z17 = this.f244253e;
        android.app.Activity context = this.f244259n;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f244283a;
            u0Var.h(context, u0Var.c(this.f244254f, this.f244255g, this.f244256h, this.f244257i, this.f244258m.a()));
            return;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
        kotlin.jvm.internal.o.d(Zi);
        java.lang.String downloadUrl = Zi.concat("1101");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
        gw4.f fVar = new gw4.f(context);
        fVar.f276157b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
        ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
    }
}
