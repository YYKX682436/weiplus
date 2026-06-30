package h61;

/* loaded from: classes9.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final h61.g f279145a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f279146b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f279147c;

    /* renamed from: d, reason: collision with root package name */
    public final long f279148d;

    /* renamed from: e, reason: collision with root package name */
    public final dn.k f279149e = new h61.f(this);

    public h(java.lang.String str, h61.g gVar) {
        this.f279148d = 0L;
        this.f279148d = java.lang.System.currentTimeMillis();
        this.f279146b = str;
        this.f279145a = gVar;
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : kk.k.g(str.getBytes());
        this.f279147c = g17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.AAImagUpload", "AAImagUpload imgPath:%s mediaId:%s", str, g17);
    }

    public boolean a() {
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_AAImagUpload";
        mVar.f241787f = this.f279149e;
        java.lang.String str = this.f279147c;
        mVar.field_mediaId = str;
        mVar.field_fullpath = this.f279146b;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 20301;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = true;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX;
        mVar.field_bzScene = 2;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Aa.AAImagUpload", "cdntra addSendTask failed. mediaId:%s", str);
        return false;
    }
}
