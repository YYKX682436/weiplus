package ua1;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425954a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f425955b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ua1.a f425956c = new ua1.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.media.AudioManager f425957d;

    /* renamed from: e, reason: collision with root package name */
    public final int f425958e;

    /* renamed from: f, reason: collision with root package name */
    public int f425959f;

    /* renamed from: g, reason: collision with root package name */
    public final ua1.e f425960g;

    /* renamed from: h, reason: collision with root package name */
    public final dl3.b f425961h;

    /* renamed from: i, reason: collision with root package name */
    public long f425962i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f425963j;

    /* renamed from: k, reason: collision with root package name */
    public tl.c f425964k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.ref.WeakReference f425965l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f425966m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f425967n;

    public f(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        this.f425957d = audioManager;
        this.f425958e = audioManager.getStreamMaxVolume(3);
        this.f425960g = new ua1.e(this, null);
        this.f425961h = new ua1.c(this);
        this.f425962i = 0L;
        this.f425963j = new ua1.d(this);
        this.f425966m = true;
        this.f425967n = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordAudioLogic", "game record audio: create audio logic");
        this.f425954a = "MicroMsg.GameRecordAudioLogic" + hashCode();
        this.f425965l = new java.lang.ref.WeakReference((fa1.s) e9Var.V0().B1(fa1.s.class));
    }

    public final synchronized boolean a() {
        return this.f425967n;
    }

    public final synchronized boolean b() {
        return this.f425966m;
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordAudioLogic", "pause, mIsPaused: " + a());
        if (a()) {
            return;
        }
        synchronized (this) {
            this.f425967n = true;
        }
        dl3.i.s().H();
        if (this.f425965l.get() != null) {
            ((fa1.a) ((fa1.s) this.f425965l.get())).Q0(null);
        }
        ((ku5.t0) ku5.t0.f312615d).A(this.f425954a);
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordAudioLogic", "resume, mIsPaused: " + a());
        if (a()) {
            synchronized (this) {
                this.f425967n = false;
            }
            dl3.i.s().P(this.f425961h);
            if (this.f425965l.get() != null) {
                ((fa1.a) ((fa1.s) this.f425965l.get())).Q0(this.f425961h);
            }
            this.f425962i = 0L;
            ((ku5.t0) ku5.t0.f312615d).h(this.f425963j, this.f425954a);
        }
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordAudioLogic", "stop, mIsStopped: " + b());
        if (b()) {
            return;
        }
        synchronized (this) {
            this.f425966m = true;
        }
        com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().unregisterContentObserver(this.f425960g);
        c();
        java.util.Iterator it = ((java.util.HashMap) this.f425955b).values().iterator();
        while (it.hasNext()) {
            ((ua1.b) it.next()).c();
        }
        ((java.util.HashMap) this.f425955b).clear();
        ua1.a aVar = this.f425956c;
        synchronized (aVar) {
            try {
                try {
                    com.tencent.mm.plugin.ap.WVAPJNI.nativeMixerUninit(aVar.f425919b);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerUninit Exception " + e17.getMessage());
                } catch (java.lang.UnsatisfiedLinkError e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerUninit UnsatisfiedLinkError " + e18.getMessage());
                }
            } finally {
            }
        }
    }
}
