package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class a implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f143493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.b f143495f;

    public a(long j17, java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.b bVar) {
        this.f143493d = j17;
        this.f143494e = str;
        this.f143495f = bVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("LiteAppDownloadVideo", "download video mediaId:%s, rawMediaId:%s", str, com.tencent.mm.plugin.lite.jsapi.comms.d.f143542a);
        if (com.tencent.mm.plugin.lite.jsapi.comms.d.f143542a.equals(str)) {
            com.tencent.mars.xlog.Log.i("LiteAppDownloadVideo", "download video cost time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f143493d));
            java.lang.String str2 = this.f143494e;
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("LiteAppDownloadVideo", "download video[%s] success", str2);
            } else {
                com.tencent.mars.xlog.Log.i("LiteAppDownloadVideo", "download video[%s] fail, ret:%d", str2, java.lang.Integer.valueOf(i17));
            }
            com.tencent.mm.plugin.lite.jsapi.comms.b bVar = this.f143495f;
            if (i17 == 0 && !android.text.TextUtils.isEmpty(com.tencent.mm.plugin.lite.jsapi.comms.d.f143543b)) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.lite.jsapi.comms.d.f143543b);
                if (r6Var.m()) {
                    com.tencent.mars.xlog.Log.i("LiteAppDownloadVideo", "download file size:%d", java.lang.Long.valueOf(r6Var.C()));
                    bVar.a(com.tencent.mm.plugin.lite.jsapi.comms.d.f143543b, 0, 0);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("LiteAppDownloadVideo", "download video[%s] fail", str2);
            if (bVar != null) {
                bVar.a(com.tencent.mm.plugin.lite.jsapi.comms.d.f143543b, 2, i17);
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
