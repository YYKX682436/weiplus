package qm;

/* loaded from: classes13.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f364648e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f364644a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.media.MediaPlayer f364645b = null;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f364647d = new qm.f(this, android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f364646c = com.tencent.mm.sdk.platformtools.x2.f193071a;

    public o() {
        java.lang.String str = null;
        java.lang.String str2 = com.tencent.mm.storage.v3.f196273a + "deviceconfig.cfg";
        com.tencent.mars.xlog.Log.i("MicroMsg.ServerConfigInfoStorage", "readConfigFromLocalFile, path: %s, isExist: %s", str2, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str2)));
        if (com.tencent.mm.vfs.w6.j(str2)) {
            byte[] N = com.tencent.mm.vfs.w6.N(str2, 0, -1);
            if (!com.tencent.mm.sdk.platformtools.t8.M0(N)) {
                java.lang.String str3 = new java.lang.String(N, java.nio.charset.Charset.defaultCharset());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    str = str3;
                }
            }
        }
        wo.v1.a(str);
    }

    public synchronized void a(java.lang.String str, boolean z17, boolean z18) {
        if (this.f364648e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "playSound playHandler == null");
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("playSoundThread", 0);
            a17.start();
            this.f364648e = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        }
        this.f364648e.post(new qm.g(this, str, z17, z18));
    }

    public final void b(android.media.MediaPlayer mediaPlayer, java.lang.String str, boolean z17, boolean z18) {
        android.net.Uri parse;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            parse = android.media.RingtoneManager.getDefaultUri(2);
        } else if (z18) {
            parse = com.tencent.mm.sdk.platformtools.i1.b(this.f364646c, com.tencent.mm.vfs.r6.j(new java.io.File(str)));
        } else if (z17) {
            android.content.res.AssetFileDescriptor openFd = this.f364646c.getAssets().openFd(str);
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            parse = null;
        } else {
            parse = android.net.Uri.parse(str);
        }
        if (parse != null) {
            try {
                mediaPlayer.setDataSource(this.f364646c, parse);
            } catch (java.io.IOException unused) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "setPlayerDataSource IOException soundUri:%s, isAsset:%s", str, java.lang.Boolean.valueOf(z17));
                } else {
                    mediaPlayer.setDataSource(this.f364646c, android.media.RingtoneManager.getDefaultUri(2));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "summeranrt setPlayerDataSource tid[%d] [%d]ms", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
