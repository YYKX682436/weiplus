package dw3;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f244277d;

    public t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.f244277d = recordConfigProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "handleNoNeedRemuxCaptureVideo");
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "handleNoNeedRemuxCaptureVideo videoState : " + o17 + ' ');
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f244277d;
        if (o17) {
            java.lang.String h17 = ai3.d.h("mp4");
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, recordConfigProvider.B, h17);
            q75.c.f(h17, com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Bi(recordConfigProvider.B);
        dw3.c0.f244182a.j(recordConfigProvider.A);
    }
}
