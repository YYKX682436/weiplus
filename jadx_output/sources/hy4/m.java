package hy4;

/* loaded from: classes5.dex */
public class m {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f286170d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f286171e;

    /* renamed from: a, reason: collision with root package name */
    public final hy4.k f286167a = new hy4.k(this, null);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f286168b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j0 f286169c = new androidx.lifecycle.j0();

    /* renamed from: f, reason: collision with root package name */
    public hy4.l f286172f = hy4.l.NONE;

    public void a(java.lang.String str, java.lang.String str2) {
        this.f286170d = str2;
        this.f286171e = str;
        this.f286172f = hy4.l.LOADING;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("vestacountavatar", currentTimeMillis, c01.z1.g().d1(), java.lang.String.valueOf(currentTimeMillis));
        ((java.util.HashMap) this.f286168b).put(b17 == null ? "" : b17, str);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_VestImgUploadEngine";
        mVar.f241787f = this.f286167a;
        mVar.field_mediaId = b17;
        mVar.field_fullpath = str;
        mVar.field_fileType = 20321;
        mVar.field_priority = 1;
        mVar.field_needStorage = true;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 200;
        mVar.field_bzScene = 2;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.VestImgUploadEngine", "hy: cdntra addSendTask failed. clientid:%s", b17);
        this.f286172f = hy4.l.FAIL;
    }
}
