package k02;

/* loaded from: classes8.dex */
public final class q implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vz.w1 f303095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303097c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303099e;

    public q(vz.w1 w1Var, android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        this.f303095a = w1Var;
        this.f303096b = context;
        this.f303097c = str;
        this.f303098d = str2;
        this.f303099e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.downloader.game.dl.protobuf.GetCloudGameDownloadInfoResponse");
        c02.m mVar = (c02.m) fVar;
        vz.w1 w1Var = this.f303095a;
        if (i17 != 0 || i18 != 0) {
            if (w1Var != null) {
                w1Var.a("cgiGetGameDownloadDetainConfig CGI return, errType = " + i17 + ", errCode = " + str);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("GameDetainManager", "response .open_type  = " + mVar.f37606d);
        int i19 = mVar.f37606d;
        if (i19 == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mVar.f37607e) && mVar.f37608f != null) {
                ik1.h0.b(new k02.o(this.f303096b, this.f303095a, mVar, this.f303097c, this.f303098d, this.f303099e));
                return;
            } else {
                if (w1Var != null) {
                    w1Var.a("gamelog response .open_type  = 1  h5_url is null");
                    return;
                }
                return;
            }
        }
        if (i19 != 2) {
            if (w1Var != null) {
                w1Var.a("open_type illegal open_type  = " + mVar.f37606d);
                return;
            }
            return;
        }
        if (mVar.f37608f != null) {
            ik1.h0.b(new k02.p(this.f303096b, this.f303095a, mVar, this.f303097c, this.f303098d, this.f303099e));
        } else if (w1Var != null) {
            w1Var.a("gamelog response .open_type  = 2  app_info is null");
        }
    }
}
