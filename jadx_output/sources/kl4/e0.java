package kl4;

/* loaded from: classes15.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f308902d;

    public e0(kl4.k0 k0Var) {
        this.f308902d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k0 k0Var = this.f308902d;
        android.media.AudioTrack audioTrack = k0Var.f308929d;
        if (audioTrack != null) {
            kl4.b0 b0Var = k0Var.f308945w;
            kl4.b0 b0Var2 = kl4.b0.f308887g;
            if (b0Var != b0Var2) {
                java.lang.String str = k0Var.f308948z;
                try {
                    audioTrack.pause();
                    com.tencent.mars.xlog.Log.i(str, "pauseInner call audioTrack pause()");
                    k0Var.e(b0Var2);
                } catch (java.lang.IllegalStateException e17) {
                    rk4.k5.d(str, "AudioTrack pause error: " + e17.getMessage());
                }
            }
        }
    }
}
