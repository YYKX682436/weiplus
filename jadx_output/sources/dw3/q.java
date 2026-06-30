package dw3;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f244260d;

    public q(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.f244260d = recordConfigProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "handleDaemonNoNeedRemuxCaptureVideo videoState : " + o17 + ' ');
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f244260d;
        if (o17) {
            java.lang.String h17 = ai3.d.h("mp4");
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, recordConfigProvider.B, h17);
            q75.c.f(h17, com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        dw3.c0.f244182a.j(recordConfigProvider.A);
    }
}
