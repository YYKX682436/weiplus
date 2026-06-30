package vq4;

/* loaded from: classes14.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f439298d;

    public g0(vq4.m0 m0Var) {
        this.f439298d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        vq4.m0 m0Var = this.f439298d;
        m0Var.f439340d = elapsedRealtime;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", "device happened shake in time,%s", java.lang.Long.valueOf(m0Var.f439340d));
    }
}
