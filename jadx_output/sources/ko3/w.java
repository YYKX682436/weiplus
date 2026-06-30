package ko3;

/* loaded from: classes13.dex */
public enum w {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.normsg.api.AudioModeStatus f310030d = com.tencent.mm.plugin.normsg.api.AudioModeStatus.a();

    w() {
    }

    public final void h() {
        try {
            ((android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio")).addOnModeChangedListener(((ku5.t0) ku5.t0.f312615d).p("n_asm_task"), new ko3.v(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ASM", "start asm failed: " + th6);
        }
    }
}
