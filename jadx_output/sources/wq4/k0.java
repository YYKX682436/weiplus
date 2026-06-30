package wq4;

/* loaded from: classes14.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f448647a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f448648b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.MediaPlayer f448649c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Vibrator f448650d;

    /* renamed from: f, reason: collision with root package name */
    public long f448652f;

    /* renamed from: g, reason: collision with root package name */
    public long f448653g;

    /* renamed from: j, reason: collision with root package name */
    public wq4.j0 f448656j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f448651e = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f448654h = false;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f448655i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public k0(android.content.Context context) {
        this.f448648b = context;
        if (context != null) {
            this.f448647a = (android.media.AudioManager) context.getSystemService("audio");
            this.f448650d = (android.os.Vibrator) context.getSystemService("vibrator");
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        context2 = context2 instanceof android.app.Activity ? com.tencent.mm.sdk.platformtools.x2.f193071a : context2;
        if (fp.h.c(8)) {
            new fp.g(context2);
        }
    }

    public void a() {
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.x2.e();
        android.content.Context context = this.f448648b;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(e17, 0);
        if (fp.h.c(26) ? sharedPreferences.getBoolean("settings_voip_scene_shake", true) : sharedPreferences.getBoolean("settings_shake", true)) {
            int ringerMode = this.f448647a.getRingerMode();
            com.tencent.mars.xlog.Log.i("MicroMsg.RingPlayer", "system ringer mode: %s", java.lang.Integer.valueOf(ringerMode));
            if (ringerMode != 1 && ringerMode != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RingPlayer", "system not open vibrate");
                return;
            }
            android.os.Vibrator vibrator = (android.os.Vibrator) context.getSystemService("vibrator");
            this.f448650d = vibrator;
            if (vibrator == null) {
                return;
            }
            if (fp.h.c(26)) {
                this.f448650d.vibrate(android.os.VibrationEffect.createWaveform(new long[]{1000, 1000, 1000, 1000}, 0), new android.media.AudioAttributes.Builder().setUsage(6).build());
            } else {
                this.f448650d.vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
            }
        }
    }

    public android.net.Uri b(java.lang.String str) {
        str.getClass();
        boolean equals = str.equals("ipcall_phonering");
        android.content.Context context = this.f448648b;
        if (equals) {
            return android.net.Uri.parse("android.resource://" + context.getPackageName() + "/2131691554");
        }
        if (str.equals("close_lower_volume")) {
            return android.net.Uri.parse("android.resource://" + context.getPackageName() + "/2131690002");
        }
        kotlin.jvm.internal.o.g(context, "context");
        if (!kotlin.jvm.internal.o.b(str, "phonering")) {
            return kotlin.jvm.internal.o.b(str, "playend") ? mx3.f0.c(context) : mx3.f0.c(context);
        }
        mx3.f0 f0Var = mx3.f0.f332548a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = mx3.f0.f332550c;
        sb6.append(str2);
        java.lang.String str3 = mx3.f0.f332552e;
        sb6.append(str3);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb6.toString());
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            mx3.f0.f332548a.a();
        }
        android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(context, new com.tencent.mm.vfs.r6(str2 + str3));
        kotlin.jvm.internal.o.f(b17, "getUriForFile(...)");
        return b17;
    }

    public void c(boolean z17) {
        int i17;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.RingPlayer", "setSpeakerStatus, isSpeakerOn: %b, isSpeakerphoneOn: %s, mode: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f448647a.isSpeakerphoneOn()), java.lang.Integer.valueOf(this.f448647a.getMode()));
        int i18 = z17 ? 0 : fp.h.c(21) ? 3 : 2;
        if ((z17 && (i17 = wo.v1.f447823c.f447588J) > -1) || (!z17 && (i17 = wo.v1.f447823c.I) > -1)) {
            i18 = i17;
        }
        if (i18 != this.f448647a.getMode()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingPlayer", "set AudioManager mode: %s", java.lang.Integer.valueOf(i18));
            ym1.f.wi().x(i18, null);
        }
        android.media.AudioManager audioManager = this.f448647a;
        if (audioManager == null) {
            audioManager = (android.media.AudioManager) ((jz5.n) mm1.g.f328661a).getValue();
        }
        if (z17 != mm1.g.b(audioManager)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingPlayer", "set AudioManager speakerphoneOn: %s", java.lang.Boolean.valueOf(z17));
            ((ku5.t0) ku5.t0.f312615d).g(new xm1.e(ym1.f.wi(), z17));
        }
    }

    public final void d(java.lang.String str, long j17, boolean z17, int i17) {
        this.f448652f = java.lang.System.currentTimeMillis();
        this.f448649c = new to.g();
        try {
            this.f448649c.setDataSource(this.f448648b, b(str));
            this.f448649c.setOnCompletionListener(new wq4.d0(this, str, j17, z17, i17));
            this.f448649c.setOnErrorListener(new wq4.e0(this));
            this.f448649c.setAudioStreamType(i17);
            if (z17) {
                this.f448649c.setVolume(0.6f, 0.6f);
            } else {
                a();
            }
            this.f448649c.setLooping(false);
            this.f448649c.prepare();
            this.f448649c.start();
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingPlayer", "new MediaPlayer failed, " + e17.toString());
        }
    }

    public void e() {
        android.os.Vibrator vibrator = this.f448650d;
        if (vibrator != null) {
            vibrator.cancel();
            this.f448650d = null;
        }
        android.media.MediaPlayer mediaPlayer = this.f448649c;
        if (mediaPlayer == null || !this.f448651e) {
            return;
        }
        try {
            mediaPlayer.stop();
            this.f448649c.release();
            wq4.j0 j0Var = this.f448656j;
            if (j0Var != null) {
                this.f448655i.removeCallbacks(j0Var);
            }
            this.f448651e = false;
            i95.m c17 = i95.n0.c(ym1.f.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xm1.h hVar = ((ym1.f) c17).f463136e;
            if (hVar == null) {
                hVar = new xm1.j();
                i95.m c18 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((ym1.f) c18).f463136e = hVar;
                i95.m c19 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ((ym1.f) c19).f463138g[0] = "music";
            }
            hVar.v();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingPlayer", e17.toString());
        }
    }
}
