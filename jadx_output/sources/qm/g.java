package qm;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f364630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f364631f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qm.o f364632g;

    public g(qm.o oVar, java.lang.String str, boolean z17, boolean z18) {
        this.f364632g = oVar;
        this.f364629d = str;
        this.f364630e = z17;
        this.f364631f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f364629d;
        boolean z17 = this.f364630e;
        boolean z18 = this.f364631f;
        qm.o oVar = this.f364632g;
        if (oVar.f364646c == null) {
            oVar.f364646c = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context = oVar.f364646c;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Notification.Tool.Sound", "playSound:context is null!!");
            return;
        }
        try {
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager.getStreamVolume(5) == 0) {
                return;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = oVar.f364647d;
            n3Var.removeMessages(305419896);
            n3Var.sendEmptyMessageDelayed(305419896, 8000L);
            boolean z19 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "doPlaySound playerIsInit: %s", java.lang.Boolean.valueOf(oVar.f364644a));
            if (oVar.f364644a) {
                try {
                    android.media.MediaPlayer mediaPlayer = oVar.f364645b;
                    if (mediaPlayer != null) {
                        if (mediaPlayer.isPlaying()) {
                            oVar.f364645b.stop();
                        }
                        oVar.f364645b.release();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "try to release player before playSound playerIsInit: %s", java.lang.Boolean.valueOf(oVar.f364644a));
                    }
                } catch (java.lang.IllegalStateException unused) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Notification.Tool.Sound", "try to release player before playSound error");
                    android.media.MediaPlayer mediaPlayer2 = oVar.f364645b;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.release();
                    }
                }
                oVar.f364644a = false;
            }
            to.g gVar = new to.g();
            oVar.f364645b = gVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "doPlaySound player: %s", gVar);
            oVar.b(oVar.f364645b, str, z17, z18);
            if (!audioManager.isWiredHeadsetOn()) {
                audioManager.getStreamVolume(5);
                oVar.f364645b.setOnCompletionListener(new qm.l(oVar));
                oVar.f364645b.setOnErrorListener(new qm.m(oVar));
                oVar.f364645b.setAudioStreamType(5);
                oVar.f364645b.setLooping(true);
                oVar.f364645b.prepare();
                oVar.f364645b.setLooping(false);
                oVar.f364645b.start();
                oVar.f364644a = true;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.TRUE;
                objArr[1] = java.lang.Boolean.valueOf(android.os.Looper.myLooper() != null);
                if (android.os.Looper.getMainLooper() == null) {
                    z19 = false;
                }
                objArr[2] = java.lang.Boolean.valueOf(z19);
                com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "doPlaySound start finish playerIsInit:%s, myLooper[%b] mainLooper[%b]", objArr);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "headset on, setSpeakerphoneOn to false");
            audioManager.setSpeakerphoneOn(false);
            wo.o oVar2 = wo.v1.f447833m;
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "notificationSetMode: %s", java.lang.Integer.valueOf(oVar2.G));
            if (oVar2.G == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "notification set mode enable, set mode now");
                if (audioManager.getMode() == 0) {
                    audioManager.setMode(3);
                }
                oVar.f364645b.setOnCompletionListener(new qm.h(oVar, audioManager));
                oVar.f364645b.setOnErrorListener(new qm.i(oVar, audioManager));
            } else {
                oVar.f364645b.setOnCompletionListener(new qm.j(oVar));
                oVar.f364645b.setOnErrorListener(new qm.k(oVar));
            }
            oVar.f364645b.setAudioStreamType(g17);
            oVar.f364645b.setLooping(true);
            oVar.f364645b.prepare();
            float f17 = streamVolume / streamMaxVolume;
            oVar.f364645b.setVolume(f17, f17);
            oVar.f364645b.setLooping(false);
            oVar.f364645b.start();
            oVar.f364644a = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.Tool.Sound", e17, "PlaySound Exception:", new java.lang.Object[0]);
            try {
                android.media.MediaPlayer mediaPlayer3 = oVar.f364645b;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.Tool.Sound", e18, "try to release player in Exception:", new java.lang.Object[0]);
            }
        }
    }
}
