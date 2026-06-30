package gy;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f277464a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.AudioTrack f277465b;

    /* renamed from: c, reason: collision with root package name */
    public final android.media.AudioFocusRequest f277466c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f277467d;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f277468e;

    /* renamed from: f, reason: collision with root package name */
    public final java.nio.ByteBuffer f277469f;

    /* renamed from: g, reason: collision with root package name */
    public final int f277470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f277471h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f277472i;

    /* renamed from: j, reason: collision with root package name */
    public long f277473j;

    /* renamed from: k, reason: collision with root package name */
    public long f277474k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f277475l;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f277476m;

    public c(android.media.AudioManager audioManager) {
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        this.f277464a = audioManager;
        this.f277467d = new java.lang.Object();
        gy.a aVar = new gy.a(this);
        this.f277476m = aVar;
        int i17 = (int) (1 * 320.0d * (16 / 8));
        this.f277470g = i17;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        kotlin.jvm.internal.o.f(allocateDirect, "allocateDirect(...)");
        this.f277469f = allocateDirect;
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(16000, 4, 2) * 3;
        android.media.AudioAttributes build = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        android.media.AudioTrack audioTrack = new android.media.AudioTrack(build, new android.media.AudioFormat.Builder().setSampleRate(16000).setChannelMask(4).setEncoding(2).build(), minBufferSize, 1, 0);
        this.f277465b = audioTrack;
        audioTrack.getState();
        this.f277466c = android.os.Build.VERSION.SDK_INT >= 26 ? new android.media.AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(aVar).setAudioAttributes(build).build() : null;
        a();
    }

    public final void a() {
        android.media.AudioManager audioManager = this.f277464a;
        this.f277475l = audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn();
    }

    public final void b() {
        synchronized (this.f277467d) {
            if (this.f277465b.getPlayState() != 1) {
                this.f277465b.stop();
            }
            this.f277465b.release();
            android.media.AudioTrack audioTrack = new android.media.AudioTrack(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build(), new android.media.AudioFormat.Builder().setSampleRate(16000).setChannelMask(4).setEncoding(2).build(), android.media.AudioTrack.getMinBufferSize(16000, 4, 2) * 3, 1, 0);
            this.f277465b = audioTrack;
            if (audioTrack.getState() != 1) {
                return;
            }
            if (this.f277471h) {
                this.f277465b.play();
            }
        }
    }

    public final void c() {
        this.f277468e = ((ku5.t0) ku5.t0.f312615d).k(new gy.b(this), java.lang.Math.max(0L, java.lang.Math.min((20 - (android.os.SystemClock.elapsedRealtime() - this.f277473j)) - this.f277474k, this.f277475l ? 40 : 30)));
    }

    public final void d() {
        a();
        boolean z17 = this.f277475l;
        android.media.AudioManager audioManager = this.f277464a;
        if (!z17) {
            audioManager.setSpeakerphoneOn(audioManager.getMode() != 2);
            return;
        }
        audioManager.setMode(0);
        if (android.os.Build.VERSION.SDK_INT < 26) {
            yj0.a.c(audioManager, "com/tencent/mm/feature/chatbot/media/AudioPlayer", "setAudioOutputDevice", "()V", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
            audioManager.startBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/mm/feature/chatbot/media/AudioPlayer", "setAudioOutputDevice", "()V", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
        }
        audioManager.setSpeakerphoneOn(false);
    }

    public final boolean e() {
        int requestAudioFocus;
        synchronized (this.f277467d) {
            if (this.f277471h) {
                return true;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.media.AudioManager audioManager = this.f277464a;
                android.media.AudioFocusRequest audioFocusRequest = this.f277466c;
                kotlin.jvm.internal.o.d(audioFocusRequest);
                requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
            } else {
                requestAudioFocus = this.f277464a.requestAudioFocus(this.f277476m, 3, 1);
            }
            if (requestAudioFocus != 1) {
                return false;
            }
            d();
            if (this.f277465b.getState() != 1) {
                b();
                if (this.f277465b.getState() != 1) {
                    return false;
                }
            }
            this.f277465b.play();
            this.f277471h = true;
            this.f277474k = 0L;
            this.f277473j = android.os.SystemClock.elapsedRealtime();
            c();
            return true;
        }
    }

    public final void f() {
        synchronized (this.f277467d) {
            this.f277471h = false;
            this.f277472i = false;
            this.f277474k = 0L;
            wu5.c cVar = this.f277468e;
            if (cVar != null && !cVar.isCancelled()) {
                wu5.c cVar2 = this.f277468e;
                if (cVar2 != null) {
                    cVar2.cancel(true);
                }
                this.f277468e = null;
            }
            this.f277465b.stop();
            this.f277464a.abandonAudioFocus(this.f277476m);
            if (this.f277475l && android.os.Build.VERSION.SDK_INT < 26) {
                android.media.AudioManager audioManager = this.f277464a;
                yj0.a.c(audioManager, "com/tencent/mm/feature/chatbot/media/AudioPlayer", "stop", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
                audioManager.stopBluetoothSco();
                yj0.a.f(audioManager, "com/tencent/mm/feature/chatbot/media/AudioPlayer", "stop", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            }
        }
    }
}
