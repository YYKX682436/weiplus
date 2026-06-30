package iu0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f294802a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f294803b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f294804c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f294805d = new android.os.Handler(android.os.Looper.getMainLooper());

    public static final void a(iu0.d dVar, java.lang.String str, iu0.a aVar, int i17, int i18, java.lang.String str2) {
        if (dVar.f294804c) {
            return;
        }
        dVar.f294803b++;
        if (dVar.f294803b > 3) {
            com.tencent.mars.xlog.Log.w("MJCC.CdnUpload", "maybeRetry: max retry count reached (3), giving up");
            ((kotlinx.coroutines.r) ((gu0.i2) aVar).f275703a).s(null, gu0.g2.f275683d);
        } else {
            com.tencent.mars.xlog.Log.i("MJCC.CdnUpload", "maybeRetry: scheduling retry #" + dVar.f294803b + " after 2000ms");
            dVar.f294805d.postDelayed(new iu0.c(dVar, str, aVar), 2000L);
        }
    }

    public final void b() {
        this.f294804c = true;
        this.f294805d.removeCallbacksAndMessages(null);
        java.lang.String str = this.f294802a;
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MJCC.CdnUpload", "cancel: taskId=".concat(str));
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(this.f294802a);
        }
        this.f294802a = null;
    }

    public final void c(java.lang.String str, iu0.a aVar) {
        if (this.f294804c) {
            com.tencent.mars.xlog.Log.w("MJCC.CdnUpload", "upload cancelled, skip");
            return;
        }
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        gu0.g2 g2Var = gu0.g2.f275683d;
        if (!j17) {
            com.tencent.mars.xlog.Log.e("MJCC.CdnUpload", "uploadZip: file not exist, path=" + str);
            ((kotlinx.coroutines.r) ((gu0.i2) aVar).f275703a).s(null, g2Var);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cc-upload-");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        sb6.append('-');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        this.f294802a = sb7;
        com.tencent.mars.xlog.Log.i("MJCC.CdnUpload", "doUpload: start, path=" + str + ", mediaId=" + sb7 + ", fileSize=" + com.tencent.mm.vfs.w6.k(str) + ", retryCount=" + this.f294803b);
        dn.m mVar = new dn.m();
        mVar.f241785d = "CDN_TASK_ComposingCreationUpload";
        mVar.f241787f = new iu0.b(this, str, aVar);
        mVar.field_mediaId = sb7;
        mVar.field_bzScene = 3;
        mVar.field_appType = 251;
        mVar.field_fileType = 20303;
        mVar.field_fullpath = str;
        mVar.field_needStorage = true;
        mVar.field_priority = 2;
        mVar.A = 120;
        mVar.B = 300;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            com.tencent.mars.xlog.Log.i("MJCC.CdnUpload", "doUpload: addSendTask success");
            return;
        }
        com.tencent.mars.xlog.Log.e("MJCC.CdnUpload", "doUpload: addSendTask failed");
        this.f294802a = null;
        ((kotlinx.coroutines.r) ((gu0.i2) aVar).f275703a).s(null, g2Var);
    }
}
