package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public class SplashFallbackActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f193632f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f193633d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f193634e = new com.tencent.mm.splash.o(this);

    @Override // android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.splash.j.d("MicroMsg.FallbackSplash", "block onBackPressed", new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.splash.j.d("MicroMsg.FallbackSplash", "onCreate", new java.lang.Object[0]);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("splash-activity");
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.f193633d = handler;
        handler.postDelayed(this.f193634e, 100L);
    }
}
