package sl;

/* loaded from: classes12.dex */
public class a implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl.j f409018d;

    public a(sl.j jVar) {
        this.f409018d = jVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        sl.j jVar = this.f409018d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onPause: %b, isPlaying：%s", valueOf, java.lang.Boolean.valueOf(jVar.c()));
        if (jVar.c()) {
            if (j65.e.b() && j65.e.g() && jVar.f409034g == null) {
                jVar.h(false);
                return;
            }
            if (jVar.f409041n || (str = jVar.f409035h) == null || (str2 = sl.j.f409027q) == null || str.equals(str2)) {
                if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_target26_voice_focus_shield_sw, 0) == 0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "no shield");
                } else if (z17 && fp.h.c(26)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK %s", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "real onPause: ");
                jVar.d(false);
            }
        }
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onResume: audioFocusChange");
        this.f409018d.e();
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "onStop: audioFocusChange");
        this.f409018d.h(false);
    }
}
