package oy5;

/* loaded from: classes10.dex */
public final class g implements oy5.b {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f350095a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.HandlerThread f350096b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tme.karaoke.lib_singscore.PitchNativeBridge f350097c = new com.tme.karaoke.lib_singscore.PitchNativeBridge();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f350098d = "pitch_Module";

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f350099e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f350100f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f350101g;

    public g(yz5.l lVar, android.os.HandlerThread handlerThread) {
        this.f350095a = lVar;
        this.f350096b = handlerThread;
    }

    public int a() {
        boolean z17;
        com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
        z17 = com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet;
        if (!z17) {
            return -1000;
        }
        android.os.Handler handler = this.f350099e;
        if (handler == null) {
            return 0;
        }
        if (handler == null) {
            kotlin.jvm.internal.o.o("pitchHandler");
            throw null;
        }
        handler.removeCallbacksAndMessages(null);
        android.os.Handler handler2 = this.f350099e;
        if (handler2 != null) {
            handler2.post(new java.lang.Runnable() { // from class: oy5.g$$c
                @Override // java.lang.Runnable
                public final void run() {
                    oy5.g this$0 = oy5.g.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    this$0.f350097c.unInit();
                    android.os.HandlerThread handlerThread = this$0.f350100f;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                }
            });
            return 0;
        }
        kotlin.jvm.internal.o.o("pitchHandler");
        throw null;
    }
}
