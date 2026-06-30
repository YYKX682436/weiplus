package qm;

/* loaded from: classes13.dex */
public class x extends qm.o {

    /* renamed from: f, reason: collision with root package name */
    public boolean f364662f = false;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaPlayer f364663g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f364664h = com.tencent.mm.sdk.platformtools.x2.f193071a;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f364665i;

    private void b(android.media.MediaPlayer mediaPlayer, java.lang.String str, boolean z17, boolean z18) {
        android.net.Uri parse;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            parse = android.media.RingtoneManager.getDefaultUri(2);
        } else if (z18) {
            parse = com.tencent.mm.sdk.platformtools.i1.b(this.f364664h, com.tencent.mm.vfs.r6.j(new java.io.File(str)));
        } else if (z17) {
            android.content.res.AssetFileDescriptor openFd = this.f364664h.getAssets().openFd(str);
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            parse = null;
        } else {
            parse = android.net.Uri.parse(str);
        }
        if (parse != null) {
            try {
                mediaPlayer.setDataSource(this.f364664h, parse);
            } catch (java.io.IOException unused) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "setPlayerDataSource IOException soundUri:%s, isAsset:%s", str, java.lang.Boolean.valueOf(z17));
                } else {
                    mediaPlayer.setDataSource(this.f364664h, android.media.RingtoneManager.getDefaultUri(2));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "summeranrt setPlayerDataSource tid[%d] [%d]ms", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static void c(qm.x xVar, java.lang.String str, boolean z17, boolean z18) {
        if (xVar.f364664h == null) {
            xVar.f364664h = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context = xVar.f364664h;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Notification.Tool.SoundFixed", "playSound:context is null!!");
            return;
        }
        try {
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager.getStreamVolume(5) == 0) {
                return;
            }
            boolean z19 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound playerIsInit: %s", java.lang.Boolean.valueOf(xVar.f364662f));
            if (xVar.f364662f) {
                try {
                    android.media.MediaPlayer mediaPlayer = xVar.f364663g;
                    if (mediaPlayer != null) {
                        if (mediaPlayer.isPlaying()) {
                            xVar.f364663g.stop();
                        }
                        xVar.f364663g.release();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "try to release player before playSound playerIsInit: %s", java.lang.Boolean.valueOf(xVar.f364662f));
                    }
                } catch (java.lang.IllegalStateException unused) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Notification.Tool.SoundFixed", "try to release player before playSound error");
                    android.media.MediaPlayer mediaPlayer2 = xVar.f364663g;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.release();
                    }
                }
                xVar.f364662f = false;
            }
            to.g gVar = new to.g();
            xVar.f364663g = gVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound player: %s", gVar);
            xVar.b(xVar.f364663g, str, z17, z18);
            if (!audioManager.isWiredHeadsetOn()) {
                audioManager.getStreamVolume(5);
                xVar.f364663g.setOnCompletionListener(new qm.v(xVar));
                xVar.f364663g.setOnErrorListener(new qm.w(xVar));
                xVar.f364663g.setAudioStreamType(5);
                xVar.f364663g.setLooping(true);
                xVar.f364663g.prepare();
                xVar.f364663g.setLooping(false);
                xVar.f364663g.start();
                xVar.f364662f = true;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.TRUE;
                objArr[1] = java.lang.Boolean.valueOf(android.os.Looper.myLooper() != null);
                if (android.os.Looper.getMainLooper() == null) {
                    z19 = false;
                }
                objArr[2] = java.lang.Boolean.valueOf(z19);
                com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound start finish playerIsInit:%s, myLooper[%b] mainLooper[%b]", objArr);
                return;
            }
            int g17 = ym1.f.f463134h.g(false);
            float streamVolume = audioManager.getStreamVolume(g17);
            float streamVolume2 = audioManager.getStreamVolume(3);
            float streamMaxVolume = audioManager.getStreamMaxVolume(g17);
            float streamMaxVolume2 = streamVolume2 / audioManager.getStreamMaxVolume(3);
            if (streamVolume / streamMaxVolume > streamMaxVolume2) {
                streamVolume = streamMaxVolume * streamMaxVolume2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "headset on, setSpeakerphoneOn to false");
            audioManager.setSpeakerphoneOn(false);
            wo.o oVar = wo.v1.f447833m;
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "notificationSetMode: %s", java.lang.Integer.valueOf(oVar.G));
            if (oVar.G == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "notification set mode enable, set mode now");
                if (audioManager.getMode() == 0) {
                    audioManager.setMode(3);
                }
                xVar.f364663g.setOnCompletionListener(new qm.r(xVar, audioManager));
                xVar.f364663g.setOnErrorListener(new qm.s(xVar, audioManager));
            } else {
                xVar.f364663g.setOnCompletionListener(new qm.t(xVar));
                xVar.f364663g.setOnErrorListener(new qm.u(xVar));
            }
            xVar.f364663g.setAudioStreamType(g17);
            xVar.f364663g.setLooping(true);
            xVar.f364663g.prepare();
            float f17 = streamVolume / streamMaxVolume;
            xVar.f364663g.setVolume(f17, f17);
            xVar.f364663g.setLooping(false);
            xVar.f364663g.start();
            xVar.f364662f = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.Tool.SoundFixed", e17, "PlaySound Exception:", new java.lang.Object[0]);
            try {
                android.media.MediaPlayer mediaPlayer3 = xVar.f364663g;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                }
                xVar.f364662f = false;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.Tool.SoundFixed", e18, "try to release player in Exception:", new java.lang.Object[0]);
            }
        }
    }

    @Override // qm.o
    public synchronized void a(java.lang.String str, boolean z17, boolean z18) {
        if (this.f364665i == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "playSound playHandler == null");
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("playSoundThread", 0);
            a17.start();
            this.f364665i = new qm.p(this, a17.getLooper());
        }
        this.f364665i.removeMessages(305419896);
        this.f364665i.sendEmptyMessageDelayed(305419896, 8000L);
        this.f364665i.post(new qm.q(this, str, z17, z18));
    }
}
