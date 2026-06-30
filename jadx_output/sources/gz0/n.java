package gz0;

/* loaded from: classes10.dex */
public final class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f277690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f277692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f277694h;

    public n(boolean z17, java.lang.String str, int i17, java.lang.String str2, android.content.Context context) {
        this.f277690d = z17;
        this.f277691e = str;
        this.f277692f = i17;
        this.f277693g = str2;
        this.f277694h = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dx1.f fVar = dx1.g.f244489a;
        fVar.i("SnsPublishProcess", "ifEgExit", 1);
        boolean z17 = this.f277690d;
        android.content.Context context = this.f277694h;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f244283a;
            u0Var.h(context, u0Var.d(this.f277691e, this.f277692f, this.f277693g));
            fVar.i("SnsTemplate", "goToMJAppResult", 1);
            return;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
        kotlin.jvm.internal.o.d(Zi);
        java.lang.String downloadUrl = Zi.concat("1101");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
        gw4.f fVar2 = new gw4.f(context);
        fVar2.f276157b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
        ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar2, null);
        fVar.i("SnsTemplate", "goToMJAppResult", 2);
    }
}
