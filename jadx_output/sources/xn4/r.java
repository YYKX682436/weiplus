package xn4;

/* loaded from: classes11.dex */
public final class r implements xn4.q {
    @Override // xn4.q
    public void a(java.lang.String mediaId, double d17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadProgress");
    }

    @Override // xn4.q
    public void b(java.lang.String mediaId, r45.mm6 info) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onMergeSuccess");
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a, xn4.e0.f455614d.b().f380671g);
    }

    @Override // xn4.q
    public void c(java.lang.String mediaId, java.lang.String path) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadSuccess");
        xn4.c0 c0Var = xn4.c0.f455604a;
        r45.mm6 mm6Var = null;
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_DIALOGINFO").getString(mediaId, null);
        if (string != null) {
            mm6Var = new r45.mm6();
            mm6Var.fromJson(string);
        }
        if (mm6Var != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            c0Var.k(context, mm6Var);
        }
    }

    @Override // xn4.q
    public void d(java.lang.String mediaId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadFail() called with: mediaId = " + mediaId + ", msg = " + msg);
    }
}
