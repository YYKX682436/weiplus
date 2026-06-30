package i53;

/* loaded from: classes12.dex */
public class v3 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f288762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m33.u1 f288764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameVideoDownloadUI f288765g;

    public v3(com.tencent.mm.plugin.game.media.GameVideoDownloadUI gameVideoDownloadUI, long j17, java.lang.String str, m33.u1 u1Var) {
        this.f288765g = gameVideoDownloadUI;
        this.f288762d = j17;
        this.f288763e = str;
        this.f288764f = u1Var;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        if (!this.f288765g.f140074g.equals(str) || j18 == 0) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new i53.u3(this, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mm.plugin.game.media.GameVideoDownloadUI gameVideoDownloadUI = this.f288765g;
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download video mediaId:%s, rawMediaId:%s", str, gameVideoDownloadUI.f140074g);
        if (gameVideoDownloadUI.f140074g.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download video cost time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f288762d));
            java.lang.String str2 = this.f288763e;
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download video[%s] success", str2);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download video[%s] fail, ret:%d", str2, java.lang.Integer.valueOf(i17));
            }
            m33.u1 u1Var = this.f288764f;
            if (i17 == 0 && !android.text.TextUtils.isEmpty(gameVideoDownloadUI.f140078n)) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(gameVideoDownloadUI.f140078n);
                if (r6Var.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download file size:%d", java.lang.Long.valueOf(r6Var.C()));
                    ((i53.t3) u1Var).a(gameVideoDownloadUI.f140078n, 0, 0);
                    return;
                }
            }
            db5.t7.makeText(gameVideoDownloadUI.f140073f, com.tencent.mm.R.string.fpt, 1).show();
            if (u1Var != null) {
                ((i53.t3) u1Var).a(gameVideoDownloadUI.f140078n, 2, i17);
            }
        }
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
    }
}
