package dw3;

/* loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f244284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f244287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f244288h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f244289i;

    public v(boolean z17, java.lang.String str, java.lang.String str2, boolean z18, boolean z19, boolean z27) {
        this.f244284d = z17;
        this.f244285e = str;
        this.f244286f = str2;
        this.f244287g = z18;
        this.f244288h = z19;
        this.f244289i = z27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f244284d) {
            dw3.c0.f244182a.j(this.f244285e);
        }
        java.lang.String str = this.f244286f;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "file is no exist >> " + str);
            return;
        }
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "videoState : " + o17 + ' ');
        if (o17) {
            boolean z17 = this.f244287g;
            if (z17 || (!z17 && this.f244288h && this.f244289i)) {
                java.lang.String h17 = ai3.d.h("mp4");
                if (!z17) {
                    h17 = q75.c.b("mp4");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "auto save video :" + h17);
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, str, h17);
                q75.c.f(h17, com.tencent.mm.sdk.platformtools.x2.f193071a);
                ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Bi(str);
            }
        }
    }
}
