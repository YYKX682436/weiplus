package pm1;

/* loaded from: classes14.dex */
public final class o extends android.media.AudioDeviceCallback implements android.media.AudioManager.OnCommunicationDeviceChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f356829a = "AudioDeviceCache";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f356830b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Boolean f356831c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f356832d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f356833e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f356834f;

    /* renamed from: g, reason: collision with root package name */
    public final android.media.AudioManager f356835g;

    public o() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f356835g = (android.media.AudioManager) systemService;
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: pm1.f
            @Override // java.lang.Runnable
            public final void run() {
                pm1.o.this.a();
            }
        }, "AudioDeviceCache");
    }

    public final void a() {
        android.media.AudioManager audioManager = this.f356835g;
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        this.f356830b = java.lang.Boolean.valueOf(audioManager.isSpeakerphoneOn());
        android.media.AudioManager audioManager2 = this.f356835g;
        kotlin.jvm.internal.o.g(audioManager2, "audioManager");
        this.f356831c = java.lang.Boolean.valueOf(audioManager2.isBluetoothScoOn());
        android.media.AudioManager audioManager3 = this.f356835g;
        kotlin.jvm.internal.o.g(audioManager3, "audioManager");
        this.f356832d = java.lang.Boolean.valueOf(audioManager3.isBluetoothA2dpOn());
        an1.d dVar = an1.d.f8838a;
        android.media.AudioManager audioManager4 = this.f356835g;
        kotlin.jvm.internal.o.g(audioManager4, "audioManager");
        this.f356833e = java.lang.Boolean.valueOf(audioManager4.isWiredHeadsetOn());
        this.f356834f = java.lang.Boolean.valueOf(dVar.a(this.f356835g));
        com.tencent.mars.xlog.Log.i("AudioDeviceCache", "update cache: speakerOn=" + this.f356830b + ", BTSocOn=" + this.f356831c + ", BTA2dpOn=" + this.f356832d + ", wiredHeadsetOn=" + this.f356833e + ", headsetPlugged=" + this.f356834f);
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        ((ku5.t0) ku5.t0.f312615d).A(this.f356829a);
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: pm1.l
            @Override // java.lang.Runnable
            public final void run() {
                pm1.o.this.a();
            }
        }, this.f356829a);
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        ((ku5.t0) ku5.t0.f312615d).A(this.f356829a);
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: pm1.m
            @Override // java.lang.Runnable
            public final void run() {
                pm1.o.this.a();
            }
        }, this.f356829a);
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public void onCommunicationDeviceChanged(android.media.AudioDeviceInfo audioDeviceInfo) {
        ((ku5.t0) ku5.t0.f312615d).A(this.f356829a);
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: pm1.n
            @Override // java.lang.Runnable
            public final void run() {
                pm1.o.this.a();
            }
        }, this.f356829a);
    }
}
