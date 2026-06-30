package dw3;

/* loaded from: classes10.dex */
public final class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f244271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f244272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f244275i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dw3.l0 f244276m;

    public s0(yz5.l lVar, boolean z17, android.app.Activity activity, yz5.l lVar2, java.lang.String str, int i17, dw3.l0 l0Var) {
        this.f244270d = lVar;
        this.f244271e = z17;
        this.f244272f = activity;
        this.f244273g = lVar2;
        this.f244274h = str;
        this.f244275i = i17;
        this.f244276m = l0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yz5.l lVar = this.f244270d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        if (this.f244271e) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new dw3.r0(this.f244273g, this.f244274h, this.f244275i, this.f244276m, this.f244272f, null), 3, null);
        } else {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
            kotlin.jvm.internal.o.d(Zi);
            java.lang.String downloadUrl = Zi.concat("1101");
            android.app.Activity context = this.f244272f;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f276157b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        dw3.u0.a(dw3.u0.f244283a, 1);
    }
}
