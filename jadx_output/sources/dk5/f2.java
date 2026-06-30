package dk5;

/* loaded from: classes9.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk5.h2 f234617e;

    public f2(java.lang.String str, dk5.h2 h2Var) {
        this.f234616d = str;
        this.f234617e = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f234616d;
        long k17 = com.tencent.mm.vfs.w6.k(str);
        dk5.h2 h2Var = this.f234617e;
        if (k17 > 1048576) {
            com.tencent.mars.xlog.Log.e("MiroMsg.MusicVideoShareUtil", "img size is too large");
            if (h2Var != null) {
                h2Var.a(null, true);
                return;
            }
            return;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
        com.tencent.mars.xlog.Log.i("MiroMsg.MusicVideoShareUtil", "handleCDNUpload imgPath: %s", i17);
        dn.m mVar = new dn.m();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("musicvideoimage", currentTimeMillis, c01.z1.g().d1(), java.lang.String.valueOf(currentTimeMillis));
        mVar.f241785d = "task_AiScanImagetUploadTask";
        mVar.field_mediaId = b17;
        mVar.field_fullpath = i17;
        mVar.field_appType = 202;
        mVar.field_fileType = 20304;
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_needCompressImage = true;
        mVar.field_isStreamMedia = false;
        mVar.field_bzScene = 2;
        mVar.f241787f = new dk5.g2(h2Var);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MiroMsg.MusicVideoShareUtil", "hy: cdntra addSendTask failed. clientid:%s", b17);
    }
}
