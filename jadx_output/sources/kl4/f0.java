package kl4;

/* loaded from: classes15.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f308904d;

    public f0(kl4.k0 k0Var) {
        this.f308904d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k0 k0Var = this.f308904d;
        java.lang.String str = k0Var.f308948z;
        android.media.AudioTrack audioTrack = k0Var.f308929d;
        if (audioTrack != null) {
            try {
                com.tencent.mars.xlog.Log.i(str, "releaseAudioTrack");
                audioTrack.setPlaybackPositionUpdateListener(null);
                audioTrack.stop();
            } catch (java.lang.Exception e17) {
                rk4.k5.d(str, "releaseAudioTrack stop failed: " + e17.getMessage());
            }
            try {
                audioTrack.release();
            } catch (java.lang.Exception e18) {
                rk4.k5.d(str, "releaseAudioTrack stop failed: " + e18.getMessage());
            }
            k0Var.f308929d = null;
        }
    }
}
