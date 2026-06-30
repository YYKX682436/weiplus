package pm1;

/* loaded from: classes14.dex */
public final class w extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f356846a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f356847b;

    /* renamed from: c, reason: collision with root package name */
    public final android.media.AudioManager f356848c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f356849d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f356850e;

    public w() {
        super(null);
        this.f356846a = "AudioVolumeCache";
        this.f356847b = new int[]{0, 1, 2, 3, 4, 5, 8, 10};
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f356848c = (android.media.AudioManager) systemService;
        this.f356849d = new java.util.HashMap();
        this.f356850e = new java.util.HashMap();
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: pm1.t
            @Override // java.lang.Runnable
            public final void run() {
                pm1.w.this.b();
            }
        }, "AudioVolumeCache");
    }

    public final int a(int i17, java.util.HashMap hashMap) {
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            ((ku5.t0) ku5.t0.f312615d).h(new pm1.u(hashMap, this, i17), this.f356846a);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        boolean z17 = hashMap == this.f356849d;
        android.media.AudioManager audioManager = this.f356848c;
        int streamMaxVolume = z17 ? audioManager.getStreamMaxVolume(i17) : audioManager.getStreamVolume(i17);
        hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(streamMaxVolume));
        return streamMaxVolume;
    }

    public final void b() {
        for (int i17 : this.f356847b) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.util.HashMap hashMap = this.f356850e;
            android.media.AudioManager audioManager = this.f356848c;
            hashMap.put(valueOf, java.lang.Integer.valueOf(audioManager.getStreamVolume(i17)));
            this.f356849d.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(audioManager.getStreamMaxVolume(i17)));
        }
        com.tencent.mars.xlog.Log.i("AudioVolumeCache", "update audio volume");
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).A(this.f356846a);
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: pm1.v
            @Override // java.lang.Runnable
            public final void run() {
                pm1.w.this.b();
            }
        }, this.f356846a);
    }
}
