package kl4;

/* loaded from: classes15.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f308918d;

    public i0(kl4.k0 k0Var) {
        this.f308918d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k0 k0Var = this.f308918d;
        if (k0Var.f308929d != null) {
            try {
                if (k0Var.f308938p == null && ((java.util.ArrayList) k0Var.f308930e).isEmpty()) {
                    int i17 = k0Var.f308942t;
                    byte[] bArr = new byte[i17];
                    for (int i18 = 0; i18 < i17; i18++) {
                        bArr[i18] = 0;
                    }
                    android.media.AudioTrack audioTrack = k0Var.f308929d;
                    kotlin.jvm.internal.o.d(audioTrack);
                    int write = audioTrack.write(bArr, 0, i17, 1);
                    if (write < 0) {
                        com.tencent.mars.xlog.Log.i(k0Var.f308948z, "AudioTrack write silence failed: " + write);
                    }
                }
                android.media.AudioTrack audioTrack2 = k0Var.f308929d;
                if (audioTrack2 != null) {
                    audioTrack2.play();
                }
                com.tencent.mars.xlog.Log.i(k0Var.f308948z, "AudioTrack started playing");
                k0Var.e(kl4.b0.f308886f);
                k0Var.A = true;
            } catch (java.lang.IllegalStateException e17) {
                rk4.k5.d(k0Var.f308948z, "AudioTrack play error: " + e17.getMessage());
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.i(k0Var.f308948z, "AudioTrack play failed: Exception", e18);
            }
        }
    }
}
