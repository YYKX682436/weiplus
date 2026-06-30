package go5;

/* loaded from: classes14.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f274149a = jz5.h.b(go5.m.f274143d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f274150b = jz5.h.b(go5.n.f274144d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f274151c = jz5.h.b(go5.o.f274145d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f274152d = jz5.h.b(go5.l.f274142d);

    /* renamed from: e, reason: collision with root package name */
    public boolean f274153e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f274154f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f274155g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f274156h;

    public final boolean a(boolean z17, boolean z18) {
        int i17 = f().f274132a;
        if (i17 == -1) {
            if (z17 || !z18) {
                return true;
            }
        } else if (i17 == 1) {
            return true;
        }
        return false;
    }

    public final void b() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            audioManager.clearCommunicationDevice();
            return;
        }
        yj0.a.c(audioManager, "com/tencent/mm/voipmp/v2/audio/VoIPMPAudioController", "clearCommunicationDevice", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
        audioManager.stopBluetoothSco();
        yj0.a.f(audioManager, "com/tencent/mm/voipmp/v2/audio/VoIPMPAudioController", "clearCommunicationDevice", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
    }

    public final go5.z c() {
        return (go5.z) ((jz5.n) this.f274152d).getValue();
    }

    public final go5.c d() {
        return (go5.c) ((jz5.n) this.f274149a).getValue();
    }

    public final go5.f e() {
        return (go5.f) ((jz5.n) this.f274150b).getValue();
    }

    public final go5.g0 f() {
        return (go5.g0) ((jz5.n) this.f274151c).getValue();
    }

    public final cv.v0 g() {
        return ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
    }

    public final boolean h() {
        this.f274153e = true;
        go5.k kVar = (go5.k) e();
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPAudioCapturer", "muteMicrophone");
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(1);
        allocateDirect.put((byte) 0);
        allocateDirect.position(0);
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.D(412, allocateDirect, 1);
        tl.w wVar = kVar.f274140a;
        if (wVar != null) {
            wVar.n(true);
        }
        return false;
    }

    public final void i(er4.l mainUiScene) {
        kotlin.jvm.internal.o.g(mainUiScene, "mainUiScene");
        int ordinal = mainUiScene.ordinal();
        if (ordinal == 0) {
            this.f274153e = false;
            this.f274154f = false;
            this.f274155g = false;
            this.f274156h = true;
            go5.g0 f17 = f();
            f17.getClass();
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(f17.f274133b);
            f().a();
            c().a();
            return;
        }
        if (ordinal == 1) {
            if (this.f274156h) {
                f().a();
                return;
            }
            this.f274153e = false;
            this.f274154f = false;
            this.f274155g = false;
            this.f274156h = true;
            go5.g0 f18 = f();
            f18.getClass();
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(f18.f274133b);
            f().a();
            c().a();
            return;
        }
        if (ordinal == 2) {
            go5.z c17 = c();
            f25.m0 m0Var = c17.f274157a;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            c17.f274157a = null;
            f().getClass();
            i95.m c18 = i95.n0.c(cv.w0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            cv.w0.f9((cv.w0) c18, 0, null, 2, null);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        this.f274153e = false;
        this.f274154f = false;
        this.f274155g = false;
        this.f274156h = true;
        go5.g0 f19 = f();
        f19.getClass();
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(f19.f274133b);
        f().f274134c = true;
        i95.m c19 = i95.n0.c(cv.w0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        cv.w0.f9((cv.w0) c19, 0, null, 2, null);
        c().a();
    }
}
