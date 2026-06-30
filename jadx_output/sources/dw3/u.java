package dw3;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f244279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f244280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f244281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f244282g;

    public u(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2, boolean z17, boolean z18) {
        this.f244279d = recordConfigProvider;
        this.f244280e = recordConfigProvider2;
        this.f244281f = z17;
        this.f244282g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f244279d;
        if (!recordConfigProvider.f155687y) {
            dw3.c0.f244182a.j(recordConfigProvider.D);
        }
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "imageState : " + o17 + ' ');
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f244280e;
        if (!o17) {
            ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Ai(recordConfigProvider2.E);
            return;
        }
        boolean z17 = this.f244281f;
        if ((z17 && o17) || (!z17 && recordConfigProvider2.f155688z && this.f244282g)) {
            java.lang.String g17 = ai3.d.g("jpg");
            if (!z17) {
                g17 = q75.c.a("jpg");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "auto save pic src " + recordConfigProvider2.E + " dest " + g17 + ' ');
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = recordConfigProvider2.E;
            ((yb0.g) b0Var).getClass();
            com.tencent.mm.platformtools.ExportFileUtil.b(context, str, g17);
            q75.c.f(g17, com.tencent.mm.sdk.platformtools.x2.f193071a);
            qk.e0.b(g17, qk.e0.a(recordConfigProvider2.E));
            ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Bi(recordConfigProvider2.E);
        }
    }
}
