package pm1;

/* loaded from: classes14.dex */
public final class s implements android.media.AudioManager.OnModeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Integer f356839a;

    /* renamed from: b, reason: collision with root package name */
    public final android.media.AudioManager f356840b;

    public s() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f356840b = (android.media.AudioManager) systemService;
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: pm1.p
            @Override // java.lang.Runnable
            public final void run() {
                pm1.s.this.a();
            }
        }, "AudioMiscCache");
    }

    public final void a() {
        this.f356839a = java.lang.Integer.valueOf(this.f356840b.getMode());
        com.tencent.mars.xlog.Log.i("AudioMiscCache", "update audio: mode=" + this.f356839a);
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public void onModeChanged(int i17) {
        ((ku5.t0) ku5.t0.f312615d).A("AudioMiscCache");
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: pm1.r
            @Override // java.lang.Runnable
            public final void run() {
                pm1.s.this.a();
            }
        }, "AudioMiscCache");
    }
}
