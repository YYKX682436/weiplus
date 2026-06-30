package vd0;

@j95.b
/* loaded from: classes5.dex */
public final class d2 extends i95.w implements wd0.m1 {

    /* renamed from: d, reason: collision with root package name */
    public f25.m0 f435386d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.AudioManager f435387e;

    /* renamed from: f, reason: collision with root package name */
    public final vd0.b2 f435388f = new vd0.b2(this);

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.feature.setting.MuteModeService$VolumeBroadcastReceiver f435389g;

    public void Ai(boolean z17) {
        com.tencent.mars.xlog.Log.i("MuteModeService", "releaseAudioFocus audioFocusSession:%s", this.f435386d);
        f25.m0 m0Var = this.f435386d;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f435386d = null;
        if (z17) {
            Di();
        }
    }

    public void Bi(boolean z17) {
        com.tencent.mars.xlog.Log.i("MuteModeService", "requestAudioFocus audioMgr:%s, audioFocusSession:%s", this.f435387e, this.f435386d);
        if (this.f435386d == null) {
            this.f435386d = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.r.f259110c, null);
        }
        if (z17) {
            Ri(0);
            j65.e.m(false);
        }
    }

    public final void Di() {
        if (this.f435387e == null) {
            this.f435387e = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        }
        if (this.f435387e != null) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_MUTE_VOLUME_INT, 0);
            com.tencent.mars.xlog.Log.i("MuteModeService", "releaseAudioFocus beforeVolum:%s", java.lang.Integer.valueOf(r17));
            to.a.c(this.f435387e, 3, r17, 1);
        }
    }

    public void Ni() {
        if (this.f435387e == null) {
            this.f435387e = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        }
        android.media.AudioManager audioManager = this.f435387e;
        if (audioManager != null) {
            kotlin.jvm.internal.o.d(audioManager);
            int streamVolume = audioManager.getStreamVolume(3);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_MUTE_VOLUME_INT, java.lang.Integer.valueOf(streamVolume));
            com.tencent.mars.xlog.Log.i("MuteModeService", "save current Volum:%s", java.lang.Integer.valueOf(streamVolume));
        }
    }

    public void Ri(int i17) {
        if (this.f435387e == null) {
            this.f435387e = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        }
        android.media.AudioManager audioManager = this.f435387e;
        if (audioManager != null) {
            to.a.c(audioManager, 3, i17, 1);
        }
    }

    public void Ui() {
        if (this.f435389g != null) {
            try {
                d75.b.g(new vd0.c2(this));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MuteModeService", th6, "unregisterContentObserver", new java.lang.Object[0]);
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MuteModeService", "onAccountInitialized");
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(this.f435388f);
        if (j65.e.b() && j65.e.g()) {
            wi();
        }
        if (j65.e.b() && j65.e.g()) {
            Bi(false);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MuteModeService", "onAccountReleased");
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this.f435388f);
        if (j65.e.b() && j65.e.g()) {
            Ai(true);
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        this.f435387e = (android.media.AudioManager) context.getSystemService("audio");
        com.tencent.mars.xlog.Log.i("MuteModeService", "onCreate");
    }

    public void wi() {
        if (this.f435389g != null) {
            return;
        }
        this.f435389g = new com.tencent.mm.feature.setting.MuteModeService$VolumeBroadcastReceiver(new java.lang.ref.WeakReference(this));
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            if (fp.h.a(33)) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f435389g, intentFilter);
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f435389g, intentFilter, 2);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MuteModeService", th6, "initBrightnessObserver", new java.lang.Object[0]);
        }
    }
}
