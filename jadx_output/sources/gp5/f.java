package gp5;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp5.g f274471d;

    public f(gp5.g gVar) {
        this.f274471d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wq4.k0 k0Var = this.f274471d.f274472a;
        k0Var.getClass();
        if (!ym1.f.Ni() && !ym1.f.Ri()) {
            android.media.AudioManager audioManager = k0Var.f448647a;
            if (audioManager.getRingerMode() == 0 || audioManager.getRingerMode() == 1) {
                return;
            }
        }
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.x2.e();
        android.content.Context context = k0Var.f448648b;
        if (context.getSharedPreferences(e17, 0).getBoolean("settings_shake", true)) {
            android.os.Vibrator vibrator = (android.os.Vibrator) context.getSystemService("vibrator");
            if (vibrator == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RingPlayer", "shake:vibrator is null!");
                return;
            }
            vibrator.vibrate(10L);
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mars.xlog.Log.i("MicroMsg.RingPlayer", "playSound, type: %s, changeStreamType: %s, shake: %s", 0, bool, bool);
        k0Var.f448653g = java.lang.System.currentTimeMillis();
        to.g gVar = new to.g();
        try {
            gVar.setDataSource(context, k0Var.b("playend"));
            gVar.setOnCompletionListener(new wq4.f0(k0Var));
            gVar.setOnErrorListener(new wq4.g0(k0Var));
            ym1.e eVar = ym1.f.f463134h;
            int c17 = ym1.f.Ni() ? eVar.c() : 0;
            if (fp.h.b(28)) {
                gVar.setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(6).setLegacyStreamType(c17).setContentType(4).build());
                com.tencent.mars.xlog.Log.i("MicroMsg.RingPlayer", "use audio attribute to play ring");
            } else {
                gVar.setAudioStreamType(c17);
            }
            if (!eVar.k()) {
                float g17 = ym1.f.wi().g(c17);
                float min = java.lang.Math.min(ym1.f.wi().h(c17) * 0.5f, 0.4f * g17) / g17;
                gVar.setVolume(min, min);
            }
            gVar.prepare();
            gVar.setLooping(false);
            gVar.start();
            if (java.lang.System.currentTimeMillis() - k0Var.f448653g > 2000) {
                k0Var.getClass();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", th6);
            k0Var.getClass();
        }
    }
}
