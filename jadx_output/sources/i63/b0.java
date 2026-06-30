package i63;

@j95.b(dependencies = {p60.x.class})
/* loaded from: classes7.dex */
public class b0 extends i95.w implements i63.k0, fz2.b {
    public final java.lang.Runnable A;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f288973f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f288974g;

    /* renamed from: h, reason: collision with root package name */
    public android.net.LocalServerSocket f288975h;

    /* renamed from: p, reason: collision with root package name */
    public final android.media.AudioManager f288980p;

    /* renamed from: q, reason: collision with root package name */
    public final int f288981q;

    /* renamed from: r, reason: collision with root package name */
    public int f288982r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f288983s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f288984t;

    /* renamed from: u, reason: collision with root package name */
    public final i63.a0 f288985u;

    /* renamed from: v, reason: collision with root package name */
    public long f288986v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.ref.WeakReference f288987w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f288988x;

    /* renamed from: y, reason: collision with root package name */
    public final fz2.a f288989y;

    /* renamed from: z, reason: collision with root package name */
    public final dl3.b f288990z;

    /* renamed from: d, reason: collision with root package name */
    public ku5.f f288971d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.io.ObjectOutputStream f288972e = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f288976i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ua1.a f288977m = new ua1.a();

    /* renamed from: n, reason: collision with root package name */
    public long f288978n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.io.OutputStream f288979o = null;

    public b0() {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        this.f288980p = audioManager;
        this.f288981q = audioManager.getStreamMaxVolume(3);
        this.f288983s = true;
        this.f288984t = true;
        this.f288985u = new i63.a0(this, null);
        this.f288986v = 0L;
        this.f288988x = "MicroMsgGameLiveAudio";
        ((j40.p) ((zy2.r7) i95.n0.c(zy2.r7.class))).getClass();
        this.f288989y = new com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver();
        this.f288990z = new i63.u(this);
        this.A = new i63.z(this);
    }

    public final boolean Ai() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_wagame_disable_mic_capture_music, 0) == 1;
    }

    public synchronized void Bi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "pause %b", java.lang.Boolean.valueOf(this.f288983s));
        if (this.f288983s) {
            return;
        }
        this.f288983s = true;
        Ni();
    }

    public synchronized void Di() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "resume %b", java.lang.Boolean.valueOf(this.f288983s));
        if (this.f288983s) {
            this.f288983s = false;
            Ni();
        }
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "onHeadsetStateChange %b", java.lang.Boolean.valueOf(z17));
        wi(true, z17);
    }

    public final void Ni() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "enabled: %d", java.lang.Integer.valueOf(1 ^ (this.f288984t ? 1 : 0)));
        boolean z17 = this.f288984t;
        java.lang.Runnable runnable = this.A;
        if (z17 || this.f288983s) {
            dl3.i.s().H();
            java.lang.ref.WeakReference weakReference = this.f288987w;
            if (weakReference != null && weakReference.get() != null) {
                ((fa1.a) ((fa1.s) this.f288987w.get())).Q0(null);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f288973f;
            if (n3Var != null) {
                n3Var.removeCallbacks(runnable);
            }
            ((java.util.HashMap) this.f288976i).clear();
            return;
        }
        dl3.i s17 = dl3.i.s();
        dl3.b bVar = this.f288990z;
        s17.P(bVar);
        java.lang.ref.WeakReference weakReference2 = this.f288987w;
        if (weakReference2 != null && weakReference2.get() != null) {
            ((fa1.a) ((fa1.s) this.f288987w.get())).Q0(bVar);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f288973f;
        if (n3Var2 != null) {
            n3Var2.post(runnable);
        }
    }

    public void stop() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.ref.WeakReference weakReference = this.f288987w;
        objArr[0] = weakReference == null ? 0 : weakReference.get();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "stop appbrand audio, gameLogic: %s", objArr);
        this.f288983s = true;
        this.f288984t = true;
        Ni();
        try {
            java.io.OutputStream outputStream = this.f288979o;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.io.IOException unused) {
        }
        java.util.Map map = this.f288976i;
        java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
        while (it.hasNext()) {
            ((ua1.b) it.next()).c();
        }
        ((java.util.HashMap) map).clear();
        if (this.f288973f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "quit handler");
            this.f288973f.getLooper().quit();
            this.f288973f.quit();
        }
        if (this.f288974g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "quit ipcHandler");
            this.f288974g.getLooper().quit();
            this.f288974g.quit();
        }
        if (this.f288975h != null) {
            try {
                this.f288972e.write(1);
                this.f288972e.flush();
                this.f288972e.close();
                this.f288972e = null;
                this.f288975h.close();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "close localServerSocket exception", e17);
            }
        }
        ku5.f fVar = this.f288971d;
        if (fVar != null) {
            fVar.shutdownNow();
            this.f288971d = null;
        }
        this.f288975h = null;
        this.f288973f = null;
        this.f288974g = null;
        com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().unregisterContentObserver(this.f288985u);
        if (Ai()) {
            return;
        }
        ((com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver) this.f288989y).c(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public void wi(boolean z17, boolean z18) {
        boolean z19 = false;
        if (Ai()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "switch disabled");
            this.f288984t = false;
            Ni();
            return;
        }
        if (!z17) {
            z18 = ((com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver) this.f288989y).a();
        }
        boolean z27 = !java.lang.Boolean.valueOf(((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f279288g).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "checkDisableMusicCapture headset: %b isMute:%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z27));
        synchronized (this) {
            boolean z28 = this.f288984t;
            if (!z18 && !z27) {
                z19 = true;
            }
            this.f288984t = z19;
            if (z28 == z19) {
                return;
            }
            Ni();
        }
    }
}
