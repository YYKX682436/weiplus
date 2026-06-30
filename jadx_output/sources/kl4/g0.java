package kl4;

/* loaded from: classes15.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f308907d;

    public g0(kl4.k0 k0Var) {
        this.f308907d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k0 k0Var = this.f308907d;
        android.media.AudioTrack audioTrack = k0Var.f308929d;
        if (audioTrack != null) {
            kl4.b0 b0Var = k0Var.f308945w;
            kl4.b0 b0Var2 = kl4.b0.f308886f;
            if (b0Var != b0Var2) {
                java.lang.String str = k0Var.f308948z;
                try {
                    audioTrack.play();
                    com.tencent.mars.xlog.Log.i(str, "resumeInner call audioTrack play()");
                    k0Var.e(b0Var2);
                    k0Var.f();
                } catch (java.lang.IllegalStateException e17) {
                    rk4.k5.d(str, "AudioTrack resume error: " + e17.getMessage());
                }
            }
        }
    }
}
