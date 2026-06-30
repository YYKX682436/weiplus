package gc5;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.plugin.ball.service.s4 implements gc5.c {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.Set f270466x;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f270467y;

    /* renamed from: z, reason: collision with root package name */
    public static long f270468z;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f270469v;

    /* renamed from: w, reason: collision with root package name */
    public int f270470w;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f270466x = hashSet;
        hashSet.add("app_type");
        hashSet.add("app_media_id");
        hashSet.add("app_msg_id");
        hashSet.add("app_show_share");
        hashSet.add(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        hashSet.add("msg_talker");
        f270467y = false;
        f270468z = 0L;
    }

    public b(dp1.x xVar) {
        super(xVar);
        this.f270469v = "";
        this.f270470w = 0;
    }

    public static boolean t0(java.lang.String str) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f270469v);
        n0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f270469v);
        this.f93246u = false;
        dp1.x xVar = this.f93239n;
        if (xVar == null || xVar.getActivity() == null) {
            return;
        }
        xVar.getActivity().finish();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return true;
    }

    public void u0(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onCreate, filePath:%s fileExt:%s sence:%s", str, str2, java.lang.Integer.valueOf(i17));
        this.f270469v = str;
        this.f270470w = i17;
        b(4, qp1.n.c(str));
        Q(1);
        t().f93086f = 4;
        t().f93085e = this.f270470w;
        g();
        android.os.Bundle bundle = this.f93132d.G;
        if (bundle != null) {
            bundle.putString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
            if (!z17) {
                this.f93132d.G.putBoolean("ifAppAttachDownloadUI", false);
                this.f93132d.G.putString("fileExt", str2);
                this.f93132d.G.putInt("sence", java.lang.Integer.valueOf(i17).intValue());
                g();
                return;
            }
            dp1.x xVar = this.f93239n;
            if (xVar.getIntent() != null) {
                qp1.m.c(xVar.getIntent(), this.f93132d.G, f270466x);
                this.f93132d.G.putBoolean("ifAppAttachDownloadUI", true);
                g();
            }
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return com.tencent.mm.sdk.platformtools.t8.K0(this.f270469v) || com.tencent.mm.vfs.w6.j(this.f270469v);
    }

    public void v0(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool = qp1.w.f365755a;
        java.lang.Integer b17 = qp1.a0.b(str);
        if (b17 == null) {
            b17 = qp1.a0.b(com.eclipsesource.mmv8.Platform.UNKNOWN);
        }
        this.f93132d.f93060u = b17.intValue();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f93132d.f93063x)) {
            this.f93132d.f93063x = str2;
        }
        g();
    }
}
