package hp5;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp5.e f282943d;

    public a(hp5.e eVar) {
        this.f282943d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        hp5.e eVar = this.f282943d;
        eVar.f282948b = elapsedRealtime;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPSensorController", "device happened shake in time,%s", java.lang.Long.valueOf(eVar.f282948b));
    }
}
