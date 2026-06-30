package dk2;

/* loaded from: classes3.dex */
public final class ig implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f233628d;

    public ig(long j17) {
        this.f233628d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLive liveId:");
        long j17 = this.f233628d;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("Finder.LiveExceptionMonitor", sb6.toString());
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("live_exception_monitor");
        R.putLong("PARAM_LIVE_ID", j17);
        R.putBoolean("PARAM_IS_SCREEN_OFF", false);
        R.putBoolean("PARAM_IS_FLOAT", false);
        R.putBoolean("PARAM_IS_FOREGROUND", true);
    }
}
