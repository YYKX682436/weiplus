package i53;

/* loaded from: classes12.dex */
public class k3 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f288634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.m3 f288636f;

    public k3(i53.m3 m3Var, long j17, java.lang.String str) {
        this.f288636f = m3Var;
        this.f288634d = j17;
        this.f288635e = str;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        if (!this.f288636f.f288659b.equals(str) || j18 == 0) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new i53.j3(this, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        i53.m3 m3Var = this.f288636f;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameVideoDownloadPerform", "download video mediaId:%s, rawMediaId:%s", str, m3Var.f288659b);
        if (m3Var.f288659b.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameVideoDownloadPerform", "download video cost time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f288634d));
            java.lang.String str2 = this.f288635e;
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameVideoDownloadPerform", "download video[%s] success", str2);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameVideoDownloadPerform", "download video[%s] fail, ret:%d", str2, java.lang.Integer.valueOf(i17));
            }
            com.tencent.mm.ui.MMActivity mMActivity = m3Var.f288658a;
            if (i17 == 0 && !android.text.TextUtils.isEmpty(m3Var.f288660c)) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(m3Var.f288660c);
                if (r6Var.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameVideoDownloadPerform", "download file size:%d", java.lang.Long.valueOf(r6Var.C()));
                    zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                    java.lang.String str3 = m3Var.f288660c;
                    ((yb0.g) b0Var).getClass();
                    java.lang.String g17 = com.tencent.mm.platformtools.ExportFileUtil.g(com.tencent.mm.sdk.platformtools.x2.f193071a, str3, null, null);
                    if (g17 != null) {
                        q75.c.f(g17, com.tencent.mm.sdk.platformtools.x2.f193071a);
                    }
                    mMActivity.setResult(-1, new android.content.Intent().putExtra("ret_info", java.lang.String.valueOf(0)));
                    mMActivity.finish();
                    return;
                }
            }
            mMActivity.setResult(-1, new android.content.Intent().putExtra("ret_info", java.lang.String.valueOf(i17)));
            mMActivity.finish();
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
